package com.training.course;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class cActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_c, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }

    public void tutorialCPage(View view) {

        Intent tutorialCpageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tutorialspoint.com/cprogramming/"));
        startActivity(tutorialCpageIntent);

    }

    public void codeSchoolCPage(View view) {
        Intent codeSchooolCIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.codeschool.com/courses/try-objective-c"));
        startActivity(codeSchooolCIntent);
    }

    public void wCPage(View view) {
        Intent wCIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.w3schools.in/c/intro/"));
        startActivity(wCIntent);
    }
}
