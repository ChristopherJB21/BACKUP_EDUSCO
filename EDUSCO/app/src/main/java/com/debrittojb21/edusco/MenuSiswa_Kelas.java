package com.debrittojb21.edusco;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MenuSiswa_Kelas extends AppCompatActivity {

    String noKelas, noUser;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_siswa_kelas);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }


    public void XIA1(View view) {
        Intent intent = new Intent(this, MenuSiswa_Presensi.class);
        noKelas = "1";
        Preferences.setLoggedKelas(getBaseContext(), noKelas);
        startActivity(intent);
        finish();
    }

    public void XIA2(View view) {
        Intent intent = new Intent(this, MenuSiswa_Presensi.class);
        noKelas = "2";
        Preferences.setLoggedKelas(getBaseContext(), noKelas);
        startActivity(intent);
        finish();
    }

    public void XIA3(View view) {
        Intent intent = new Intent(this, MenuSiswa_Presensi.class);
        noKelas = "3";
        Preferences.setLoggedKelas(getBaseContext(), noKelas);
        startActivity(intent);
        finish();
    }

    public void XIA4(View view) {
        Intent intent = new Intent(this, MenuSiswa_Presensi.class);
        noKelas = "4";
        Preferences.setLoggedKelas(getBaseContext(), noKelas);
        startActivity(intent);
        finish();
    }

    public void XIA5(View view) {
        Intent intent = new Intent(this, MenuSiswa_Presensi.class);
        noKelas = "5";
        Preferences.setLoggedKelas(getBaseContext(), noKelas);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent (this, Menu_User.class);
        startActivity(intent);
        finish();
    }
}
