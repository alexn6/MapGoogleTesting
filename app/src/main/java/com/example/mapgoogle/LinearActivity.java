package com.example.mapgoogle;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LinearActivity extends AppCompatActivity implements MapFragment.OnFragmentInteractionListener{

    MapFragment fragMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        addfragmentMap();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {}

    public void addfragmentMap(){
        fragMap = new MapFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container_map, fragMap).commit();

    }
}
