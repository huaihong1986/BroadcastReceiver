package com.cloudtv.hahong.broadcastreceiver;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class EoeAndroidReceiver1 extends BroadcastReceiver {
    Context context;
    public static int NOTIFICATION_ID = 21321;

    @Override
    public void onReceive(Context context, Intent intent) {
        this.context = context;
        showNotification();
    }

    private void showNotification() {

        NotificationManager notificationManager = (NotificationManager) context
                .getSystemService(android.content.Context.NOTIFICATION_SERVICE);


        PendingIntent contentIntent = PendingIntent.getActivity(context, 0,
                new Intent(context, MainActivity.class), 0);


        Notification.Builder builder = new Notification.Builder(context)
                .setAutoCancel(true)
                .setContentTitle("EoeAndroidReceiver1")
                .setContentText("在EoeAndroidReceiver1中")
                .setContentIntent(contentIntent)
                .setSmallIcon(R.drawable.icon)
                .setWhen(System.currentTimeMillis())
                .setOngoing(true);
        Notification notification=builder.getNotification();
        notificationManager.notify(NOTIFICATION_ID, notification);

    }
}
