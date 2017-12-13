package com.example.razor.makevideo;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.MediaController;
        import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = (VideoView) findViewById(R.id.videoView); //insialisai widget videoview
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.videodemo); //mencari video berdasarkan path nya
        MediaController mediaController = new MediaController(this);//enambahkan media control
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);//mengset media control pada webview
        videoView.start();
    }
}
