package com.debrittojb21.edusco;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuSiswa_Mapel extends AppCompatActivity {

    String noMapel;

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_siswa_mapel);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
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


    public void Agama(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "1";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void pkn(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "2";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void Indo(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "3";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void Math(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "4";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void sejarah(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "5";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void Bing(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "6";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void Art(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "7";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void or(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "8";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void pkwu(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "9";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void mathminat(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "10";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void Biologi(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "11";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void Fisika(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "12";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void kimia(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "13";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void Bingminat(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "14";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    public void Bjerman(View view) {
        Intent intent = new Intent (this, MenuSiswa_View.class);
        noMapel = "15";

        Preferences.setLoggedMapel(getBaseContext(), noMapel);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent (this, MenuSiswa_Semester.class);
        startActivity(intent);
        finish();
    }
}
