package ml.alghifarifikri.www.kuninganrealm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import static ml.alghifarifikri.www.kuninganrealm.R.string.text_desk1;

public class Sejarah extends AppCompatActivity {
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

        bt=(Button)findViewById(R.id.share1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "http://www.historyofcirebon.id/2017/09/asal-usul-lahirnya-kabupaten-kuningan.html";
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent, "Bagikan dengan"));
            }
        });
        String text =  getString(R.string.text_desk1);
        WebView webView = (WebView) findViewById(R.id.webView1);
        webView.loadData("<p style=\"text-align: justify\">"+ text +"</p>", "text/html", "UTF-8");
        webView.getSettings().setBuiltInZoomControls(true);

    }
}

