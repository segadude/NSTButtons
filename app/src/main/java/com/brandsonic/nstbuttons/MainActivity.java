package com.brandsonic.nstbuttons;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {

    TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = (TextView) findViewById(R.id.tvText);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        int keyCodeNum;
        keyCodeNum = event.getKeyCode();

        switch (keyCodeNum){
            case 92:
                tvText.setText("Top left page button pressed!");
                break;
            case 93:
                tvText.setText("Bottom left page button pressed!");
                break;
            case 94:
                tvText.setText("Top right page button pressed!");
                break;
            case 95:
                tvText.setText("Bottom right page button pressed!");
                break;
        }
        return false;

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
