package com.debrittojb21.edusco;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuSiswa_Semester extends AppCompatActivity {

    String noSemester;

    @Override
    protected void onCreate (Bundle savedInstanceSaved){
        super.onCreate(savedInstanceSaved);
        setContentView(R.layout.activity_menu_siswa_semester);
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

    public void Semester1(View view) {
        noSemester = "1";
        Preferences.setLoggedSemester(getBaseContext(), noSemester);

        Intent intent = new Intent(this, MenuSiswa_Mapel.class);
        startActivity(intent);
        finish();
    }

    public void Semester2(View view) {
        noSemester = "2";
        Preferences.setLoggedSemester(getBaseContext(), noSemester);

        Intent intent = new Intent(this, MenuSiswa_Mapel.class);
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
