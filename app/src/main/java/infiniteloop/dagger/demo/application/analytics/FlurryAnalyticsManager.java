package infiniteloop.dagger.demo.application.analytics;

import android.util.Log;

import javax.inject.Inject;


public class FlurryAnalyticsManager implements AnalyticsManager {

    public static final String TAG = "FlurryAnalyticsManager";

    @Inject
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
