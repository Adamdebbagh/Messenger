package org.tekwin.messenger;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by adamdebbagh on 2/6/15.
 */
public class MessengerApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "DhzhNGmL0V2GeX4YaqNsEZjFxDaTNUpzLr1QJBfo", "ev54urbJAIWZPjPMSq8OpcF47knfhBQg7bcNqwOV");



    }
}
