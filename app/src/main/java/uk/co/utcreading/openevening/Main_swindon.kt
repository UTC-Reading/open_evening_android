package uk.co.utcreading.openevening

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.webkit.WebView
import android.widget.Button

class Main_swindon : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Webview = findViewById<View>(R.id.webview) as WebView
        Webview.settings.javaScriptEnabled = true
        val url:String="https://google.com"
        Webview.loadUrl(url)
        //Webview.loadUrl("www.google.com")
        val reset_button:Button = findViewById(R.id.button)
        reset_button.setOnClickListener {
            Webview.loadUrl(url)
        }
    }
}
