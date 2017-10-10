package com.example.android.citylistview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Shereen on 10/10/2017.
 */

public class CityArrayAdapter extends ArrayAdapter<City> {


    public CityArrayAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<City> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        final City city = getItem(position);
        TextView NameTextView = (TextView) listItem.findViewById(R.id.name_text_view);
        TextView PopulationTextView = (TextView) listItem.findViewById(R.id.population_text_view);
        ImageView imageView = (ImageView) listItem.findViewById(R.id.city_image_view);
        Button locationButton = (Button) listItem.findViewById(R.id.location_button);
        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("geo:0,0?q=22.99948365856307,72.60040283203125");
                if (!city.getLongitude().equals("") && !city.getLatitude().equals("")) {
                    uri = Uri.parse("geo:0,0?q=" + city.getLongitude() + "," + city.getLatitude());
                }
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                getContext().startActivity(intent);
            }
        });

        NameTextView.setText(city.getName());
        PopulationTextView.setText(city.getPopulation() + "");
        imageView.setImageResource(city.getImage());

        return listItem;
    }
}
