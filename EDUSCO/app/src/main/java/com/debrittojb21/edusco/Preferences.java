package com.debrittojb21.edusco;


import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferences {

    static final String KEY_USER_UNTUK_LOGIN = "noUser";
    static final String KEY_KELAS_UNTUK_LOGIN = "noKelas";
    static final String KEY_PRESENSI_UNTUK_LOGIN = "noPresensi";
    static final String KEY_PASSWORD_UNTUK_LOGIN = "noPass";
    static final String KEY_MAPEL_UNTUK_LOGIN = "noMapel";
    static final String KEY_SEMESTER_UNTUK_LOGIN = "noSemester";
    static final String KEY_STATUS_UNTUK_LOGIN = "Status_logged_in";


    public static SharedPreferences getSharedPreference(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void setLoggedUser(Context context, String noUser){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(KEY_USER_UNTUK_LOGIN, noUser);
        editor.apply();
    }

    public static void setLoggedKelas(Context context, String noKelas){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(KEY_KELAS_UNTUK_LOGIN, noKelas);
        editor.apply();
    }

    public static void setLoggedPresensi(Context context, String noPresensi){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(KEY_PRESENSI_UNTUK_LOGIN, noPresensi);
        editor.apply();
    }

    public static void setLoggedPassword(Context context, String noPassword){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(KEY_PASSWORD_UNTUK_LOGIN, noPassword);
        editor.apply();
    }

    public static void setLoggedSemester(Context context, String noSemester){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(KEY_SEMESTER_UNTUK_LOGIN, noSemester);
        editor.apply();
    }

    public static void setLoggedMapel(Context context, String noMapel){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(KEY_MAPEL_UNTUK_LOGIN, noMapel);
        editor.apply();
    }


    public static String getLoggedUser(Context context){
        return getSharedPreference(context).getString(KEY_USER_UNTUK_LOGIN,"");
    }

    public static String getLoggedKelas(Context context){
        return getSharedPreference(context).getString(KEY_KELAS_UNTUK_LOGIN,"");
    }

    public static String getLoggedPresensi(Context context){
        return getSharedPreference(context).getString(KEY_PRESENSI_UNTUK_LOGIN,"");
    }

    public static String getLoggedPassword(Context context){
        return getSharedPreference(context).getString(KEY_PASSWORD_UNTUK_LOGIN,"");
    }

    public static String getLoggedMapel(Context context){
        return getSharedPreference(context).getString(KEY_MAPEL_UNTUK_LOGIN,"");
    }

    public static String getLoggedSemester(Context context){
        return getSharedPreference(context).getString(KEY_SEMESTER_UNTUK_LOGIN,"");
    }

    public static void setLoggedInStatus(Context context, boolean status){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putBoolean(KEY_STATUS_UNTUK_LOGIN, status);
        editor.apply();
    }

    public static boolean getLoggedInStatus(Context context){
        return getSharedPreference(context).getBoolean(KEY_STATUS_UNTUK_LOGIN,false);
    }

    public static void clearLoggedInUser (Context context){
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.remove(KEY_USER_UNTUK_LOGIN);
        editor.remove(KEY_KELAS_UNTUK_LOGIN);
        editor.remove(KEY_PRESENSI_UNTUK_LOGIN);
        editor.remove(KEY_PASSWORD_UNTUK_LOGIN);
        editor.remove(KEY_MAPEL_UNTUK_LOGIN);
        editor.remove(KEY_STATUS_UNTUK_LOGIN);
        editor.apply();
    }
}