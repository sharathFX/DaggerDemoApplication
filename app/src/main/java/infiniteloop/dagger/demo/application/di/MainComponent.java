package infiniteloop.dagger.demo.application.di;

import javax.inject.Singleton;

import dagger.Component;
import infiniteloop.dagger.demo.application.views.MainActivity;

@Singleton
@Component(dependencies = {}, modules = MainModule.class)
public interface MainComponent{

    void inject(MainActivity activity);
}
