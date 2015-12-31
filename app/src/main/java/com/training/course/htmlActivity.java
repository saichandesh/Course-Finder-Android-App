package com.training.course;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class htmlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_html, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }


    public void codeSchoolHtmlPage(View view) {

        Intent codehtml = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codeschool.com/courses/front-end-formations"));
        startActivity(codehtml);
    }

    public void tutorialHtmlPage(View view) {
        Intent tutorialhtml = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tutorialspoint.com/html5/"));
        startActivity(tutorialhtml);

    }

    public void wHtmlPage(View view) {

        Intent whtml = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3schools.com/html/html5_intro.asp"));
        startActivity(whtml);
    }
}
