package com.example.activityexample;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class NotificationActivity extends Activity {
    private static final int NOTIFICATION_ID = 127;
    NotificationManager manager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    }
    public void showNotification(View view){
        Notification.Builder builder = new Notification.Builder(getApplicationContext());
        Intent intent = new Intent(getApplicationContext(), IntentNotificationActivity.class );
        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        builder.setContentIntent(pendingIntent)
                .setSmallIcon(R.mipmap.ic_launcher_round)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round))
                .setTicker("My Notification")
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setContentTitle("Notification")
                .setContentText("click if you think uou know a secret");
//                .setProgress(100, 50, true);

        Notification notification = builder.build();
        notification.defaults = Notification.DEFAULT_VIBRATE | Notification.DEFAULT_SOUND;
        notification.sound = Uri.parse("android.resourse://" + getPackageName() + "/" + R.raw.sound_laser);
        long[]vibrate = {1000, 1500, 1000, 1500};
        notification.vibrate = vibrate;
        notification.flags = notification.flags | Notification.FLAG_INSISTENT;
        manager.notify(NOTIFICATION_ID, notification);
    }
    public  void cancelNotification(View view){
        manager.cancel(NOTIFICATION_ID);
    }
}





























