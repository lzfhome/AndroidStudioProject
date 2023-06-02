package com.example.videoplayer;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.os.EnvironmentCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.videoplayer.R;

import java.io.File;

import static com.example.videoplayer.R.id.play_video;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = (VideoView)findViewById(R.id.video_view);
        Button play_video = (Button)findViewById(R.id.play_video);
        Button pause_video = (Button)findViewById(R.id.pause_video);
        Button stop_video = (Button)findViewById(R.id.stop_video);
        play_video.setOnClickListener(this);
        pause_video.setOnClickListener(this);
        stop_video.setOnClickListener(this);
        if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        }else{
            initVideoPlayer();
        }

    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 1:
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    initVideoPlayer();
                } else {
                    Toast.makeText(this, "You denied the permission",Toast.LENGTH_SHORT).show();
                }
                break;
            default:
        }
    }
    private void initVideoPlayer() {
        try{
            File file = new File(Environment.getExternalStorageDirectory(), "Aging_Test_Video.mp4");
            videoView.setVideoPath(file.getPath());
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case play_video:
                if(!videoView.isPlaying()){
                    videoView.start();
                }
                break;
            case R.id.pause_video:
                if(videoView.isPlaying()){
                    videoView.pause();
                }
                break;
            case R.id.stop_video:
                if(videoView.isPlaying()){
                    videoView.resume();
                }
                break;
            default:
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(videoView != null){
            videoView.suspend();
        }
    }
}
