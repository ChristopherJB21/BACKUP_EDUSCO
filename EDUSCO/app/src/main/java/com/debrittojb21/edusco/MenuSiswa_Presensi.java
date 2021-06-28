package com.debrittojb21.edusco;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MenuSiswa_Presensi extends AppCompatActivity {

    String noKelas, noUser, noPresensi;
    EditText eT_Presensi;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_siswa_presensi);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        eT_Presensi = (EditText) findViewById(R.id.edit_nopresensi);
    }

    public void next(View view) {
        noPresensi = eT_Presensi.getText().toString();

        if (noPresensi.length() == 0){
            Toast.makeText(this, "Masukkan nomer presensi Anda", Toast.LENGTH_SHORT).show();
        } else {
            int Presensi = Integer.parseInt(noPresensi);

            if (Presensi > 29){
                Toast.makeText(this, "Masukkan nomer presensi Anda dengan benar", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(this, MenuSiswa_Login.class);
                Preferences.setLoggedPresensi(getBaseContext(), noPresensi);
                startActivity(intent);
                finish();
            }
        }
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent (this, MenuSiswa_Kelas.class);
        startActivity(intent);
        finish();
    }
}
