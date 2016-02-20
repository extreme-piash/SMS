package com.example.piash.sms;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Button button1, button2, button3, button4, button5;
    Button button6, button7, button8, button9, button10;
    Button button11, button12, button13, button14, button15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonIdCastingListenerSetting();

        // for actionbar icon
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);



    }

    // this function is for casting button and set the listener for multiple button
    public void buttonIdCastingListenerSetting (){

        button1 = (Button)findViewById(R.id.button_angrysms);
        button2 = (Button)findViewById(R.id.button_aniversery);
        button3 = (Button)findViewById(R.id.button_attitudesms);
        button4 = (Button)findViewById(R.id.button_bestwishes);
        button5 = (Button)findViewById(R.id.button_birthday);
        button6 = (Button)findViewById(R.id.button_brokenHeart);
        button7 = (Button)findViewById(R.id.button_chrismas);
        button8 = (Button)findViewById(R.id.button_kissSMS);
        button9 = (Button)findViewById(R.id.button_flirtSMS);
        button10 = (Button)findViewById(R.id.button_breakUp);
        button11 = (Button)findViewById(R.id.button_cool);
        button12 = (Button)findViewById(R.id.button_cute);
        button13 = (Button)findViewById(R.id.button_EidMubarak);
        button14 = (Button)findViewById(R.id.button_funny);


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
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);



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

    @Override
    public void onClick(View v) {
        Intent intent;
        ActionBar actionBar = getSupportActionBar();

        String name;
        switch (v.getId()){

            case R.id.button_angrysms:
                intent = new Intent(MainActivity.this, SecondActivity.class);
                name = button1.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;

            case R.id.button_aniversery:
                 intent = new Intent(MainActivity.this, AniversarySMS.class);
                name = button2.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;

            case R.id.button_attitudesms:
                intent = new Intent(MainActivity.this, AniversarySMS.class);
                name = button3.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;

            case R.id.button_bestwishes:
                intent = new Intent(MainActivity.this, BestWishes.class);
                name = button4.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;

            case R.id.button_birthday:
                intent = new Intent(MainActivity.this, BirthdaySMS.class);
                name = button5.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;

            case R.id.button_brokenHeart:
                intent = new Intent(MainActivity.this, BrokenHertSMs.class);
                name = button6.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;

            case R.id.button_chrismas:
                intent = new Intent(MainActivity.this, ChrismasSMS.class);
                name = button7.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;

            case R.id.button_kissSMS:
                intent = new Intent(MainActivity.this, KissSMS.class);
                name = button8.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;

            case R.id.button_flirtSMS:
                intent = new Intent(MainActivity.this, FlirtSMS.class);
                name = button9.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;

            case R.id.button_breakUp:
                intent = new Intent(MainActivity.this, BreakupSMS.class);
                name = button10.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;

            case R.id.button_cool:
                intent = new Intent(MainActivity.this, CoolSMS.class);
                name = button11.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;

            case R.id.button_cute:
                intent = new Intent(MainActivity.this, CuteSMS.class);
                name = button12.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;

            case R.id.button_EidMubarak:
                intent = new Intent(MainActivity.this, EidMubarak.class);
                name = button13.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;
            case R.id.button_funny:
                intent = new Intent(MainActivity.this, FunnySMS.class);
                name = button14.getText().toString();
                intent.putExtra("one",name);
                actionBar.setTitle(name);
                startActivity(intent);
                break;


        }
    }
}
