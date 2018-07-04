package com.example.ero.week2homework1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Menyu> menyuslist = MenuProvider.getMenyuArrayList(this);

        final MenyuAdapter menyuAdapter = new MenyuAdapter(this, R.layout.conteint_main, menyuslist);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(menyuAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(menyuslist.get(position).getMenyuUrl()));
                startActivity(intent);
            }
        });
    }
}
