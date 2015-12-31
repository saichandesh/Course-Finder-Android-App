package com.training.course;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class androidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_android, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    public void androidDevPage(View view) {

        Intent androidDevIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com/guide/index.html"));
        startActivity(androidDevIntent);
    }

    public void tutorialAndroidPage(View view) {
        Intent tutorialAndroidIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tutorialspoint.com/android/"));
        startActivity(tutorialAndroidIntent);
    }

    public void courseraAndroidPage(View view) {
        Intent courserAndroidIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.coursera.org/course/androidpart1"));
        startActivity(courserAndroidIntent);
    }
}
