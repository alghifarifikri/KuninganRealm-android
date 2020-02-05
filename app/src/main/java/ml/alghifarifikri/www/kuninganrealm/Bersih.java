package ml.alghifarifikri.www.kuninganrealm;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class Bersih extends Activity implements Runnable {
    private Button startButton2;
    private Button stopButton2;
    private Button pauseButton2;
    private SeekBar soundSeekBar2;
    private MediaPlayer soundPlayer;
    private Thread soundThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bersih);

        startButton2 = (Button) findViewById(R.id.playButton2);
        pauseButton2 = (Button) findViewById(R.id.pauseButton2);
        stopButton2 = (Button) findViewById(R.id.stopButton2);
        soundSeekBar2 = (SeekBar) findViewById(R.id.soundSeekBar2);
        soundPlayer = MediaPlayer.create(this.getBaseContext(), R.raw.bebersih);

        setupListeners();

        soundThread = new Thread(this);
        soundThread.start();
    }

    private void setupListeners() {
        startButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPlayer.start();
            }
        });

        pauseButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                soundPlayer.pause();
            }
        });

        stopButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View currentView) {
                soundPlayer.stop();
                soundPlayer =  MediaPlayer.create(getBaseContext(), R.raw.bebersih);
            }
        });

        soundSeekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser)
                {
                    soundPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override

            public void onStopTrackingTouch(SeekBar seekBar) {
            }

        });

    }

    @Override
    public void run() {
        int currentPosition = 0;
        int soundTotal = soundPlayer.getDuration();
        soundSeekBar2.setMax(soundTotal);

        while (soundPlayer != null && currentPosition < soundTotal)
        {
            try
            {
                Thread.sleep(300);
                currentPosition = soundPlayer.getCurrentPosition();
            } catch (InterruptedException soundException) {
                return;
            } catch (Exception otherException) {
                return;
            }
            soundSeekBar2.setProgress(currentPosition);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

}
