package com.cloudtv.hahong.broadcastreceiver;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {
    public static final int ITEM0 = Menu.FIRST;
    public static final int ITEM1 = Menu.FIRST + 1;

    static final String ACTION_1 = "NEW_BROADCAST_1";
    static final String ACTION_2 = "NEW_BROADCAST_2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        super.onCreateOptionsMenu(menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);

        menu.add(0, ITEM0, 0, "显示Notification");
        menu.add(0, ITEM1, 0, "清除Notification");
        menu.findItem(ITEM1);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case ITEM0:
                actionClickMenuItem1();
                break;
            case ITEM1:
                actionClickMenuItem2();
                break;

        }
        return true;
    }


    private void actionClickMenuItem1() {
        Intent intent = new Intent(ACTION_1);
        sendBroadcast(intent);
    }


    private void actionClickMenuItem2() {
        Intent intent = new Intent(ACTION_2);
        sendBroadcast(intent);

    }
}
