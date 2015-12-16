package infiniteloop.dagger.demo.application.analytics;

import android.util.Log;

import javax.inject.Inject;


public class GoogleAnalyticsManager implements AnalyticsManager {

    public static final String TAG = "GoogleAnalyticsManager";

    @Inject
    public GoogleAnalyticsManager() {
    }

    /*private static GoogleAnalyticsManager sAnalyticsManager;
    public static synchronized GoogleAnalyticsManager getInstance() {
        if (sAnalyticsManager == null) {
            sAnalyticsManager = new GoogleAnalyticsManager();
        }
        return sAnalyticsManager;
    }*/


    @Override
    public void logEvent1() {
        Log.v(TAG, TAG + " logging event1");
    }

    @Override
    public void logEvent2() {
        Log.v(TAG, TAG + " logging event2");
    }

    @Override
    public void logEvent3() {
        Log.v(TAG, TAG + " logging event3");
    }
}
