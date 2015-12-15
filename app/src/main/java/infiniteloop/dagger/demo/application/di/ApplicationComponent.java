package infiniteloop.dagger.demo.application.di;

import javax.inject.Singleton;

import dagger.Component;
import infiniteloop.dagger.demo.application.MainActivity;
import infiniteloop.dagger.demo.application.analytics.AnalyticsProvider;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

     MainActivity inject(MainActivity activity);

    AnalyticsProvider getAnalyticsProvider();
}
