package infiniteloop.dagger.demo.application.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import infiniteloop.dagger.demo.application.R;
import infiniteloop.dagger.demo.application.analytics.GoogleAnalyticsManager;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    GoogleAnalyticsManager mAnalyticsProvider;

    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    //*********************************************************************
    // Life cycles
    //*********************************************************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);

        mAnalyticsProvider = new GoogleAnalyticsManager();

        injectMyself();
    }

    //*********************************************************************
    // Utility functions
    //*********************************************************************

    private void injectMyself() {

    }

    //*********************************************************************
    // View interactions
    //*********************************************************************

    @OnClick(R.id.button1)
    public void logEvent1() {
        Toast.makeText(this, "Event1", Toast.LENGTH_SHORT).show();
        mAnalyticsProvider.logEvent1();
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
