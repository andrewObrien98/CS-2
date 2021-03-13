package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

import java.util.WeakHashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setBackgroundColor(Color.rgb(250,50,50));
        layout.setOrientation(layout.VERTICAL);
        AppCompatTextView userNameView = new AppCompatTextView(this);
        userNameView.setText("Username:");
        //this creates space from text and its layout border
        userNameView.setPadding(0,100,0,100);
        //this will center text, you can also right and left align using RIGHT and LEFT
        userNameView.setGravity(Gravity.CENTER);
        AppCompatEditText userNameField = new AppCompatEditText(this);
        layout.addView(userNameView);
        layout.addView(userNameField);

        AppCompatTextView passwordView = new AppCompatTextView(this);
        passwordView.setText("Password:");
        passwordView.setPadding(200,100,0,100);
        AppCompatEditText passwordField = new AppCompatEditText(this);
        layout.addView(passwordView);
        layout.addView(passwordField);

        //this one creates space from end of layout and screen.. creates the white space
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(40, 100, 100, 40);
        layout.setLayoutParams(params);

        //permissions
//        WebView webView = new WebView(this);
//        webView.loadUrl("https://usu.edu");
//        //this make sure that it goes to the website in my application rather than the default browser
//        webView.setWebViewClient(new WebViewClient());
        setContentView(layout);
    }
}