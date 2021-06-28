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

public class MenuGuru_Login extends AppCompatActivity {

    TextView tV_pass, textPass;
    EditText eT_password;
    Button button_pass;

    String noKelas, noMapel, s, id;
    String Pass_input, Pass_match;

    protected void onCreate (Bundle savedInstanceSaved){
        super.onCreate(savedInstanceSaved);
        setContentView(R.layout.activity_menu_guru_login);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        textPass = (TextView) findViewById(R.id.text_password);

        tV_pass = (TextView) findViewById(R.id.text_password);
        eT_password = (EditText) findViewById(R.id.edit_password);

        Intent intent = getIntent();
        noKelas = Preferences.getLoggedKelas(getBaseContext());
        noMapel = Preferences.getLoggedMapel(getBaseContext());
        id = noMapel;

        switch (noKelas){
            case "1":
                s = Configuration.URL_LOGIN_TCH_XIA1;
                break;
            case "2":
                s = Configuration.URL_LOGIN_TCH_XIA2;
                break;
            case "3":
                s = Configuration.URL_LOGIN_TCH_XIA3;
                break;
            case "4":
                s = Configuration.URL_LOGIN_TCH_XIA4;
                break;
            case "5":
                s = Configuration.URL_LOGIN_TCH_XIA5;
                break;
        }
        getTeachers();
    }

    private void getTeachers(){
        class GetTeachers extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MenuGuru_Login.this,"Fetching...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                showTeachers(s);
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String a = rh.sendGetRequestParam(s,id);
                return a;
            }
        }
        GetTeachers ge = new GetTeachers();
        ge.execute();
    }

    private void showTeachers(String json){
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
            Intent intent = new Intent (this, MenuGuru_Semester.class);
            startActivity(intent);
            finish();
        }else{
            String empty = "";
            eT_password.setText(empty);
            Toast.makeText(this,"Wrong Password", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed (){
        Intent intent = new Intent(this, MenuGuru_Kelas.class);
        startActivity(intent);
        finish();
    }
}
