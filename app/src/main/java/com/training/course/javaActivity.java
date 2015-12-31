package com.training.course;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class javaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_java, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }

    public void javaDocPage(View view) {

        Intent javaDocintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.oracle.com/javase/7/docs/api/"));
        startActivity(javaDocintent);

    }


    public void javaCodeAcdPage(View view) {

        Intent javaCodeAcdIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.codecademy.com/learn/learn-java"));
        startActivity(javaCodeAcdIntent);
    }


    public void tutorialJavaPage(View view) {

        Intent tutorialJavaIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.tutorialspoint.com/java/"));
        startActivity(tutorialJavaIntent);
    }


}
