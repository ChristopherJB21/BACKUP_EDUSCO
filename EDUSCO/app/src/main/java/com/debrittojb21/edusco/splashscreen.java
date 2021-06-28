package com.debrittojb21.edusco;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class splashscreen extends AppCompatActivity {
    private int waktu_loading=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (Preferences.getLoggedInStatus(getBaseContext())) {
                    if (Preferences.getLoggedUser(getBaseContext()).equals("1")) {
                        Intent intent = new Intent(splashscreen.this, MenuSiswa_Semester.class);
                        startActivity(intent);
                    } else if (Preferences.getLoggedUser(getBaseContext()).equals("2")) {
                        Intent intent = new Intent(splashscreen.this, MenuGuru_Kelas.class);
                        startActivity(intent);
                    } else if (Preferences.getLoggedUser(getBaseContext()).equals("3")) {
                        Intent intent = new Intent(splashscreen.this, MenuSiswa_Semester.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(splashscreen.this, Menu_User.class);
                        startActivity(intent);
                    }
                } else {
                    Intent intent = new Intent(splashscreen.this, Menu_User.class);
                    startActivity(intent);
                }

                finish();
            }
        }, waktu_loading);
    }
}
