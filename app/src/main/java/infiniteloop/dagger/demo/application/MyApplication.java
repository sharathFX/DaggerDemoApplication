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
    }

    /**
     * get Application context
     *
     * @return The application Context
     */
    public static Context getAppContext() {
        return mContext;
    }


}
