package lbycp24_everreadygroup.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import lbycp24_everreadygroup.gopink.R;


public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent goToMain = new Intent(SplashScreenActivity.this, MenuActivity.class);
                    startActivity(goToMain);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}

