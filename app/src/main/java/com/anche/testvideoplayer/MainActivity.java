package com.anche.testvideoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.io.IOException;

import tv.danmaku.ijk.media.player.IMediaPlayer;

public class MainActivity extends AppCompatActivity implements VideoListener {
    private VideoPlayer videoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoPlayer = findViewById(R.id.video);

        videoPlayer.setVideoListener(this);
//        videoPlayer.setPath("http://ipfs.ztgame.com.cn/QmRRGU4aUZEqJsHxKzBb1ns97GHw45eCRRZFe6Eu8GCmZ4.m3u8");
//        videoPlayer.setPath("http://stream1.grtn.cn/tvs2/sd/live.m3u8?_ts&time=1518428696629");
        videoPlayer.setPath("http://218.207.213.137//PLTV/88888888/224/3221225879/index.m3u8");
//        videoPlayer.setPath("http://183.251.61.207/PLTV/88888888/224/3221225829/index.m3u8");
//        videoPlayer.setPath("http://118.190.75.162:8090/SHUCCSystem/picDataTableStream_showPic.action?picPath=images/2020/3/16/_797512B1163A.mp4");
        try {
            videoPlayer.load();
        } catch (IOException e) {
            Toast.makeText(this,"播放失败",Toast.LENGTH_SHORT);
            e.printStackTrace();
        }
    }

    @Override
    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {

    }

    @Override
    public void onCompletion(IMediaPlayer iMediaPlayer) {

    }

    @Override
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i1) {
        return false;
    }

    @Override
    public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i1) {
        return false;
    }

    @Override
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        videoPlayer.start();
    }

    @Override
    public void onSeekComplete(IMediaPlayer iMediaPlayer) {

    }

    @Override
    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i1, int i2, int i3) {

    }
}
