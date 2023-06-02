package com.example.notificationtest;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.send_notice);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.send_notice:
                Intent intent = new Intent(this, Notification_layout.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
                NotificationManager manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                Notification notification = new NotificationCompat.Builder(this)
                        .setContentTitle("This is content title")

                        .setWhen(System.currentTimeMillis())
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
                        .setContentIntent(pendingIntent)
                        .setStyle(new NotificationCompat.BigTextStyle().bigText("LXXXXXXXXXXXXXXXASDASDASDHASJKDBNAJSBDJASBDJASJ,,AS,DAS,D,ASD,AS,DA,SD,ASD,AS,DA,SD" +
                                ",AS,DA,SD,AS,DASDASDASJDJASJDAKSD" +
                                "ASD" +
                                "A" +
                                "SD" +
                                "AS" +
                                "DA" +
                                "SD" +
                                "AS" +
                                "" +
                                "AS" +
                                "D" +
                                "ASD" +
                                "UWQIUE19082U4ESDOHQSDASHDASJKDHOQWDHQSIOD" +
                                "ASDJ9013URED0-SDLASHDIOSAD"))
                        .setPriority(NotificationCompat.PRIORITY_MAX)
                        .build();
                manager.notify(1,notification);
                break;
            default:
                break;
        }
    }
}
