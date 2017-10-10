package com.example.android.citylistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.list_view);
        ArrayList<City> cities=new ArrayList<>();
        City erbil=new City("Erbil",850000,R.drawable.erbil);
        erbil.setLongitude("36.1972753");
        erbil.setLatitude("43.9384431");
        cities.add(erbil);
        cities.add(new City("Suly",950000,R.drawable.suly));
        cities.add(new City("Mosul",665000,R.drawable.mosul));
        cities.add(new City("Qamshlo",500000,R.drawable.qamishlo));

        CityArrayAdapter adapter=new CityArrayAdapter(this,R.layout.list_item,cities);
        listView.setAdapter(adapter);

    }
}
