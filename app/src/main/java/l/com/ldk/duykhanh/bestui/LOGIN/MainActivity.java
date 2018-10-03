package l.com.ldk.duykhanh.bestui.LOGIN;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import l.com.ldk.duykhanh.bestui.FRAGMENT.FragmentPlash2;
import l.com.ldk.duykhanh.bestui.FRAGMENT.FragmentSplash;
import l.com.ldk.duykhanh.bestui.R;

public class MainActivity extends AppCompatActivity {
    private final static int TIME_OUT = 1500;
    Fragment fragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = new FragmentPlash2();
        loadFragment(fragment);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                fragment = new FragmentSplash();
                loadFragment(fragment);
            }
        }, TIME_OUT);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 4000);
    }
    private void loadFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment, fragment);
        String tag = null;
        transaction.commit();
    }
}
