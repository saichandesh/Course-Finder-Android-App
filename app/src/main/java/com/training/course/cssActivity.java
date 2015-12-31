package com.training.course;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class cssActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_css, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        return super.onOptionsItemSelected(item);
    }

    public void codeAcademyCssPage(View view) {

        Intent codeAcademyCssIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codecademy.com/courses/css-coding-with-style/0/1"));
        startActivity(codeAcademyCssIntent);
    }

    public void tutorialCssPage(View view) {
        Intent tutorialCssIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.tutorialspoint.com/css/"));
        startActivity(tutorialCssIntent);
    }

    public void codeSchoolCssPage(View view) {
        Intent codeSchoolCssIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.codeschool.com/courses/front-end-formations"));
        startActivity(codeSchoolCssIntent);
    }
}
