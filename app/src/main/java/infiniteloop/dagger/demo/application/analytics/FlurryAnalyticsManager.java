package infiniteloop.dagger.demo.application.analytics;

import android.util.Log;


public class FlurryAnalyticsManager implements AnalyticsProvider {

    public static final String TAG = "FlurryAnalyticsManager";

    public FlurryAnalyticsManager() {
    }

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
