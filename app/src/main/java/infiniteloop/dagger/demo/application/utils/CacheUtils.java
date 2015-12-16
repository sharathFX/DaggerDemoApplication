package infiniteloop.dagger.demo.application.utils;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

import infiniteloop.dagger.demo.application.MyApplication;


@Singleton
public class CacheUtils {

    private static final String TAG = "CacheUtils";

    /* Reference to shared preference */
    private SharedPreferences mSharedPreferences;


    private static String sDummyKey = "dummy_key";


    @Inject
    public CacheUtils(MyApplication context) {
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public void setDummyValue(final String value) {
        Log.i(TAG, "Saving dummy value as " + value);
        mSharedPreferences.edit().putString(sDummyKey, value).apply();
    }

    public String getcachedDummyValue() {
        return mSharedPreferences.getString(sDummyKey, "");
    }


    //*********************************************************************
    // End of class
    //*********************************************************************

}
