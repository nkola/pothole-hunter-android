package org.nkola.potholehunter.android;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import org.nkola.potholehunter.android.R;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new AsyncTask<Void, Void, Void>() {

            @Override
            protected Void doInBackground(Void... params) {
                try {
                    Thread.sleep(2000);
                    startHunterActivity();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }.execute();
    }

    private void startHunterActivity() {

    }
}
