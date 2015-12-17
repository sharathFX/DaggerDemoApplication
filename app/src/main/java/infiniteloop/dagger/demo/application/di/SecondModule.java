package infiniteloop.dagger.demo.application.di;

import dagger.Module;
import dagger.Provides;
import infiniteloop.dagger.demo.application.analytics.AnalyticsManager;
import infiniteloop.dagger.demo.application.views.SecondActivityPresenter;

/**
 * Created by sharath.pandeshwar on 17/12/15.
 */
@Module
public class SecondModule {

    @SmallerScope
    @Provides
    SecondActivityPresenter getSecondPresenter(AnalyticsManager manager){
        return new SecondActivityPresenter(manager);
    }
}

