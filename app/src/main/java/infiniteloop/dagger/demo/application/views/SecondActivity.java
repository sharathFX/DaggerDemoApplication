package infiniteloop.dagger.demo.application.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import infiniteloop.dagger.demo.application.MyApplication;
import infiniteloop.dagger.demo.application.R;
import infiniteloop.dagger.demo.application.di.DaggerSecondComponent;
import infiniteloop.dagger.demo.application.di.SecondComponent;
import infiniteloop.dagger.demo.application.di.SecondModule;


public class SecondActivity extends AppCompatActivity {

    public static final String TAG = "SecondActivity";

    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    @OnClick(R.id.id_hi)
    void sayHi() {
        mSecondActivityPresenter.sayHi(this);
    }

    @Inject
    SecondActivityPresenter mSecondActivityPresenter;

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
        SecondComponent component= DaggerSecondComponent.builder().mainComponent(MyApplication.getAppContext().getComponent())
                .secondModule(new SecondModule())
                .build();
        component.inject(this);
    }

    //*********************************************************************
    // View interactions
    //*********************************************************************


    //*********************************************************************
    // End of class
    //*********************************************************************

}
