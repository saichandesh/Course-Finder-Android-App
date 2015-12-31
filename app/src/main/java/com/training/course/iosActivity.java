package com.training.course;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class iosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ios);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ios, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        return super.onOptionsItemSelected(item);
    }

    public void iosDevPage(View view) {

        Intent iosDevIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.apple.com/library/ios/navigation/"));
        startActivity(iosDevIntent);


    }


    public void tutorialIosPage(View view) {
        Intent tutorialIosIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.tutorialspoint.com/ios/"));
        startActivity(tutorialIosIntent);
    }

    public void codeSchoolIosPage(View view) {

        Intent codeSchoolIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.codeschool.com/paths/ios"));
        startActivity(codeSchoolIntent);
    }
}
