package infiniteloop.dagger.demo.application.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import infiniteloop.dagger.demo.application.analytics.AnalyticsManager;
import infiniteloop.dagger.demo.application.analytics.GoogleAnalyticsManager;

@Module
public class MainModule {


    @Singleton
    @Provides
    AnalyticsManager provideAnalyticsManager() {
        return new GoogleAnalyticsManager();
    }
}
