package ml.alghifarifikri.www.kuninganrealm;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Seni extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

    Button Sapton, Seren, Kawin, Pesta, Sintren, Cingcowong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seni);

        Sapton = (Button) findViewById(R.id.Sapton);
        Seren = (Button) findViewById(R.id.Seren);
        Kawin = (Button) findViewById(R.id.Kawin);
        Pesta = (Button) findViewById(R.id.Pesta);
        Sintren = (Button) findViewById(R.id.Sintren);
        Cingcowong = (Button) findViewById(R.id.Cingcowong);

        Sapton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Sapton.class);
                startActivity(i);

            }
        });

        Seren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Seren.class);
                startActivity(i);

            }
        });

        Kawin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Kawin.class);
                startActivity(i);

            }
        });

        Pesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Pesta.class);
                startActivity(i);

            }
        });

        Sintren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Sintren.class);
                startActivity(i);

            }
        });

        Cingcowong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Cingcowong.class);
                startActivity(i);

            }
        });
    }
}
