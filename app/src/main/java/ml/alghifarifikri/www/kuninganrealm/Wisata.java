package ml.alghifarifikri.www.kuninganrealm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Wisata extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

    Button Jalur, Alam, Budaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        Jalur = (Button) findViewById(R.id.Jalur);
        Alam = (Button) findViewById(R.id.Alam);
        Budaya = (Button) findViewById(R.id.Budaya);

        Jalur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Pendakian.class);
                startActivity(i);
            }
        });

        Alam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Alam.class);
                startActivity(i);
            }
        });

        Budaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Budaya.class);
                startActivity(i);
            }
        });
    }
}
