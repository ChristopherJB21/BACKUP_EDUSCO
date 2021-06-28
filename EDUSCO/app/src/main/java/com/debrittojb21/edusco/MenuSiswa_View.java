package com.debrittojb21.edusco;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MenuSiswa_View extends AppCompatActivity {

    TextView title, Nama;
    TextView KD1, KD2, KD3, KD4, KD5, UTS, UAS, NH, NS, COMMENT, SEMESTER;
    String id, noAbsen, noKelas, noMapel, noSemester;
    String s, empty;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_siswa_view);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        noKelas = Preferences.getLoggedKelas(getBaseContext());
        noMapel = Preferences.getLoggedMapel(getBaseContext());
        noAbsen = Preferences.getLoggedPresensi(getBaseContext());
        noSemester = Preferences.getLoggedSemester(getBaseContext());
        id = noAbsen;

        title = (TextView) findViewById(R.id.title_mapel);
        Nama = (TextView) findViewById(R.id.Text_Nama);
        SEMESTER = (TextView) findViewById(R.id.title_semester);
        KD1 = (TextView) findViewById(R.id.Text_KD1);
        KD2 = (TextView) findViewById(R.id.Text_KD2);
        KD3 = (TextView) findViewById(R.id.Text_KD3);
        KD4 = (TextView) findViewById(R.id.Text_KD4);
        KD5 = (TextView) findViewById(R.id.Text_KD5);
        UTS = (TextView) findViewById(R.id.Text_UTS);
        UAS = (TextView) findViewById(R.id.Text_Comment);
        COMMENT = (TextView) findViewById(R.id.Text_comment);
        NH = (TextView) findViewById(R.id.Text_NH);
        NS = (TextView) findViewById(R.id.Text_NS);

        if (noSemester.equals("1"))
            SEMESTER.setText("Semester 1");
        else if (noSemester.equals("2"))
            SEMESTER.setText("Semester 2");

        get_url();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu_siswa, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()== R.id.ChangePassword){
            Intent intent = new Intent (this, MenuSiswa_ChangePass.class);
            startActivity(intent);
            finish();
        } else if (item.getItemId() == R.id.Save) {
            Intent intent = new Intent(this, MenuSiswa_Save.class);
            startActivity(intent);
            finish();
        } else if (item.getItemId() == R.id.Logout){
            Preferences.clearLoggedInUser(getBaseContext());

            Intent intent = new Intent(this, Menu_User.class);
            startActivity(intent);
            finish();
        }

        return true;
    }

    private void getScore(){
        class GetScore extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MenuSiswa_View.this,"Fetching...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                showScore(s);
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String a = rh.sendGetRequestParam(s,id);
                return a;
            }
        }
        GetScore ge = new GetScore();
        ge.execute();
    }

    private void showScore(String json){
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray result = jsonObject.getJSONArray(Configuration.TAG_JSON_ARRAY);
            JSONObject c = result.getJSONObject(0);
            String nama = c.getString(Configuration.TAG_NAMA);
            String kd1 = c.getString(Configuration.TAG_KD1);
            String kd2 = c.getString(Configuration.TAG_KD2);
            String kd3 = c.getString(Configuration.TAG_KD3);
            String kd4 = c.getString(Configuration.TAG_KD4);
            String kd5 = c.getString(Configuration.TAG_KD5);
            String uts = c.getString(Configuration.TAG_UTS);
            String uas = c.getString(Configuration.TAG_UAS);
            String comment = c.getString(Configuration.TAG_COMMENT);
            int nh = 0;
            int ns = 0;

            Nama.setText(nama);

            if (kd1 == "null")
                KD1.setText(empty);
            else if (kd1.length() == 0){
                kd1 = "null";
            }
            else
                KD1.setText(kd1);

            if (kd2 == "null")
                KD2.setText(empty);
            else if (kd2.length() == 0){
                kd2 = "null";
            }
            else
                KD2.setText(kd2);

            if (kd3 == "null")
                KD3.setText(empty);
            else if (kd3.length() == 0){
                kd3 = "null";
            }
            else
                KD3.setText(kd3);

            if (kd4 == "null")
                KD4.setText(empty);
            else if (kd4.length() == 0){
                kd4 = "null";
            }
            else
                KD4.setText(kd4);

            if (kd5 == "null")
                KD5.setText(empty);
            else if (kd5.length() == 0){
                kd5 = "null";
            }
            else
                KD5.setText(kd5);

            if (uts == "null")
                UTS.setText(empty);
            else if (uts.length() == 0){
                uts = "null";
            }
            else
                UTS.setText(uts);

            if (uas == "null")
                UAS.setText(empty);
            else if (uas.length() == 0){
                uas = "null";
            }
            else
                UAS.setText(uas);

            if (comment == "null")
                UAS.setText(empty);
            else if (comment.length() == 0){
                comment = "null";
            }
            else
                COMMENT.setText(comment);

            if (kd1 == "null" && kd2 == "null" && kd3 == "null" && kd4 == "null" && kd5 == "null"){
                NH.setText(empty);
            }
            else if(kd2 == "null" && kd3 == "null" && kd4 == "null" && kd5 == "null"){
                int k1 = Integer.parseInt(kd1);

                nh = k1;

                String hasil = String.valueOf(nh);
                NH.setText(hasil);
            }
            else if (kd3 == "null" && kd4 == "null" && kd5 == "null"){
                int k1 = Integer.parseInt(kd1);
                int k2 = Integer.parseInt(kd2);

                nh = (k1 + k2) / 2;

                String hasil = String.valueOf(nh);
                NH.setText(hasil);
            }
            else if (kd4 == "null" && kd5 == "null"){
                int k1 = Integer.parseInt(kd1);
                int k2 = Integer.parseInt(kd2);
                int k3 = Integer.parseInt(kd3);
                nh = (k1 + k2 + k3) / 3;

                String hasil = String.valueOf(nh);
                NH.setText(hasil);
            }
            else if (kd5 == "null"){
                int k1 = Integer.parseInt(kd1);
                int k2 = Integer.parseInt(kd2);
                int k3 = Integer.parseInt(kd3);
                int k4 = Integer.parseInt(kd4);
                nh = (k1 + k2 + k3 + k4) / 4;

                String hasil = String.valueOf(nh);
                NH.setText(hasil);
            }
            else{
                int k1 = Integer.parseInt(kd1);
                int k2 = Integer.parseInt(kd2);
                int k3 = Integer.parseInt(kd3);
                int k4 = Integer.parseInt(kd4);
                int k5 = Integer.parseInt(kd5);
                nh = (k1 + k2 + k3 + k4 + k5) / 5;

                String hasil = String.valueOf(nh);
                NH.setText(hasil);
            }

            if (uts == "null" && uas == "null"){
                NS.setText(empty);
            }
            else if (uts != "null" && uas == "null"){
                NS.setText(uts);
            }
            else{
                int kt = Integer.parseInt(uts);
                int ks = Integer.parseInt(uas);

                ns = (nh + kt + ks) / 3;

                String hasil = String.valueOf(ns);
                NS.setText(hasil);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Gagal dan lucu", Toast.LENGTH_SHORT).show();
        }
    }

    public void Previous(View view) {
        refresh();

        int noM = Integer.parseInt(noMapel);
        noM -= 1;

        if (noM < 1){
            noM = 15;
        }

        noMapel = String.valueOf(noM);
        get_url();
    }

    public void Next(View view) {
        refresh();

        int noM = Integer.parseInt(noMapel);
        noM += 1;

        if(noM > 15){
            noM = 1;
        }

        noMapel = String.valueOf(noM);
        get_url();
    }

    private void get_url (){
        switch (noMapel){
            case "1":
                title.setText("Agama");
                break;
            case "2":
                title.setText("PKN");
                break;
            case "3":
                title.setText("Bahasa Indonesia");
                break;
            case "4":
                title.setText("Matematika Wajib");
                break;
            case "5":
                title.setText("Sejarah");
                break;
            case "6":
                title.setText("Bahasa Inggris Wajib");
                break;
            case "7":
                title.setText("Seni Rupa");
                break;
            case "8":
                title.setText("Olahraga");
                break;
            case "9":
                title.setText("PKWU");
                break;
            case "10":
                title.setText("Matematika Minat");
                break;
            case "11":
                title.setText("Biologi");
                break;
            case "12":
                title.setText("Fisika");
                break;
            case "13":
                title.setText("Kimia");
                break;
            case "14":
                title.setText("Bahasa Inggris Minat");
                break;
            case "15":
                title.setText("Bahasa Jerman");
                break;
        }

        switch (noKelas) {
            case "1": {
                switch (noSemester) {
                    case "1": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEW_AGAMA_XIA1_SMT1;
                                break;
                            case "2":
                                s = Configuration.URL_VIEW_PKN_XIA1_SMT1;
                                break;
                            case "3":
                                s = Configuration.URL_VIEW_INDO_XIA1_SMT1;
                                break;
                            case "4":
                                s = Configuration.URL_VIEW_MATH_XIA1_SMT1;
                                break;
                            case "5":
                                s = Configuration.URL_VIEW_SEJARAH_XIA1_SMT1;
                                break;
                            case "6":
                                s = Configuration.URL_VIEW_BING_XIA1_SMT1;
                                break;
                            case "7":
                                s = Configuration.URL_VIEW_ART_XIA1_SMT1;
                                break;
                            case "8":
                                s = Configuration.URL_VIEW_OR_XIA1_SMT1;
                                break;
                            case "9":
                                s = Configuration.URL_VIEW_PKWU_XIA1_SMT1;
                                break;
                            case "10":
                                s = Configuration.URL_VIEW_MATHMINAT_XIA1_SMT1;
                                break;
                            case "11":
                                s = Configuration.URL_VIEW_BIOLOGI_XIA1_SMT1;
                                break;
                            case "12":
                                s = Configuration.URL_VIEW_FISIKA_XIA1_SMT1;
                                break;
                            case "13":
                                s = Configuration.URL_VIEW_KIMIA_XIA1_SMT1;
                                break;
                            case "14":
                                s = Configuration.URL_VIEW_BINGMINAT_XIA1_SMT1;
                                break;
                            case "15":
                                s = Configuration.URL_VIEW_BJERMAN_XIA1_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEW_AGAMA_XIA1_SMT2;
                                break;
                            case "2":
                                s = Configuration.URL_VIEW_PKN_XIA1_SMT2;
                                break;
                            case "3":
                                s = Configuration.URL_VIEW_INDO_XIA1_SMT2;
                                break;
                            case "4":
                                s = Configuration.URL_VIEW_MATH_XIA1_SMT2;
                                break;
                            case "5":
                                s = Configuration.URL_VIEW_SEJARAH_XIA1_SMT2;
                                break;
                            case "6":
                                s = Configuration.URL_VIEW_BING_XIA1_SMT2;
                                break;
                            case "7":
                                s = Configuration.URL_VIEW_ART_XIA1_SMT2;
                                break;
                            case "8":
                                s = Configuration.URL_VIEW_OR_XIA1_SMT2;
                                break;
                            case "9":
                                s = Configuration.URL_VIEW_PKWU_XIA1_SMT2;
                                break;
                            case "10":
                                s = Configuration.URL_VIEW_MATHMINAT_XIA1_SMT2;
                                break;
                            case "11":
                                s = Configuration.URL_VIEW_BIOLOGI_XIA1_SMT2;
                                break;
                            case "12":
                                s = Configuration.URL_VIEW_FISIKA_XIA1_SMT2;
                                break;
                            case "13":
                                s = Configuration.URL_VIEW_KIMIA_XIA1_SMT2;
                                break;
                            case "14":
                                s = Configuration.URL_VIEW_BINGMINAT_XIA1_SMT2;
                                break;
                            case "15":
                                s = Configuration.URL_VIEW_BJERMAN_XIA1_SMT2;
                                break;
                        }
                    } break;
                }
            } break;

            case "2": {
                switch (noSemester) {
                    case "1": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEW_AGAMA_XIA2_SMT1;
                                break;
                            case "2":
                                s = Configuration.URL_VIEW_PKN_XIA2_SMT1;
                                break;
                            case "3":
                                s = Configuration.URL_VIEW_INDO_XIA2_SMT1;
                                break;
                            case "4":
                                s = Configuration.URL_VIEW_MATH_XIA2_SMT1;
                                break;
                            case "5":
                                s = Configuration.URL_VIEW_SEJARAH_XIA2_SMT1;
                                break;
                            case "6":
                                s = Configuration.URL_VIEW_BING_XIA2_SMT1;
                                break;
                            case "7":
                                s = Configuration.URL_VIEW_ART_XIA2_SMT1;
                                break;
                            case "8":
                                s = Configuration.URL_VIEW_OR_XIA2_SMT1;
                                break;
                            case "9":
                                s = Configuration.URL_VIEW_PKWU_XIA2_SMT1;
                                break;
                            case "10":
                                s = Configuration.URL_VIEW_MATHMINAT_XIA2_SMT1;
                                break;
                            case "11":
                                s = Configuration.URL_VIEW_BIOLOGI_XIA2_SMT1;
                                break;
                            case "12":
                                s = Configuration.URL_VIEW_FISIKA_XIA2_SMT1;
                                break;
                            case "13":
                                s = Configuration.URL_VIEW_KIMIA_XIA2_SMT1;
                                break;
                            case "14":
                                s = Configuration.URL_VIEW_BINGMINAT_XIA2_SMT1;
                                break;
                            case "15":
                                s = Configuration.URL_VIEW_BJERMAN_XIA2_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEW_AGAMA_XIA2_SMT2;
                                break;
                            case "2":
                                s = Configuration.URL_VIEW_PKN_XIA2_SMT2;
                                break;
                            case "3":
                                s = Configuration.URL_VIEW_INDO_XIA2_SMT2;
                                break;
                            case "4":
                                s = Configuration.URL_VIEW_MATH_XIA2_SMT2;
                                break;
                            case "5":
                                s = Configuration.URL_VIEW_SEJARAH_XIA2_SMT2;
                                break;
                            case "6":
                                s = Configuration.URL_VIEW_BING_XIA2_SMT2;
                                break;
                            case "7":
                                s = Configuration.URL_VIEW_ART_XIA2_SMT2;
                                break;
                            case "8":
                                s = Configuration.URL_VIEW_OR_XIA2_SMT2;
                                break;
                            case "9":
                                s = Configuration.URL_VIEW_PKWU_XIA2_SMT2;
                                break;
                            case "10":
                                s = Configuration.URL_VIEW_MATHMINAT_XIA2_SMT2;
                                break;
                            case "11":
                                s = Configuration.URL_VIEW_BIOLOGI_XIA2_SMT2;
                                break;
                            case "12":
                                s = Configuration.URL_VIEW_FISIKA_XIA2_SMT2;
                                break;
                            case "13":
                                s = Configuration.URL_VIEW_KIMIA_XIA2_SMT2;
                                break;
                            case "14":
                                s = Configuration.URL_VIEW_BINGMINAT_XIA2_SMT2;
                                break;
                            case "15":
                                s = Configuration.URL_VIEW_BJERMAN_XIA2_SMT2;
                                break;
                        }
                    } break;
                }
            } break;

            case "3": {
                switch (noSemester) {
                    case "1": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEW_AGAMA_XIA3_SMT1;
                                break;
                            case "2":
                                s = Configuration.URL_VIEW_PKN_XIA3_SMT1;
                                break;
                            case "3":
                                s = Configuration.URL_VIEW_INDO_XIA3_SMT1;
                                break;
                            case "4":
                                s = Configuration.URL_VIEW_MATH_XIA3_SMT1;
                                break;
                            case "5":
                                s = Configuration.URL_VIEW_SEJARAH_XIA3_SMT1;
                                break;
                            case "6":
                                s = Configuration.URL_VIEW_BING_XIA3_SMT1;
                                break;
                            case "7":
                                s = Configuration.URL_VIEW_ART_XIA3_SMT1;
                                break;
                            case "8":
                                s = Configuration.URL_VIEW_OR_XIA3_SMT1;
                                break;
                            case "9":
                                s = Configuration.URL_VIEW_PKWU_XIA3_SMT1;
                                break;
                            case "10":
                                s = Configuration.URL_VIEW_MATHMINAT_XIA3_SMT1;
                                break;
                            case "11":
                                s = Configuration.URL_VIEW_BIOLOGI_XIA3_SMT1;
                                break;
                            case "12":
                                s = Configuration.URL_VIEW_FISIKA_XIA3_SMT1;
                                break;
                            case "13":
                                s = Configuration.URL_VIEW_KIMIA_XIA3_SMT1;
                                break;
                            case "14":
                                s = Configuration.URL_VIEW_BINGMINAT_XIA3_SMT1;
                                break;
                            case "15":
                                s = Configuration.URL_VIEW_BJERMAN_XIA3_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEW_AGAMA_XIA3_SMT2;
                                break;
                            case "2":
                                s = Configuration.URL_VIEW_PKN_XIA3_SMT2;
                                break;
                            case "3":
                                s = Configuration.URL_VIEW_INDO_XIA3_SMT2;
                                break;
                            case "4":
                                s = Configuration.URL_VIEW_MATH_XIA3_SMT2;
                                break;
                            case "5":
                                s = Configuration.URL_VIEW_SEJARAH_XIA3_SMT2;
                                break;
                            case "6":
                                s = Configuration.URL_VIEW_BING_XIA3_SMT2;
                                break;
                            case "7":
                                s = Configuration.URL_VIEW_ART_XIA3_SMT2;
                                break;
                            case "8":
                                s = Configuration.URL_VIEW_OR_XIA3_SMT2;
                                break;
                            case "9":
                                s = Configuration.URL_VIEW_PKWU_XIA3_SMT2;
                                break;
                            case "10":
                                s = Configuration.URL_VIEW_MATHMINAT_XIA3_SMT2;
                                break;
                            case "11":
                                s = Configuration.URL_VIEW_BIOLOGI_XIA3_SMT2;
                                break;
                            case "12":
                                s = Configuration.URL_VIEW_FISIKA_XIA3_SMT2;
                                break;
                            case "13":
                                s = Configuration.URL_VIEW_KIMIA_XIA3_SMT2;
                                break;
                            case "14":
                                s = Configuration.URL_VIEW_BINGMINAT_XIA3_SMT2;
                                break;
                            case "15":
                                s = Configuration.URL_VIEW_BJERMAN_XIA3_SMT2;
                                break;
                        }
                    } break;
                }
            } break;

            case "4": {
                switch (noSemester) {
                    case "1": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEW_AGAMA_XIA4_SMT1;
                                break;
                            case "2":
                                s = Configuration.URL_VIEW_PKN_XIA4_SMT1;
                                break;
                            case "3":
                                s = Configuration.URL_VIEW_INDO_XIA4_SMT1;
                                break;
                            case "4":
                                s = Configuration.URL_VIEW_MATH_XIA4_SMT1;
                                break;
                            case "5":
                                s = Configuration.URL_VIEW_SEJARAH_XIA4_SMT1;
                                break;
                            case "6":
                                s = Configuration.URL_VIEW_BING_XIA4_SMT1;
                                break;
                            case "7":
                                s = Configuration.URL_VIEW_ART_XIA4_SMT1;
                                break;
                            case "8":
                                s = Configuration.URL_VIEW_OR_XIA4_SMT1;
                                break;
                            case "9":
                                s = Configuration.URL_VIEW_PKWU_XIA4_SMT1;
                                break;
                            case "10":
                                s = Configuration.URL_VIEW_MATHMINAT_XIA4_SMT1;
                                break;
                            case "11":
                                s = Configuration.URL_VIEW_BIOLOGI_XIA4_SMT1;
                                break;
                            case "12":
                                s = Configuration.URL_VIEW_FISIKA_XIA4_SMT1;
                                break;
                            case "13":
                                s = Configuration.URL_VIEW_KIMIA_XIA4_SMT1;
                                break;
                            case "14":
                                s = Configuration.URL_VIEW_BINGMINAT_XIA4_SMT1;
                                break;
                            case "15":
                                s = Configuration.URL_VIEW_BJERMAN_XIA4_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEW_AGAMA_XIA4_SMT2;
                                break;
                            case "2":
                                s = Configuration.URL_VIEW_PKN_XIA4_SMT2;
                                break;
                            case "3":
                                s = Configuration.URL_VIEW_INDO_XIA4_SMT2;
                                break;
                            case "4":
                                s = Configuration.URL_VIEW_MATH_XIA4_SMT2;
                                break;
                            case "5":
                                s = Configuration.URL_VIEW_SEJARAH_XIA4_SMT2;
                                break;
                            case "6":
                                s = Configuration.URL_VIEW_BING_XIA4_SMT2;
                                break;
                            case "7":
                                s = Configuration.URL_VIEW_ART_XIA4_SMT2;
                                break;
                            case "8":
                                s = Configuration.URL_VIEW_OR_XIA4_SMT2;
                                break;
                            case "9":
                                s = Configuration.URL_VIEW_PKWU_XIA4_SMT2;
                                break;
                            case "10":
                                s = Configuration.URL_VIEW_MATHMINAT_XIA4_SMT2;
                                break;
                            case "11":
                                s = Configuration.URL_VIEW_BIOLOGI_XIA4_SMT2;
                                break;
                            case "12":
                                s = Configuration.URL_VIEW_FISIKA_XIA4_SMT2;
                                break;
                            case "13":
                                s = Configuration.URL_VIEW_KIMIA_XIA4_SMT2;
                                break;
                            case "14":
                                s = Configuration.URL_VIEW_BINGMINAT_XIA4_SMT2;
                                break;
                            case "15":
                                s = Configuration.URL_VIEW_BJERMAN_XIA4_SMT2;
                                break;
                        }
                    } break;
                }
            } break;

            case "5": {
                switch (noSemester) {
                    case "1": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEW_AGAMA_XIA5_SMT1;
                                break;
                            case "2":
                                s = Configuration.URL_VIEW_PKN_XIA5_SMT1;
                                break;
                            case "3":
                                s = Configuration.URL_VIEW_INDO_XIA5_SMT1;
                                break;
                            case "4":
                                s = Configuration.URL_VIEW_MATH_XIA5_SMT1;
                                break;
                            case "5":
                                s = Configuration.URL_VIEW_SEJARAH_XIA5_SMT1;
                                break;
                            case "6":
                                s = Configuration.URL_VIEW_BING_XIA5_SMT1;
                                break;
                            case "7":
                                s = Configuration.URL_VIEW_ART_XIA5_SMT1;
                                break;
                            case "8":
                                s = Configuration.URL_VIEW_OR_XIA5_SMT1;
                                break;
                            case "9":
                                s = Configuration.URL_VIEW_PKWU_XIA5_SMT1;
                                break;
                            case "10":
                                s = Configuration.URL_VIEW_MATHMINAT_XIA5_SMT1;
                                break;
                            case "11":
                                s = Configuration.URL_VIEW_BIOLOGI_XIA5_SMT1;
                                break;
                            case "12":
                                s = Configuration.URL_VIEW_FISIKA_XIA5_SMT1;
                                break;
                            case "13":
                                s = Configuration.URL_VIEW_KIMIA_XIA5_SMT1;
                                break;
                            case "14":
                                s = Configuration.URL_VIEW_BINGMINAT_XIA5_SMT1;
                                break;
                            case "15":
                                s = Configuration.URL_VIEW_BJERMAN_XIA5_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEW_AGAMA_XIA5_SMT2;
                                break;
                            case "2":
                                s = Configuration.URL_VIEW_PKN_XIA5_SMT2;
                                break;
                            case "3":
                                s = Configuration.URL_VIEW_INDO_XIA5_SMT2;
                                break;
                            case "4":
                                s = Configuration.URL_VIEW_MATH_XIA5_SMT2;
                                break;
                            case "5":
                                s = Configuration.URL_VIEW_SEJARAH_XIA5_SMT2;
                                break;
                            case "6":
                                s = Configuration.URL_VIEW_BING_XIA5_SMT2;
                                break;
                            case "7":
                                s = Configuration.URL_VIEW_ART_XIA5_SMT2;
                                break;
                            case "8":
                                s = Configuration.URL_VIEW_OR_XIA5_SMT2;
                                break;
                            case "9":
                                s = Configuration.URL_VIEW_PKWU_XIA5_SMT2;
                                break;
                            case "10":
                                s = Configuration.URL_VIEW_MATHMINAT_XIA5_SMT2;
                                break;
                            case "11":
                                s = Configuration.URL_VIEW_BIOLOGI_XIA5_SMT2;
                                break;
                            case "12":
                                s = Configuration.URL_VIEW_FISIKA_XIA5_SMT2;
                                break;
                            case "13":
                                s = Configuration.URL_VIEW_KIMIA_XIA5_SMT2;
                                break;
                            case "14":
                                s = Configuration.URL_VIEW_BINGMINAT_XIA5_SMT2;
                                break;
                            case "15":
                                s = Configuration.URL_VIEW_BJERMAN_XIA5_SMT2;
                                break;
                        }
                    } break;
                }
            } break;
        }

        getScore();
    }

    private void refresh (){
        KD1.setText(empty);
        KD2.setText(empty);
        KD3.setText(empty);
        KD4.setText(empty);
        KD5.setText(empty);
        UTS.setText(empty);
        UAS.setText(empty);
        NH.setText(empty);
        NS.setText(empty);
        COMMENT.setText(empty);
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent (this, MenuSiswa_Mapel.class);
        startActivity(intent);
        finish();
    }
}
