package infiniteloop.dagger.demo.application.di;

import dagger.Component;
import infiniteloop.dagger.demo.application.views.SecondActivity;

/**
 * Created by sharath.pandeshwar on 17/12/15.
 */
@SmallerScope
@Component(dependencies = {MainComponent.class}, modules = {SecondModule.class})
public interface SecondComponent {

    void inject(SecondActivity activity);
}
