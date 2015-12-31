package com.training.course;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class javascriptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javascript);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_javascript, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        return super.onOptionsItemSelected(item);
    }

    public void codeAcademyJsPage(View view) {

        Intent codeAcademyJsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codecademy.com/learn/javascript"));
        startActivity(codeAcademyJsIntent);
    }

    public void codeSchoolJsPage(View view) {
        Intent codeSchoolIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.codeschool.com/paths/javascript"));
        startActivity(codeSchoolIntent);
    }

    public void wJsPage(View view) {
        Intent wJsIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.w3schools.com/js/"));
        startActivity(wJsIntent);
    }
}
