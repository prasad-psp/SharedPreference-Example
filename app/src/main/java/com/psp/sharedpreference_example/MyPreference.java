package com.psp.sharedpreference_example;

import android.content.Context;
import android.content.SharedPreferences;

public class MyPreference {

    private final SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private final String PREFERENCE_TAG = "my_pref";
    private final String KEY = "data";

    public MyPreference(Context context) {
        preferences = context.getSharedPreferences(PREFERENCE_TAG,Context.MODE_PRIVATE);
    }

    public void editPreference(boolean isVisible) {
        if(editor == null) {
            editor = preferences.edit();
        }

        editor.putBoolean(KEY,isVisible);

        if(editor != null) {
            editor.commit();
            editor = null;
        }
    }

    public boolean getPreference() {
        return preferences.getBoolean(KEY,false);
    }
}
