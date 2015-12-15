package infiniteloop.dagger.demo.application.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import infiniteloop.dagger.demo.application.analytics.AnalyticsProvider;
import infiniteloop.dagger.demo.application.analytics.FlurryAnalyticsManager;

@Module
public class ApplicationModule {

    @Provides
    @Singleton
    AnalyticsProvider provideAnalyticsProvider() {
        return new FlurryAnalyticsManager();
    }
}
