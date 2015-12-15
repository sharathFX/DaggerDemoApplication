package infiniteloop.dagger.demo.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import infiniteloop.dagger.demo.application.analytics.AnalyticsProvider;
import infiniteloop.dagger.demo.application.analytics.GoogleAnalyticsManager;
import infiniteloop.dagger.demo.application.di.ApplicationComponent;
import infiniteloop.dagger.demo.application.di.ApplicationModule;
import infiniteloop.dagger.demo.application.di.DaggerApplicationComponent;
import infiniteloop.dagger.demo.application.utils.Calculator;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    ApplicationComponent mApplicationComponent;

    @Inject
    AnalyticsProvider mAnalyticsProvider;

    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    @Inject
    GoogleAnalyticsManager mGoogleAnalyticsManager;

    //*********************************************************************
    // Life cycles
    //*********************************************************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);

        injectMyself();
    }

    //*********************************************************************
    // Utility functions
    //*********************************************************************

    private void injectMyself() {
        mApplicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule()).build();
        mApplicationComponent.inject(this);
    }

    //*********************************************************************
    // View interactions
    //*********************************************************************

    @OnClick(R.id.button1)
    public void logEvent1() {
        Toast.makeText(this, "Event1", Toast.LENGTH_SHORT).show();
        mGoogleAnalyticsManager.logEvent1();
    }

    @OnClick(R.id.button2)
    public void logEvent2() {
        Toast.makeText(this, "Event2", Toast.LENGTH_SHORT).show();
        mAnalyticsProvider.logEvent2();
    }


    @OnClick(R.id.button3)
    public void logEvent3() {
        Toast.makeText(this, "Event3", Toast.LENGTH_SHORT).show();
        mAnalyticsProvider.logEvent3();
    }


    //*********************************************************************
    // End of class
    //*********************************************************************

}
