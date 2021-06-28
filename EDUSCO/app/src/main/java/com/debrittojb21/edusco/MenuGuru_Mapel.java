package com.debrittojb21.edusco;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MenuGuru_Mapel extends AppCompatActivity {

    String noMapel, noUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_guru_mapel);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
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

    public void Agama(View view) {
        noMapel = "1";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void pkn(View view) {
        noMapel = "2";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void Indo(View view) {
        noMapel = "3";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void Math(View view) {
        noMapel = "4";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void sejarah(View view) {
        noMapel = "5";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void Bing(View view) {
        noMapel = "6";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void Art(View view) {
        noMapel = "7";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void or(View view) {
        noMapel = "8";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void pkwu(View view) {
        noMapel = "9";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void mathminat(View view) {
        noMapel = "10";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void Biologi(View view) {
        noMapel = "11";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void Fisika(View view) {
        noMapel = "12";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void kimia(View view) {
        noMapel = "13";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void Bingminat(View view) {
        noMapel = "14";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    public void Bjerman(View view) {
        noMapel = "15";

        Preferences.setLoggedMapel(getBaseContext(),noMapel);
        next();
    }

    private void next (){
        Intent intent = new Intent(this, MenuGuru_Kelas.class);
        Preferences.setLoggedInStatus(getBaseContext(), true);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(this, Menu_User.class);
        startActivity(intent);
        finish();
    }
}
