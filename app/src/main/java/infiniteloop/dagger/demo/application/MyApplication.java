package infiniteloop.dagger.demo.application;


import android.app.Application;
import android.content.Context;

import infiniteloop.dagger.demo.application.di.DaggerMainComponent;
import infiniteloop.dagger.demo.application.di.MainComponent;
import infiniteloop.dagger.demo.application.di.MainModule;


public class MyApplication extends Application {

    /**
     * Global Context that can be used anywhere
     */
    private static Context mContext;

    MainComponent component;


    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;

        prepareAppLevelInjector();
    }

    //*********************************************************************
    // Utility methods
    //*********************************************************************

    private void prepareAppLevelInjector() {
       component = DaggerMainComponent.builder().mainModule(new MainModule()).build();
    }

    //*********************************************************************
    // APIs
    //*********************************************************************


    /**
     * get Application context
     *
     * @return The application Context
     */
    public static MyApplication getAppContext() {
        return (MyApplication) mContext;
    }


    public MainComponent getComponent() {
        return component;
    }
}


//*********************************************************************
// End of class
//*********************************************************************

