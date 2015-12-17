package infiniteloop.dagger.demo.application.di;

import javax.inject.Singleton;

import dagger.Component;
import infiniteloop.dagger.demo.application.analytics.AnalyticsManager;
import infiniteloop.dagger.demo.application.views.MainActivity;

/**
 * Created by sharath.pandeshwar on 17/12/15.
 */
@Singleton
@Component(dependencies = {}, modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);

    AnalyticsManager getAnalytics();
}
