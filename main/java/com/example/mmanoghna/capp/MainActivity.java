package com.example.mmanoghna.capp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;

import static android.R.attr.button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


                button1=(Button) findViewById(R.id.button1);
                button2=(Button) findViewById(R.id.button2);
                button3=(Button) findViewById(R.id.button3);
                button4=(Button) findViewById(R.id.button4);


        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) { // Does nothing yet, but soon!
                 Toast.makeText(MainActivity.this,
                R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) { // Does nothing yet, but soon!
                 Toast.makeText(MainActivity.this,
                R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) { // Does nothing yet, but soon!
                 Toast.makeText(MainActivity.this,
                R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) { // Does nothing yet, but soon!
                Toast.makeText(MainActivity.this,
                R.string.correct_toast, Toast.LENGTH_SHORT).show();
            }
        });
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
