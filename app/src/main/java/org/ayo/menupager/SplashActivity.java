package org.ayo.menupager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import org.ayo.component.MasterActivity;


/**
 * Created by Administrator on 2016/12/20.
 */

public class SplashActivity extends MasterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.ayo_fade_in, R.anim.ayo_fade_out);
                finish();
            }
        }, 1500);
    }
}
