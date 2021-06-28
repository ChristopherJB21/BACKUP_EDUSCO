package com.debrittojb21.edusco;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class MenuSiswa_ChangePass extends AppCompatActivity {

    TextView tV_now, tV_change, tV_confirm;
    EditText eT_now, eT_change, eT_confirm;
    Button button_next, button_change;

    String t, s, id, noKelas, noUser;
    String pass_input, pass_now, pass_change, pass_confirm;

    protected void onCreate (Bundle savedInstanceSaved){
        super.onCreate(savedInstanceSaved);
        setContentView(R.layout.activity_menu_siswa_changepass);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Intent intent = getIntent();
        id = Preferences.getLoggedPresensi(getBaseContext());
        noKelas = Preferences.getLoggedKelas(getBaseContext());
        noUser = Preferences.getLoggedUser(getBaseContext());

        tV_now = (TextView) findViewById(R.id.text_pass_now);
        tV_change = (TextView) findViewById(R.id.text_pass_change);
        tV_confirm = (TextView) findViewById(R.id.text_pass_confirm);

        eT_now = (EditText) findViewById(R.id.edit_pass_now);
        eT_change = (EditText) findViewById(R.id.edit_pass_change);
        eT_confirm = (EditText) findViewById(R.id.edit_pass_confirm);

        button_next = (Button) findViewById(R.id.button_next);
        button_change = (Button) findViewById(R.id.button_change);

        switch (noUser){
            case "1": {
                switch (noKelas) {
                    case "1":
                        s = Configuration.URL_LOGIN_STD_XIA1;
                        t = Configuration.URL_CHANGE_STD_XIA1;
                        break;
                    case "2":
                        s = Configuration.URL_LOGIN_STD_XIA2;
                        t = Configuration.URL_CHANGE_STD_XIA2;
                        break;
                    case "3":
                        s = Configuration.URL_LOGIN_STD_XIA3;
                        t = Configuration.URL_CHANGE_STD_XIA3;
                        break;
                    case "4":
                        s = Configuration.URL_LOGIN_STD_XIA4;
                        t = Configuration.URL_CHANGE_STD_XIA4;
                        break;
                    case "5":
                        s = Configuration.URL_LOGIN_STD_XIA5;
                        t = Configuration.URL_CHANGE_STD_XIA5;
                        break;
                }
            }
            break;
            case "3": {
                switch (noKelas) {
                    case "1":
                        s = Configuration.URL_LOGIN_PRT_XIA1;
                        t = Configuration.URL_CHANGE_PRT_XIA1;
                        break;
                    case "2":
                        s = Configuration.URL_LOGIN_PRT_XIA2;
                        t = Configuration.URL_CHANGE_PRT_XIA2;
                        break;
                    case "3":
                        s = Configuration.URL_LOGIN_PRT_XIA3;
                        t = Configuration.URL_CHANGE_PRT_XIA3;
                        break;
                    case "4":
                        s = Configuration.URL_LOGIN_PRT_XIA4;
                        t = Configuration.URL_CHANGE_PRT_XIA4;
                        break;
                    case "5":
                        s = Configuration.URL_LOGIN_PRT_XIA5;
                        t = Configuration.URL_CHANGE_PRT_XIA5;
                        break;
                }
            }
            break;
        }

        getStudents();
    }

    private void getStudents(){
        class GetStudents extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MenuSiswa_ChangePass.this,"Fetching...","Wait...",false,false);
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
            pass_input = c.getString(Configuration.TAG_PASS);

        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Gagal", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateStudents(){
        final String ID = id.trim();
        final String pass = eT_change.getText().toString().trim();

        class UpdateStudents extends AsyncTask<Void,Void,String>{
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MenuSiswa_ChangePass.this,"Updating...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(MenuSiswa_ChangePass.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... params) {
                HashMap<String,String> hashMap = new HashMap<>();
                hashMap.put(Configuration.KEY_STD_ID, ID);
                hashMap.put(Configuration.KEY_STD_PASS, pass);

                RequestHandler rh = new RequestHandler();
                String s = rh.sendPostRequest(t,hashMap);
                return s;
            }
        }

        UpdateStudents ue = new UpdateStudents();
        ue.execute();
    }

    public void Change(View view) {
        pass_change = eT_change.getText().toString();
        pass_confirm = eT_confirm.getText().toString();

        if (pass_change.equals(pass_confirm)){
            updateStudents();
            Intent intent = new Intent (this, MenuSiswa_Login.class);
            startActivity(intent);
            finish();
        }
        else {
            String empty = "";
            eT_confirm.setText(empty);
            Toast.makeText(this,"Password tidak sama", Toast.LENGTH_SHORT).show();
        }
    }

    public void Next(View view) {
        pass_now = eT_now.getText().toString();

        if (pass_input.equals(pass_now)){
            tV_now.setVisibility(View.GONE);
            eT_now.setVisibility(View.GONE);
            button_next.setVisibility(View.GONE);

            tV_change.setVisibility(View.VISIBLE);
            tV_confirm.setVisibility(View.VISIBLE);
            eT_change.setVisibility(View.VISIBLE);
            eT_confirm.setVisibility(View.VISIBLE);
            button_change.setVisibility(View.VISIBLE);
        }
        else {
            String empty = "";
            eT_now.setText(empty);
            Toast.makeText(this,"Wrong Password", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent (this, MenuSiswa_Semester.class);
        startActivity(intent);
        finish();
    }
}
