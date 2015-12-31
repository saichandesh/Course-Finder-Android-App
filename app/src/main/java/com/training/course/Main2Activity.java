package com.training.course;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
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


    public void htmlPage(View view) {

        Intent htmlintent = new Intent(this, htmlActivity.class);
        startActivity(htmlintent);


    }


    public void javaTutPage(View view) {
        Intent javaTutIntent = new Intent(this,javaActivity.class);
        startActivity(javaTutIntent);
    }

    public void hadoopTutPage(View view) {
        Intent hadoopTutIntent = new Intent(this,hadoopActivity.class);
        startActivity(hadoopTutIntent);
    }

    public void androidTutPage(View view) {
        Intent  androidTutIntent = new Intent(this, androidActivity.class);
        startActivity(androidTutIntent);
    }

    public void iosTutPage(View view) {
        Intent iosTutIntent = new Intent(this,iosActivity.class);
        startActivity(iosTutIntent);
    }

    public void pythonTutPage(View view) {
        Intent pythonTutIntent = new Intent(this,pythonActivity.class);
        startActivity(pythonTutIntent);
    }

    public void mysqlTutPage(View view) {
        Intent mysqlTutIntent = new Intent(this,mysqlActivity.class);
        startActivity(mysqlTutIntent);
    }

    public void cTutPage(View view) {
        Intent cTutIntent = new Intent(this,cActivity.class);
        startActivity(cTutIntent);
    }

    public void cssTutPage(View view) {
        Intent  cssTutIntent = new Intent(this, cssActivity.class);
        startActivity(cssTutIntent);
    }

    public void javaScriptTutPage(View view) {
        Intent javaScriptTutIntent = new Intent(this, javascriptActivity.class);
        startActivity(javaScriptTutIntent);
    }
}
