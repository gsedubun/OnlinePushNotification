package com.somedeveloperblog.onlinepushnotification

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    // google Oauth client id
    val oauthClientId =
            "136513988383-ngqnambc1qk0u37tqvebpb500142bc9c.apps.googleusercontent.com"

    val apiKey = "AIzaSyBeP_orjaBXpMUiA8_hMFGi4Hm5WP5hI9Y"
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
