package com.training.course;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class pythonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_python, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        return super.onOptionsItemSelected(item);
    }

    public void pythonDocPage(View view) {
        Intent pythonIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.python.org/3/"));

        startActivity(pythonIntent);

    }

    public void pythonCourseraPage(View view) {
        Intent pythonCourseraIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.coursera.org/learn/python"));
        startActivity(pythonCourseraIntent);
    }

    public void codeAcademyPythonPage(View view) {
        Intent codeAcademyPythonIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.codecademy.com/learn/python"));
        startActivity(codeAcademyPythonIntent);
    }
}
