package uk.co.utcreading.openevening

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.webkit.WebView
import android.widget.Button

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Webview = findViewById<View>(R.id.webview) as WebView
        Webview.settings.javaScriptEnabled = true
        Webview.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=JcuAJKXl-UOYkvqEr2KwoNmEMwREsoxPtIf2nCWCj45UNVZDUTdWVEFGN1UxQUM0NFE0WjFPS1JJVi4u")
        //Webview.loadUrl("www.google.com")
        val reset_button:Button = findViewById(R.id.button)
        reset_button.setOnClickListener {
            Webview.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=JcuAJKXl-UOYkvqEr2KwoNmEMwREsoxPtIf2nCWCj45UNVZDUTdWVEFGN1UxQUM0NFE0WjFPS1JJVi4u")
        }
    }
}
