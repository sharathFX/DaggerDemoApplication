package infiniteloop.dagger.demo.application;


import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    /**
     * Global Context that can be used anywhere
     */
    private static Context mContext;


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

}


//*********************************************************************
// End of class
//*********************************************************************

