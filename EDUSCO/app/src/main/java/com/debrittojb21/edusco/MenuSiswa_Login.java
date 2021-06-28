package com.debrittojb21.edusco;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MenuSiswa_Login extends AppCompatActivity {

    EditText eT_password;


    String id, Pass_input, Pass_match, noKelas, s, noUser, noPresensi;

    protected void onCreate (Bundle savedInstanceSaved){
        super.onCreate(savedInstanceSaved);
        setContentView(R.layout.activity_menu_siswa_login);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        noUser = Preferences.getLoggedUser(getBaseContext());
        noKelas = Preferences.getLoggedKelas(getBaseContext());
        noPresensi = Preferences.getLoggedPresensi(getBaseContext());

        id = noPresensi;

        eT_password = (EditText) findViewById(R.id.edit_password);

        switch (noUser){
            case "1":{
                switch (noKelas){
                    case "1":
                        s = Configuration.URL_LOGIN_STD_XIA1;
                        break;
                    case "2":
                        s = Configuration.URL_LOGIN_STD_XIA2;
                        break;
                    case "3":
                        s = Configuration.URL_LOGIN_STD_XIA3;
                        break;
                    case "4":
                        s = Configuration.URL_LOGIN_STD_XIA4;
                        break;
                    case "5":
                        s = Configuration.URL_LOGIN_STD_XIA5;
                        break;
                }
            } break;
            case "3":{
                switch (noKelas){
                    case "1":
                        s = Configuration.URL_LOGIN_PRT_XIA1;
                        break;
                    case "2":
                        s = Configuration.URL_LOGIN_PRT_XIA2;
                        break;
                    case "3":
                        s = Configuration.URL_LOGIN_PRT_XIA3;
                        break;
                    case "4":
                        s = Configuration.URL_LOGIN_PRT_XIA4;
                        break;
                    case "5":
                        s = Configuration.URL_LOGIN_PRT_XIA5;
                        break;
                }
            } break;
        }

        getStudents();
    }

    private void getStudents(){
        class GetStudents extends AsyncTask <Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MenuSiswa_Login.this,"Fetching...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                showStudents(s);
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String a = rh.sendGetRequestParam(s,id);
                return a;
            }
        }
        GetStudents ge = new GetStudents();
        ge.execute();
    }

    private void showStudents(String json){
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray result = jsonObject.getJSONArray(Configuration.TAG_JSON_ARRAY);
            JSONObject c = result.getJSONObject(0);
            Pass_input = c.getString(Configuration.TAG_PASS);

        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Gagal", Toast.LENGTH_SHORT).show();
        }
    }

    public void Login(View view) {
        Pass_match = eT_password.getText().toString();

        if (Pass_match.equals(Pass_input)){
            Preferences.setLoggedInStatus(getBaseContext(), true);

            Intent intent = new Intent (this, MenuSiswa_Semester.class);
            startActivity(intent);
            finish();
        }
        else {
            String empty = "";
            eT_password.setText(empty);
            Toast.makeText(this,"Wrong Password", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent (this, MenuSiswa_Presensi.class);
        startActivity(intent);
        finish();
    }
}
