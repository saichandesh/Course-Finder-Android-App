package com.training.course;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class hadoopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadoop);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hadoop, menu);
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

    public void apacheHadoopPage(View view) {

        Intent apacheIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hadoop.apache.org/docs/stable/"));
        startActivity(apacheIntent);
    }

    public void bigHadoopPage(View view) {
        Intent bigIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://bigdatauniversity.com/courses/hadoop-course/"));
        startActivity(bigIntent);
    }

    public void tutorialHadoopPage(View view) {

        Intent tutorialHadoopIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.tutorialspoint.com/hadoop/"));
        startActivity(tutorialHadoopIntent);
    }
}
