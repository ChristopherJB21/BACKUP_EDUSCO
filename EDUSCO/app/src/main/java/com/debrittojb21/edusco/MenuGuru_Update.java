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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class MenuGuru_Update extends AppCompatActivity {

    String id, noKelas, noMapel, s, t, empty, noSemester;

    TextView title, ID, Name;
    EditText KD1, KD2, KD3, KD4, KD5, UTS, UAS, COMMENT;
    Boolean next, previous, change, logout;

    protected void onCreate (Bundle savedInstanceSaved){
        super.onCreate(savedInstanceSaved);
        setContentView(R.layout.activity_menu_guru_update);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        next = false;
        previous = false;
        change = false;
        logout = false;

        title = findViewById(R.id.title);
        ID = findViewById(R.id.Text_ID);
        Name = findViewById(R.id.Text_Nama);

        KD1 = findViewById(R.id.Text_KD1);
        KD2 = findViewById(R.id.Text_KD2);
        KD3 = findViewById(R.id.Text_KD3);
        KD4 = findViewById(R.id.Text_KD4);
        KD5 = findViewById(R.id.Text_KD5);
        UTS = findViewById(R.id.Text_UTS);
        UAS = findViewById(R.id.Text_UAS);
        COMMENT = findViewById(R.id.Text_Comment);

        id = Preferences.getLoggedPresensi(getBaseContext());

        noKelas = Preferences.getLoggedKelas(getBaseContext());
        noMapel = Preferences.getLoggedMapel(getBaseContext());
        noSemester = Preferences.getLoggedSemester(getBaseContext());

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

        switch (noKelas) {
            case "1": {
                switch (noSemester) {
                    case "1": {
                        switch (noMapel) {
                            case "1":
                                t = Configuration.URL_UPDATE_AGAMA_XIA1_SMT1;
                                break;
                            case "2":
                                t = Configuration.URL_UPDATE_PKN_XIA1_SMT1;
                                break;
                            case "3":
                                t = Configuration.URL_UPDATE_INDO_XIA1_SMT1;
                                break;
                            case "4":
                                t = Configuration.URL_UPDATE_MATH_XIA1_SMT1;
                                break;
                            case "5":
                                t = Configuration.URL_UPDATE_SEJARAH_XIA1_SMT1;
                                break;
                            case "6":
                                t = Configuration.URL_UPDATE_BING_XIA1_SMT1;
                                break;
                            case "7":
                                t = Configuration.URL_UPDATE_ART_XIA1_SMT1;
                                break;
                            case "8":
                                t = Configuration.URL_UPDATE_OR_XIA1_SMT1;
                                break;
                            case "9":
                                t = Configuration.URL_UPDATE_PKWU_XIA1_SMT1;
                                break;
                            case "10":
                                t = Configuration.URL_UPDATE_MATHMINAT_XIA1_SMT1;
                                break;
                            case "11":
                                t = Configuration.URL_UPDATE_BIOLOGI_XIA1_SMT1;
                                break;
                            case "12":
                                t = Configuration.URL_UPDATE_FISIKA_XIA1_SMT1;
                                break;
                            case "13":
                                t = Configuration.URL_UPDATE_KIMIA_XIA1_SMT1;
                                break;
                            case "14":
                                t = Configuration.URL_UPDATE_BINGMINAT_XIA1_SMT1;
                                break;
                            case "15":
                                t = Configuration.URL_UPDATE_BJERMAN_XIA1_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                t = Configuration.URL_UPDATE_AGAMA_XIA1_SMT2;
                                break;
                            case "2":
                                t = Configuration.URL_UPDATE_PKN_XIA1_SMT2;
                                break;
                            case "3":
                                t = Configuration.URL_UPDATE_INDO_XIA1_SMT2;
                                break;
                            case "4":
                                t = Configuration.URL_UPDATE_MATH_XIA1_SMT2;
                                break;
                            case "5":
                                t = Configuration.URL_UPDATE_SEJARAH_XIA1_SMT2;
                                break;
                            case "6":
                                t = Configuration.URL_UPDATE_BING_XIA1_SMT2;
                                break;
                            case "7":
                                t = Configuration.URL_UPDATE_ART_XIA1_SMT2;
                                break;
                            case "8":
                                t = Configuration.URL_UPDATE_OR_XIA1_SMT2;
                                break;
                            case "9":
                                t = Configuration.URL_UPDATE_PKWU_XIA1_SMT2;
                                break;
                            case "10":
                                t = Configuration.URL_UPDATE_MATHMINAT_XIA1_SMT2;
                                break;
                            case "11":
                                t = Configuration.URL_UPDATE_BIOLOGI_XIA1_SMT2;
                                break;
                            case "12":
                                t = Configuration.URL_UPDATE_FISIKA_XIA1_SMT2;
                                break;
                            case "13":
                                t = Configuration.URL_UPDATE_KIMIA_XIA1_SMT2;
                                break;
                            case "14":
                                t = Configuration.URL_UPDATE_BINGMINAT_XIA1_SMT2;
                                break;
                            case "15":
                                t = Configuration.URL_UPDATE_BJERMAN_XIA1_SMT2;
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
                                t = Configuration.URL_UPDATE_AGAMA_XIA2_SMT1;
                                break;
                            case "2":
                                t = Configuration.URL_UPDATE_PKN_XIA2_SMT1;
                                break;
                            case "3":
                                t = Configuration.URL_UPDATE_INDO_XIA2_SMT1;
                                break;
                            case "4":
                                t = Configuration.URL_UPDATE_MATH_XIA2_SMT1;
                                break;
                            case "5":
                                t = Configuration.URL_UPDATE_SEJARAH_XIA2_SMT1;
                                break;
                            case "6":
                                t = Configuration.URL_UPDATE_BING_XIA2_SMT1;
                                break;
                            case "7":
                                t = Configuration.URL_UPDATE_ART_XIA2_SMT1;
                                break;
                            case "8":
                                t = Configuration.URL_UPDATE_OR_XIA2_SMT1;
                                break;
                            case "9":
                                t = Configuration.URL_UPDATE_PKWU_XIA2_SMT1;
                                break;
                            case "10":
                                t = Configuration.URL_UPDATE_MATHMINAT_XIA2_SMT1;
                                break;
                            case "11":
                                t = Configuration.URL_UPDATE_BIOLOGI_XIA2_SMT1;
                                break;
                            case "12":
                                t = Configuration.URL_UPDATE_FISIKA_XIA2_SMT1;
                                break;
                            case "13":
                                t = Configuration.URL_UPDATE_KIMIA_XIA2_SMT1;
                                break;
                            case "14":
                                t = Configuration.URL_UPDATE_BINGMINAT_XIA2_SMT1;
                                break;
                            case "15":
                                t = Configuration.URL_UPDATE_BJERMAN_XIA2_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                t = Configuration.URL_UPDATE_AGAMA_XIA2_SMT2;
                                break;
                            case "2":
                                t = Configuration.URL_UPDATE_PKN_XIA2_SMT2;
                                break;
                            case "3":
                                t = Configuration.URL_UPDATE_INDO_XIA2_SMT2;
                                break;
                            case "4":
                                t = Configuration.URL_UPDATE_MATH_XIA2_SMT2;
                                break;
                            case "5":
                                t = Configuration.URL_UPDATE_SEJARAH_XIA2_SMT2;
                                break;
                            case "6":
                                t = Configuration.URL_UPDATE_BING_XIA2_SMT2;
                                break;
                            case "7":
                                t = Configuration.URL_UPDATE_ART_XIA2_SMT2;
                                break;
                            case "8":
                                t = Configuration.URL_UPDATE_OR_XIA2_SMT2;
                                break;
                            case "9":
                                t = Configuration.URL_UPDATE_PKWU_XIA2_SMT2;
                                break;
                            case "10":
                                t = Configuration.URL_UPDATE_MATHMINAT_XIA2_SMT2;
                                break;
                            case "11":
                                t = Configuration.URL_UPDATE_BIOLOGI_XIA2_SMT2;
                                break;
                            case "12":
                                t = Configuration.URL_UPDATE_FISIKA_XIA2_SMT2;
                                break;
                            case "13":
                                t = Configuration.URL_UPDATE_KIMIA_XIA2_SMT2;
                                break;
                            case "14":
                                t = Configuration.URL_UPDATE_BINGMINAT_XIA2_SMT2;
                                break;
                            case "15":
                                t = Configuration.URL_UPDATE_BJERMAN_XIA2_SMT2;
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
                                t = Configuration.URL_UPDATE_AGAMA_XIA3_SMT1;
                                break;
                            case "2":
                                t = Configuration.URL_UPDATE_PKN_XIA3_SMT1;
                                break;
                            case "3":
                                t = Configuration.URL_UPDATE_INDO_XIA3_SMT1;
                                break;
                            case "4":
                                t = Configuration.URL_UPDATE_MATH_XIA3_SMT1;
                                break;
                            case "5":
                                t = Configuration.URL_UPDATE_SEJARAH_XIA3_SMT1;
                                break;
                            case "6":
                                t = Configuration.URL_UPDATE_BING_XIA3_SMT1;
                                break;
                            case "7":
                                t = Configuration.URL_UPDATE_ART_XIA3_SMT1;
                                break;
                            case "8":
                                t = Configuration.URL_UPDATE_OR_XIA3_SMT1;
                                break;
                            case "9":
                                t = Configuration.URL_UPDATE_PKWU_XIA3_SMT1;
                                break;
                            case "10":
                                t = Configuration.URL_UPDATE_MATHMINAT_XIA3_SMT1;
                                break;
                            case "11":
                                t = Configuration.URL_UPDATE_BIOLOGI_XIA3_SMT1;
                                break;
                            case "12":
                                t = Configuration.URL_UPDATE_FISIKA_XIA3_SMT1;
                                break;
                            case "13":
                                t = Configuration.URL_UPDATE_KIMIA_XIA3_SMT1;
                                break;
                            case "14":
                                t = Configuration.URL_UPDATE_BINGMINAT_XIA3_SMT1;
                                break;
                            case "15":
                                t = Configuration.URL_UPDATE_BJERMAN_XIA3_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                t = Configuration.URL_UPDATE_AGAMA_XIA3_SMT2;
                                break;
                            case "2":
                                t = Configuration.URL_UPDATE_PKN_XIA3_SMT2;
                                break;
                            case "3":
                                t = Configuration.URL_UPDATE_INDO_XIA3_SMT2;
                                break;
                            case "4":
                                t = Configuration.URL_UPDATE_MATH_XIA3_SMT2;
                                break;
                            case "5":
                                t = Configuration.URL_UPDATE_SEJARAH_XIA3_SMT2;
                                break;
                            case "6":
                                t = Configuration.URL_UPDATE_BING_XIA3_SMT2;
                                break;
                            case "7":
                                t = Configuration.URL_UPDATE_ART_XIA3_SMT2;
                                break;
                            case "8":
                                t = Configuration.URL_UPDATE_OR_XIA3_SMT2;
                                break;
                            case "9":
                                t = Configuration.URL_UPDATE_PKWU_XIA3_SMT2;
                                break;
                            case "10":
                                t = Configuration.URL_UPDATE_MATHMINAT_XIA3_SMT2;
                                break;
                            case "11":
                                t = Configuration.URL_UPDATE_BIOLOGI_XIA3_SMT2;
                                break;
                            case "12":
                                t = Configuration.URL_UPDATE_FISIKA_XIA3_SMT2;
                                break;
                            case "13":
                                t = Configuration.URL_UPDATE_KIMIA_XIA3_SMT2;
                                break;
                            case "14":
                                t = Configuration.URL_UPDATE_BINGMINAT_XIA3_SMT2;
                                break;
                            case "15":
                                t = Configuration.URL_UPDATE_BJERMAN_XIA3_SMT2;
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
                                t = Configuration.URL_UPDATE_AGAMA_XIA4_SMT1;
                                break;
                            case "2":
                                t = Configuration.URL_UPDATE_PKN_XIA4_SMT1;
                                break;
                            case "3":
                                t = Configuration.URL_UPDATE_INDO_XIA4_SMT1;
                                break;
                            case "4":
                                t = Configuration.URL_UPDATE_MATH_XIA4_SMT1;
                                break;
                            case "5":
                                t = Configuration.URL_UPDATE_SEJARAH_XIA4_SMT1;
                                break;
                            case "6":
                                t = Configuration.URL_UPDATE_BING_XIA4_SMT1;
                                break;
                            case "7":
                                t = Configuration.URL_UPDATE_ART_XIA4_SMT1;
                                break;
                            case "8":
                                t = Configuration.URL_UPDATE_OR_XIA4_SMT1;
                                break;
                            case "9":
                                t = Configuration.URL_UPDATE_PKWU_XIA4_SMT1;
                                break;
                            case "10":
                                t = Configuration.URL_UPDATE_MATHMINAT_XIA4_SMT1;
                                break;
                            case "11":
                                t = Configuration.URL_UPDATE_BIOLOGI_XIA4_SMT1;
                                break;
                            case "12":
                                t = Configuration.URL_UPDATE_FISIKA_XIA4_SMT1;
                                break;
                            case "13":
                                t = Configuration.URL_UPDATE_KIMIA_XIA4_SMT1;
                                break;
                            case "14":
                                t = Configuration.URL_UPDATE_BINGMINAT_XIA4_SMT1;
                                break;
                            case "15":
                                t = Configuration.URL_UPDATE_BJERMAN_XIA4_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                t = Configuration.URL_UPDATE_AGAMA_XIA4_SMT2;
                                break;
                            case "2":
                                t = Configuration.URL_UPDATE_PKN_XIA4_SMT2;
                                break;
                            case "3":
                                t = Configuration.URL_UPDATE_INDO_XIA4_SMT2;
                                break;
                            case "4":
                                t = Configuration.URL_UPDATE_MATH_XIA4_SMT2;
                                break;
                            case "5":
                                t = Configuration.URL_UPDATE_SEJARAH_XIA4_SMT2;
                                break;
                            case "6":
                                t = Configuration.URL_UPDATE_BING_XIA4_SMT2;
                                break;
                            case "7":
                                t = Configuration.URL_UPDATE_ART_XIA4_SMT2;
                                break;
                            case "8":
                                t = Configuration.URL_UPDATE_OR_XIA4_SMT2;
                                break;
                            case "9":
                                t = Configuration.URL_UPDATE_PKWU_XIA4_SMT2;
                                break;
                            case "10":
                                t = Configuration.URL_UPDATE_MATHMINAT_XIA4_SMT2;
                                break;
                            case "11":
                                t = Configuration.URL_UPDATE_BIOLOGI_XIA4_SMT2;
                                break;
                            case "12":
                                t = Configuration.URL_UPDATE_FISIKA_XIA4_SMT2;
                                break;
                            case "13":
                                t = Configuration.URL_UPDATE_KIMIA_XIA4_SMT2;
                                break;
                            case "14":
                                t = Configuration.URL_UPDATE_BINGMINAT_XIA4_SMT2;
                                break;
                            case "15":
                                t = Configuration.URL_UPDATE_BJERMAN_XIA4_SMT2;
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
                                t = Configuration.URL_UPDATE_AGAMA_XIA5_SMT1;
                                break;
                            case "2":
                                t = Configuration.URL_UPDATE_PKN_XIA5_SMT1;
                                break;
                            case "3":
                                t = Configuration.URL_UPDATE_INDO_XIA5_SMT1;
                                break;
                            case "4":
                                t = Configuration.URL_UPDATE_MATH_XIA5_SMT1;
                                break;
                            case "5":
                                t = Configuration.URL_UPDATE_SEJARAH_XIA5_SMT1;
                                break;
                            case "6":
                                t = Configuration.URL_UPDATE_BING_XIA5_SMT1;
                                break;
                            case "7":
                                t = Configuration.URL_UPDATE_ART_XIA5_SMT1;
                                break;
                            case "8":
                                t = Configuration.URL_UPDATE_OR_XIA5_SMT1;
                                break;
                            case "9":
                                t = Configuration.URL_UPDATE_PKWU_XIA5_SMT1;
                                break;
                            case "10":
                                t = Configuration.URL_UPDATE_MATHMINAT_XIA5_SMT1;
                                break;
                            case "11":
                                t = Configuration.URL_UPDATE_BIOLOGI_XIA5_SMT1;
                                break;
                            case "12":
                                t = Configuration.URL_UPDATE_FISIKA_XIA5_SMT1;
                                break;
                            case "13":
                                t = Configuration.URL_UPDATE_KIMIA_XIA5_SMT1;
                                break;
                            case "14":
                                t = Configuration.URL_UPDATE_BINGMINAT_XIA5_SMT1;
                                break;
                            case "15":
                                t = Configuration.URL_UPDATE_BJERMAN_XIA5_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                t = Configuration.URL_UPDATE_AGAMA_XIA5_SMT2;
                                break;
                            case "2":
                                t = Configuration.URL_UPDATE_PKN_XIA5_SMT2;
                                break;
                            case "3":
                                t = Configuration.URL_UPDATE_INDO_XIA5_SMT2;
                                break;
                            case "4":
                                t = Configuration.URL_UPDATE_MATH_XIA5_SMT2;
                                break;
                            case "5":
                                t = Configuration.URL_UPDATE_SEJARAH_XIA5_SMT2;
                                break;
                            case "6":
                                t = Configuration.URL_UPDATE_BING_XIA5_SMT2;
                                break;
                            case "7":
                                t = Configuration.URL_UPDATE_ART_XIA5_SMT2;
                                break;
                            case "8":
                                t = Configuration.URL_UPDATE_OR_XIA5_SMT2;
                                break;
                            case "9":
                                t = Configuration.URL_UPDATE_PKWU_XIA5_SMT2;
                                break;
                            case "10":
                                t = Configuration.URL_UPDATE_MATHMINAT_XIA5_SMT2;
                                break;
                            case "11":
                                t = Configuration.URL_UPDATE_BIOLOGI_XIA5_SMT2;
                                break;
                            case "12":
                                t = Configuration.URL_UPDATE_FISIKA_XIA5_SMT2;
                                break;
                            case "13":
                                t = Configuration.URL_UPDATE_KIMIA_XIA5_SMT2;
                                break;
                            case "14":
                                t = Configuration.URL_UPDATE_BINGMINAT_XIA5_SMT2;
                                break;
                            case "15":
                                t = Configuration.URL_UPDATE_BJERMAN_XIA5_SMT2;
                                break;
                        }
                    } break;
                }
            } break;
        }


        getStudents();
    }

    private void getStudents(){
        class GetStudents extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MenuGuru_Update.this,"Fetching...","Wait...",false,false);
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
                String a = rh.sendGetRequestParam(s, id);
                return a;
            }
        }
        GetStudents ge = new GetStudents();
        ge.execute();
    }

    private void showScore(String json){
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray result = jsonObject.getJSONArray(Configuration.TAG_JSON_ARRAY);
            JSONObject c = result.getJSONObject(0);
            String id = c.getString(Configuration.TAG_ID);
            String nama = c.getString(Configuration.TAG_NAMA);
            String kd1 = c.getString(Configuration.TAG_KD1);
            String kd2 = c.getString(Configuration.TAG_KD2);
            String kd3 = c.getString(Configuration.TAG_KD3);
            String kd4 = c.getString(Configuration.TAG_KD4);
            String kd5 = c.getString(Configuration.TAG_KD5);
            String uts = c.getString(Configuration.TAG_UTS);
            String uas = c.getString(Configuration.TAG_UAS);
            String comment = c.getString(Configuration.TAG_COMMENT);

            ID.setText(id);
            Name.setText(nama);

            if (kd1 == "null")
                KD1.setText(empty);
            else
                KD1.setText(kd1);

            if (kd2 == "null")
                KD2.setText(empty);
            else
                KD2.setText(kd2);

            if (kd3 == "null")
                KD3.setText(empty);
            else
                KD3.setText(kd3);

            if (kd4 == "null")
                KD4.setText(empty);
            else
                KD4.setText(kd4);

            if (kd5 == "null")
                KD5.setText(empty);
            else
                KD5.setText(kd5);

            if (uts == "null")
                UTS.setText(empty);
            else
                UTS.setText(uts);

            if (uas == "null")
                UAS.setText(empty);
            else
                UAS.setText(uas);

            if (comment == "null")
                COMMENT.setText(empty);
            else
                COMMENT.setText(comment);


        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Gagal", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu_guru, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()== R.id.ChangePassword){
            validasi_kd();
            change = true;
        } else if (item.getItemId() == R.id.Logout){
            validasi_kd();
            logout = true;
        }

        return true;
    }

    private void validasi_kd (){
        String kd1 = KD1.getText().toString();
        String kd2 = KD2.getText().toString();
        String kd3 = KD3.getText().toString();
        String kd4 = KD4.getText().toString();
        String kd5 = KD5.getText().toString();

        if (kd1.length() != 0 && kd2.length() != 0 && kd3.length() != 0 && kd4.length() != 0 && kd5.length() != 0){
            int k1 = Integer.parseInt(kd1);
            int k2 = Integer.parseInt(kd2);
            int k3 = Integer.parseInt(kd3);
            int k4 = Integer.parseInt(kd4);
            int k5 = Integer.parseInt(kd5);

            if (k1 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k1, Toast.LENGTH_SHORT).show();
            }
            else if (k2 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k2, Toast.LENGTH_SHORT).show();
            }
            else if (k3 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k3, Toast.LENGTH_SHORT).show();
            }
            else if (k4 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k4, Toast.LENGTH_SHORT).show();
            }
            else if (k5 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k5, Toast.LENGTH_SHORT).show();
            }
            else{
                validasi_ulangan_umum();
            }
        }
        else if (kd1.length() != 0 && kd2.length() != 0 && kd3.length() != 0 && kd4.length() != 0 && kd5.length() == 0){
            int k1 = Integer.parseInt(kd1);
            int k2 = Integer.parseInt(kd2);
            int k3 = Integer.parseInt(kd3);
            int k4 = Integer.parseInt(kd4);

            if (k1 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k1, Toast.LENGTH_SHORT).show();
            }
            else if (k2 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k2, Toast.LENGTH_SHORT).show();
            }
            else if (k3 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k3, Toast.LENGTH_SHORT).show();
            }
            else if (k4 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k4, Toast.LENGTH_SHORT).show();
            }
            else{
                validasi_ulangan_umum();
            }
        }
        else if (kd1.length() != 0 && kd2.length() != 0 && kd3.length() != 0 && kd4.length() == 0 && kd5.length() == 0){
            int k1 = Integer.parseInt(kd1);
            int k2 = Integer.parseInt(kd2);
            int k3 = Integer.parseInt(kd3);

            if (k1 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k1, Toast.LENGTH_SHORT).show();
            }
            else if (k2 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k2, Toast.LENGTH_SHORT).show();
            }
            else if (k3 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k3, Toast.LENGTH_SHORT).show();
            }
            else{
                validasi_ulangan_umum();
            }
        }
        else if (kd1.length() != 0 && kd2.length() != 0 && kd3.length() == 0 && kd4.length() == 0 && kd5.length() == 0){
            int k1 = Integer.parseInt(kd1);
            int k2 = Integer.parseInt(kd2);

            if (k1 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k1, Toast.LENGTH_SHORT).show();
            }
            else if (k2 > 100){
                Toast.makeText(this, "Tidak ada nilai " + k2, Toast.LENGTH_SHORT).show();
            }
            else{
                validasi_ulangan_umum();
            }
        }
        else if (kd1.length() != 0 && kd2.length() == 0 && kd3.length() == 0 && kd4.length() == 0 && kd5.length() == 0){
            int k1 = Integer.parseInt(kd1);

            if (k1 > 100) {
                Toast.makeText(this, "Tidak ada nilai " + k1, Toast.LENGTH_SHORT).show();
            }
            else{
                validasi_ulangan_umum();
            }
        }
        else if (kd1.length() == 0 && kd2.length() == 0 && kd3.length() == 0 && kd4.length() == 0 && kd5.length() == 0){
            updateScore();
        }
        else {
            Toast.makeText(this, "Mohon mengisi KD secara berurutan", Toast.LENGTH_SHORT).show();
        }
    }

    private void validasi_ulangan_umum (){
        String uts = UTS.getText().toString();
        String uas = UAS.getText().toString();

        if (uts.length() == 0 && uas.length() == 0){
            updateScore();
        }
        else if (uts.length() != 0 && uas.length() != 0){
            int kt = Integer.parseInt(uts);
            int ks = Integer.parseInt(uas);

            if (kt > 100){
                Toast.makeText(this, "Tidak ada nilai " + kt, Toast.LENGTH_SHORT).show();
            }
            else if (ks > 100){
                Toast.makeText(this, "Tidak ada nilai " + ks, Toast.LENGTH_SHORT).show();
            }
            else{
                updateScore();
            }
        }
        else if (uts.length() != 0 && uas.length() == 0){
            int kt = Integer.parseInt(uts);

            if (kt > 100){
                Toast.makeText(this, "Tidak ada nilai " + kt, Toast.LENGTH_SHORT).show();
            }
            else{
                updateScore();
            }
        }
        else{
            Toast.makeText(this, "Mohon mengisi uts terlebih dahulu", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateScore(){
        final String id = ID.getText().toString().trim();
        final String nama = Name.getText().toString().trim();
        final String kd1 = KD1.getText().toString().trim();
        final String kd2 = KD2.getText().toString().trim();
        final String kd3 = KD3.getText().toString().trim();
        final String kd4 = KD4.getText().toString().trim();
        final String kd5 = KD5.getText().toString().trim();
        final String uts = UTS.getText().toString().trim();
        final String uas = UAS.getText().toString().trim();
        final String comment = COMMENT.getText().toString().trim();

        class UpdateScore extends AsyncTask<Void,Void,String>{
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MenuGuru_Update.this,"Updating...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(MenuGuru_Update.this,s,Toast.LENGTH_LONG).show();
                navigation();
            }

            @Override
            protected String doInBackground(Void... params) {
                HashMap<String,String> hashMap = new HashMap<>();
                hashMap.put(Configuration.KEY_STD_ID, id);
                hashMap.put(Configuration.KEY_STD_NAME,nama);
                hashMap.put(Configuration.KEY_STD_KD1,kd1);
                hashMap.put(Configuration.KEY_STD_KD2,kd2);
                hashMap.put(Configuration.KEY_STD_KD3,kd3);
                hashMap.put(Configuration.KEY_STD_KD4,kd4);
                hashMap.put(Configuration.KEY_STD_KD5,kd5);
                hashMap.put(Configuration.KEY_STD_UTS,uts);
                hashMap.put(Configuration.KEY_STD_UAS,uas);
                hashMap.put(Configuration.KEY_STD_COMMENT, comment);

                RequestHandler rh = new RequestHandler();

                String s = rh.sendPostRequest(t,hashMap);

                return s;
            }
        }
        UpdateScore ue = new UpdateScore();
        ue.execute();
    }

    private void navigation (){
        if (previous){
            next = false;
            previous = false;
            change = false;
            logout = false;
            setPrevious();
        }
        if (next){
            next = false;
            previous = false;
            change = false;
            logout = false;
            setNext();
        }
        if (change){
            next = false;
            previous = false;
            change = false;
            logout = false;
            Intent intent = new Intent (this, MenuGuru_ChangePass.class);
            startActivity(intent);
            finish();
        }
        if (logout){
            next = false;
            previous = false;
            change = false;
            logout = false;
            Preferences.clearLoggedInUser(getBaseContext());

            Intent intent = new Intent(this, Menu_User.class);
            startActivity(intent);
            finish();
        }
    }

    public void Previous(View view) {
        previous = true;
        validasi_kd();
    }

    private void setPrevious(){
        refresh();

        int noID = Integer.parseInt(id);
        noID -= 1;

        switch (noKelas){
            case "1":{
                if (noID < 1){
                    noID = 29;
                }
            } break;
            case "2":{
                if (noID < 1){
                    noID = 28;
                }
            } break;
            case "3":{
                if (noID < 1){
                    noID = 29;
                }
            } break;
            case "4":{
                if (noID < 1){
                    noID = 28;
                }
            } break;
            case "5":{
                if (noID < 1){
                    noID = 28;
                }
            } break;
        }

        id = String.valueOf(noID);
        previous = false;
        getStudents();
    }

    public void Next(View view) {
        next = true;
        validasi_kd();
    }

    private void setNext (){
        refresh();

        int noID = Integer.parseInt(id);
        noID += 1;


        switch (noKelas){
            case "1":{
                if (noID > 29){
                    noID = 1;
                }
            } break;
            case "2":{
                if (noID > 28){
                    noID = 1;
                }
            } break;
            case "3":{
                if (noID > 29){
                    noID = 1;
                }
            } break;
            case "4":{
                if (noID > 28){
                    noID = 1;
                }
            } break;
            case "5":{
                if (noID > 28){
                    noID = 1;
                }
            } break;
        }
        id = String.valueOf(noID);
        next = false;
        getStudents();
    }

    private void refresh (){
        KD1.setText(empty);
        KD2.setText(empty);
        KD3.setText(empty);
        KD4.setText(empty);
        KD5.setText(empty);
        UTS.setText(empty);
        UAS.setText(empty);
        COMMENT.setText(empty);
    }

    public void Update(View view) {
        next = false;
        previous = false;
        change = false;
        logout = false;

        validasi_kd();
    }

    @Override
    public void onBackPressed (){
        Intent intent = new Intent(this, MenuGuru_ViewAll.class);
        startActivity(intent);
        finish();
    }
}
