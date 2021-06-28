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
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MenuGuru_ViewAll extends AppCompatActivity implements ListView.OnItemClickListener {

    protected ListView listView;
    protected String JSON_STRING;
    public String noKelas, noMapel, s, noSemester;

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
            Intent intent = new Intent (this, MenuGuru_ChangePass.class);
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

    protected void onCreate (Bundle savedInstanceSaved){
        super.onCreate(savedInstanceSaved);
        setContentView(R.layout.activity_menu_guru_viewall);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(this);

        noMapel = Preferences.getLoggedMapel(getBaseContext());
        noKelas = Preferences.getLoggedKelas(getBaseContext());
        noSemester = Preferences.getLoggedSemester(getBaseContext());

        switch (noKelas) {
            case "1": {
                switch (noSemester) {
                    case "1": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEWALL_AGAMA_XIA1_SMT1;
                                break;
                            case "2":
                                s = Configuration.URL_VIEWALL_PKN_XIA1_SMT1;
                                break;
                            case "3":
                                s = Configuration.URL_VIEWALL_INDO_XIA1_SMT1;
                                break;
                            case "4":
                                s = Configuration.URL_VIEWALL_MATH_XIA1_SMT1;
                                break;
                            case "5":
                                s = Configuration.URL_VIEWALL_SEJARAH_XIA1_SMT1;
                                break;
                            case "6":
                                s = Configuration.URL_VIEWALL_BING_XIA1_SMT1;
                                break;
                            case "7":
                                s = Configuration.URL_VIEWALL_ART_XIA1_SMT1;
                                break;
                            case "8":
                                s = Configuration.URL_VIEWALL_OR_XIA1_SMT1;
                                break;
                            case "9":
                                s = Configuration.URL_VIEWALL_PKWU_XIA1_SMT1;
                                break;
                            case "10":
                                s = Configuration.URL_VIEWALL_MATHMINAT_XIA1_SMT1;
                                break;
                            case "11":
                                s = Configuration.URL_VIEWALL_BIOLOGI_XIA1_SMT1;
                                break;
                            case "12":
                                s = Configuration.URL_VIEWALL_FISIKA_XIA1_SMT1;
                                break;
                            case "13":
                                s = Configuration.URL_VIEWALL_KIMIA_XIA1_SMT1;
                                break;
                            case "14":
                                s = Configuration.URL_VIEWALL_BINGMINAT_XIA1_SMT1;
                                break;
                            case "15":
                                s = Configuration.URL_VIEWALL_BJERMAN_XIA1_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEWALL_AGAMA_XIA1_SMT2;
                                break;
                            case "2":
                                s = Configuration.URL_VIEWALL_PKN_XIA1_SMT2;
                                break;
                            case "3":
                                s = Configuration.URL_VIEWALL_INDO_XIA1_SMT2;
                                break;
                            case "4":
                                s = Configuration.URL_VIEWALL_MATH_XIA1_SMT2;
                                break;
                            case "5":
                                s = Configuration.URL_VIEWALL_SEJARAH_XIA1_SMT2;
                                break;
                            case "6":
                                s = Configuration.URL_VIEWALL_BING_XIA1_SMT2;
                                break;
                            case "7":
                                s = Configuration.URL_VIEWALL_ART_XIA1_SMT2;
                                break;
                            case "8":
                                s = Configuration.URL_VIEWALL_OR_XIA1_SMT2;
                                break;
                            case "9":
                                s = Configuration.URL_VIEWALL_PKWU_XIA1_SMT2;
                                break;
                            case "10":
                                s = Configuration.URL_VIEWALL_MATHMINAT_XIA1_SMT2;
                                break;
                            case "11":
                                s = Configuration.URL_VIEWALL_BIOLOGI_XIA1_SMT2;
                                break;
                            case "12":
                                s = Configuration.URL_VIEWALL_FISIKA_XIA1_SMT2;
                                break;
                            case "13":
                                s = Configuration.URL_VIEWALL_KIMIA_XIA1_SMT2;
                                break;
                            case "14":
                                s = Configuration.URL_VIEWALL_BINGMINAT_XIA1_SMT2;
                                break;
                            case "15":
                                s = Configuration.URL_VIEWALL_BJERMAN_XIA1_SMT2;
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
                                s = Configuration.URL_VIEWALL_AGAMA_XIA2_SMT1;
                                break;
                            case "2":
                                s = Configuration.URL_VIEWALL_PKN_XIA2_SMT1;
                                break;
                            case "3":
                                s = Configuration.URL_VIEWALL_INDO_XIA2_SMT1;
                                break;
                            case "4":
                                s = Configuration.URL_VIEWALL_MATH_XIA2_SMT1;
                                break;
                            case "5":
                                s = Configuration.URL_VIEWALL_SEJARAH_XIA2_SMT1;
                                break;
                            case "6":
                                s = Configuration.URL_VIEWALL_BING_XIA2_SMT1;
                                break;
                            case "7":
                                s = Configuration.URL_VIEWALL_ART_XIA2_SMT1;
                                break;
                            case "8":
                                s = Configuration.URL_VIEWALL_OR_XIA2_SMT1;
                                break;
                            case "9":
                                s = Configuration.URL_VIEWALL_PKWU_XIA2_SMT1;
                                break;
                            case "10":
                                s = Configuration.URL_VIEWALL_MATHMINAT_XIA2_SMT1;
                                break;
                            case "11":
                                s = Configuration.URL_VIEWALL_BIOLOGI_XIA2_SMT1;
                                break;
                            case "12":
                                s = Configuration.URL_VIEWALL_FISIKA_XIA2_SMT1;
                                break;
                            case "13":
                                s = Configuration.URL_VIEWALL_KIMIA_XIA2_SMT1;
                                break;
                            case "14":
                                s = Configuration.URL_VIEWALL_BINGMINAT_XIA2_SMT1;
                                break;
                            case "15":
                                s = Configuration.URL_VIEWALL_BJERMAN_XIA2_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEWALL_AGAMA_XIA2_SMT2;
                                break;
                            case "2":
                                s = Configuration.URL_VIEWALL_PKN_XIA2_SMT2;
                                break;
                            case "3":
                                s = Configuration.URL_VIEWALL_INDO_XIA2_SMT2;
                                break;
                            case "4":
                                s = Configuration.URL_VIEWALL_MATH_XIA2_SMT2;
                                break;
                            case "5":
                                s = Configuration.URL_VIEWALL_SEJARAH_XIA2_SMT2;
                                break;
                            case "6":
                                s = Configuration.URL_VIEWALL_BING_XIA2_SMT2;
                                break;
                            case "7":
                                s = Configuration.URL_VIEWALL_ART_XIA2_SMT2;
                                break;
                            case "8":
                                s = Configuration.URL_VIEWALL_OR_XIA2_SMT2;
                                break;
                            case "9":
                                s = Configuration.URL_VIEWALL_PKWU_XIA2_SMT2;
                                break;
                            case "10":
                                s = Configuration.URL_VIEWALL_MATHMINAT_XIA2_SMT2;
                                break;
                            case "11":
                                s = Configuration.URL_VIEWALL_BIOLOGI_XIA2_SMT2;
                                break;
                            case "12":
                                s = Configuration.URL_VIEWALL_FISIKA_XIA2_SMT2;
                                break;
                            case "13":
                                s = Configuration.URL_VIEWALL_KIMIA_XIA2_SMT2;
                                break;
                            case "14":
                                s = Configuration.URL_VIEWALL_BINGMINAT_XIA2_SMT2;
                                break;
                            case "15":
                                s = Configuration.URL_VIEWALL_BJERMAN_XIA2_SMT2;
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
                                s = Configuration.URL_VIEWALL_AGAMA_XIA3_SMT1;
                                break;
                            case "2":
                                s = Configuration.URL_VIEWALL_PKN_XIA3_SMT1;
                                break;
                            case "3":
                                s = Configuration.URL_VIEWALL_INDO_XIA3_SMT1;
                                break;
                            case "4":
                                s = Configuration.URL_VIEWALL_MATH_XIA3_SMT1;
                                break;
                            case "5":
                                s = Configuration.URL_VIEWALL_SEJARAH_XIA3_SMT1;
                                break;
                            case "6":
                                s = Configuration.URL_VIEWALL_BING_XIA3_SMT1;
                                break;
                            case "7":
                                s = Configuration.URL_VIEWALL_ART_XIA3_SMT1;
                                break;
                            case "8":
                                s = Configuration.URL_VIEWALL_OR_XIA3_SMT1;
                                break;
                            case "9":
                                s = Configuration.URL_VIEWALL_PKWU_XIA3_SMT1;
                                break;
                            case "10":
                                s = Configuration.URL_VIEWALL_MATHMINAT_XIA3_SMT1;
                                break;
                            case "11":
                                s = Configuration.URL_VIEWALL_BIOLOGI_XIA3_SMT1;
                                break;
                            case "12":
                                s = Configuration.URL_VIEWALL_FISIKA_XIA3_SMT1;
                                break;
                            case "13":
                                s = Configuration.URL_VIEWALL_KIMIA_XIA3_SMT1;
                                break;
                            case "14":
                                s = Configuration.URL_VIEWALL_BINGMINAT_XIA3_SMT1;
                                break;
                            case "15":
                                s = Configuration.URL_VIEWALL_BJERMAN_XIA3_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEWALL_AGAMA_XIA3_SMT2;
                                break;
                            case "2":
                                s = Configuration.URL_VIEWALL_PKN_XIA3_SMT2;
                                break;
                            case "3":
                                s = Configuration.URL_VIEWALL_INDO_XIA3_SMT2;
                                break;
                            case "4":
                                s = Configuration.URL_VIEWALL_MATH_XIA3_SMT2;
                                break;
                            case "5":
                                s = Configuration.URL_VIEWALL_SEJARAH_XIA3_SMT2;
                                break;
                            case "6":
                                s = Configuration.URL_VIEWALL_BING_XIA3_SMT2;
                                break;
                            case "7":
                                s = Configuration.URL_VIEWALL_ART_XIA3_SMT2;
                                break;
                            case "8":
                                s = Configuration.URL_VIEWALL_OR_XIA3_SMT2;
                                break;
                            case "9":
                                s = Configuration.URL_VIEWALL_PKWU_XIA3_SMT2;
                                break;
                            case "10":
                                s = Configuration.URL_VIEWALL_MATHMINAT_XIA3_SMT2;
                                break;
                            case "11":
                                s = Configuration.URL_VIEWALL_BIOLOGI_XIA3_SMT2;
                                break;
                            case "12":
                                s = Configuration.URL_VIEWALL_FISIKA_XIA3_SMT2;
                                break;
                            case "13":
                                s = Configuration.URL_VIEWALL_KIMIA_XIA3_SMT2;
                                break;
                            case "14":
                                s = Configuration.URL_VIEWALL_BINGMINAT_XIA3_SMT2;
                                break;
                            case "15":
                                s = Configuration.URL_VIEWALL_BJERMAN_XIA3_SMT2;
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
                                s = Configuration.URL_VIEWALL_AGAMA_XIA4_SMT1;
                                break;
                            case "2":
                                s = Configuration.URL_VIEWALL_PKN_XIA4_SMT1;
                                break;
                            case "3":
                                s = Configuration.URL_VIEWALL_INDO_XIA4_SMT1;
                                break;
                            case "4":
                                s = Configuration.URL_VIEWALL_MATH_XIA4_SMT1;
                                break;
                            case "5":
                                s = Configuration.URL_VIEWALL_SEJARAH_XIA4_SMT1;
                                break;
                            case "6":
                                s = Configuration.URL_VIEWALL_BING_XIA4_SMT1;
                                break;
                            case "7":
                                s = Configuration.URL_VIEWALL_ART_XIA4_SMT1;
                                break;
                            case "8":
                                s = Configuration.URL_VIEWALL_OR_XIA4_SMT1;
                                break;
                            case "9":
                                s = Configuration.URL_VIEWALL_PKWU_XIA4_SMT1;
                                break;
                            case "10":
                                s = Configuration.URL_VIEWALL_MATHMINAT_XIA4_SMT1;
                                break;
                            case "11":
                                s = Configuration.URL_VIEWALL_BIOLOGI_XIA4_SMT1;
                                break;
                            case "12":
                                s = Configuration.URL_VIEWALL_FISIKA_XIA4_SMT1;
                                break;
                            case "13":
                                s = Configuration.URL_VIEWALL_KIMIA_XIA4_SMT1;
                                break;
                            case "14":
                                s = Configuration.URL_VIEWALL_BINGMINAT_XIA4_SMT1;
                                break;
                            case "15":
                                s = Configuration.URL_VIEWALL_BJERMAN_XIA4_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEWALL_AGAMA_XIA4_SMT2;
                                break;
                            case "2":
                                s = Configuration.URL_VIEWALL_PKN_XIA4_SMT2;
                                break;
                            case "3":
                                s = Configuration.URL_VIEWALL_INDO_XIA4_SMT2;
                                break;
                            case "4":
                                s = Configuration.URL_VIEWALL_MATH_XIA4_SMT2;
                                break;
                            case "5":
                                s = Configuration.URL_VIEWALL_SEJARAH_XIA4_SMT2;
                                break;
                            case "6":
                                s = Configuration.URL_VIEWALL_BING_XIA4_SMT2;
                                break;
                            case "7":
                                s = Configuration.URL_VIEWALL_ART_XIA4_SMT2;
                                break;
                            case "8":
                                s = Configuration.URL_VIEWALL_OR_XIA4_SMT2;
                                break;
                            case "9":
                                s = Configuration.URL_VIEWALL_PKWU_XIA4_SMT2;
                                break;
                            case "10":
                                s = Configuration.URL_VIEWALL_MATHMINAT_XIA4_SMT2;
                                break;
                            case "11":
                                s = Configuration.URL_VIEWALL_BIOLOGI_XIA4_SMT2;
                                break;
                            case "12":
                                s = Configuration.URL_VIEWALL_FISIKA_XIA4_SMT2;
                                break;
                            case "13":
                                s = Configuration.URL_VIEWALL_KIMIA_XIA4_SMT2;
                                break;
                            case "14":
                                s = Configuration.URL_VIEWALL_BINGMINAT_XIA4_SMT2;
                                break;
                            case "15":
                                s = Configuration.URL_VIEWALL_BJERMAN_XIA4_SMT2;
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
                                s = Configuration.URL_VIEWALL_AGAMA_XIA5_SMT1;
                                break;
                            case "2":
                                s = Configuration.URL_VIEWALL_PKN_XIA5_SMT1;
                                break;
                            case "3":
                                s = Configuration.URL_VIEWALL_INDO_XIA5_SMT1;
                                break;
                            case "4":
                                s = Configuration.URL_VIEWALL_MATH_XIA5_SMT1;
                                break;
                            case "5":
                                s = Configuration.URL_VIEWALL_SEJARAH_XIA5_SMT1;
                                break;
                            case "6":
                                s = Configuration.URL_VIEWALL_BING_XIA5_SMT1;
                                break;
                            case "7":
                                s = Configuration.URL_VIEWALL_ART_XIA5_SMT1;
                                break;
                            case "8":
                                s = Configuration.URL_VIEWALL_OR_XIA5_SMT1;
                                break;
                            case "9":
                                s = Configuration.URL_VIEWALL_PKWU_XIA5_SMT1;
                                break;
                            case "10":
                                s = Configuration.URL_VIEWALL_MATHMINAT_XIA5_SMT1;
                                break;
                            case "11":
                                s = Configuration.URL_VIEWALL_BIOLOGI_XIA5_SMT1;
                                break;
                            case "12":
                                s = Configuration.URL_VIEWALL_FISIKA_XIA5_SMT1;
                                break;
                            case "13":
                                s = Configuration.URL_VIEWALL_KIMIA_XIA5_SMT1;
                                break;
                            case "14":
                                s = Configuration.URL_VIEWALL_BINGMINAT_XIA5_SMT1;
                                break;
                            case "15":
                                s = Configuration.URL_VIEWALL_BJERMAN_XIA5_SMT1;
                                break;
                        }
                    } break;
                    case "2": {
                        switch (noMapel) {
                            case "1":
                                s = Configuration.URL_VIEWALL_AGAMA_XIA5_SMT2;
                                break;
                            case "2":
                                s = Configuration.URL_VIEWALL_PKN_XIA5_SMT2;
                                break;
                            case "3":
                                s = Configuration.URL_VIEWALL_INDO_XIA5_SMT2;
                                break;
                            case "4":
                                s = Configuration.URL_VIEWALL_MATH_XIA5_SMT2;
                                break;
                            case "5":
                                s = Configuration.URL_VIEWALL_SEJARAH_XIA5_SMT2;
                                break;
                            case "6":
                                s = Configuration.URL_VIEWALL_BING_XIA5_SMT2;
                                break;
                            case "7":
                                s = Configuration.URL_VIEWALL_ART_XIA5_SMT2;
                                break;
                            case "8":
                                s = Configuration.URL_VIEWALL_OR_XIA5_SMT2;
                                break;
                            case "9":
                                s = Configuration.URL_VIEWALL_PKWU_XIA5_SMT2;
                                break;
                            case "10":
                                s = Configuration.URL_VIEWALL_MATHMINAT_XIA5_SMT2;
                                break;
                            case "11":
                                s = Configuration.URL_VIEWALL_BIOLOGI_XIA5_SMT2;
                                break;
                            case "12":
                                s = Configuration.URL_VIEWALL_FISIKA_XIA5_SMT2;
                                break;
                            case "13":
                                s = Configuration.URL_VIEWALL_KIMIA_XIA5_SMT2;
                                break;
                            case "14":
                                s = Configuration.URL_VIEWALL_BINGMINAT_XIA5_SMT2;
                                break;
                            case "15":
                                s = Configuration.URL_VIEWALL_BJERMAN_XIA5_SMT2;
                                break;
                        }
                    } break;
                }
            } break;
        }

        getJSON();
    }

    private void showStudent(){
        JSONObject jsonObject = null;
        ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String, String>>();
        try {
            jsonObject = new JSONObject(JSON_STRING);
            JSONArray result = jsonObject.getJSONArray(Configuration.TAG_JSON_ARRAY);

            for(int i = 0; i<result.length(); i++){
                JSONObject jo = result.getJSONObject(i);
                String id = jo.getString(Configuration.TAG_ID);
                String name = jo.getString(Configuration.TAG_NAMA);

                HashMap<String,String> students = new HashMap<>();
                students.put(Configuration.TAG_ID,id);
                students.put(Configuration.TAG_NAMA,name);
                list.add(students);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ListAdapter adapter = new SimpleAdapter(
                MenuGuru_ViewAll.this, list, R.layout.list_item,
                new String[]{Configuration.TAG_ID, Configuration.TAG_NAMA},
                new int[]{R.id.id, R.id.name});

        listView.setAdapter(adapter);
    }

    private void getJSON() {
        class GetJSON extends AsyncTask<Void,Void,String> {

            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MenuGuru_ViewAll.this,"Mengambil Data","Mohon Tunggu...",false,false);
            }

            @Override
            protected void onPostExecute(String b) {
                super.onPostExecute(b);
                loading.dismiss();
                JSON_STRING = b;
                showStudent();
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String a = rh.sendGetRequest(s);
                return a;
            }
        }
        GetJSON gj = new GetJSON();
        gj.execute();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long ld) {
        Intent intent = new Intent(this, MenuGuru_Update.class);
        HashMap<String,String> map =(HashMap)parent.getItemAtPosition(position);
        String stdId = map.get(Configuration.TAG_ID).toString();
        Preferences.setLoggedPresensi(getBaseContext(), stdId);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed (){
        Intent intent = new Intent(this, MenuGuru_Semester.class);
        startActivity(intent);
        finish();
    }
}
