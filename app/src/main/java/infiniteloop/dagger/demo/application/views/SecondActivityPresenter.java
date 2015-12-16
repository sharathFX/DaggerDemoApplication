package infiniteloop.dagger.demo.application.views;


import javax.inject.Inject;

import infiniteloop.dagger.demo.application.analytics.AnalyticsManager;

public class SecondActivityPresenter {
    AnalyticsManager mAnalyticsManager;

    @Inject
    public SecondActivityPresenter(AnalyticsManager mAnalyticsManager) {
        this.mAnalyticsManager = mAnalyticsManager;
    }
}
