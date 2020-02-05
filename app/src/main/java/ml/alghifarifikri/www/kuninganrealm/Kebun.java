package ml.alghifarifikri.www.kuninganrealm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Kebun extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

    Button Latar, Ruang, Luas, Struktur, Tumbuhan, Akses, Potensi, Krk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebun);

        Latar = (Button) findViewById(R.id.Latar);
        Ruang = (Button) findViewById(R.id.Ruang);
        Luas = (Button) findViewById(R.id.Luas);
        Struktur = (Button) findViewById(R.id.Struktur);
        Tumbuhan = (Button) findViewById(R.id.Tumbuhan);
        Akses = (Button) findViewById(R.id.Akses);
        Potensi = (Button) findViewById(R.id.Potensi);
        Krk = (Button) findViewById(R.id.video6);

        Latar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), LatarBelakang.class);
                startActivity(i);

            }
        });

        Ruang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), RuangLingkup.class);
                startActivity(i);

            }
        });

        Luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Luas.class);
                startActivity(i);

            }
        });

        Struktur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Struktur.class);
                startActivity(i);

            }
        });

        Tumbuhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Tumbuhan.class);
                startActivity(i);

            }
        });
        Akses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Akses.class);
                startActivity(i);

            }
        });

        Potensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Potensi.class);
                startActivity(i);

            }
        });

        Krk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Krk.class);
                startActivity(i);

            }
        });
    }
}
