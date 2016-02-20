package com.example.piash.sms;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class FunnySMS extends ActionBarActivity implements View.OnClickListener{
    Button button1, button2, button3, button4,button5;
    Button button6, button7, button8, button9, button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny_sms);
        buttonIdCastingListenerSetting ();

        // For actionbar icon
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);

        // actionBar Title
        String smsName = getIntent().getStringExtra( "one");
        actionBar.setTitle(smsName);

    }
    public void buttonIdCastingListenerSetting (){

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);



        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_funny_sm, menu);
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

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(FunnySMS.this,ThirdActivity.class);
        String smsName, name;
        switch (v.getId()){

            case R.id.button1:

                smsName = getIntent().getStringExtra("one");
                intent.putExtra("smsforTitlebar", smsName);

                name =button1.getText().toString();
                intent.putExtra("one", name);
                startActivity(intent);
                break;

            case R.id.button2:

                smsName = getIntent().getStringExtra("one");
                intent.putExtra("smsforTitlebar", smsName);

                name =button2.getText().toString();
                intent.putExtra("one", name);
                startActivity(intent);
                break;

            case R.id.button3:

                smsName = getIntent().getStringExtra("one");
                intent.putExtra("smsforTitlebar", smsName);

                name =button3.getText().toString();
                intent.putExtra("one", name);
                startActivity(intent);
                break;

            case R.id.button4:

                smsName = getIntent().getStringExtra("one");
                intent.putExtra("smsforTitlebar", smsName);

                name =button4.getText().toString();
                intent.putExtra("one", name);
                startActivity(intent);
                break;

            case R.id.button5:

                smsName = getIntent().getStringExtra("one");
                intent.putExtra("smsforTitlebar", smsName);

                name =button5.getText().toString();
                intent.putExtra("one", name);
                startActivity(intent);
                break;
            case R.id.button6:

                smsName = getIntent().getStringExtra("one");
                intent.putExtra("smsforTitlebar", smsName);

                name =button6.getText().toString();
                intent.putExtra("one", name);
                startActivity(intent);
                break;

            case R.id.button7:

                smsName = getIntent().getStringExtra("one");
                intent.putExtra("smsforTitlebar", smsName);

                name =button7.getText().toString();
                intent.putExtra("one", name);
                startActivity(intent);
                break;

            case R.id.button8:

                smsName = getIntent().getStringExtra("one");
                intent.putExtra("smsforTitlebar", smsName);

                name =button8.getText().toString();
                intent.putExtra("one", name);
                startActivity(intent);
                break;

            case R.id.button9:

                smsName = getIntent().getStringExtra("one");
                intent.putExtra("smsforTitlebar", smsName);

                name =button9.getText().toString();
                intent.putExtra("one", name);
                startActivity(intent);
                break;

            case R.id.button10:

                smsName = getIntent().getStringExtra("one");
                intent.putExtra("smsforTitlebar", smsName);

                name =button10.getText().toString();
                intent.putExtra("one", name);
                startActivity(intent);
                break;

        }
    }
}
