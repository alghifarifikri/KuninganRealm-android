package ml.alghifarifikri.www.kuninganrealm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Taman extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

    Button Florafauna, Wisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taman);

        Florafauna = (Button) findViewById(R.id.Florafauna);
        Wisata = (Button) findViewById(R.id.Wisata);

        Florafauna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), FloraFauna.class);
                startActivity(i);
            }
        });

        Wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Wisata.class);
                startActivity(i);
            }
        });
    }
}
