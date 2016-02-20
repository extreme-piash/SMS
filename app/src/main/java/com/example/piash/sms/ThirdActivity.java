package com.example.piash.sms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.piash.sms.R.id.button1;
import static com.example.piash.sms.R.id.textView2;


public class ThirdActivity extends ActionBarActivity {
TextView textViewOne;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        textViewOne = (TextView)findViewById(textView2);

        buttonCliked();

        String name = getIntent().getStringExtra("one");
        textViewOne.setText(name);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);
        String title = getIntent().getStringExtra("smsforTitlebar");
        actionBar.setTitle(title);
    }





    public  void buttonCliked(){

        button = (Button)findViewById(R.id.buttonSend);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = getIntent().getStringExtra("one");
                        textViewOne.setText(name);

                        sendSMS( name );

                        String titleName = getIntent().getStringExtra( "smsforTitlebar");
                        ActionBar actionBar2 = getSupportActionBar();
                        actionBar2.setTitle(titleName);
                    }
                }
        );
    }
    public void sendSMS(String smsbody){

        Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
        sendIntent.setData(Uri.parse("smsto:"));
        sendIntent.putExtra("sms_body", smsbody);
        startActivity(sendIntent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_third, menu);
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
