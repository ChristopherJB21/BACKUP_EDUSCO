package com.debrittojb21.edusco;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuGuru_Kelas extends AppCompatActivity {

    String noKelas;
    String noMapel;
    String noUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_guru_kelas);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu_guru_kelas, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
         if (item.getItemId() == R.id.Logout){
            Preferences.clearLoggedInUser(getBaseContext());

            Intent intent = new Intent(this, Menu_User.class);
            startActivity(intent);
            finish();
        }

        return true;
    }


    public void XIA1(View view) {
        Intent intent = new Intent(this, MenuGuru_Login.class);
        noKelas = "1";
        Preferences.setLoggedKelas(getBaseContext(), noKelas);
        startActivity(intent);
        finish();
    }

    public void XIA2(View view) {
        Intent intent = new Intent(this, MenuGuru_Login.class);
        noKelas = "2";
        Preferences.setLoggedKelas(getBaseContext(), noKelas);
        startActivity(intent);
        finish();
    }

    public void XIA3(View view) {
        Intent intent = new Intent(this, MenuGuru_Login.class);
        noKelas = "3";
        Preferences.setLoggedKelas(getBaseContext(), noKelas);
        startActivity(intent);
        finish();
    }

    public void XIA4(View view) {
        Intent intent = new Intent(this, MenuGuru_Login.class);
        noKelas = "4";
        Preferences.setLoggedKelas(getBaseContext(), noKelas);
        startActivity(intent);
        finish();
    }

    public void XIA5(View view) {
        Intent intent = new Intent(this, MenuGuru_Login.class);
        noKelas = "5";
        Preferences.setLoggedKelas(getBaseContext(), noKelas);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed (){
        Preferences.clearLoggedInUser(getBaseContext());

        Intent intent = new Intent(this, MenuGuru_Mapel.class);
        startActivity(intent);
        finish();
    }
}
