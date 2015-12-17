package infiniteloop.dagger.demo.application.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import infiniteloop.dagger.demo.application.analytics.AnalyticsManager;
import infiniteloop.dagger.demo.application.analytics.FlurryAnalyticsManager;
import infiniteloop.dagger.demo.application.analytics.GoogleAnalyticsManager;

/**
 * Created by sharath.pandeshwar on 17/12/15.
 */
@Module
public class MainModule {


    @Singleton
    @Provides
    AnalyticsManager getAnalyticsManager(){
        return new FlurryAnalyticsManager();
    }
}
