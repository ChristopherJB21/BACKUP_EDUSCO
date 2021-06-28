package com.debrittojb21.edusco;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuSiswa_Save extends AppCompatActivity {

    private String nameFile;
    private static final int MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE = 1;

    String s, id, noAbsen, noKelas;

    String id_1, nama_1, kd1_1, kd2_1, kd3_1, kd4_1, kd5_1, uts_1, uas_1, coment_1;
    String id_2, nama_2, kd1_2, kd2_2, kd3_2, kd4_2, kd5_2, uts_2, uas_2, coment_2;
    String id_3, nama_3, kd1_3, kd2_3, kd3_3, kd4_3, kd5_3, uts_3, uas_3, coment_3;
    String id_4, nama_4, kd1_4, kd2_4, kd3_4, kd4_4, kd5_4, uts_4, uas_4, coment_4;
    String id_5, nama_5, kd1_5, kd2_5, kd3_5, kd4_5, kd5_5, uts_5, uas_5, coment_5;
    String id_6, nama_6, kd1_6, kd2_6, kd3_6, kd4_6, kd5_6, uts_6, uas_6, coment_6;
    String id_7, nama_7, kd1_7, kd2_7, kd3_7, kd4_7, kd5_7, uts_7, uas_7, coment_7;
    String id_8, nama_8, kd1_8, kd2_8, kd3_8, kd4_8, kd5_8, uts_8, uas_8, coment_8;
    String id_9, nama_9, kd1_9, kd2_9, kd3_9, kd4_9, kd5_9, uts_9, uas_9, coment_9;
    String id_10, nama_10, kd1_10, kd2_10, kd3_10, kd4_10, kd5_10, uts_10, uas_10, coment_10;
    String id_11, nama_11, kd1_11, kd2_11, kd3_11, kd4_11, kd5_11, uts_11, uas_11, coment_11;
    String id_12, nama_12, kd1_12, kd2_12, kd3_12, kd4_12, kd5_12, uts_12, uas_12, coment_12;
    String id_13, nama_13, kd1_13, kd2_13, kd3_13, kd4_13, kd5_13, uts_13, uas_13, coment_13;
    String id_14, nama_14, kd1_14, kd2_14, kd3_14, kd4_14, kd5_14, uts_14, uas_14, coment_14;
    String id_15, nama_15, kd1_15, kd2_15, kd3_15, kd4_15, kd5_15, uts_15, uas_15, coment_15;
    String id_16, nama_16, kd1_16, kd2_16, kd3_16, kd4_16, kd5_16, uts_16, uas_16, coment_16;
    String id_17, nama_17, kd1_17, kd2_17, kd3_17, kd4_17, kd5_17, uts_17, uas_17, coment_17;
    String id_18, nama_18, kd1_18, kd2_18, kd3_18, kd4_18, kd5_18, uts_18, uas_18, coment_18;
    String id_19, nama_19, kd1_19, kd2_19, kd3_19, kd4_19, kd5_19, uts_19, uas_19, coment_19;
    String id_20, nama_20, kd1_20, kd2_20, kd3_20, kd4_20, kd5_20, uts_20, uas_20, coment_20;
    String id_21, nama_21, kd1_21, kd2_21, kd3_21, kd4_21, kd5_21, uts_21, uas_21, coment_21;
    String id_22, nama_22, kd1_22, kd2_22, kd3_22, kd4_22, kd5_22, uts_22, uas_22, coment_22;
    String id_23, nama_23, kd1_23, kd2_23, kd3_23, kd4_23, kd5_23, uts_23, uas_23, coment_23;
    String id_24, nama_24, kd1_24, kd2_24, kd3_24, kd4_24, kd5_24, uts_24, uas_24, coment_24;
    String id_25, nama_25, kd1_25, kd2_25, kd3_25, kd4_25, kd5_25, uts_25, uas_25, coment_25;
    String id_26, nama_26, kd1_26, kd2_26, kd3_26, kd4_26, kd5_26, uts_26, uas_26, coment_26;
    String id_27, nama_27, kd1_27, kd2_27, kd3_27, kd4_27, kd5_27, uts_27, uas_27, coment_27;
    String id_28, nama_28, kd1_28, kd2_28, kd3_28, kd4_28, kd5_28, uts_28, uas_28, coment_28;
    String id_29, nama_29, kd1_29, kd2_29, kd3_29, kd4_29, kd5_29, uts_29, uas_29, coment_29;
    String id_30, nama_30, kd1_30, kd2_30, kd3_30, kd4_30, kd5_30, uts_30, uas_30, coment_30;

    int nh_1, ns_1;
    int nh_2, ns_2;
    int nh_3, ns_3;
    int nh_4, ns_4;
    int nh_5, ns_5;
    int nh_6, ns_6;
    int nh_7, ns_7;
    int nh_8, ns_8;
    int nh_9, ns_9;
    int nh_10, ns_10;
    int nh_11, ns_11;
    int nh_12, ns_12;
    int nh_13, ns_13;
    int nh_14, ns_14;
    int nh_15, ns_15;
    int nh_16, ns_16;
    int nh_17, ns_17;
    int nh_18, ns_18;
    int nh_19, ns_19;
    int nh_20, ns_20;
    int nh_21, ns_21;
    int nh_22, ns_22;
    int nh_23, ns_23;
    int nh_24, ns_24;
    int nh_25, ns_25;
    int nh_26, ns_26;
    int nh_27, ns_27;
    int nh_28, ns_28;
    int nh_29, ns_29;
    int nh_30, ns_30;

    int na_1;
    int na_2;
    int na_3;
    int na_4;
    int na_5;
    int na_6;
    int na_7;
    int na_8;
    int na_9;
    int na_10;
    int na_11;
    int na_12;
    int na_13;
    int na_14;
    int na_15;

    boolean tw_1, tw_2, tw_3, tm;

    String t_1;
    String t_2;
    String t_3;
    String t_4;
    String t_5;
    String t_6;
    String t_7;
    String t_8;
    String t_9;
    String t_10;
    String t_11;
    String t_12;
    String t_13;
    String t_14;
    String t_15;

    String keputusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_siswa_save);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        noKelas = Preferences.getLoggedKelas(getBaseContext());
        noAbsen = Preferences.getLoggedPresensi(getBaseContext());
        id = noAbsen;

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)){
                Toast.makeText(this, "Izin ini diperlukan untuk menyimpan raport", Toast.LENGTH_SHORT).show();
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE);
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE);
            }
        } else {
            getUrl();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    getUrl();
                } else {
                    Intent intent = new Intent(this, MenuSiswa_Semester.class);
                    startActivity(intent);
                    finish();
                }
                return;
            }
        }
    }

    private void getUrl (){
        switch (noKelas){
            case "1":
                s = Configuration.URL_SAVE_XIA1;
                break;
            case "2":
                s = Configuration.URL_SAVE_XIA2;
                break;
            case "3":
                s = Configuration.URL_SAVE_XIA3;
                break;
            case "4":
                s = Configuration.URL_SAVE_XIA4;
                break;
            case "5":
                s = Configuration.URL_SAVE_XIA5;
                break;
        }

        getScore();
    }

    private void getScore(){
        class GetScore extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MenuSiswa_Save.this,"Saving","Please Wait",false, false);
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

            id_1 = c.getString(Configuration.TAG_ID_1);
            nama_1 = c.getString(Configuration.TAG_NAMA_1);
            kd1_1 = c.getString(Configuration.TAG_KD1_1);
            kd2_1 = c.getString(Configuration.TAG_KD2_1);
            kd3_1 = c.getString(Configuration.TAG_KD3_1);
            kd4_1 = c.getString(Configuration.TAG_KD4_1);
            kd5_1 = c.getString(Configuration.TAG_KD5_1);
            uts_1 = c.getString(Configuration.TAG_UTS_1);
            uas_1 = c.getString(Configuration.TAG_UAS_1);
            coment_1 = c.getString(Configuration.TAG_COMMENT_1);

            id_2 = c.getString(Configuration.TAG_ID_2);
            nama_2 = c.getString(Configuration.TAG_NAMA_2);
            kd1_2 = c.getString(Configuration.TAG_KD1_2);
            kd2_2 = c.getString(Configuration.TAG_KD2_2);
            kd3_2 = c.getString(Configuration.TAG_KD3_2);
            kd4_2 = c.getString(Configuration.TAG_KD4_2);
            kd5_2 = c.getString(Configuration.TAG_KD5_2);
            uts_2 = c.getString(Configuration.TAG_UTS_2);
            uas_2 = c.getString(Configuration.TAG_UAS_2);
            coment_2 = c.getString(Configuration.TAG_COMMENT_2);

            id_3 = c.getString(Configuration.TAG_ID_3);
            nama_3 = c.getString(Configuration.TAG_NAMA_3);
            kd1_3 = c.getString(Configuration.TAG_KD1_3);
            kd2_3 = c.getString(Configuration.TAG_KD2_3);
            kd3_3 = c.getString(Configuration.TAG_KD3_3);
            kd4_3 = c.getString(Configuration.TAG_KD4_3);
            kd5_3 = c.getString(Configuration.TAG_KD5_3);
            uts_3 = c.getString(Configuration.TAG_UTS_3);
            uas_3 = c.getString(Configuration.TAG_UAS_3);
            coment_3 = c.getString(Configuration.TAG_COMMENT_3);

            id_4 = c.getString(Configuration.TAG_ID_4);
            nama_4 = c.getString(Configuration.TAG_NAMA_4);
            kd1_4 = c.getString(Configuration.TAG_KD1_4);
            kd2_4 = c.getString(Configuration.TAG_KD2_4);
            kd3_4 = c.getString(Configuration.TAG_KD3_4);
            kd4_4 = c.getString(Configuration.TAG_KD4_4);
            kd5_4 = c.getString(Configuration.TAG_KD5_4);
            uts_4 = c.getString(Configuration.TAG_UTS_4);
            uas_4 = c.getString(Configuration.TAG_UAS_4);
            coment_4 = c.getString(Configuration.TAG_COMMENT_4);

            id_5 = c.getString(Configuration.TAG_ID_5);
            nama_5 = c.getString(Configuration.TAG_NAMA_5);
            kd1_5 = c.getString(Configuration.TAG_KD1_5);
            kd2_5 = c.getString(Configuration.TAG_KD2_5);
            kd3_5 = c.getString(Configuration.TAG_KD3_5);
            kd4_5 = c.getString(Configuration.TAG_KD4_5);
            kd5_5 = c.getString(Configuration.TAG_KD5_5);
            uts_5 = c.getString(Configuration.TAG_UTS_5);
            uas_5 = c.getString(Configuration.TAG_UAS_5);
            coment_5 = c.getString(Configuration.TAG_COMMENT_5);

            id_6 = c.getString(Configuration.TAG_ID_6);
            nama_6 = c.getString(Configuration.TAG_NAMA_6);
            kd1_6 = c.getString(Configuration.TAG_KD1_6);
            kd2_6 = c.getString(Configuration.TAG_KD2_6);
            kd3_6 = c.getString(Configuration.TAG_KD3_6);
            kd4_6 = c.getString(Configuration.TAG_KD4_6);
            kd5_6 = c.getString(Configuration.TAG_KD5_6);
            uts_6 = c.getString(Configuration.TAG_UTS_6);
            uas_6 = c.getString(Configuration.TAG_UAS_6);
            coment_6 = c.getString(Configuration.TAG_COMMENT_6);

            id_7 = c.getString(Configuration.TAG_ID_7);
            nama_7 = c.getString(Configuration.TAG_NAMA_7);
            kd1_7 = c.getString(Configuration.TAG_KD1_7);
            kd2_7 = c.getString(Configuration.TAG_KD2_7);
            kd3_7 = c.getString(Configuration.TAG_KD3_7);
            kd4_7 = c.getString(Configuration.TAG_KD4_7);
            kd5_7 = c.getString(Configuration.TAG_KD5_7);
            uts_7 = c.getString(Configuration.TAG_UTS_7);
            uas_7 = c.getString(Configuration.TAG_UAS_7);
            coment_7 = c.getString(Configuration.TAG_COMMENT_7);

            id_8 = c.getString(Configuration.TAG_ID_8);
            nama_8 = c.getString(Configuration.TAG_NAMA_8);
            kd1_8 = c.getString(Configuration.TAG_KD1_8);
            kd2_8 = c.getString(Configuration.TAG_KD2_8);
            kd3_8 = c.getString(Configuration.TAG_KD3_8);
            kd4_8 = c.getString(Configuration.TAG_KD4_8);
            kd5_8 = c.getString(Configuration.TAG_KD5_8);
            uts_8 = c.getString(Configuration.TAG_UTS_8);
            uas_8 = c.getString(Configuration.TAG_UAS_8);
            coment_8 = c.getString(Configuration.TAG_COMMENT_8);

            id_9 = c.getString(Configuration.TAG_ID_9);
            nama_9 = c.getString(Configuration.TAG_NAMA_9);
            kd1_9 = c.getString(Configuration.TAG_KD1_9);
            kd2_9 = c.getString(Configuration.TAG_KD2_9);
            kd3_9 = c.getString(Configuration.TAG_KD3_9);
            kd4_9 = c.getString(Configuration.TAG_KD4_9);
            kd5_9 = c.getString(Configuration.TAG_KD5_9);
            uts_9 = c.getString(Configuration.TAG_UTS_9);
            uas_9 = c.getString(Configuration.TAG_UAS_9);
            coment_9 = c.getString(Configuration.TAG_COMMENT_9);

            id_10 = c.getString(Configuration.TAG_ID_10);
            nama_10 = c.getString(Configuration.TAG_NAMA_10);
            kd1_10 = c.getString(Configuration.TAG_KD1_10);
            kd2_10 = c.getString(Configuration.TAG_KD2_10);
            kd3_10 = c.getString(Configuration.TAG_KD3_10);
            kd4_10 = c.getString(Configuration.TAG_KD4_10);
            kd5_10 = c.getString(Configuration.TAG_KD5_10);
            uts_10 = c.getString(Configuration.TAG_UTS_10);
            uas_10 = c.getString(Configuration.TAG_UAS_10);
            coment_10 = c.getString(Configuration.TAG_COMMENT_10);

            id_11 = c.getString(Configuration.TAG_ID_11);
            nama_11 = c.getString(Configuration.TAG_NAMA_11);
            kd1_11 = c.getString(Configuration.TAG_KD1_11);
            kd2_11 = c.getString(Configuration.TAG_KD2_11);
            kd3_11 = c.getString(Configuration.TAG_KD3_11);
            kd4_11 = c.getString(Configuration.TAG_KD4_11);
            kd5_11 = c.getString(Configuration.TAG_KD5_11);
            uts_11 = c.getString(Configuration.TAG_UTS_11);
            uas_11 = c.getString(Configuration.TAG_UAS_11);
            coment_11 = c.getString(Configuration.TAG_COMMENT_11);

            id_12 = c.getString(Configuration.TAG_ID_12);
            nama_12 = c.getString(Configuration.TAG_NAMA_12);
            kd1_12 = c.getString(Configuration.TAG_KD1_12);
            kd2_12 = c.getString(Configuration.TAG_KD2_12);
            kd3_12 = c.getString(Configuration.TAG_KD3_12);
            kd4_12 = c.getString(Configuration.TAG_KD4_12);
            kd5_12 = c.getString(Configuration.TAG_KD5_12);
            uts_12 = c.getString(Configuration.TAG_UTS_12);
            uas_12 = c.getString(Configuration.TAG_UAS_12);
            coment_12 = c.getString(Configuration.TAG_COMMENT_12);

            id_13 = c.getString(Configuration.TAG_ID_13);
            nama_13 = c.getString(Configuration.TAG_NAMA_13);
            kd1_13 = c.getString(Configuration.TAG_KD1_13);
            kd2_13 = c.getString(Configuration.TAG_KD2_13);
            kd3_13 = c.getString(Configuration.TAG_KD3_13);
            kd4_13 = c.getString(Configuration.TAG_KD4_13);
            kd5_13 = c.getString(Configuration.TAG_KD5_13);
            uts_13 = c.getString(Configuration.TAG_UTS_13);
            uas_13 = c.getString(Configuration.TAG_UAS_13);
            coment_13 = c.getString(Configuration.TAG_COMMENT_13);

            id_14 = c.getString(Configuration.TAG_ID_14);
            nama_14 = c.getString(Configuration.TAG_NAMA_14);
            kd1_14 = c.getString(Configuration.TAG_KD1_14);
            kd2_14 = c.getString(Configuration.TAG_KD2_14);
            kd3_14 = c.getString(Configuration.TAG_KD3_14);
            kd4_14 = c.getString(Configuration.TAG_KD4_14);
            kd5_14 = c.getString(Configuration.TAG_KD5_14);
            uts_14 = c.getString(Configuration.TAG_UTS_14);
            uas_14 = c.getString(Configuration.TAG_UAS_14);
            coment_14 = c.getString(Configuration.TAG_COMMENT_14);

            id_15 = c.getString(Configuration.TAG_ID_15);
            nama_15 = c.getString(Configuration.TAG_NAMA_15);
            kd1_15 = c.getString(Configuration.TAG_KD1_15);
            kd2_15 = c.getString(Configuration.TAG_KD2_15);
            kd3_15 = c.getString(Configuration.TAG_KD3_15);
            kd4_15 = c.getString(Configuration.TAG_KD4_15);
            kd5_15 = c.getString(Configuration.TAG_KD5_15);
            uts_15 = c.getString(Configuration.TAG_UTS_15);
            uas_15 = c.getString(Configuration.TAG_UAS_15);
            coment_15 = c.getString(Configuration.TAG_COMMENT_15);

            id_16 = c.getString(Configuration.TAG_ID_16);
            nama_16 = c.getString(Configuration.TAG_NAMA_16);
            kd1_16 = c.getString(Configuration.TAG_KD1_16);
            kd2_16 = c.getString(Configuration.TAG_KD2_16);
            kd3_16 = c.getString(Configuration.TAG_KD3_16);
            kd4_16 = c.getString(Configuration.TAG_KD4_16);
            kd5_16 = c.getString(Configuration.TAG_KD5_16);
            uts_16 = c.getString(Configuration.TAG_UTS_16);
            uas_16 = c.getString(Configuration.TAG_UAS_16);
            coment_16 = c.getString(Configuration.TAG_COMMENT_16);

            id_17 = c.getString(Configuration.TAG_ID_17);
            nama_17 = c.getString(Configuration.TAG_NAMA_17);
            kd1_17 = c.getString(Configuration.TAG_KD1_17);
            kd2_17 = c.getString(Configuration.TAG_KD2_17);
            kd3_17 = c.getString(Configuration.TAG_KD3_17);
            kd4_17 = c.getString(Configuration.TAG_KD4_17);
            kd5_17 = c.getString(Configuration.TAG_KD5_17);
            uts_17 = c.getString(Configuration.TAG_UTS_17);
            uas_17 = c.getString(Configuration.TAG_UAS_17);
            coment_17 = c.getString(Configuration.TAG_COMMENT_17);

            id_18 = c.getString(Configuration.TAG_ID_18);
            nama_18 = c.getString(Configuration.TAG_NAMA_18);
            kd1_18 = c.getString(Configuration.TAG_KD1_18);
            kd2_18 = c.getString(Configuration.TAG_KD2_18);
            kd3_18 = c.getString(Configuration.TAG_KD3_18);
            kd4_18 = c.getString(Configuration.TAG_KD4_18);
            kd5_18 = c.getString(Configuration.TAG_KD5_18);
            uts_18 = c.getString(Configuration.TAG_UTS_18);
            uas_18 = c.getString(Configuration.TAG_UAS_18);
            coment_18 = c.getString(Configuration.TAG_COMMENT_18);

            id_19 = c.getString(Configuration.TAG_ID_19);
            nama_19 = c.getString(Configuration.TAG_NAMA_19);
            kd1_19 = c.getString(Configuration.TAG_KD1_19);
            kd2_19 = c.getString(Configuration.TAG_KD2_19);
            kd3_19 = c.getString(Configuration.TAG_KD3_19);
            kd4_19 = c.getString(Configuration.TAG_KD4_19);
            kd5_19 = c.getString(Configuration.TAG_KD5_19);
            uts_19 = c.getString(Configuration.TAG_UTS_19);
            uas_19 = c.getString(Configuration.TAG_UAS_19);
            coment_19 = c.getString(Configuration.TAG_COMMENT_19);

            id_20 = c.getString(Configuration.TAG_ID_20);
            nama_20 = c.getString(Configuration.TAG_NAMA_20);
            kd1_20 = c.getString(Configuration.TAG_KD1_20);
            kd2_20 = c.getString(Configuration.TAG_KD2_20);
            kd3_20 = c.getString(Configuration.TAG_KD3_20);
            kd4_20 = c.getString(Configuration.TAG_KD4_20);
            kd5_20 = c.getString(Configuration.TAG_KD5_20);
            uts_20 = c.getString(Configuration.TAG_UTS_20);
            uas_20 = c.getString(Configuration.TAG_UAS_20);
            coment_20 = c.getString(Configuration.TAG_COMMENT_20);

            id_21 = c.getString(Configuration.TAG_ID_21);
            nama_21 = c.getString(Configuration.TAG_NAMA_21);
            kd1_21 = c.getString(Configuration.TAG_KD1_21);
            kd2_21 = c.getString(Configuration.TAG_KD2_21);
            kd3_21 = c.getString(Configuration.TAG_KD3_21);
            kd4_21 = c.getString(Configuration.TAG_KD4_21);
            kd5_21 = c.getString(Configuration.TAG_KD5_21);
            uts_21 = c.getString(Configuration.TAG_UTS_21);
            uas_21 = c.getString(Configuration.TAG_UAS_21);
            coment_21 = c.getString(Configuration.TAG_COMMENT_21);

            id_22 = c.getString(Configuration.TAG_ID_22);
            nama_22 = c.getString(Configuration.TAG_NAMA_22);
            kd1_22 = c.getString(Configuration.TAG_KD1_22);
            kd2_22 = c.getString(Configuration.TAG_KD2_22);
            kd3_22 = c.getString(Configuration.TAG_KD3_22);
            kd4_22 = c.getString(Configuration.TAG_KD4_22);
            kd5_22 = c.getString(Configuration.TAG_KD5_22);
            uts_22 = c.getString(Configuration.TAG_UTS_22);
            uas_22 = c.getString(Configuration.TAG_UAS_22);
            coment_22 = c.getString(Configuration.TAG_COMMENT_22);

            id_23 = c.getString(Configuration.TAG_ID_23);
            nama_23 = c.getString(Configuration.TAG_NAMA_23);
            kd1_23 = c.getString(Configuration.TAG_KD1_23);
            kd2_23 = c.getString(Configuration.TAG_KD2_23);
            kd3_23 = c.getString(Configuration.TAG_KD3_23);
            kd4_23 = c.getString(Configuration.TAG_KD4_23);
            kd5_23 = c.getString(Configuration.TAG_KD5_23);
            uts_23 = c.getString(Configuration.TAG_UTS_23);
            uas_23 = c.getString(Configuration.TAG_UAS_23);
            coment_23 = c.getString(Configuration.TAG_COMMENT_23);

            id_24 = c.getString(Configuration.TAG_ID_24);
            nama_24 = c.getString(Configuration.TAG_NAMA_24);
            kd1_24 = c.getString(Configuration.TAG_KD1_24);
            kd2_24 = c.getString(Configuration.TAG_KD2_24);
            kd3_24 = c.getString(Configuration.TAG_KD3_24);
            kd4_24 = c.getString(Configuration.TAG_KD4_24);
            kd5_24 = c.getString(Configuration.TAG_KD5_24);
            uts_24 = c.getString(Configuration.TAG_UTS_24);
            uas_24 = c.getString(Configuration.TAG_UAS_24);
            coment_24 = c.getString(Configuration.TAG_COMMENT_24);

            id_25 = c.getString(Configuration.TAG_ID_25);
            nama_25 = c.getString(Configuration.TAG_NAMA_25);
            kd1_25 = c.getString(Configuration.TAG_KD1_25);
            kd2_25 = c.getString(Configuration.TAG_KD2_25);
            kd3_25 = c.getString(Configuration.TAG_KD3_25);
            kd4_25 = c.getString(Configuration.TAG_KD4_25);
            kd5_25 = c.getString(Configuration.TAG_KD5_25);
            uts_25 = c.getString(Configuration.TAG_UTS_25);
            uas_25 = c.getString(Configuration.TAG_UAS_25);
            coment_25 = c.getString(Configuration.TAG_COMMENT_25);

            id_26 = c.getString(Configuration.TAG_ID_26);
            nama_26 = c.getString(Configuration.TAG_NAMA_26);
            kd1_26 = c.getString(Configuration.TAG_KD1_26);
            kd2_26 = c.getString(Configuration.TAG_KD2_26);
            kd3_26 = c.getString(Configuration.TAG_KD3_26);
            kd4_26 = c.getString(Configuration.TAG_KD4_26);
            kd5_26 = c.getString(Configuration.TAG_KD5_26);
            uts_26 = c.getString(Configuration.TAG_UTS_26);
            uas_26 = c.getString(Configuration.TAG_UAS_26);
            coment_26 = c.getString(Configuration.TAG_COMMENT_26);

            id_27 = c.getString(Configuration.TAG_ID_27);
            nama_27 = c.getString(Configuration.TAG_NAMA_27);
            kd1_27 = c.getString(Configuration.TAG_KD1_27);
            kd2_27 = c.getString(Configuration.TAG_KD2_27);
            kd3_27 = c.getString(Configuration.TAG_KD3_27);
            kd4_27 = c.getString(Configuration.TAG_KD4_27);
            kd5_27 = c.getString(Configuration.TAG_KD5_27);
            uts_27 = c.getString(Configuration.TAG_UTS_27);
            uas_27 = c.getString(Configuration.TAG_UAS_27);
            coment_27 = c.getString(Configuration.TAG_COMMENT_27);

            id_28 = c.getString(Configuration.TAG_ID_28);
            nama_28 = c.getString(Configuration.TAG_NAMA_28);
            kd1_28 = c.getString(Configuration.TAG_KD1_28);
            kd2_28 = c.getString(Configuration.TAG_KD2_28);
            kd3_28 = c.getString(Configuration.TAG_KD3_28);
            kd4_28 = c.getString(Configuration.TAG_KD4_28);
            kd5_28 = c.getString(Configuration.TAG_KD5_28);
            uts_28 = c.getString(Configuration.TAG_UTS_28);
            uas_28 = c.getString(Configuration.TAG_UAS_28);
            coment_28 = c.getString(Configuration.TAG_COMMENT_28);

            id_29 = c.getString(Configuration.TAG_ID_29);
            nama_29 = c.getString(Configuration.TAG_NAMA_29);
            kd1_29 = c.getString(Configuration.TAG_KD1_29);
            kd2_29 = c.getString(Configuration.TAG_KD2_29);
            kd3_29 = c.getString(Configuration.TAG_KD3_29);
            kd4_29 = c.getString(Configuration.TAG_KD4_29);
            kd5_29 = c.getString(Configuration.TAG_KD5_29);
            uts_29 = c.getString(Configuration.TAG_UTS_29);
            uas_29 = c.getString(Configuration.TAG_UAS_29);
            coment_29 = c.getString(Configuration.TAG_COMMENT_29);

            id_30 = c.getString(Configuration.TAG_ID_30);
            nama_30 = c.getString(Configuration.TAG_NAMA_30);
            kd1_30 = c.getString(Configuration.TAG_KD1_30);
            kd2_30 = c.getString(Configuration.TAG_KD2_30);
            kd3_30 = c.getString(Configuration.TAG_KD3_30);
            kd4_30 = c.getString(Configuration.TAG_KD4_30);
            kd5_30 = c.getString(Configuration.TAG_KD5_30);
            uts_30 = c.getString(Configuration.TAG_UTS_30);
            uas_30 = c.getString(Configuration.TAG_UAS_30);
            coment_30 = c.getString(Configuration.TAG_COMMENT_30);

            if (kd1_1.length() == 0){
                kd1_1 = "null";
            }

            if (kd2_1.length() == 0){
                kd2_1 = "null";
            }

            if (kd3_1.length() == 0){
                kd3_1 = "null";
            }

            if (kd4_1.length() == 0){
                kd4_1 = "null";
            }

            if (kd5_1.length() == 0){
                kd5_1 = "null";
            }

            if (uts_1.length() == 0){
                uts_1 = "null";
            }

            if (uas_1.length() == 0){
                uas_1 = "null";
            }

            if (coment_1.length() == 0){
                coment_1 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_2.length() == 0){
                kd1_2 = "null";
            }

            if (kd2_2.length() == 0){
                kd2_2 = "null";
            }

            if (kd3_2.length() == 0){
                kd3_2 = "null";
            }

            if (kd4_2.length() == 0){
                kd4_2 = "null";
            }

            if (kd5_2.length() == 0){
                kd5_2 = "null";
            }

            if (uts_2.length() == 0){
                uts_2 = "null";
            }

            if (uas_2.length() == 0){
                uas_2 = "null";
            }

            if (coment_2.length() == 0){
                coment_2 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_3.length() == 0){
                kd1_3 = "null";
            }

            if (kd2_3.length() == 0){
                kd2_3 = "null";
            }

            if (kd3_3.length() == 0){
                kd3_3 = "null";
            }

            if (kd4_3.length() == 0){
                kd4_3 = "null";
            }

            if (kd5_3.length() == 0){
                kd5_3 = "null";
            }

            if (uts_3.length() == 0){
                uts_3 = "null";
            }

            if (uas_3.length() == 0){
                uas_3 = "null";
            }

            if (coment_3.length() == 0){
                coment_3 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_4.length() == 0){
                kd1_4 = "null";
            }

            if (kd2_4.length() == 0){
                kd2_4 = "null";
            }

            if (kd3_4.length() == 0){
                kd3_4 = "null";
            }

            if (kd4_4.length() == 0){
                kd4_4 = "null";
            }

            if (kd5_4.length() == 0){
                kd5_4 = "null";
            }

            if (uts_4.length() == 0){
                uts_4 = "null";
            }

            if (uas_4.length() == 0){
                uas_4 = "null";
            }

            if (coment_4.length() == 0){
                coment_4 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_5.length() == 0){
                kd1_5 = "null";
            }

            if (kd2_5.length() == 0){
                kd2_5 = "null";
            }

            if (kd3_5.length() == 0){
                kd3_5 = "null";
            }

            if (kd4_5.length() == 0){
                kd4_5 = "null";
            }

            if (kd5_5.length() == 0){
                kd5_5 = "null";
            }

            if (uts_5.length() == 0){
                uts_5 = "null";
            }

            if (uas_5.length() == 0){
                uas_5 = "null";
            }

            if (coment_5.length() == 0){
                coment_5 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_6.length() == 0){
                kd1_6 = "null";
            }

            if (kd2_6.length() == 0){
                kd2_6 = "null";
            }

            if (kd3_6.length() == 0){
                kd3_6 = "null";
            }

            if (kd4_6.length() == 0){
                kd4_6 = "null";
            }

            if (kd5_6.length() == 0){
                kd5_6 = "null";
            }

            if (uts_6.length() == 0){
                uts_6 = "null";
            }

            if (uas_6.length() == 0){
                uas_6 = "null";
            }

            if (coment_6.length() == 0){
                coment_6 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_7.length() == 0){
                kd1_7 = "null";
            }

            if (kd2_7.length() == 0){
                kd2_7 = "null";
            }

            if (kd3_7.length() == 0){
                kd3_7 = "null";
            }

            if (kd4_7.length() == 0){
                kd4_7 = "null";
            }

            if (kd5_7.length() == 0){
                kd5_7 = "null";
            }

            if (uts_7.length() == 0){
                uts_7 = "null";
            }

            if (uas_7.length() == 0){
                uas_7 = "null";
            }

            if (coment_7.length() == 0){
                coment_7 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_8.length() == 0){
                kd1_8 = "null";
            }

            if (kd2_8.length() == 0){
                kd2_8 = "null";
            }

            if (kd3_8.length() == 0){
                kd3_8 = "null";
            }

            if (kd4_8.length() == 0){
                kd4_8 = "null";
            }

            if (kd5_8.length() == 0){
                kd5_8 = "null";
            }

            if (uts_8.length() == 0){
                uts_8 = "null";
            }

            if (uas_8.length() == 0){
                uas_8 = "null";
            }

            if (coment_8.length() == 0){
                coment_8 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_9.length() == 0){
                kd1_9 = "null";
            }

            if (kd2_9.length() == 0){
                kd2_9 = "null";
            }

            if (kd3_9.length() == 0){
                kd3_9 = "null";
            }

            if (kd4_9.length() == 0){
                kd4_9 = "null";
            }

            if (kd5_9.length() == 0){
                kd5_9 = "null";
            }

            if (uts_9.length() == 0){
                uts_9 = "null";
            }

            if (uas_9.length() == 0){
                uas_9 = "null";
            }

            if (coment_9.length() == 0){
                coment_9 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_10.length() == 0){
                kd1_10 = "null";
            }

            if (kd2_10.length() == 0){
                kd2_10 = "null";
            }

            if (kd3_10.length() == 0){
                kd3_10 = "null";
            }

            if (kd4_10.length() == 0){
                kd4_10 = "null";
            }

            if (kd5_10.length() == 0){
                kd5_10 = "null";
            }

            if (uts_10.length() == 0){
                uts_10 = "null";
            }

            if (uas_10.length() == 0){
                uas_10 = "null";
            }

            if (coment_10.length() == 0){
                coment_10 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_11.length() == 0){
                kd1_11 = "null";
            }

            if (kd2_11.length() == 0){
                kd2_11 = "null";
            }

            if (kd3_11.length() == 0){
                kd3_11 = "null";
            }

            if (kd4_11.length() == 0){
                kd4_11 = "null";
            }

            if (kd5_11.length() == 0){
                kd5_11 = "null";
            }

            if (uts_11.length() == 0){
                uts_11 = "null";
            }

            if (uas_11.length() == 0){
                uas_11 = "null";
            }

            if (coment_11.length() == 0){
                coment_11 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_12.length() == 0){
                kd1_12 = "null";
            }

            if (kd2_12.length() == 0){
                kd2_12 = "null";
            }

            if (kd3_12.length() == 0){
                kd3_12 = "null";
            }

            if (kd4_12.length() == 0){
                kd4_12 = "null";
            }

            if (kd5_12.length() == 0){
                kd5_12 = "null";
            }

            if (uts_12.length() == 0){
                uts_12 = "null";
            }

            if (uas_12.length() == 0){
                uas_12 = "null";
            }

            if (coment_12.length() == 0){
                coment_12 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_13.length() == 0){
                kd1_13 = "null";
            }

            if (kd2_13.length() == 0){
                kd2_13 = "null";
            }

            if (kd3_13.length() == 0){
                kd3_13 = "null";
            }

            if (kd4_13.length() == 0){
                kd4_13 = "null";
            }

            if (kd5_13.length() == 0){
                kd5_13 = "null";
            }

            if (uts_13.length() == 0){
                uts_13 = "null";
            }

            if (uas_13.length() == 0){
                uas_13 = "null";
            }

            if (coment_13.length() == 0){
                coment_13 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_14.length() == 0){
                kd1_14 = "null";
            }

            if (kd2_14.length() == 0){
                kd2_14 = "null";
            }

            if (kd3_14.length() == 0){
                kd3_14 = "null";
            }

            if (kd4_14.length() == 0){
                kd4_14 = "null";
            }

            if (kd5_14.length() == 0){
                kd5_14 = "null";
            }

            if (uts_14.length() == 0){
                uts_14 = "null";
            }

            if (uas_14.length() == 0){
                uas_14 = "null";
            }

            if (coment_14.length() == 0){
                coment_14 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_15.length() == 0){
                kd1_15 = "null";
            }

            if (kd2_15.length() == 0){
                kd2_15 = "null";
            }

            if (kd3_15.length() == 0){
                kd3_15 = "null";
            }

            if (kd4_15.length() == 0){
                kd4_15 = "null";
            }

            if (kd5_15.length() == 0){
                kd5_15 = "null";
            }

            if (uts_15.length() == 0){
                uts_15 = "null";
            }

            if (uas_15.length() == 0){
                uas_15 = "null";
            }

            if (coment_15.length() == 0){
                coment_15 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_16.length() == 0){
                kd1_16 = "null";
            }

            if (kd2_16.length() == 0){
                kd2_16 = "null";
            }

            if (kd3_16.length() == 0){
                kd3_16 = "null";
            }

            if (kd4_16.length() == 0){
                kd4_16 = "null";
            }

            if (kd5_16.length() == 0){
                kd5_16 = "null";
            }

            if (uts_16.length() == 0){
                uts_16 = "null";
            }

            if (uas_16.length() == 0){
                uas_16 = "null";
            }

            if (coment_16.length() == 0){
                coment_16 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_17.length() == 0){
                kd1_17 = "null";
            }

            if (kd2_17.length() == 0){
                kd2_17 = "null";
            }

            if (kd3_17.length() == 0){
                kd3_17 = "null";
            }

            if (kd4_17.length() == 0){
                kd4_17 = "null";
            }

            if (kd5_17.length() == 0){
                kd5_17 = "null";
            }

            if (uts_17.length() == 0){
                uts_17 = "null";
            }

            if (uas_17.length() == 0){
                uas_17 = "null";
            }

            if (coment_17.length() == 0){
                coment_17 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_18.length() == 0){
                kd1_18 = "null";
            }

            if (kd2_18.length() == 0){
                kd2_18 = "null";
            }

            if (kd3_18.length() == 0){
                kd3_18 = "null";
            }

            if (kd4_18.length() == 0){
                kd4_18 = "null";
            }

            if (kd5_18.length() == 0){
                kd5_18 = "null";
            }

            if (uts_18.length() == 0){
                uts_18 = "null";
            }

            if (uas_18.length() == 0){
                uas_18 = "null";
            }

            if (coment_18.length() == 0){
                coment_18 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_19.length() == 0){
                kd1_19 = "null";
            }

            if (kd2_19.length() == 0){
                kd2_19 = "null";
            }

            if (kd3_19.length() == 0){
                kd3_19 = "null";
            }

            if (kd4_19.length() == 0){
                kd4_19 = "null";
            }

            if (kd5_19.length() == 0){
                kd5_19 = "null";
            }

            if (uts_19.length() == 0){
                uts_19 = "null";
            }

            if (uas_19.length() == 0){
                uas_19 = "null";
            }

            if (coment_19.length() == 0){
                coment_19 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_20.length() == 0){
                kd1_20 = "null";
            }

            if (kd2_20.length() == 0){
                kd2_20 = "null";
            }

            if (kd3_20.length() == 0){
                kd3_20 = "null";
            }

            if (kd4_20.length() == 0){
                kd4_20 = "null";
            }

            if (kd5_20.length() == 0){
                kd5_20 = "null";
            }

            if (uts_20.length() == 0){
                uts_20 = "null";
            }

            if (uas_20.length() == 0){
                uas_20 = "null";
            }

            if (coment_20.length() == 0){
                coment_20 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_21.length() == 0){
                kd1_21 = "null";
            }

            if (kd2_21.length() == 0){
                kd2_21 = "null";
            }

            if (kd3_21.length() == 0){
                kd3_21 = "null";
            }

            if (kd4_21.length() == 0){
                kd4_21 = "null";
            }

            if (kd5_21.length() == 0){
                kd5_21 = "null";
            }

            if (uts_21.length() == 0){
                uts_21 = "null";
            }

            if (uas_21.length() == 0){
                uas_21 = "null";
            }

            if (coment_21.length() == 0){
                coment_21 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_22.length() == 0){
                kd1_22 = "null";
            }

            if (kd2_22.length() == 0){
                kd2_22 = "null";
            }

            if (kd3_22.length() == 0){
                kd3_22 = "null";
            }

            if (kd4_22.length() == 0){
                kd4_22 = "null";
            }

            if (kd5_22.length() == 0){
                kd5_22 = "null";
            }

            if (uts_22.length() == 0){
                uts_22 = "null";
            }

            if (uas_22.length() == 0){
                uas_22 = "null";
            }

            if (coment_22.length() == 0){
                coment_22 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_23.length() == 0){
                kd1_23 = "null";
            }

            if (kd2_23.length() == 0){
                kd2_23 = "null";
            }

            if (kd3_23.length() == 0){
                kd3_23 = "null";
            }

            if (kd4_23.length() == 0){
                kd4_23 = "null";
            }

            if (kd5_23.length() == 0){
                kd5_23 = "null";
            }

            if (uts_23.length() == 0){
                uts_23 = "null";
            }

            if (uas_23.length() == 0){
                uas_23 = "null";
            }

            if (coment_23.length() == 0){
                coment_23 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_24.length() == 0){
                kd1_24 = "null";
            }

            if (kd2_24.length() == 0){
                kd2_24 = "null";
            }

            if (kd3_24.length() == 0){
                kd3_24 = "null";
            }

            if (kd4_24.length() == 0){
                kd4_24 = "null";
            }

            if (kd5_24.length() == 0){
                kd5_24 = "null";
            }

            if (uts_24.length() == 0){
                uts_24 = "null";
            }

            if (uas_24.length() == 0){
                uas_24 = "null";
            }

            if (coment_24.length() == 0){
                coment_24 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_25.length() == 0){
                kd1_25 = "null";
            }

            if (kd2_25.length() == 0){
                kd2_25 = "null";
            }

            if (kd3_25.length() == 0){
                kd3_25 = "null";
            }

            if (kd4_25.length() == 0){
                kd4_25 = "null";
            }

            if (kd5_25.length() == 0){
                kd5_25 = "null";
            }

            if (uts_25.length() == 0){
                uts_25 = "null";
            }

            if (uas_25.length() == 0){
                uas_25 = "null";
            }

            if (coment_25.length() == 0){
                coment_25 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_26.length() == 0){
                kd1_26 = "null";
            }

            if (kd2_26.length() == 0){
                kd2_26 = "null";
            }

            if (kd3_26.length() == 0){
                kd3_26 = "null";
            }

            if (kd4_26.length() == 0){
                kd4_26 = "null";
            }

            if (kd5_26.length() == 0){
                kd5_26 = "null";
            }

            if (uts_26.length() == 0){
                uts_26 = "null";
            }

            if (uas_26.length() == 0){
                uas_26 = "null";
            }

            if (coment_26.length() == 0){
                coment_26 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_27.length() == 0){
                kd1_27 = "null";
            }

            if (kd2_27.length() == 0){
                kd2_27 = "null";
            }

            if (kd3_27.length() == 0){
                kd3_27 = "null";
            }

            if (kd4_27.length() == 0){
                kd4_27 = "null";
            }

            if (kd5_27.length() == 0){
                kd5_27 = "null";
            }

            if (uts_27.length() == 0){
                uts_27 = "null";
            }

            if (uas_27.length() == 0){
                uas_27 = "null";
            }

            if (coment_27.length() == 0){
                coment_27 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_28.length() == 0){
                kd1_28 = "null";
            }

            if (kd2_28.length() == 0){
                kd2_28 = "null";
            }

            if (kd3_28.length() == 0){
                kd3_28 = "null";
            }

            if (kd4_28.length() == 0){
                kd4_28 = "null";
            }

            if (kd5_28.length() == 0){
                kd5_28 = "null";
            }

            if (uts_28.length() == 0){
                uts_28 = "null";
            }

            if (uas_28.length() == 0){
                uas_28 = "null";
            }

            if (coment_28.length() == 0){
                coment_28 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_29.length() == 0){
                kd1_29 = "null";
            }

            if (kd2_29.length() == 0){
                kd2_29 = "null";
            }

            if (kd3_29.length() == 0){
                kd3_29 = "null";
            }

            if (kd4_29.length() == 0){
                kd4_29 = "null";
            }

            if (kd5_29.length() == 0){
                kd5_29 = "null";
            }

            if (uts_29.length() == 0){
                uts_29 = "null";
            }

            if (uas_29.length() == 0){
                uas_29 = "null";
            }

            if (coment_29.length() == 0){
                coment_29 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_30.length() == 0){
                kd1_30 = "null";
            }

            if (kd2_30.length() == 0){
                kd2_30 = "null";
            }

            if (kd3_30.length() == 0){
                kd3_30 = "null";
            }

            if (kd4_30.length() == 0){
                kd4_30 = "null";
            }

            if (kd5_30.length() == 0){
                kd5_30 = "null";
            }

            if (uts_30.length() == 0){
                uts_30 = "null";
            }

            if (uas_30.length() == 0){
                uas_30 = "null";
            }

            if (coment_30.length() == 0){
                coment_30 = "Tidak ada komentar dari guru Anda";
            }

            if (kd1_1 == "null" && kd2_1 == "null" && kd3_1 == "null" && kd4_1 == "null" && kd5_1 == "null"){
                nh_1 = 0;
            }
            else if(kd2_1 == "null" && kd3_1 == "null" && kd4_1 == "null" && kd5_1 == "null"){
                int k1 = Integer.parseInt(kd1_1);

                nh_1 = k1;
            }
            else if (kd3_1 == "null" && kd4_1 == "null" && kd5_1 == "null"){
                int k1 = Integer.parseInt(kd1_1);
                int k2 = Integer.parseInt(kd2_1);

                nh_1 = (k1 + k2) / 2;
            }
            else if (kd4_1 == "null" && kd5_1 == "null"){
                int k1 = Integer.parseInt(kd1_1);
                int k2 = Integer.parseInt(kd2_1);
                int k3 = Integer.parseInt(kd3_1);
                nh_1 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_1 == "null"){
                int k1 = Integer.parseInt(kd1_1);
                int k2 = Integer.parseInt(kd2_1);
                int k3 = Integer.parseInt(kd3_1);
                int k4 = Integer.parseInt(kd4_1);
                nh_1 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_1);
                int k2 = Integer.parseInt(kd2_1);
                int k3 = Integer.parseInt(kd3_1);
                int k4 = Integer.parseInt(kd4_1);
                int k5 = Integer.parseInt(kd5_1);
                nh_1 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_1 == "null" && uas_1 == "null"){
                ns_1 = 0;
            }
            else if (uts_1 != "null" && uas_1 == "null"){
                ns_1 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_1);
                int ks = Integer.parseInt(uas_1);

                ns_1 = (nh_1 + kt + ks) / 3;
            }

            if (kd1_2 == "null" && kd2_2 == "null" && kd3_2 == "null" && kd4_2 == "null" && kd5_2 == "null"){
                nh_2 = 0;
            }
            else if(kd2_2 == "null" && kd3_2 == "null" && kd4_2 == "null" && kd5_2 == "null"){
                int k1 = Integer.parseInt(kd1_2);

                nh_2 = k1;
            }
            else if (kd3_2 == "null" && kd4_2 == "null" && kd5_2 == "null"){
                int k1 = Integer.parseInt(kd1_2);
                int k2 = Integer.parseInt(kd2_2);

                nh_2 = (k1 + k2) / 2;
            }
            else if (kd4_2 == "null" && kd5_2 == "null"){
                int k1 = Integer.parseInt(kd1_2);
                int k2 = Integer.parseInt(kd2_2);
                int k3 = Integer.parseInt(kd3_2);
                nh_2 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_2 == "null"){
                int k1 = Integer.parseInt(kd1_2);
                int k2 = Integer.parseInt(kd2_2);
                int k3 = Integer.parseInt(kd3_2);
                int k4 = Integer.parseInt(kd4_2);
                nh_2 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_2);
                int k2 = Integer.parseInt(kd2_2);
                int k3 = Integer.parseInt(kd3_2);
                int k4 = Integer.parseInt(kd4_2);
                int k5 = Integer.parseInt(kd5_2);
                nh_2 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_2 == "null" && uas_2 == "null"){
                ns_2 = 0;
            }
            else if (uts_2 != "null" && uas_2 == "null"){
                ns_2 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_2);
                int ks = Integer.parseInt(uas_2);

                ns_2 = (nh_2 + kt + ks) / 3;
            }

            if (kd1_3 == "null" && kd2_3 == "null" && kd3_3 == "null" && kd4_3 == "null" && kd5_3 == "null"){
                nh_3 = 0;
            }
            else if(kd2_3 == "null" && kd3_3 == "null" && kd4_3 == "null" && kd5_3 == "null"){
                int k1 = Integer.parseInt(kd1_3);

                nh_3 = k1;
            }
            else if (kd3_3 == "null" && kd4_3 == "null" && kd5_3 == "null"){
                int k1 = Integer.parseInt(kd1_3);
                int k2 = Integer.parseInt(kd2_3);

                nh_3 = (k1 + k2) / 2;
            }
            else if (kd4_3 == "null" && kd5_3 == "null"){
                int k1 = Integer.parseInt(kd1_3);
                int k2 = Integer.parseInt(kd2_3);
                int k3 = Integer.parseInt(kd3_3);
                nh_3 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_3 == "null"){
                int k1 = Integer.parseInt(kd1_3);
                int k2 = Integer.parseInt(kd2_3);
                int k3 = Integer.parseInt(kd3_3);
                int k4 = Integer.parseInt(kd4_3);
                nh_3 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_3);
                int k2 = Integer.parseInt(kd2_3);
                int k3 = Integer.parseInt(kd3_3);
                int k4 = Integer.parseInt(kd4_3);
                int k5 = Integer.parseInt(kd5_3);
                nh_3 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_3 == "null" && uas_3 == "null"){
                ns_3 = 0;
            }
            else if (uts_3 != "null" && uas_3 == "null"){
                ns_3 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_3);
                int ks = Integer.parseInt(uas_3);

                ns_3 = (nh_3 + kt + ks) / 3;
            }

            if (kd1_4 == "null" && kd2_4 == "null" && kd3_4 == "null" && kd4_4 == "null" && kd5_4 == "null"){
                nh_4 = 0;
            }
            else if(kd2_4 == "null" && kd3_4 == "null" && kd4_4 == "null" && kd5_4 == "null"){
                int k1 = Integer.parseInt(kd1_4);

                nh_4 = k1;
            }
            else if (kd3_4 == "null" && kd4_4 == "null" && kd5_4 == "null"){
                int k1 = Integer.parseInt(kd1_4);
                int k2 = Integer.parseInt(kd2_4);

                nh_4 = (k1 + k2) / 2;
            }
            else if (kd4_4 == "null" && kd5_4 == "null"){
                int k1 = Integer.parseInt(kd1_4);
                int k2 = Integer.parseInt(kd2_4);
                int k3 = Integer.parseInt(kd3_4);
                nh_4 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_4 == "null"){
                int k1 = Integer.parseInt(kd1_4);
                int k2 = Integer.parseInt(kd2_4);
                int k3 = Integer.parseInt(kd3_4);
                int k4 = Integer.parseInt(kd4_4);
                nh_4 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_4);
                int k2 = Integer.parseInt(kd2_4);
                int k3 = Integer.parseInt(kd3_4);
                int k4 = Integer.parseInt(kd4_4);
                int k5 = Integer.parseInt(kd5_4);
                nh_4 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_4 == "null" && uas_4 == "null"){
                ns_4 = 0;
            }
            else if (uts_4 != "null" && uas_4 == "null"){
                ns_4 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_4);
                int ks = Integer.parseInt(uas_4);

                ns_4 = (nh_4 + kt + ks) / 3;
            }

            if (kd1_5 == "null" && kd2_5 == "null" && kd3_5 == "null" && kd4_5 == "null" && kd5_5 == "null"){
                nh_5 = 0;
            }
            else if(kd2_5 == "null" && kd3_5 == "null" && kd4_5 == "null" && kd5_5 == "null"){
                int k1 = Integer.parseInt(kd1_5);

                nh_5 = k1;
            }
            else if (kd3_5 == "null" && kd4_5 == "null" && kd5_5 == "null"){
                int k1 = Integer.parseInt(kd1_5);
                int k2 = Integer.parseInt(kd2_5);

                nh_5 = (k1 + k2) / 2;
            }
            else if (kd4_5 == "null" && kd5_5 == "null"){
                int k1 = Integer.parseInt(kd1_5);
                int k2 = Integer.parseInt(kd2_5);
                int k3 = Integer.parseInt(kd3_5);
                nh_5 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_5 == "null"){
                int k1 = Integer.parseInt(kd1_5);
                int k2 = Integer.parseInt(kd2_5);
                int k3 = Integer.parseInt(kd3_5);
                int k4 = Integer.parseInt(kd4_5);
                nh_5 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_5);
                int k2 = Integer.parseInt(kd2_5);
                int k3 = Integer.parseInt(kd3_5);
                int k4 = Integer.parseInt(kd4_5);
                int k5 = Integer.parseInt(kd5_5);
                nh_5 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_5 == "null" && uas_5 == "null"){
                ns_5 = 0;
            }
            else if (uts_5 != "null" && uas_5 == "null"){
                ns_5 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_5);
                int ks = Integer.parseInt(uas_5);

                ns_5 = (nh_5 + kt + ks) / 3;
            }

            if (kd1_6 == "null" && kd2_6 == "null" && kd3_6 == "null" && kd4_6 == "null" && kd5_6 == "null"){
                nh_6 = 0;
            }
            else if(kd2_6 == "null" && kd3_6 == "null" && kd4_6 == "null" && kd5_6 == "null"){
                int k1 = Integer.parseInt(kd1_6);

                nh_6 = k1;
            }
            else if (kd3_6 == "null" && kd4_6 == "null" && kd5_6 == "null"){
                int k1 = Integer.parseInt(kd1_6);
                int k2 = Integer.parseInt(kd2_6);

                nh_6 = (k1 + k2) / 2;
            }
            else if (kd4_6 == "null" && kd5_6 == "null"){
                int k1 = Integer.parseInt(kd1_6);
                int k2 = Integer.parseInt(kd2_6);
                int k3 = Integer.parseInt(kd3_6);
                nh_6 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_6 == "null"){
                int k1 = Integer.parseInt(kd1_6);
                int k2 = Integer.parseInt(kd2_6);
                int k3 = Integer.parseInt(kd3_6);
                int k4 = Integer.parseInt(kd4_6);
                nh_6 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_6);
                int k2 = Integer.parseInt(kd2_6);
                int k3 = Integer.parseInt(kd3_6);
                int k4 = Integer.parseInt(kd4_6);
                int k5 = Integer.parseInt(kd5_6);
                nh_6 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_6 == "null" && uas_6 == "null"){
                ns_6 = 0;
            }
            else if (uts_6 != "null" && uas_6 == "null"){
                ns_6 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_6);
                int ks = Integer.parseInt(uas_6);

                ns_6 = (nh_6 + kt + ks) / 3;
            }

            if (kd1_7 == "null" && kd2_7 == "null" && kd3_7 == "null" && kd4_7 == "null" && kd5_7 == "null"){
                nh_7 = 0;
            }
            else if(kd2_7 == "null" && kd3_7 == "null" && kd4_7 == "null" && kd5_7 == "null"){
                int k1 = Integer.parseInt(kd1_7);

                nh_7 = k1;
            }
            else if (kd3_7 == "null" && kd4_7 == "null" && kd5_7 == "null"){
                int k1 = Integer.parseInt(kd1_7);
                int k2 = Integer.parseInt(kd2_7);

                nh_7 = (k1 + k2) / 2;
            }
            else if (kd4_7 == "null" && kd5_7 == "null"){
                int k1 = Integer.parseInt(kd1_7);
                int k2 = Integer.parseInt(kd2_7);
                int k3 = Integer.parseInt(kd3_7);
                nh_7 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_7 == "null"){
                int k1 = Integer.parseInt(kd1_7);
                int k2 = Integer.parseInt(kd2_7);
                int k3 = Integer.parseInt(kd3_7);
                int k4 = Integer.parseInt(kd4_7);
                nh_7 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_7);
                int k2 = Integer.parseInt(kd2_7);
                int k3 = Integer.parseInt(kd3_7);
                int k4 = Integer.parseInt(kd4_7);
                int k5 = Integer.parseInt(kd5_7);
                nh_7 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_7 == "null" && uas_7 == "null"){
                ns_7 = 0;
            }
            else if (uts_7 != "null" && uas_7 == "null"){
                ns_7 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_7);
                int ks = Integer.parseInt(uas_7);

                ns_7 = (nh_7 + kt + ks) / 3;
            }

            if (kd1_8 == "null" && kd2_8 == "null" && kd3_8 == "null" && kd4_8 == "null" && kd5_8 == "null"){
                nh_8 = 0;
            }
            else if(kd2_8 == "null" && kd3_8 == "null" && kd4_8 == "null" && kd5_8 == "null"){
                int k1 = Integer.parseInt(kd1_8);

                nh_8 = k1;
            }
            else if (kd3_8 == "null" && kd4_8 == "null" && kd5_8 == "null"){
                int k1 = Integer.parseInt(kd1_8);
                int k2 = Integer.parseInt(kd2_8);

                nh_8 = (k1 + k2) / 2;
            }
            else if (kd4_8 == "null" && kd5_8 == "null"){
                int k1 = Integer.parseInt(kd1_8);
                int k2 = Integer.parseInt(kd2_8);
                int k3 = Integer.parseInt(kd3_8);
                nh_8 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_8 == "null"){
                int k1 = Integer.parseInt(kd1_8);
                int k2 = Integer.parseInt(kd2_8);
                int k3 = Integer.parseInt(kd3_8);
                int k4 = Integer.parseInt(kd4_8);
                nh_8 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_8);
                int k2 = Integer.parseInt(kd2_8);
                int k3 = Integer.parseInt(kd3_8);
                int k4 = Integer.parseInt(kd4_8);
                int k5 = Integer.parseInt(kd5_8);
                nh_8 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_8 == "null" && uas_8 == "null"){
                ns_8 = 0;
            }
            else if (uts_8 != "null" && uas_8 == "null"){
                ns_8 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_8);
                int ks = Integer.parseInt(uas_8);

                ns_8 = (nh_8 + kt + ks) / 3;
            }

            if (kd1_9 == "null" && kd2_9 == "null" && kd3_9 == "null" && kd4_9 == "null" && kd5_9 == "null"){
                nh_9 = 0;
            }
            else if(kd2_9 == "null" && kd3_9 == "null" && kd4_9 == "null" && kd5_9 == "null"){
                int k1 = Integer.parseInt(kd1_9);

                nh_9 = k1;
            }
            else if (kd3_9 == "null" && kd4_9 == "null" && kd5_9 == "null"){
                int k1 = Integer.parseInt(kd1_9);
                int k2 = Integer.parseInt(kd2_9);

                nh_9 = (k1 + k2) / 2;
            }
            else if (kd4_9 == "null" && kd5_9 == "null"){
                int k1 = Integer.parseInt(kd1_9);
                int k2 = Integer.parseInt(kd2_9);
                int k3 = Integer.parseInt(kd3_9);
                nh_9 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_9 == "null"){
                int k1 = Integer.parseInt(kd1_9);
                int k2 = Integer.parseInt(kd2_9);
                int k3 = Integer.parseInt(kd3_9);
                int k4 = Integer.parseInt(kd4_9);
                nh_9 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_9);
                int k2 = Integer.parseInt(kd2_9);
                int k3 = Integer.parseInt(kd3_9);
                int k4 = Integer.parseInt(kd4_9);
                int k5 = Integer.parseInt(kd5_9);
                nh_9 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_9 == "null" && uas_9 == "null"){
                ns_9 = 0;
            }
            else if (uts_9 != "null" && uas_9 == "null"){
                ns_9 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_9);
                int ks = Integer.parseInt(uas_9);

                ns_9 = (nh_9 + kt + ks) / 3;
            }

            if (kd1_10 == "null" && kd2_10 == "null" && kd3_10 == "null" && kd4_10 == "null" && kd5_10 == "null"){
                nh_10 = 0;
            }
            else if(kd2_10 == "null" && kd3_10 == "null" && kd4_10 == "null" && kd5_10 == "null"){
                int k1 = Integer.parseInt(kd1_10);

                nh_10 = k1;
            }
            else if (kd3_10 == "null" && kd4_10 == "null" && kd5_10 == "null"){
                int k1 = Integer.parseInt(kd1_10);
                int k2 = Integer.parseInt(kd2_10);

                nh_10 = (k1 + k2) / 2;
            }
            else if (kd4_10 == "null" && kd5_10 == "null"){
                int k1 = Integer.parseInt(kd1_10);
                int k2 = Integer.parseInt(kd2_10);
                int k3 = Integer.parseInt(kd3_10);
                nh_10 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_10 == "null"){
                int k1 = Integer.parseInt(kd1_10);
                int k2 = Integer.parseInt(kd2_10);
                int k3 = Integer.parseInt(kd3_10);
                int k4 = Integer.parseInt(kd4_10);
                nh_10 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_10);
                int k2 = Integer.parseInt(kd2_10);
                int k3 = Integer.parseInt(kd3_10);
                int k4 = Integer.parseInt(kd4_10);
                int k5 = Integer.parseInt(kd5_10);
                nh_10 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_10 == "null" && uas_10 == "null"){
                ns_10 = 0;
            }
            else if (uts_10 != "null" && uas_10 == "null"){
                ns_10 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_10);
                int ks = Integer.parseInt(uas_10);

                ns_10 = (nh_10 + kt + ks) / 3;
            }

            if (kd1_11 == "null" && kd2_11 == "null" && kd3_11 == "null" && kd4_11 == "null" && kd5_11 == "null"){
                nh_11 = 0;
            }
            else if(kd2_11 == "null" && kd3_11 == "null" && kd4_11 == "null" && kd5_11 == "null"){
                int k1 = Integer.parseInt(kd1_11);

                nh_11 = k1;
            }
            else if (kd3_11 == "null" && kd4_11 == "null" && kd5_11 == "null"){
                int k1 = Integer.parseInt(kd1_11);
                int k2 = Integer.parseInt(kd2_11);

                nh_11 = (k1 + k2) / 2;
            }
            else if (kd4_11 == "null" && kd5_11 == "null"){
                int k1 = Integer.parseInt(kd1_11);
                int k2 = Integer.parseInt(kd2_11);
                int k3 = Integer.parseInt(kd3_11);
                nh_11 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_11 == "null"){
                int k1 = Integer.parseInt(kd1_11);
                int k2 = Integer.parseInt(kd2_11);
                int k3 = Integer.parseInt(kd3_11);
                int k4 = Integer.parseInt(kd4_11);
                nh_11 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_11);
                int k2 = Integer.parseInt(kd2_11);
                int k3 = Integer.parseInt(kd3_11);
                int k4 = Integer.parseInt(kd4_11);
                int k5 = Integer.parseInt(kd5_11);
                nh_11 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_11 == "null" && uas_11 == "null"){
                ns_11 = 0;
            }
            else if (uts_11 != "null" && uas_11 == "null"){
                ns_11 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_11);
                int ks = Integer.parseInt(uas_11);

                ns_11 = (nh_11 + kt + ks) / 3;
            }

            if (kd1_12 == "null" && kd2_12 == "null" && kd3_12 == "null" && kd4_12 == "null" && kd5_12 == "null"){
                nh_12 = 0;
            }
            else if(kd2_12 == "null" && kd3_12 == "null" && kd4_12 == "null" && kd5_12 == "null"){
                int k1 = Integer.parseInt(kd1_12);

                nh_12 = k1;
            }
            else if (kd3_12 == "null" && kd4_12 == "null" && kd5_12 == "null"){
                int k1 = Integer.parseInt(kd1_12);
                int k2 = Integer.parseInt(kd2_12);

                nh_12 = (k1 + k2) / 2;
            }
            else if (kd4_12 == "null" && kd5_12 == "null"){
                int k1 = Integer.parseInt(kd1_12);
                int k2 = Integer.parseInt(kd2_12);
                int k3 = Integer.parseInt(kd3_12);
                nh_12 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_12 == "null"){
                int k1 = Integer.parseInt(kd1_12);
                int k2 = Integer.parseInt(kd2_12);
                int k3 = Integer.parseInt(kd3_12);
                int k4 = Integer.parseInt(kd4_12);
                nh_12 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_12);
                int k2 = Integer.parseInt(kd2_12);
                int k3 = Integer.parseInt(kd3_12);
                int k4 = Integer.parseInt(kd4_12);
                int k5 = Integer.parseInt(kd5_12);
                nh_12 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_12 == "null" && uas_12 == "null"){
                ns_12 = 0;
            }
            else if (uts_12 != "null" && uas_12 == "null"){
                ns_12 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_12);
                int ks = Integer.parseInt(uas_12);

                ns_12 = (nh_12 + kt + ks) / 3;
            }

            if (kd1_13 == "null" && kd2_13 == "null" && kd3_13 == "null" && kd4_13 == "null" && kd5_13 == "null"){
                nh_13 = 0;
            }
            else if(kd2_13 == "null" && kd3_13 == "null" && kd4_13 == "null" && kd5_13 == "null"){
                int k1 = Integer.parseInt(kd1_13);

                nh_13 = k1;
            }
            else if (kd3_13 == "null" && kd4_13 == "null" && kd5_13 == "null"){
                int k1 = Integer.parseInt(kd1_13);
                int k2 = Integer.parseInt(kd2_13);

                nh_13 = (k1 + k2) / 2;
            }
            else if (kd4_13 == "null" && kd5_13 == "null"){
                int k1 = Integer.parseInt(kd1_13);
                int k2 = Integer.parseInt(kd2_13);
                int k3 = Integer.parseInt(kd3_13);
                nh_13 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_13 == "null"){
                int k1 = Integer.parseInt(kd1_13);
                int k2 = Integer.parseInt(kd2_13);
                int k3 = Integer.parseInt(kd3_13);
                int k4 = Integer.parseInt(kd4_13);
                nh_13 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_13);
                int k2 = Integer.parseInt(kd2_13);
                int k3 = Integer.parseInt(kd3_13);
                int k4 = Integer.parseInt(kd4_13);
                int k5 = Integer.parseInt(kd5_13);
                nh_13 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_13 == "null" && uas_13 == "null"){
                ns_13 = 0;
            }
            else if (uts_13 != "null" && uas_13 == "null"){
                ns_13 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_13);
                int ks = Integer.parseInt(uas_13);

                ns_13 = (nh_13 + kt + ks) / 3;
            }

            if (kd1_14 == "null" && kd2_14 == "null" && kd3_14 == "null" && kd4_14 == "null" && kd5_14 == "null"){
                nh_14 = 0;
            }
            else if(kd2_14 == "null" && kd3_14 == "null" && kd4_14 == "null" && kd5_14 == "null"){
                int k1 = Integer.parseInt(kd1_14);

                nh_14 = k1;
            }
            else if (kd3_14 == "null" && kd4_14 == "null" && kd5_14 == "null"){
                int k1 = Integer.parseInt(kd1_14);
                int k2 = Integer.parseInt(kd2_14);

                nh_14 = (k1 + k2) / 2;
            }
            else if (kd4_14 == "null" && kd5_14 == "null"){
                int k1 = Integer.parseInt(kd1_14);
                int k2 = Integer.parseInt(kd2_14);
                int k3 = Integer.parseInt(kd3_14);
                nh_14 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_14 == "null"){
                int k1 = Integer.parseInt(kd1_14);
                int k2 = Integer.parseInt(kd2_14);
                int k3 = Integer.parseInt(kd3_14);
                int k4 = Integer.parseInt(kd4_14);
                nh_14 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_14);
                int k2 = Integer.parseInt(kd2_14);
                int k3 = Integer.parseInt(kd3_14);
                int k4 = Integer.parseInt(kd4_14);
                int k5 = Integer.parseInt(kd5_14);
                nh_14 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_14 == "null" && uas_14 == "null"){
                ns_14 = 0;
            }
            else if (uts_14 != "null" && uas_14 == "null"){
                ns_14 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_14);
                int ks = Integer.parseInt(uas_14);

                ns_14 = (nh_14 + kt + ks) / 3;
            }

            if (kd1_15 == "null" && kd2_15 == "null" && kd3_15 == "null" && kd4_15 == "null" && kd5_15 == "null"){
                nh_15 = 0;
            }
            else if(kd2_15 == "null" && kd3_15 == "null" && kd4_15 == "null" && kd5_15 == "null"){
                int k1 = Integer.parseInt(kd1_15);

                nh_15 = k1;
            }
            else if (kd3_15 == "null" && kd4_15 == "null" && kd5_15 == "null"){
                int k1 = Integer.parseInt(kd1_15);
                int k2 = Integer.parseInt(kd2_15);

                nh_15 = (k1 + k2) / 2;
            }
            else if (kd4_15 == "null" && kd5_15 == "null"){
                int k1 = Integer.parseInt(kd1_15);
                int k2 = Integer.parseInt(kd2_15);
                int k3 = Integer.parseInt(kd3_15);
                nh_15 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_15 == "null"){
                int k1 = Integer.parseInt(kd1_15);
                int k2 = Integer.parseInt(kd2_15);
                int k3 = Integer.parseInt(kd3_15);
                int k4 = Integer.parseInt(kd4_15);
                nh_15 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_15);
                int k2 = Integer.parseInt(kd2_15);
                int k3 = Integer.parseInt(kd3_15);
                int k4 = Integer.parseInt(kd4_15);
                int k5 = Integer.parseInt(kd5_15);
                nh_15 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_15 == "null" && uas_15 == "null"){
                ns_15 = 0;
            }
            else if (uts_15 != "null" && uas_15 == "null"){
                ns_15 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_15);
                int ks = Integer.parseInt(uas_15);

                ns_15 = (nh_15 + kt + ks) / 3;
            }

            if (kd1_16 == "null" && kd2_16 == "null" && kd3_16 == "null" && kd4_16 == "null" && kd5_16 == "null"){
                nh_16 = 0;
            }
            else if(kd2_16 == "null" && kd3_16 == "null" && kd4_16 == "null" && kd5_16 == "null"){
                int k1 = Integer.parseInt(kd1_16);

                nh_16 = k1;
            }
            else if (kd3_16 == "null" && kd4_16 == "null" && kd5_16 == "null"){
                int k1 = Integer.parseInt(kd1_16);
                int k2 = Integer.parseInt(kd2_16);

                nh_16 = (k1 + k2) / 2;
            }
            else if (kd4_16 == "null" && kd5_16 == "null"){
                int k1 = Integer.parseInt(kd1_16);
                int k2 = Integer.parseInt(kd2_16);
                int k3 = Integer.parseInt(kd3_16);
                nh_16 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_16 == "null"){
                int k1 = Integer.parseInt(kd1_16);
                int k2 = Integer.parseInt(kd2_16);
                int k3 = Integer.parseInt(kd3_16);
                int k4 = Integer.parseInt(kd4_16);
                nh_16 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_16);
                int k2 = Integer.parseInt(kd2_16);
                int k3 = Integer.parseInt(kd3_16);
                int k4 = Integer.parseInt(kd4_16);
                int k5 = Integer.parseInt(kd5_16);
                nh_16 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_16 == "null" && uas_16 == "null"){
                ns_16 = 0;
            }
            else if (uts_16 != "null" && uas_16 == "null"){
                ns_16 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_16);
                int ks = Integer.parseInt(uas_16);

                ns_16 = (nh_16 + kt + ks) / 3;
            }

            if (kd1_17 == "null" && kd2_17 == "null" && kd3_17 == "null" && kd4_17 == "null" && kd5_17 == "null"){
                nh_17 = 0;
            }
            else if(kd2_17 == "null" && kd3_17 == "null" && kd4_17 == "null" && kd5_17 == "null"){
                int k1 = Integer.parseInt(kd1_17);

                nh_17 = k1;
            }
            else if (kd3_17 == "null" && kd4_17 == "null" && kd5_17 == "null"){
                int k1 = Integer.parseInt(kd1_17);
                int k2 = Integer.parseInt(kd2_17);

                nh_17 = (k1 + k2) / 2;
            }
            else if (kd4_17 == "null" && kd5_17 == "null"){
                int k1 = Integer.parseInt(kd1_17);
                int k2 = Integer.parseInt(kd2_17);
                int k3 = Integer.parseInt(kd3_17);
                nh_17 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_17 == "null"){
                int k1 = Integer.parseInt(kd1_17);
                int k2 = Integer.parseInt(kd2_17);
                int k3 = Integer.parseInt(kd3_17);
                int k4 = Integer.parseInt(kd4_17);
                nh_17 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_17);
                int k2 = Integer.parseInt(kd2_17);
                int k3 = Integer.parseInt(kd3_17);
                int k4 = Integer.parseInt(kd4_17);
                int k5 = Integer.parseInt(kd5_17);
                nh_17 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_17 == "null" && uas_17 == "null"){
                ns_17 = 0;
            }
            else if (uts_17 != "null" && uas_17 == "null"){
                ns_17 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_17);
                int ks = Integer.parseInt(uas_17);

                ns_17 = (nh_17 + kt + ks) / 3;
            }

            if (kd1_18 == "null" && kd2_18 == "null" && kd3_18 == "null" && kd4_18 == "null" && kd5_18 == "null"){
                nh_18 = 0;
            }
            else if(kd2_18 == "null" && kd3_18 == "null" && kd4_18 == "null" && kd5_18 == "null"){
                int k1 = Integer.parseInt(kd1_18);

                nh_18 = k1;
            }
            else if (kd3_18 == "null" && kd4_18 == "null" && kd5_18 == "null"){
                int k1 = Integer.parseInt(kd1_18);
                int k2 = Integer.parseInt(kd2_18);

                nh_18 = (k1 + k2) / 2;
            }
            else if (kd4_18 == "null" && kd5_18 == "null"){
                int k1 = Integer.parseInt(kd1_18);
                int k2 = Integer.parseInt(kd2_18);
                int k3 = Integer.parseInt(kd3_18);
                nh_18 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_18 == "null"){
                int k1 = Integer.parseInt(kd1_18);
                int k2 = Integer.parseInt(kd2_18);
                int k3 = Integer.parseInt(kd3_18);
                int k4 = Integer.parseInt(kd4_18);
                nh_18 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_18);
                int k2 = Integer.parseInt(kd2_18);
                int k3 = Integer.parseInt(kd3_18);
                int k4 = Integer.parseInt(kd4_18);
                int k5 = Integer.parseInt(kd5_18);
                nh_18 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_18 == "null" && uas_18 == "null"){
                ns_18 = 0;
            }
            else if (uts_18 != "null" && uas_18 == "null"){
                ns_18 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_18);
                int ks = Integer.parseInt(uas_18);

                ns_18 = (nh_18 + kt + ks) / 3;
            }

            if (kd1_19 == "null" && kd2_19 == "null" && kd3_19 == "null" && kd4_19 == "null" && kd5_19 == "null"){
                nh_19 = 0;
            }
            else if(kd2_19 == "null" && kd3_19 == "null" && kd4_19 == "null" && kd5_19 == "null"){
                int k1 = Integer.parseInt(kd1_19);

                nh_19 = k1;
            }
            else if (kd3_19 == "null" && kd4_19 == "null" && kd5_19 == "null"){
                int k1 = Integer.parseInt(kd1_19);
                int k2 = Integer.parseInt(kd2_19);

                nh_19 = (k1 + k2) / 2;
            }
            else if (kd4_19 == "null" && kd5_19 == "null"){
                int k1 = Integer.parseInt(kd1_19);
                int k2 = Integer.parseInt(kd2_19);
                int k3 = Integer.parseInt(kd3_19);
                nh_19 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_19 == "null"){
                int k1 = Integer.parseInt(kd1_19);
                int k2 = Integer.parseInt(kd2_19);
                int k3 = Integer.parseInt(kd3_19);
                int k4 = Integer.parseInt(kd4_19);
                nh_19 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_19);
                int k2 = Integer.parseInt(kd2_19);
                int k3 = Integer.parseInt(kd3_19);
                int k4 = Integer.parseInt(kd4_19);
                int k5 = Integer.parseInt(kd5_19);
                nh_19 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_19 == "null" && uas_19 == "null"){
                ns_19 = 0;
            }
            else if (uts_19 != "null" && uas_19 == "null"){
                ns_19 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_19);
                int ks = Integer.parseInt(uas_19);

                ns_19 = (nh_19 + kt + ks) / 3;
            }

            if (kd1_20 == "null" && kd2_20 == "null" && kd3_20 == "null" && kd4_20 == "null" && kd5_20 == "null"){
                nh_20 = 0;
            }
            else if(kd2_20 == "null" && kd3_20 == "null" && kd4_20 == "null" && kd5_20 == "null"){
                int k1 = Integer.parseInt(kd1_20);

                nh_20 = k1;
            }
            else if (kd3_20 == "null" && kd4_20 == "null" && kd5_20 == "null"){
                int k1 = Integer.parseInt(kd1_20);
                int k2 = Integer.parseInt(kd2_20);

                nh_20 = (k1 + k2) / 2;
            }
            else if (kd4_20 == "null" && kd5_20 == "null"){
                int k1 = Integer.parseInt(kd1_20);
                int k2 = Integer.parseInt(kd2_20);
                int k3 = Integer.parseInt(kd3_20);
                nh_20 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_20 == "null"){
                int k1 = Integer.parseInt(kd1_20);
                int k2 = Integer.parseInt(kd2_20);
                int k3 = Integer.parseInt(kd3_20);
                int k4 = Integer.parseInt(kd4_20);
                nh_20 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_20);
                int k2 = Integer.parseInt(kd2_20);
                int k3 = Integer.parseInt(kd3_20);
                int k4 = Integer.parseInt(kd4_20);
                int k5 = Integer.parseInt(kd5_20);
                nh_20 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_20 == "null" && uas_20 == "null"){
                ns_20 = 0;
            }
            else if (uts_20 != "null" && uas_20 == "null"){
                ns_20 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_20);
                int ks = Integer.parseInt(uas_20);

                ns_20 = (nh_20 + kt + ks) / 3;
            }

            if (kd1_21 == "null" && kd2_21 == "null" && kd3_21 == "null" && kd4_21 == "null" && kd5_21 == "null"){
                nh_21 = 0;
            }
            else if(kd2_21 == "null" && kd3_21 == "null" && kd4_21 == "null" && kd5_21 == "null"){
                int k1 = Integer.parseInt(kd1_21);

                nh_21 = k1;
            }
            else if (kd3_21 == "null" && kd4_21 == "null" && kd5_21 == "null"){
                int k1 = Integer.parseInt(kd1_21);
                int k2 = Integer.parseInt(kd2_21);

                nh_21 = (k1 + k2) / 2;
            }
            else if (kd4_21 == "null" && kd5_21 == "null"){
                int k1 = Integer.parseInt(kd1_21);
                int k2 = Integer.parseInt(kd2_21);
                int k3 = Integer.parseInt(kd3_21);
                nh_21 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_21 == "null"){
                int k1 = Integer.parseInt(kd1_21);
                int k2 = Integer.parseInt(kd2_21);
                int k3 = Integer.parseInt(kd3_21);
                int k4 = Integer.parseInt(kd4_21);
                nh_21 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_21);
                int k2 = Integer.parseInt(kd2_21);
                int k3 = Integer.parseInt(kd3_21);
                int k4 = Integer.parseInt(kd4_21);
                int k5 = Integer.parseInt(kd5_21);
                nh_21 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_21 == "null" && uas_21 == "null"){
                ns_21 = 0;
            }
            else if (uts_21 != "null" && uas_21 == "null"){
                ns_21 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_21);
                int ks = Integer.parseInt(uas_21);

                ns_21 = (nh_21 + kt + ks) / 3;
            }

            if (kd1_22 == "null" && kd2_22 == "null" && kd3_22 == "null" && kd4_22 == "null" && kd5_22 == "null"){
                nh_22 = 0;
            }
            else if(kd2_22 == "null" && kd3_22 == "null" && kd4_22 == "null" && kd5_22 == "null"){
                int k1 = Integer.parseInt(kd1_22);

                nh_22 = k1;
            }
            else if (kd3_22 == "null" && kd4_22 == "null" && kd5_22 == "null"){
                int k1 = Integer.parseInt(kd1_22);
                int k2 = Integer.parseInt(kd2_22);

                nh_22 = (k1 + k2) / 2;
            }
            else if (kd4_22 == "null" && kd5_22 == "null"){
                int k1 = Integer.parseInt(kd1_22);
                int k2 = Integer.parseInt(kd2_22);
                int k3 = Integer.parseInt(kd3_22);
                nh_22 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_22 == "null"){
                int k1 = Integer.parseInt(kd1_22);
                int k2 = Integer.parseInt(kd2_22);
                int k3 = Integer.parseInt(kd3_22);
                int k4 = Integer.parseInt(kd4_22);
                nh_22 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_22);
                int k2 = Integer.parseInt(kd2_22);
                int k3 = Integer.parseInt(kd3_22);
                int k4 = Integer.parseInt(kd4_22);
                int k5 = Integer.parseInt(kd5_22);
                nh_22 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_22 == "null" && uas_22 == "null"){
                ns_22 = 0;
            }
            else if (uts_22 != "null" && uas_22 == "null"){
                ns_22 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_22);
                int ks = Integer.parseInt(uas_22);

                ns_22 = (nh_22 + kt + ks) / 3;
            }

            if (kd1_23 == "null" && kd2_23 == "null" && kd3_23 == "null" && kd4_23 == "null" && kd5_23 == "null"){
                nh_23 = 0;
            }
            else if(kd2_23 == "null" && kd3_23 == "null" && kd4_23 == "null" && kd5_23 == "null"){
                int k1 = Integer.parseInt(kd1_23);

                nh_23 = k1;
            }
            else if (kd3_23 == "null" && kd4_23 == "null" && kd5_23 == "null"){
                int k1 = Integer.parseInt(kd1_23);
                int k2 = Integer.parseInt(kd2_23);

                nh_23 = (k1 + k2) / 2;
            }
            else if (kd4_23 == "null" && kd5_23 == "null"){
                int k1 = Integer.parseInt(kd1_23);
                int k2 = Integer.parseInt(kd2_23);
                int k3 = Integer.parseInt(kd3_23);
                nh_23 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_23 == "null"){
                int k1 = Integer.parseInt(kd1_23);
                int k2 = Integer.parseInt(kd2_23);
                int k3 = Integer.parseInt(kd3_23);
                int k4 = Integer.parseInt(kd4_23);
                nh_23 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_23);
                int k2 = Integer.parseInt(kd2_23);
                int k3 = Integer.parseInt(kd3_23);
                int k4 = Integer.parseInt(kd4_23);
                int k5 = Integer.parseInt(kd5_23);
                nh_23 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_23 == "null" && uas_23 == "null"){
                ns_23 = 0;
            }
            else if (uts_23 != "null" && uas_23 == "null"){
                ns_23 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_23);
                int ks = Integer.parseInt(uas_23);

                ns_23 = (nh_23 + kt + ks) / 3;
            }

            if (kd1_24 == "null" && kd2_24 == "null" && kd3_24 == "null" && kd4_24 == "null" && kd5_24 == "null"){
                nh_24 = 0;
            }
            else if(kd2_24 == "null" && kd3_24 == "null" && kd4_24 == "null" && kd5_24 == "null"){
                int k1 = Integer.parseInt(kd1_24);

                nh_24 = k1;
            }
            else if (kd3_24 == "null" && kd4_24 == "null" && kd5_24 == "null"){
                int k1 = Integer.parseInt(kd1_24);
                int k2 = Integer.parseInt(kd2_24);

                nh_24 = (k1 + k2) / 2;
            }
            else if (kd4_24 == "null" && kd5_24 == "null"){
                int k1 = Integer.parseInt(kd1_24);
                int k2 = Integer.parseInt(kd2_24);
                int k3 = Integer.parseInt(kd3_24);
                nh_24 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_24 == "null"){
                int k1 = Integer.parseInt(kd1_24);
                int k2 = Integer.parseInt(kd2_24);
                int k3 = Integer.parseInt(kd3_24);
                int k4 = Integer.parseInt(kd4_24);
                nh_24 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_24);
                int k2 = Integer.parseInt(kd2_24);
                int k3 = Integer.parseInt(kd3_24);
                int k4 = Integer.parseInt(kd4_24);
                int k5 = Integer.parseInt(kd5_24);
                nh_24 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_24 == "null" && uas_24 == "null"){
                ns_24 = 0;
            }
            else if (uts_24 != "null" && uas_24 == "null"){
                ns_24 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_24);
                int ks = Integer.parseInt(uas_24);

                ns_24 = (nh_24 + kt + ks) / 3;
            }

            if (kd1_25 == "null" && kd2_25 == "null" && kd3_25 == "null" && kd4_25 == "null" && kd5_25 == "null"){
                nh_25 = 0;
            }
            else if(kd2_25 == "null" && kd3_25 == "null" && kd4_25 == "null" && kd5_25 == "null"){
                int k1 = Integer.parseInt(kd1_25);

                nh_25 = k1;
            }
            else if (kd3_25 == "null" && kd4_25 == "null" && kd5_25 == "null"){
                int k1 = Integer.parseInt(kd1_25);
                int k2 = Integer.parseInt(kd2_25);

                nh_25 = (k1 + k2) / 2;
            }
            else if (kd4_25 == "null" && kd5_25 == "null"){
                int k1 = Integer.parseInt(kd1_25);
                int k2 = Integer.parseInt(kd2_25);
                int k3 = Integer.parseInt(kd3_25);
                nh_25 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_25 == "null"){
                int k1 = Integer.parseInt(kd1_25);
                int k2 = Integer.parseInt(kd2_25);
                int k3 = Integer.parseInt(kd3_25);
                int k4 = Integer.parseInt(kd4_25);
                nh_25 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_25);
                int k2 = Integer.parseInt(kd2_25);
                int k3 = Integer.parseInt(kd3_25);
                int k4 = Integer.parseInt(kd4_25);
                int k5 = Integer.parseInt(kd5_25);
                nh_25 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_25 == "null" && uas_25 == "null"){
                ns_25 = 0;
            }
            else if (uts_25 != "null" && uas_25 == "null"){
                ns_25 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_25);
                int ks = Integer.parseInt(uas_25);

                ns_25 = (nh_25 + kt + ks) / 3;
            }

            if (kd1_26 == "null" && kd2_26 == "null" && kd3_26 == "null" && kd4_26 == "null" && kd5_26 == "null"){
                nh_26 = 0;
            }
            else if(kd2_26 == "null" && kd3_26 == "null" && kd4_26 == "null" && kd5_26 == "null"){
                int k1 = Integer.parseInt(kd1_26);

                nh_26 = k1;
            }
            else if (kd3_26 == "null" && kd4_26 == "null" && kd5_26 == "null"){
                int k1 = Integer.parseInt(kd1_26);
                int k2 = Integer.parseInt(kd2_26);

                nh_26 = (k1 + k2) / 2;
            }
            else if (kd4_26 == "null" && kd5_26 == "null"){
                int k1 = Integer.parseInt(kd1_26);
                int k2 = Integer.parseInt(kd2_26);
                int k3 = Integer.parseInt(kd3_26);
                nh_26 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_26 == "null"){
                int k1 = Integer.parseInt(kd1_26);
                int k2 = Integer.parseInt(kd2_26);
                int k3 = Integer.parseInt(kd3_26);
                int k4 = Integer.parseInt(kd4_26);
                nh_26 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_26);
                int k2 = Integer.parseInt(kd2_26);
                int k3 = Integer.parseInt(kd3_26);
                int k4 = Integer.parseInt(kd4_26);
                int k5 = Integer.parseInt(kd5_26);
                nh_26 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_26 == "null" && uas_26 == "null"){
                ns_26 = 0;
            }
            else if (uts_26 != "null" && uas_26 == "null"){
                ns_26 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_26);
                int ks = Integer.parseInt(uas_26);

                ns_26 = (nh_26 + kt + ks) / 3;
            }

            if (kd1_27 == "null" && kd2_27 == "null" && kd3_27 == "null" && kd4_27 == "null" && kd5_27 == "null"){
                nh_27 = 0;
            }
            else if(kd2_27 == "null" && kd3_27 == "null" && kd4_27 == "null" && kd5_27 == "null"){
                int k1 = Integer.parseInt(kd1_27);

                nh_27 = k1;
            }
            else if (kd3_27 == "null" && kd4_27 == "null" && kd5_27 == "null"){
                int k1 = Integer.parseInt(kd1_27);
                int k2 = Integer.parseInt(kd2_27);

                nh_27 = (k1 + k2) / 2;
            }
            else if (kd4_27 == "null" && kd5_27 == "null"){
                int k1 = Integer.parseInt(kd1_27);
                int k2 = Integer.parseInt(kd2_27);
                int k3 = Integer.parseInt(kd3_27);
                nh_27 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_27 == "null"){
                int k1 = Integer.parseInt(kd1_27);
                int k2 = Integer.parseInt(kd2_27);
                int k3 = Integer.parseInt(kd3_27);
                int k4 = Integer.parseInt(kd4_27);
                nh_27 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_27);
                int k2 = Integer.parseInt(kd2_27);
                int k3 = Integer.parseInt(kd3_27);
                int k4 = Integer.parseInt(kd4_27);
                int k5 = Integer.parseInt(kd5_27);
                nh_27 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_27 == "null" && uas_27 == "null"){
                ns_27 = 0;
            }
            else if (uts_27 != "null" && uas_27 == "null"){
                ns_27 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_27);
                int ks = Integer.parseInt(uas_27);

                ns_27 = (nh_27 + kt + ks) / 3;
            }

            if (kd1_28 == "null" && kd2_28 == "null" && kd3_28 == "null" && kd4_28 == "null" && kd5_28 == "null"){
                nh_28 = 0;
            }
            else if(kd2_28 == "null" && kd3_28 == "null" && kd4_28 == "null" && kd5_28 == "null"){
                int k1 = Integer.parseInt(kd1_28);

                nh_28 = k1;
            }
            else if (kd3_28 == "null" && kd4_28 == "null" && kd5_28 == "null"){
                int k1 = Integer.parseInt(kd1_28);
                int k2 = Integer.parseInt(kd2_28);

                nh_28 = (k1 + k2) / 2;
            }
            else if (kd4_28 == "null" && kd5_28 == "null"){
                int k1 = Integer.parseInt(kd1_28);
                int k2 = Integer.parseInt(kd2_28);
                int k3 = Integer.parseInt(kd3_28);
                nh_28 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_28 == "null"){
                int k1 = Integer.parseInt(kd1_28);
                int k2 = Integer.parseInt(kd2_28);
                int k3 = Integer.parseInt(kd3_28);
                int k4 = Integer.parseInt(kd4_28);
                nh_28 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_28);
                int k2 = Integer.parseInt(kd2_28);
                int k3 = Integer.parseInt(kd3_28);
                int k4 = Integer.parseInt(kd4_28);
                int k5 = Integer.parseInt(kd5_28);
                nh_28 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_28 == "null" && uas_28 == "null"){
                ns_28 = 0;
            }
            else if (uts_28 != "null" && uas_28 == "null"){
                ns_28 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_28);
                int ks = Integer.parseInt(uas_28);

                ns_28 = (nh_28 + kt + ks) / 3;
            }

            if (kd1_29 == "null" && kd2_29 == "null" && kd3_29 == "null" && kd4_29 == "null" && kd5_29 == "null"){
                nh_29 = 0;
            }
            else if(kd2_29 == "null" && kd3_29 == "null" && kd4_29 == "null" && kd5_29 == "null"){
                int k1 = Integer.parseInt(kd1_29);

                nh_29 = k1;
            }
            else if (kd3_29 == "null" && kd4_29 == "null" && kd5_29 == "null"){
                int k1 = Integer.parseInt(kd1_29);
                int k2 = Integer.parseInt(kd2_29);

                nh_29 = (k1 + k2) / 2;
            }
            else if (kd4_29 == "null" && kd5_29 == "null"){
                int k1 = Integer.parseInt(kd1_29);
                int k2 = Integer.parseInt(kd2_29);
                int k3 = Integer.parseInt(kd3_29);
                nh_29 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_29 == "null"){
                int k1 = Integer.parseInt(kd1_29);
                int k2 = Integer.parseInt(kd2_29);
                int k3 = Integer.parseInt(kd3_29);
                int k4 = Integer.parseInt(kd4_29);
                nh_29 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_29);
                int k2 = Integer.parseInt(kd2_29);
                int k3 = Integer.parseInt(kd3_29);
                int k4 = Integer.parseInt(kd4_29);
                int k5 = Integer.parseInt(kd5_29);
                nh_29 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_29 == "null" && uas_29 == "null"){
                ns_29 = 0;
            }
            else if (uts_29 != "null" && uas_29 == "null"){
                ns_29 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_29);
                int ks = Integer.parseInt(uas_29);

                ns_29 = (nh_29 + kt + ks) / 3;
            }

            if (kd1_30 == "null" && kd2_30 == "null" && kd3_30 == "null" && kd4_30 == "null" && kd5_30 == "null"){
                nh_30 = 0;
            }
            else if(kd2_30 == "null" && kd3_30 == "null" && kd4_30 == "null" && kd5_30 == "null"){
                int k1 = Integer.parseInt(kd1_30);

                nh_30 = k1;
            }
            else if (kd3_30 == "null" && kd4_30 == "null" && kd5_30 == "null"){
                int k1 = Integer.parseInt(kd1_30);
                int k2 = Integer.parseInt(kd2_30);

                nh_30 = (k1 + k2) / 2;
            }
            else if (kd4_30 == "null" && kd5_30 == "null"){
                int k1 = Integer.parseInt(kd1_30);
                int k2 = Integer.parseInt(kd2_30);
                int k3 = Integer.parseInt(kd3_30);
                nh_30 = (k1 + k2 + k3) / 3;
            }
            else if (kd5_30 == "null"){
                int k1 = Integer.parseInt(kd1_30);
                int k2 = Integer.parseInt(kd2_30);
                int k3 = Integer.parseInt(kd3_30);
                int k4 = Integer.parseInt(kd4_30);
                nh_30 = (k1 + k2 + k3 + k4) / 4;
            }
            else{
                int k1 = Integer.parseInt(kd1_30);
                int k2 = Integer.parseInt(kd2_30);
                int k3 = Integer.parseInt(kd3_30);
                int k4 = Integer.parseInt(kd4_30);
                int k5 = Integer.parseInt(kd5_30);
                nh_30 = (k1 + k2 + k3 + k4 + k5) / 5;
            }

            if (uts_30 == "null" && uas_30 == "null"){
                ns_30 = 0;
            }
            else if (uts_30 != "null" && uas_30 == "null"){
                ns_30 = 0;
            }
            else{
                int kt = Integer.parseInt(uts_30);
                int ks = Integer.parseInt(uas_30);

                ns_30 = (nh_30 + kt + ks) / 3;
            }

            if (ns_1 != 0 && ns_16 != 0){
                na_1 = (ns_1 + ns_16) / 2;

                if (na_1 >= 78)
                    t_1 = "Tuntas";
                else {
                    t_1 = "Tidak Tuntas";

                    if (!tw_1)
                        tw_1 = true;
                    else {
                        if (!tw_2)
                            tw_2 = true;
                        else {
                            if (!tw_3)
                                tw_3 = true;
                        }
                    }
                }
            }

            if (ns_2 != 0 && ns_17 != 0){
                na_2 = (ns_2 + ns_17) / 2;

                if (na_2 >= 78)
                    t_2 = "Tuntas";
                else {
                    t_2 = "Tidak Tuntas";

                    if (!tw_1)
                        tw_1 = true;
                    else {
                        if (!tw_2)
                            tw_2 = true;
                        else {
                            if (!tw_3)
                                tw_3 = true;
                        }
                    }
                }
            }

            if (ns_3 != 0 && ns_18 != 0){
                na_3 = (ns_3 + ns_18) / 2;

                if (na_3 >= 78)
                    t_3 = "Tuntas";
                else {
                    t_3 = "Tidak Tuntas";

                    if (!tw_1)
                        tw_1 = true;
                    else {
                        if (!tw_2)
                            tw_2 = true;
                        else {
                            if (!tw_3)
                                tw_3 = true;
                        }
                    }
                }
            }

            if (ns_4 != 0 && ns_19 != 0){
                na_4 = (ns_4 + ns_19) / 2;

                if (na_4 >= 76)
                    t_4 = "Tuntas";
                else {
                    t_4 = "Tidak Tuntas";

                    if (!tw_1)
                        tw_1 = true;
                    else {
                        if (!tw_2)
                            tw_2 = true;
                        else {
                            if (!tw_3)
                                tw_3 = true;
                        }
                    }
                }
            }

            if (ns_5 != 0 && ns_20 != 0){
                na_5 = (ns_5 + ns_20) / 2;

                if (na_5 >= 76)
                    t_5 = "Tuntas";
                else {
                    t_5 = "Tidak Tuntas";

                    if (!tw_1)
                        tw_1 = true;
                    else {
                        if (!tw_2)
                            tw_2 = true;
                        else {
                            if (!tw_3)
                                tw_3 = true;
                        }
                    }
                }
            }

            if (ns_6 != 0 && ns_21 != 0){
                na_6 = (ns_6 + ns_21) / 2;

                if (na_6 >= 77)
                    t_6 = "Tuntas";
                else {
                    t_6 = "Tidak Tuntas";

                    if (!tw_1)
                        tw_1 = true;
                    else {
                        if (!tw_2)
                            tw_2 = true;
                        else {
                            if (!tw_3)
                                tw_3 = true;
                        }
                    }
                }
            }

            if (ns_7 != 0 && ns_22 != 0){
                na_7 = (ns_7 + ns_22) / 2;

                if (na_7 >= 76)
                    t_7 = "Tuntas";
                else {
                    t_7 = "Tidak Tuntas";

                    if (!tw_1)
                        tw_1 = true;
                    else {
                        if (!tw_2)
                            tw_2 = true;
                        else {
                            if (!tw_3)
                                tw_3 = true;
                        }
                    }
                }
            }

            if (ns_8 != 0 && ns_23 != 0){
                na_8 = (ns_8 + ns_23) / 2;

                if (na_8 >= 78)
                    t_8 = "Tuntas";
                else {
                    t_8 = "Tidak Tuntas";

                    if (!tw_1)
                        tw_1 = true;
                    else {
                        if (!tw_2)
                            tw_2 = true;
                        else {
                            if (!tw_3)
                                tw_3 = true;
                        }
                    }
                }
            }

            if (ns_9 != 0 && ns_24 != 0){
                na_9 = (ns_9 + ns_24) / 2;

                if (na_9 >= 76)
                    t_9 = "Tuntas";
                else {
                    t_9 = "Tidak Tuntas";

                    if (!tw_1)
                        tw_1 = true;
                    else {
                        if (!tw_2)
                            tw_2 = true;
                        else {
                            if (!tw_3)
                                tw_3 = true;
                        }
                    }
                }
            }

            if (ns_10 != 0 && ns_25 != 0){
                na_10 = (ns_10 + ns_25) / 2;

                if (na_10 >= 75)
                    t_10 = "Tuntas";
                else {
                    t_10 = "Tidak Tuntas";

                    if (!tm)
                        tm = true;
                }
            }

            if (ns_11 != 0 && ns_26 != 0){
                na_11 = (ns_11 + ns_26) / 2;

                if (na_11 >= 76)
                    t_11 = "Tuntas";
                else {
                    t_11 = "Tidak Tuntas";

                    if (!tm)
                        tm = true;
                }
            }

            if (ns_12 != 0 && ns_27 != 0){
                na_12 = (ns_12 + ns_27) / 2;

                if (na_12 >= 77)
                    t_12 = "Tuntas";
                else {
                    t_12 = "Tidak Tuntas";

                    if (!tm)
                        tm = true;
                }
            }

            if (ns_13 != 0 && ns_28 != 0){
                na_13 = (ns_13 + ns_28) / 2;

                if (na_13 >= 77)
                    t_13 = "Tuntas";
                else {
                    t_13 = "Tidak Tuntas";

                    if (!tm)
                        tm = true;
                }
            }

            if (ns_14 != 0 && ns_29 != 0){
                na_14 = (ns_14 + ns_29) / 2;

                if (na_14 >= 76)
                    t_14 = "Tuntas";
                else {
                    t_14 = "Tidak Tuntas";

                    if (!tw_1)
                        tw_1 = true;
                    else {
                        if (!tw_2)
                            tw_2 = true;
                        else {
                            if (!tw_3)
                                tw_3 = true;
                        }
                    }
                }
            }

            if (ns_15 != 0 && ns_30 != 0){
                na_15 = (ns_15 + ns_30) / 2;

                if (na_15 >= 77)
                    t_15 = "Tuntas";
                else {
                    t_15 = "Tidak Tuntas";

                    if (!tw_1)
                        tw_1 = true;
                    else {
                        if (!tw_2)
                            tw_2 = true;
                        else {
                            if (!tw_3)
                                tw_3 = true;
                        }
                    }
                }
            }

            if (tw_1 && tw_2 && tw_3){
                keputusan = "Maaf, Anda tidak naik kelas";
            } else if (tm){
                keputusan = "Maaf, Anda tidak naik kelas";
            } else {
                keputusan = "Selamat! Anda naik kelas";
            }


            if (kd1_1.length() == 0){
                kd1_1 = "";
            }

            if (kd2_1.length() == 0){
                kd2_1 = "";
            }

            if (kd3_1.length() == 0){
                kd3_1 = "";
            }

            if (kd4_1.length() == 0){
                kd4_1 = "";
            }

            if (kd5_1.length() == 0){
                kd5_1 = "";
            }

            if (uts_1.length() == 0){
                uts_1 = "";
            }

            if (uas_1.length() == 0){
                uas_1 = "";
            }

            if (kd1_2.length() == 0){
                kd1_2 = "";
            }

            if (kd2_2.length() == 0){
                kd2_2 = "";
            }

            if (kd3_2.length() == 0){
                kd3_2 = "";
            }

            if (kd4_2.length() == 0){
                kd4_2 = "";
            }

            if (kd5_2.length() == 0){
                kd5_2 = "";
            }

            if (uts_2.length() == 0){
                uts_2 = "";
            }

            if (uas_2.length() == 0){
                uas_2 = "";
            }

            if (kd1_3.length() == 0){
                kd1_3 = "";
            }

            if (kd2_3.length() == 0){
                kd2_3 = "";
            }

            if (kd3_3.length() == 0){
                kd3_3 = "";
            }

            if (kd4_3.length() == 0){
                kd4_3 = "";
            }

            if (kd5_3.length() == 0){
                kd5_3 = "";
            }

            if (uts_3.length() == 0){
                uts_3 = "";
            }

            if (uas_3.length() == 0){
                uas_3 = "";
            }

            if (kd1_4.length() == 0){
                kd1_4 = "";
            }

            if (kd2_4.length() == 0){
                kd2_4 = "";
            }

            if (kd3_4.length() == 0){
                kd3_4 = "";
            }

            if (kd4_4.length() == 0){
                kd4_4 = "";
            }

            if (kd5_4.length() == 0){
                kd5_4 = "";
            }

            if (uts_4.length() == 0){
                uts_4 = "";
            }

            if (uas_4.length() == 0){
                uas_4 = "";
            }

            if (kd1_5.length() == 0){
                kd1_5 = "";
            }

            if (kd2_5.length() == 0){
                kd2_5 = "";
            }

            if (kd3_5.length() == 0){
                kd3_5 = "";
            }

            if (kd4_5.length() == 0){
                kd4_5 = "";
            }

            if (kd5_5.length() == 0){
                kd5_5 = "";
            }

            if (uts_5.length() == 0){
                uts_5 = "";
            }

            if (uas_5.length() == 0){
                uas_5 = "";
            }

            if (kd1_6.length() == 0){
                kd1_6 = "";
            }

            if (kd2_6.length() == 0){
                kd2_6 = "";
            }

            if (kd3_6.length() == 0){
                kd3_6 = "";
            }

            if (kd4_6.length() == 0){
                kd4_6 = "";
            }

            if (kd5_6.length() == 0){
                kd5_6 = "";
            }

            if (uts_6.length() == 0){
                uts_6 = "";
            }

            if (uas_6.length() == 0){
                uas_6 = "";
            }

            if (kd1_7.length() == 0){
                kd1_7 = "";
            }

            if (kd2_7.length() == 0){
                kd2_7 = "";
            }

            if (kd3_7.length() == 0){
                kd3_7 = "";
            }

            if (kd4_7.length() == 0){
                kd4_7 = "";
            }

            if (kd5_7.length() == 0){
                kd5_7 = "";
            }

            if (uts_7.length() == 0){
                uts_7 = "";
            }

            if (uas_7.length() == 0){
                uas_7 = "";
            }

            if (kd1_8.length() == 0){
                kd1_8 = "";
            }

            if (kd2_8.length() == 0){
                kd2_8 = "";
            }

            if (kd3_8.length() == 0){
                kd3_8 = "";
            }

            if (kd4_8.length() == 0){
                kd4_8 = "";
            }

            if (kd5_8.length() == 0){
                kd5_8 = "";
            }

            if (uts_8.length() == 0){
                uts_8 = "";
            }

            if (uas_8.length() == 0){
                uas_8 = "";
            }

            if (kd1_9.length() == 0){
                kd1_9 = "";
            }

            if (kd2_9.length() == 0){
                kd2_9 = "";
            }

            if (kd3_9.length() == 0){
                kd3_9 = "";
            }

            if (kd4_9.length() == 0){
                kd4_9 = "";
            }

            if (kd5_9.length() == 0){
                kd5_9 = "";
            }

            if (uts_9.length() == 0){
                uts_9 = "";
            }

            if (uas_9.length() == 0){
                uas_9 = "";
            }

            if (kd1_10.length() == 0){
                kd1_10 = "";
            }

            if (kd2_10.length() == 0){
                kd2_10 = "";
            }

            if (kd3_10.length() == 0){
                kd3_10 = "";
            }

            if (kd4_10.length() == 0){
                kd4_10 = "";
            }

            if (kd5_10.length() == 0){
                kd5_10 = "";
            }

            if (uts_10.length() == 0){
                uts_10 = "";
            }

            if (uas_10.length() == 0){
                uas_10 = "";
            }

            if (kd1_11.length() == 0){
                kd1_11 = "";
            }

            if (kd2_11.length() == 0){
                kd2_11 = "";
            }

            if (kd3_11.length() == 0){
                kd3_11 = "";
            }

            if (kd4_11.length() == 0){
                kd4_11 = "";
            }

            if (kd5_11.length() == 0){
                kd5_11 = "";
            }

            if (uts_11.length() == 0){
                uts_11 = "";
            }

            if (uas_11.length() == 0){
                uas_11 = "";
            }

            if (kd1_12.length() == 0){
                kd1_12 = "";
            }

            if (kd2_12.length() == 0){
                kd2_12 = "";
            }

            if (kd3_12.length() == 0){
                kd3_12 = "";
            }

            if (kd4_12.length() == 0){
                kd4_12 = "";
            }

            if (kd5_12.length() == 0){
                kd5_12 = "";
            }

            if (uts_12.length() == 0){
                uts_12 = "";
            }

            if (uas_12.length() == 0){
                uas_12 = "";
            }

            if (kd1_13.length() == 0){
                kd1_13 = "";
            }

            if (kd2_13.length() == 0){
                kd2_13 = "";
            }

            if (kd3_13.length() == 0){
                kd3_13 = "";
            }

            if (kd4_13.length() == 0){
                kd4_13 = "";
            }

            if (kd5_13.length() == 0){
                kd5_13 = "";
            }

            if (uts_13.length() == 0){
                uts_13 = "";
            }

            if (uas_13.length() == 0){
                uas_13 = "";
            }

            if (kd1_14.length() == 0){
                kd1_14 = "";
            }

            if (kd2_14.length() == 0){
                kd2_14 = "";
            }

            if (kd3_14.length() == 0){
                kd3_14 = "";
            }

            if (kd4_14.length() == 0){
                kd4_14 = "";
            }

            if (kd5_14.length() == 0){
                kd5_14 = "";
            }

            if (uts_14.length() == 0){
                uts_14 = "";
            }

            if (uas_14.length() == 0){
                uas_14 = "";
            }

            if (kd1_15.length() == 0){
                kd1_15 = "";
            }

            if (kd2_15.length() == 0){
                kd2_15 = "";
            }

            if (kd3_15.length() == 0){
                kd3_15 = "";
            }

            if (kd4_15.length() == 0){
                kd4_15 = "";
            }

            if (kd5_15.length() == 0){
                kd5_15 = "";
            }

            if (uts_15.length() == 0){
                uts_15 = "";
            }

            if (uas_15.length() == 0){
                uas_15 = "";
            }

            if (kd1_16.length() == 0){
                kd1_16 = "";
            }

            if (kd2_16.length() == 0){
                kd2_16 = "";
            }

            if (kd3_16.length() == 0){
                kd3_16 = "";
            }

            if (kd4_16.length() == 0){
                kd4_16 = "";
            }

            if (kd5_16.length() == 0){
                kd5_16 = "";
            }

            if (uts_16.length() == 0){
                uts_16 = "";
            }

            if (uas_16.length() == 0){
                uas_16 = "";
            }

            if (kd1_17.length() == 0){
                kd1_17 = "";
            }

            if (kd2_17.length() == 0){
                kd2_17 = "";
            }

            if (kd3_17.length() == 0){
                kd3_17 = "";
            }

            if (kd4_17.length() == 0){
                kd4_17 = "";
            }

            if (kd5_17.length() == 0){
                kd5_17 = "";
            }

            if (uts_17.length() == 0){
                uts_17 = "";
            }

            if (uas_17.length() == 0){
                uas_17 = "";
            }

            if (kd1_18.length() == 0){
                kd1_18 = "";
            }

            if (kd2_18.length() == 0){
                kd2_18 = "";
            }

            if (kd3_18.length() == 0){
                kd3_18 = "";
            }

            if (kd4_18.length() == 0){
                kd4_18 = "";
            }

            if (kd5_18.length() == 0){
                kd5_18 = "";
            }

            if (uts_18.length() == 0){
                uts_18 = "";
            }

            if (uas_18.length() == 0){
                uas_18 = "";
            }

            if (kd1_19.length() == 0){
                kd1_19 = "";
            }

            if (kd2_19.length() == 0){
                kd2_19 = "";
            }

            if (kd3_19.length() == 0){
                kd3_19 = "";
            }

            if (kd4_19.length() == 0){
                kd4_19 = "";
            }

            if (kd5_19.length() == 0){
                kd5_19 = "";
            }

            if (uts_19.length() == 0){
                uts_19 = "";
            }

            if (uas_19.length() == 0){
                uas_19 = "";
            }

            if (kd1_20.length() == 0){
                kd1_20 = "";
            }

            if (kd2_20.length() == 0){
                kd2_20 = "";
            }

            if (kd3_20.length() == 0){
                kd3_20 = "";
            }

            if (kd4_20.length() == 0){
                kd4_20 = "";
            }

            if (kd5_20.length() == 0){
                kd5_20 = "";
            }

            if (uts_20.length() == 0){
                uts_20 = "";
            }

            if (uas_20.length() == 0){
                uas_20 = "";
            }

            if (kd1_21.length() == 0){
                kd1_21 = "";
            }

            if (kd2_21.length() == 0){
                kd2_21 = "";
            }

            if (kd3_21.length() == 0){
                kd3_21 = "";
            }

            if (kd4_21.length() == 0){
                kd4_21 = "";
            }

            if (kd5_21.length() == 0){
                kd5_21 = "";
            }

            if (uts_21.length() == 0){
                uts_21 = "";
            }

            if (uas_21.length() == 0){
                uas_21 = "";
            }

            if (kd1_22.length() == 0){
                kd1_22 = "";
            }

            if (kd2_22.length() == 0){
                kd2_22 = "";
            }

            if (kd3_22.length() == 0){
                kd3_22 = "";
            }

            if (kd4_22.length() == 0){
                kd4_22 = "";
            }

            if (kd5_22.length() == 0){
                kd5_22 = "";
            }

            if (uts_22.length() == 0){
                uts_22 = "";
            }

            if (uas_22.length() == 0){
                uas_22 = "";
            }

            if (kd1_23.length() == 0){
                kd1_23 = "";
            }

            if (kd2_23.length() == 0){
                kd2_23 = "";
            }

            if (kd3_23.length() == 0){
                kd3_23 = "";
            }

            if (kd4_23.length() == 0){
                kd4_23 = "";
            }

            if (kd5_23.length() == 0){
                kd5_23 = "";
            }

            if (uts_23.length() == 0){
                uts_23 = "";
            }

            if (uas_23.length() == 0){
                uas_23 = "";
            }

            if (kd1_24.length() == 0){
                kd1_24 = "";
            }

            if (kd2_24.length() == 0){
                kd2_24 = "";
            }

            if (kd3_24.length() == 0){
                kd3_24 = "";
            }

            if (kd4_24.length() == 0){
                kd4_24 = "";
            }

            if (kd5_24.length() == 0){
                kd5_24 = "";
            }

            if (uts_24.length() == 0){
                uts_24 = "";
            }

            if (uas_24.length() == 0){
                uas_24 = "";
            }

            if (kd1_25.length() == 0){
                kd1_25 = "";
            }

            if (kd2_25.length() == 0){
                kd2_25 = "";
            }

            if (kd3_25.length() == 0){
                kd3_25 = "";
            }

            if (kd4_25.length() == 0){
                kd4_25 = "";
            }

            if (kd5_25.length() == 0){
                kd5_25 = "";
            }

            if (uts_25.length() == 0){
                uts_25 = "";
            }

            if (uas_25.length() == 0){
                uas_25 = "";
            }

            if (kd1_26.length() == 0){
                kd1_26 = "";
            }

            if (kd2_26.length() == 0){
                kd2_26 = "";
            }

            if (kd3_26.length() == 0){
                kd3_26 = "";
            }

            if (kd4_26.length() == 0){
                kd4_26 = "";
            }

            if (kd5_26.length() == 0){
                kd5_26 = "";
            }

            if (uts_26.length() == 0){
                uts_26 = "";
            }

            if (uas_26.length() == 0){
                uas_26 = "";
            }

            if (kd1_27.length() == 0){
                kd1_27 = "";
            }

            if (kd2_27.length() == 0){
                kd2_27 = "";
            }

            if (kd3_27.length() == 0){
                kd3_27 = "";
            }

            if (kd4_27.length() == 0){
                kd4_27 = "";
            }

            if (kd5_27.length() == 0){
                kd5_27 = "";
            }

            if (uts_27.length() == 0){
                uts_27 = "";
            }

            if (uas_27.length() == 0){
                uas_27 = "";
            }

            if (kd1_28.length() == 0){
                kd1_28 = "";
            }

            if (kd2_28.length() == 0){
                kd2_28 = "";
            }

            if (kd3_28.length() == 0){
                kd3_28 = "";
            }

            if (kd4_28.length() == 0){
                kd4_28 = "";
            }

            if (kd5_28.length() == 0){
                kd5_28 = "";
            }

            if (uts_28.length() == 0){
                uts_28 = "";
            }

            if (uas_28.length() == 0){
                uas_28 = "";
            }

            if (kd1_29.length() == 0){
                kd1_29 = "";
            }

            if (kd2_29.length() == 0){
                kd2_29 = "";
            }

            if (kd3_29.length() == 0){
                kd3_29 = "";
            }

            if (kd4_29.length() == 0){
                kd4_29 = "";
            }

            if (kd5_29.length() == 0){
                kd5_29 = "";
            }

            if (uts_29.length() == 0){
                uts_29 = "";
            }

            if (uas_29.length() == 0){
                uas_29 = "";
            }

            if (kd1_30.length() == 0){
                kd1_30 = "";
            }

            if (kd2_30.length() == 0){
                kd2_30 = "";
            }

            if (kd3_30.length() == 0){
                kd3_30 = "";
            }

            if (kd4_30.length() == 0){
                kd4_30 = "";
            }

            if (kd5_30.length() == 0){
                kd5_30 = "";
            }

            if (uts_30.length() == 0){
                uts_30 = "";
            }

            if (uas_30.length() == 0){
                uas_30 = "";
            }

        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Gagal Mendapatkan Data", Toast.LENGTH_SHORT).show();
        } finally {
            CheckStoragePermission();
        }
    }

    private void CheckStoragePermission () {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            // Permission is granted
            MakeFolder();
        } else {
            // Permission is not granted
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE);
        }
    }

    private void MakeFolder () {
        File directory = new File(Environment.getExternalStorageDirectory() + "/EDUSCO");

        boolean checkFolder = directory.exists();

        if (!checkFolder) {
            boolean makeFolder = directory.mkdirs();
        }

        MakeNameFile();
    }

    private void MakeNameFile(){
        String paternDate = "E_dd.MM.yyyy_HH.mm.ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat (paternDate);
        String currentDate = simpleDateFormat.format(new Date());

        nameFile = "EDUSCO_" + currentDate;

        MakeFile();
    }

    private void MakeFile(){
        try {
            File textFile = new File(Environment.getExternalStorageDirectory() + "/EDUSCO", nameFile + ".txt");

            FileWriter fileWriter = new FileWriter(textFile);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("EDUSCO");
            printWriter.println("Aplikasi Penilaian Pertama di Indonesia");
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("SEMESTER 1");
            printWriter.println("");
            printWriter.println("Agama");
            printWriter.println("\tID: " + id_1);
            printWriter.println("\tNama: " + nama_1);
            printWriter.println("\tKD1 = " + kd1_1);
            printWriter.println("\tKD2 = " + kd2_1);
            printWriter.println("\tKD3 = " + kd3_1);
            printWriter.println("\tKD4 = " + kd4_1);
            printWriter.println("\tKD5 = " + kd5_1);
            printWriter.println("\tUTS = " + uts_1);
            printWriter.println("\tUAS = " + uas_1);
            printWriter.println("\tKOMENTAR = " + coment_1);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_1);
            printWriter.println("\tNS = " + ns_1);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Pendidikan Kewarganegaraan");
            printWriter.println("\tID: " + id_2);
            printWriter.println("\tNama: " + nama_2);
            printWriter.println("\tKD1 = " + kd1_2);
            printWriter.println("\tKD2 = " + kd2_2);
            printWriter.println("\tKD3 = " + kd3_2);
            printWriter.println("\tKD4 = " + kd4_2);
            printWriter.println("\tKD5 = " + kd5_2);
            printWriter.println("\tUTS = " + uts_2);
            printWriter.println("\tUAS = " + uas_2);
            printWriter.println("\tKOMENTAR = " + coment_2);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_2);
            printWriter.println("\tNS = " + ns_2);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Bahasa Indonesia");
            printWriter.println("\tID: " + id_3);
            printWriter.println("\tNama: " + nama_3);
            printWriter.println("\tKD1 = " + kd1_3);
            printWriter.println("\tKD2 = " + kd2_3);
            printWriter.println("\tKD3 = " + kd3_3);
            printWriter.println("\tKD4 = " + kd4_3);
            printWriter.println("\tKD5 = " + kd5_3);
            printWriter.println("\tUTS = " + uts_3);
            printWriter.println("\tUAS = " + uas_3);
            printWriter.println("\tKOMENTAR = " + coment_3);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_3);
            printWriter.println("\tNS = " + ns_3);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Matematika Wajib");
            printWriter.println("\tID: " + id_4);
            printWriter.println("\tNama: " + nama_4);
            printWriter.println("\tKD1 = " + kd1_4);
            printWriter.println("\tKD2 = " + kd2_4);
            printWriter.println("\tKD3 = " + kd3_4);
            printWriter.println("\tKD4 = " + kd4_4);
            printWriter.println("\tKD5 = " + kd5_4);
            printWriter.println("\tUTS = " + uts_4);
            printWriter.println("\tUAS = " + uas_4);
            printWriter.println("\tKOMENTAR = " + coment_4);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_4);
            printWriter.println("\tNS = " + ns_4);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Sejarah");
            printWriter.println("\tID: " + id_5);
            printWriter.println("\tNama: " + nama_5);
            printWriter.println("\tKD1 = " + kd1_5);
            printWriter.println("\tKD2 = " + kd2_5);
            printWriter.println("\tKD3 = " + kd3_5);
            printWriter.println("\tKD4 = " + kd4_5);
            printWriter.println("\tKD5 = " + kd5_5);
            printWriter.println("\tUTS = " + uts_5);
            printWriter.println("\tUAS = " + uas_5);
            printWriter.println("\tKOMENTAR = " + coment_5);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_5);
            printWriter.println("\tNS = " + ns_5);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Bahasa Inggris Wajib");
            printWriter.println("\tID: " + id_6);
            printWriter.println("\tNama: " + nama_6);
            printWriter.println("\tKD1 = " + kd1_6);
            printWriter.println("\tKD2 = " + kd2_6);
            printWriter.println("\tKD3 = " + kd3_6);
            printWriter.println("\tKD4 = " + kd4_6);
            printWriter.println("\tKD5 = " + kd5_6);
            printWriter.println("\tUTS = " + uts_6);
            printWriter.println("\tUAS = " + uas_6);
            printWriter.println("\tKOMENTAR = " + coment_6);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_6);
            printWriter.println("\tNS = " + ns_6);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Seni Rupa");
            printWriter.println("\tID: " + id_7);
            printWriter.println("\tNama: " + nama_7);
            printWriter.println("\tKD1 = " + kd1_7);
            printWriter.println("\tKD2 = " + kd2_7);
            printWriter.println("\tKD3 = " + kd3_7);
            printWriter.println("\tKD4 = " + kd4_7);
            printWriter.println("\tKD5 = " + kd5_7);
            printWriter.println("\tUTS = " + uts_7);
            printWriter.println("\tUAS = " + uas_7);
            printWriter.println("\tKOMENTAR = " + coment_7);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_7);
            printWriter.println("\tNS = " + ns_7);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Pendidikan Jasmani, Olahraga, dan Kesehatan");
            printWriter.println("\tID: " + id_8);
            printWriter.println("\tNama: " + nama_8);
            printWriter.println("\tKD1 = " + kd1_8);
            printWriter.println("\tKD2 = " + kd2_8);
            printWriter.println("\tKD3 = " + kd3_8);
            printWriter.println("\tKD4 = " + kd4_8);
            printWriter.println("\tKD5 = " + kd5_8);
            printWriter.println("\tUTS = " + uts_8);
            printWriter.println("\tUAS = " + uas_8);
            printWriter.println("\tKOMENTAR = " + coment_8);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_8);
            printWriter.println("\tNS = " + ns_8);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Pendidikan Kewirausahaan");
            printWriter.println("\tID: " + id_9);
            printWriter.println("\tNama: " + nama_9);
            printWriter.println("\tKD1 = " + kd1_9);
            printWriter.println("\tKD2 = " + kd2_9);
            printWriter.println("\tKD3 = " + kd3_9);
            printWriter.println("\tKD4 = " + kd4_9);
            printWriter.println("\tKD5 = " + kd5_9);
            printWriter.println("\tUTS = " + uts_9);
            printWriter.println("\tUAS = " + uas_9);
            printWriter.println("\tKOMENTAR = " + coment_9);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_9);
            printWriter.println("\tNS = " + ns_9);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Matematika Minat");
            printWriter.println("\tID: " + id_10);
            printWriter.println("\tNama: " + nama_10);
            printWriter.println("\tKD1 = " + kd1_10);
            printWriter.println("\tKD2 = " + kd2_10);
            printWriter.println("\tKD3 = " + kd3_10);
            printWriter.println("\tKD4 = " + kd4_10);
            printWriter.println("\tKD5 = " + kd5_10);
            printWriter.println("\tUTS = " + uts_10);
            printWriter.println("\tUAS = " + uas_10);
            printWriter.println("\tKOMENTAR = " + coment_10);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_10);
            printWriter.println("\tNS = " + ns_10);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Biologi");
            printWriter.println("\tID: " + id_11);
            printWriter.println("\tNama: " + nama_11);
            printWriter.println("\tKD1 = " + kd1_11);
            printWriter.println("\tKD2 = " + kd2_11);
            printWriter.println("\tKD3 = " + kd3_11);
            printWriter.println("\tKD4 = " + kd4_11);
            printWriter.println("\tKD5 = " + kd5_11);
            printWriter.println("\tUTS = " + uts_11);
            printWriter.println("\tUAS = " + uas_11);
            printWriter.println("\tKOMENTAR = " + coment_11);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_11);
            printWriter.println("\tNS = " + ns_11);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Fisika");
            printWriter.println("\tID: " + id_12);
            printWriter.println("\tNama: " + nama_12);
            printWriter.println("\tKD1 = " + kd1_12);
            printWriter.println("\tKD2 = " + kd2_12);
            printWriter.println("\tKD3 = " + kd3_12);
            printWriter.println("\tKD4 = " + kd4_12);
            printWriter.println("\tKD5 = " + kd5_12);
            printWriter.println("\tUTS = " + uts_12);
            printWriter.println("\tUAS = " + uas_12);
            printWriter.println("\tKOMENTAR = " + coment_12);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_12);
            printWriter.println("\tNS = " + ns_12);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Kimia");
            printWriter.println("\tID: " + id_13);
            printWriter.println("\tNama: " + nama_13);
            printWriter.println("\tKD1 = " + kd1_13);
            printWriter.println("\tKD2 = " + kd2_13);
            printWriter.println("\tKD3 = " + kd3_13);
            printWriter.println("\tKD4 = " + kd4_13);
            printWriter.println("\tKD5 = " + kd5_13);
            printWriter.println("\tUTS = " + uts_13);
            printWriter.println("\tUAS = " + uas_13);
            printWriter.println("\tKOMENTAR = " + coment_13);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_13);
            printWriter.println("\tNS = " + ns_13);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Bahasa Inggris Lintas Minat");
            printWriter.println("\tID: " + id_14);
            printWriter.println("\tNama: " + nama_14);
            printWriter.println("\tKD1 = " + kd1_14);
            printWriter.println("\tKD2 = " + kd2_14);
            printWriter.println("\tKD3 = " + kd3_14);
            printWriter.println("\tKD4 = " + kd4_14);
            printWriter.println("\tKD5 = " + kd5_14);
            printWriter.println("\tUTS = " + uts_14);
            printWriter.println("\tUAS = " + uas_14);
            printWriter.println("\tKOMENTAR = " + coment_14);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_14);
            printWriter.println("\tNS = " + ns_14);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Bahasa Jerman");
            printWriter.println("\tID: " + id_15);
            printWriter.println("\tNama: " + nama_15);
            printWriter.println("\tKD1 = " + kd1_15);
            printWriter.println("\tKD2 = " + kd2_15);
            printWriter.println("\tKD3 = " + kd3_15);
            printWriter.println("\tKD4 = " + kd4_15);
            printWriter.println("\tKD5 = " + kd5_15);
            printWriter.println("\tUTS = " + uts_15);
            printWriter.println("\tUAS = " + uas_15);
            printWriter.println("\tKOMENTAR = " + coment_15);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_15);
            printWriter.println("\tNS = " + ns_15);
            printWriter.println("");
            printWriter.println("SEMESTER 2");
            printWriter.println("");
            printWriter.println("Agama");
            printWriter.println("\tID: " + id_16);
            printWriter.println("\tNama: " + nama_16);
            printWriter.println("\tKD1 = " + kd1_16);
            printWriter.println("\tKD2 = " + kd2_16);
            printWriter.println("\tKD3 = " + kd3_16);
            printWriter.println("\tKD4 = " + kd4_16);
            printWriter.println("\tKD5 = " + kd5_16);
            printWriter.println("\tUTS = " + uts_16);
            printWriter.println("\tUAS = " + uas_16);
            printWriter.println("\tKOMENTAR = " + coment_16);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_16);
            printWriter.println("\tNS = " + ns_16);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Pendidikan Kewarganegaraan");
            printWriter.println("\tID: " + id_17);
            printWriter.println("\tNama: " + nama_17);
            printWriter.println("\tKD1 = " + kd1_17);
            printWriter.println("\tKD2 = " + kd2_17);
            printWriter.println("\tKD3 = " + kd3_17);
            printWriter.println("\tKD4 = " + kd4_17);
            printWriter.println("\tKD5 = " + kd5_17);
            printWriter.println("\tUTS = " + uts_17);
            printWriter.println("\tUAS = " + uas_17);
            printWriter.println("\tKOMENTAR = " + coment_17);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_17);
            printWriter.println("\tNS = " + ns_17);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Bahasa Indonesia");
            printWriter.println("\tID: " + id_18);
            printWriter.println("\tNama: " + nama_18);
            printWriter.println("\tKD1 = " + kd1_18);
            printWriter.println("\tKD2 = " + kd2_18);
            printWriter.println("\tKD3 = " + kd3_18);
            printWriter.println("\tKD4 = " + kd4_18);
            printWriter.println("\tKD5 = " + kd5_18);
            printWriter.println("\tUTS = " + uts_18);
            printWriter.println("\tUAS = " + uas_18);
            printWriter.println("\tKOMENTAR = " + coment_18);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_18);
            printWriter.println("\tNS = " + ns_18);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Matematika Wajib");
            printWriter.println("\tID: " + id_19);
            printWriter.println("\tNama: " + nama_19);
            printWriter.println("\tKD1 = " + kd1_19);
            printWriter.println("\tKD2 = " + kd2_19);
            printWriter.println("\tKD3 = " + kd3_19);
            printWriter.println("\tKD4 = " + kd4_19);
            printWriter.println("\tKD5 = " + kd5_19);
            printWriter.println("\tUTS = " + uts_19);
            printWriter.println("\tUAS = " + uas_19);
            printWriter.println("\tKOMENTAR = " + coment_19);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_19);
            printWriter.println("\tNS = " + ns_19);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Sejarah");
            printWriter.println("\tID: " + id_20);
            printWriter.println("\tNama: " + nama_20);
            printWriter.println("\tKD1 = " + kd1_20);
            printWriter.println("\tKD2 = " + kd2_20);
            printWriter.println("\tKD3 = " + kd3_20);
            printWriter.println("\tKD4 = " + kd4_20);
            printWriter.println("\tKD5 = " + kd5_20);
            printWriter.println("\tUTS = " + uts_20);
            printWriter.println("\tUAS = " + uas_20);
            printWriter.println("\tKOMENTAR = " + coment_20);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_20);
            printWriter.println("\tNS = " + ns_20);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Bahasa Inggris Wajib");
            printWriter.println("\tID: " + id_21);
            printWriter.println("\tNama: " + nama_21);
            printWriter.println("\tKD1 = " + kd1_21);
            printWriter.println("\tKD2 = " + kd2_21);
            printWriter.println("\tKD3 = " + kd3_21);
            printWriter.println("\tKD4 = " + kd4_21);
            printWriter.println("\tKD5 = " + kd5_21);
            printWriter.println("\tUTS = " + uts_21);
            printWriter.println("\tUAS = " + uas_21);
            printWriter.println("\tKOMENTAR = " + coment_21);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_21);
            printWriter.println("\tNS = " + ns_21);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Seni Rupa");
            printWriter.println("\tID: " + id_22);
            printWriter.println("\tNama: " + nama_22);
            printWriter.println("\tKD1 = " + kd1_22);
            printWriter.println("\tKD2 = " + kd2_22);
            printWriter.println("\tKD3 = " + kd3_22);
            printWriter.println("\tKD4 = " + kd4_22);
            printWriter.println("\tKD5 = " + kd5_22);
            printWriter.println("\tUTS = " + uts_22);
            printWriter.println("\tUAS = " + uas_22);
            printWriter.println("\tKOMENTAR = " + coment_22);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_22);
            printWriter.println("\tNS = " + ns_22);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Pendidikan Jasmani, Olahraga, dan Kesehatan");
            printWriter.println("\tID: " + id_23);
            printWriter.println("\tNama: " + nama_23);
            printWriter.println("\tKD1 = " + kd1_23);
            printWriter.println("\tKD2 = " + kd2_23);
            printWriter.println("\tKD3 = " + kd3_23);
            printWriter.println("\tKD4 = " + kd4_23);
            printWriter.println("\tKD5 = " + kd5_23);
            printWriter.println("\tUTS = " + uts_23);
            printWriter.println("\tUAS = " + uas_23);
            printWriter.println("\tKOMENTAR = " + coment_23);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_23);
            printWriter.println("\tNS = " + ns_23);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Pendidikan Kewirausahaan");
            printWriter.println("\tID: " + id_24);
            printWriter.println("\tNama: " + nama_24);
            printWriter.println("\tKD1 = " + kd1_24);
            printWriter.println("\tKD2 = " + kd2_24);
            printWriter.println("\tKD3 = " + kd3_24);
            printWriter.println("\tKD4 = " + kd4_24);
            printWriter.println("\tKD5 = " + kd5_24);
            printWriter.println("\tUTS = " + uts_24);
            printWriter.println("\tUAS = " + uas_24);
            printWriter.println("\tKOMENTAR = " + coment_24);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_24);
            printWriter.println("\tNS = " + ns_24);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Matematika Minat");
            printWriter.println("\tID: " + id_25);
            printWriter.println("\tNama: " + nama_25);
            printWriter.println("\tKD1 = " + kd1_25);
            printWriter.println("\tKD2 = " + kd2_25);
            printWriter.println("\tKD3 = " + kd3_25);
            printWriter.println("\tKD4 = " + kd4_25);
            printWriter.println("\tKD5 = " + kd5_25);
            printWriter.println("\tUTS = " + uts_25);
            printWriter.println("\tUAS = " + uas_25);
            printWriter.println("\tKOMENTAR = " + coment_25);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_25);
            printWriter.println("\tNS = " + ns_25);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Biologi");
            printWriter.println("\tID: " + id_26);
            printWriter.println("\tNama: " + nama_26);
            printWriter.println("\tKD1 = " + kd1_26);
            printWriter.println("\tKD2 = " + kd2_26);
            printWriter.println("\tKD3 = " + kd3_26);
            printWriter.println("\tKD4 = " + kd4_26);
            printWriter.println("\tKD5 = " + kd5_26);
            printWriter.println("\tUTS = " + uts_26);
            printWriter.println("\tUAS = " + uas_26);
            printWriter.println("\tKOMENTAR = " + coment_26);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_26);
            printWriter.println("\tNS = " + ns_26);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Fisika");
            printWriter.println("\tID: " + id_27);
            printWriter.println("\tNama: " + nama_27);
            printWriter.println("\tKD1 = " + kd1_27);
            printWriter.println("\tKD2 = " + kd2_27);
            printWriter.println("\tKD3 = " + kd3_27);
            printWriter.println("\tKD4 = " + kd4_27);
            printWriter.println("\tKD5 = " + kd5_27);
            printWriter.println("\tUTS = " + uts_27);
            printWriter.println("\tUAS = " + uas_27);
            printWriter.println("\tKOMENTAR = " + coment_27);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_27);
            printWriter.println("\tNS = " + ns_27);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Kimia");
            printWriter.println("\tID: " + id_28);
            printWriter.println("\tNama: " + nama_28);
            printWriter.println("\tKD1 = " + kd1_28);
            printWriter.println("\tKD2 = " + kd2_28);
            printWriter.println("\tKD3 = " + kd3_28);
            printWriter.println("\tKD4 = " + kd4_28);
            printWriter.println("\tKD5 = " + kd5_28);
            printWriter.println("\tUTS = " + uts_28);
            printWriter.println("\tUAS = " + uas_28);
            printWriter.println("\tKOMENTAR = " + coment_28);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_28);
            printWriter.println("\tNS = " + ns_28);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Bahasa Inggris Lintas Minat");
            printWriter.println("\tID: " + id_29);
            printWriter.println("\tNama: " + nama_29);
            printWriter.println("\tKD1 = " + kd1_29);
            printWriter.println("\tKD2 = " + kd2_29);
            printWriter.println("\tKD3 = " + kd3_29);
            printWriter.println("\tKD4 = " + kd4_29);
            printWriter.println("\tKD5 = " + kd5_29);
            printWriter.println("\tUTS = " + uts_29);
            printWriter.println("\tUAS = " + uas_29);
            printWriter.println("\tKOMENTAR = " + coment_29);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_29);
            printWriter.println("\tNS = " + ns_29);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Bahasa Jerman");
            printWriter.println("\tID: " + id_30);
            printWriter.println("\tNama: " + nama_30);
            printWriter.println("\tKD1 = " + kd1_30);
            printWriter.println("\tKD2 = " + kd2_30);
            printWriter.println("\tKD3 = " + kd3_30);
            printWriter.println("\tKD4 = " + kd4_30);
            printWriter.println("\tKD5 = " + kd5_30);
            printWriter.println("\tUTS = " + uts_30);
            printWriter.println("\tUAS = " + uas_30);
            printWriter.println("\tKOMENTAR = " + coment_30);
            printWriter.println("");
            printWriter.println("\tNH = " + nh_30);
            printWriter.println("\tNS = " + ns_30);
            printWriter.println("");
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Nilai Akhir");
            printWriter.println("\tID: " + id_1);
            printWriter.println("\tNama: " + nama_1);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Agama");
            printWriter.println("\tNilai Semester 1 = " + ns_1);
            printWriter.println("\tNilai Semester 2 = " + ns_16);
            printWriter.println("\tNilai Akhir      = " + na_1 + "\t" + t_1);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Pendidikan Kewarganegaraan");
            printWriter.println("\tNilai Semester 1 = " + ns_2);
            printWriter.println("\tNilai Semester 2 = " + ns_17);
            printWriter.println("\tNilai Akhir      = " + na_2 + "\t" + t_2);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Bahasa Indonesia");
            printWriter.println("\tNilai Semester 1 = " + ns_3);
            printWriter.println("\tNilai Semester 2 = " + ns_18);
            printWriter.println("\tNilai Akhir      = " + na_3 + "\t" + t_3);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Matematika Wajib");
            printWriter.println("\tNilai Semester 1 = " + ns_4);
            printWriter.println("\tNilai Semester 2 = " + ns_19);
            printWriter.println("\tNilai Akhir      = " + na_4 + "\t" + t_4);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Sejarah");
            printWriter.println("\tNilai Semester 1 = " + ns_5);
            printWriter.println("\tNilai Semester 2 = " + ns_20);
            printWriter.println("\tNilai Akhir      = " + na_5 + "\t" + t_5);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Bahasa Inggris Wajib");
            printWriter.println("\tNilai Semester 1 = " + ns_6);
            printWriter.println("\tNilai Semester 2 = " + ns_21);
            printWriter.println("\tNilai Akhir      = " + na_6 + "\t" + t_6);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Seni Rupa");
            printWriter.println("\tNilai Semester 1 = " + ns_7);
            printWriter.println("\tNilai Semester 2 = " + ns_22);
            printWriter.println("\tNilai Akhir      = " + na_7 + "\t" + t_7);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Pendidikan Jasmani, Olahraga, dan Kesehatan");
            printWriter.println("\tNilai Semester 1 = " + ns_8);
            printWriter.println("\tNilai Semester 2 = " + ns_23);
            printWriter.println("\tNilai Akhir      = " + na_8 + "\t" + t_8);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Pendidikan Kewirausahaan");
            printWriter.println("\tNilai Semester 1 = " + ns_9);
            printWriter.println("\tNilai Semester 2 = " + ns_24);
            printWriter.println("\tNilai Akhir      = " + na_9 + "\t" + t_9);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Matematika Minat");
            printWriter.println("\tNilai Semester 1 = " + ns_10);
            printWriter.println("\tNilai Semester 2 = " + ns_25);
            printWriter.println("\tNilai Akhir      = " + na_10 + "\t" + t_10);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Biologi");
            printWriter.println("\tNilai Semester 1 = " + ns_11);
            printWriter.println("\tNilai Semester 2 = " + ns_26);
            printWriter.println("\tNilai Akhir      = " + na_11 + "\t" + t_11);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Fisika");
            printWriter.println("\tNilai Semester 1 = " + ns_12);
            printWriter.println("\tNilai Semester 2 = " + ns_27);
            printWriter.println("\tNilai Akhir      = " + na_12 + "\t" + t_12);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Kimia");
            printWriter.println("\tNilai Semester 1 = " + ns_13);
            printWriter.println("\tNilai Semester 2 = " + ns_28);
            printWriter.println("\tNilai Akhir      = " + na_13 + "\t" + t_13);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Bahasa Inggris Lintas Minat");
            printWriter.println("\tNilai Semester 1 = " + ns_14);
            printWriter.println("\tNilai Semester 2 = " + ns_29);
            printWriter.println("\tNilai Akhir      = " + na_14 + "\t" + t_14);
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Bahasa Jerman");
            printWriter.println("\tNilai Semester 1 = " + ns_15);
            printWriter.println("\tNilai Semester 2 = " + ns_30);
            printWriter.println("\tNilai Akhir      = " + na_15 + "\t" + t_15);
            printWriter.println("");
            printWriter.println("---------------------------------------");
            printWriter.println("");
            printWriter.println("Berdasarkan nilai yang Anda dapatkan, maka: ");
            printWriter.println(keputusan);
            printWriter.println("");
            printWriter.println("---------------------------------------");
            printWriter.println("File ini dibuat oleh: " + "EDUSCO");
            printWriter.println("Author: Christopher JB'21");
            printWriter.println("App Version: 1");
            printWriter.println("2019");
            printWriter.println("---------------------------------------");

            printWriter.close();
            fileWriter.close();

            Toast.makeText(this,"Saved File" + getFilesDir(), Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(this, "Gagal", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
        finally {
            end();
        }
    }

    private void end() {
        Intent intent = new Intent(this, MenuSiswa_Semester.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed(){
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE);
    }
}
