package com.debrittojb21.edusco;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Menu_User extends AppCompatActivity {

    String noUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_user);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    public void Student(View view) {
        noUser = "1";

        Preferences.setLoggedUser(getBaseContext(), noUser);

        Intent intent = new Intent (this, MenuSiswa_Kelas.class);
        startActivity(intent);
        finish();
    }

    public void Teacher(View view) {
        noUser = "2";

        Preferences.setLoggedUser(getBaseContext(), noUser);

        Intent intent = new Intent (this, MenuGuru_Mapel.class);
        startActivity(intent);
        finish();
    }

    public void Parent(View view) {
        noUser = "3";

        Preferences.setLoggedUser(getBaseContext(), noUser);

        Intent intent = new Intent (this, MenuSiswa_Kelas.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed(){
        finish();
    }
}
