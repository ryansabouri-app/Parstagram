package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("IZffau1zoxZOaYlpZc1GznDdMzfaKEXy1ZaUW6Ep")
                .clientKey("7q6nKVhS1eVYIRNleYMPJHhNRXb7aruPJn56mhKn")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
