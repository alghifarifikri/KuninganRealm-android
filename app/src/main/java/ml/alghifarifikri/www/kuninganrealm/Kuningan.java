package ml.alghifarifikri.www.kuninganrealm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Kuningan extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

    Button Sejarah, Letak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuningan);

        Sejarah = (Button) findViewById(R.id.Sejarah);
        Letak = (Button) findViewById(R.id.Letak);

        Sejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Sejarah.class);
                startActivity(i);
            }
        });

        Letak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Letak.class);
                startActivity(i);
            }
        });
    }
}
