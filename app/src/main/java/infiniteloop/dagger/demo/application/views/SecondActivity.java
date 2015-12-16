package infiniteloop.dagger.demo.application.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;
import infiniteloop.dagger.demo.application.R;


public class SecondActivity extends AppCompatActivity {

    public static final String TAG = "SecondActivity";

    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    //*********************************************************************
    // Life cycles
    //*********************************************************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);

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


    //*********************************************************************
    // End of class
    //*********************************************************************

}
