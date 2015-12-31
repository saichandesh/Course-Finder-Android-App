package com.training.course;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class mysqlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysql);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mysql, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        return super.onOptionsItemSelected(item);
    }

    public void mysqlDocPage(View view) {
        Intent mysqlDocIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dev.mysql.com/doc/"));
        startActivity(mysqlDocIntent);

    }

    public void tutorialmysqlPage(View view) {
        Intent tutorialMysqlIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.tutorialspoint.com/mysql/"));
        startActivity(tutorialMysqlIntent);
    }

    public void codeSchoolMysqlPage(View view) {
        Intent codeSchoolMysqlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codeschool.com/courses/the-sequel-to-sql"));
        startActivity(codeSchoolMysqlIntent);
    }
}
