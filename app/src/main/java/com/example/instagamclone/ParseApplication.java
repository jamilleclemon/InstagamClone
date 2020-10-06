package com.example.instagamclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // register parse model
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("u5O0eWOMhyphlCfBInuwYt5B7kPjskcl0wn9EGP1")
                .clientKey("oZJzOr7fo1N6Fs9jBBvIcVcsXn48CcTZvyuHfbx1")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
