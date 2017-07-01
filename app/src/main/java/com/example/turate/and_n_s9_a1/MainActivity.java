package com.example.turate.and_n_s9_a1;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int SUBMENU1 = Menu.FIRST;
    private static final int SUBMENU2 = SUBMENU1 + 1;
    private static final int SUBMENU3 = SUBMENU1 + 2;
    private static final int TEXT_COLOR = 6;
    public TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // ADDING MENU AND SUBMENU INTO APP
        SubMenu nmenu = menu.addSubMenu("TEXT_COLOR" );
            nmenu.add(TEXT_COLOR, SUBMENU1, 1, "Orange");
            nmenu.add(TEXT_COLOR, SUBMENU2, 2, "Red");
            nmenu.add(TEXT_COLOR, SUBMENU3, 3, "Green");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        txtv = (TextView) findViewById(R.id.dtext);
        //
        switch (item.getItemId()) {
            case SUBMENU1:
                txtv.setTextColor(ContextCompat.getColor(this,R.color.Orange));
                return true;
            case SUBMENU2:
                txtv.setTextColor(ContextCompat.getColor(this,R.color.Red));
                return true;
            case SUBMENU3:
                txtv.setTextColor(ContextCompat.getColor(this,R.color.Green));
                return true;
            default:
            return super.onOptionsItemSelected(item);
        }
    }
}
