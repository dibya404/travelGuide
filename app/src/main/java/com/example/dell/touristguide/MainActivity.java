package com.example.dell.touristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.lang.reflect.Array;

import static com.example.dell.touristguide.R.*;
import static com.example.dell.touristguide.R.id.listViewId;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    ArrayAdapter<String>adapter;
    private SearchView searchView;

    public static final String EXTRA_COUNTRY_NAME = "country name";
    public static final String EXTRA_COUNTRY_POSITION = "country position";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        listView=findViewById(R.id.listViewId);
        searchView=findViewById(id.searchViewId);
        final String[] countryNames=getResources().getStringArray(array.Country_names);
        adapter=new ArrayAdapter<String>(MainActivity.this,R.layout.sample_view,id.textViewId,countryNames);
        listView.setAdapter(adapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,profileActivity.class);

                String name = countryNames[position];
                intent.putExtra("name",name);
                intent.putExtra("pos",position);
               Toast.makeText(MainActivity.this, "name : " + name +"pos : " + position, Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }
}
