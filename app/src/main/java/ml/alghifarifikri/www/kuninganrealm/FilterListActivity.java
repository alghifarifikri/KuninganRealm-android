package ml.alghifarifikri.www.kuninganrealm;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class FilterListActivity extends Activity implements OnClickListener {
    ListView lv;
    String Konten[] = {"About", "Cingcowong", "Fauna", "Flora", "Gunung Ciremai", "Gunung Tilu", "Jalur Pendakian", "Kawin Cai", "Kebun Raya Kuningan",
            "Letak Geografis", "Pesta Dadung", "Sapton dan Panahan", "Sejarah", "Seren Taun", "Sintren", "Wisata Alam", "Wisata Budaya"};
    ArrayAdapter<String> adapter;
    EditText inputSearch;
    ArrayList<HashMap<String, String>> negaraList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);
        adapter = new ArrayAdapter<String>(this, R.layout.list_item_filter, R.id.Konten, Konten);
        lv.setAdapter(adapter);

        /**
         * Kode dibawah ini dipakai untuk memfilter/pencarian realtime
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2,
                                      int arg3) {
                FilterListActivity.this.adapter.getFilter().filter(cs);
            }
            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1,
                                          int arg2, int arg3) {
            }
            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });

        lv.setAdapter(adapter);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Konten);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView arg0, View arg1, int posisi, long arg3) {
                // TODO Auto-generated method stub
                int item = posisi;
                String itemText = (String) lv.getItemAtPosition(posisi);
                if (itemText.equals("About")) {
                    Intent About = getIntent();
                    About = new Intent(FilterListActivity.this, About.class);
                    startActivity(About);
                } else if (itemText.equals("Cingcowong")) {
                    Intent Cingcowong = getIntent();
                    Cingcowong = new Intent(FilterListActivity.this, Cingcowong.class);
                    startActivity(Cingcowong);
                } else if (itemText.equals("Fauna")) {
                    Intent Fauna = getIntent();
                    Fauna = new Intent(FilterListActivity.this, Fauna.class);
                    startActivity(Fauna);
                } else if (itemText.equals("Flora")) {
                    Intent Flora = getIntent();
                    Flora = new Intent(FilterListActivity.this, Flora.class);
                    startActivity(Flora);
                } else if (itemText.equals("Gunung Ciremai")) {
                    Intent Ciremai = getIntent();
                    Ciremai = new Intent(FilterListActivity.this, GunungCiremai.class);
                    startActivity(Ciremai);
                } else if (itemText.equals("Gunung Tilu")) {
                    Intent Tilu = getIntent();
                    Tilu = new Intent(FilterListActivity.this, GunungTilu.class);
                    startActivity(Tilu);
                } else if (itemText.equals("Jalur Pendakian")) {
                    Intent Jalur = getIntent();
                    Jalur = new Intent(FilterListActivity.this, Pendakian.class);
                    startActivity(Jalur);
                } else if (itemText.equals("Kawin Cai")) {
                    Intent Kawin = getIntent();
                    Kawin = new Intent(FilterListActivity.this, Kawin.class);
                    startActivity(Kawin);
                } else if (itemText.equals("Kebun Raya Kuningan")) {
                    Intent Krk = getIntent();
                    Krk = new Intent(FilterListActivity.this, Kebun.class);
                    startActivity(Krk);
                } else if (itemText.equals("Letak Geografis")) {
                    Intent Letak = getIntent();
                    Letak = new Intent(FilterListActivity.this, Letak.class);
                    startActivity(Letak);
                } else if (itemText.equals("Pesta Dadung")) {
                    Intent Pesta = getIntent();
                    Pesta = new Intent(FilterListActivity.this, Pesta.class);
                    startActivity(Pesta);
                } else if (itemText.equals("Sapton dan Panahan")) {
                    Intent Sapton = getIntent();
                    Sapton = new Intent(FilterListActivity.this, Sapton.class);
                    startActivity(Sapton);
                } else if (itemText.equals("Sejarah")) {
                    Intent Sejarah = getIntent();
                    Sejarah = new Intent(FilterListActivity.this, Sejarah.class);
                    startActivity(Sejarah);
                } else if (itemText.equals("Seren Taun")) {
                    Intent Seren = getIntent();
                    Seren = new Intent(FilterListActivity.this, Seren.class);
                    startActivity(Seren);
                } else if (itemText.equals("Sintren")) {
                    Intent Sintren = getIntent();
                    Sintren = new Intent(FilterListActivity.this, Sintren.class);
                    startActivity(Sintren);
                } else if (itemText.equals("Wisata Alam")) {
                    Intent Alam = getIntent();
                    Alam = new Intent(FilterListActivity.this, Alam.class);
                    startActivity(Alam);
                } else {
                    Intent Budaya = getIntent();
                    Budaya = new Intent(FilterListActivity.this, Budaya.class);
                    startActivity(Budaya);
                }
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}
