package infiniteloop.dagger.demo.application.views;


import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

import infiniteloop.dagger.demo.application.analytics.AnalyticsManager;

public class SecondActivityPresenter {

    public static final String TAG = "SecondActivityPresenter";

    AnalyticsManager mAnalyticsManager;

    @Inject
    public SecondActivityPresenter(AnalyticsManager mAnalyticsManager) {
        this.mAnalyticsManager = mAnalyticsManager;
    }

    public void sayHi(Context context) {
        Toast.makeText(context, "Hey hi", Toast.LENGTH_SHORT).show();
    }
}
