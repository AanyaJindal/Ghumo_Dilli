package com.example.aanya.ghumodilli;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    boolean detailPage = false;
    public static ArrayList<Places.Place> abc = Places.getPlaces();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState==null){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            ListFragment fragOne = new ListFragment();
            fragmentTransaction.add(R.id.places_list, fragOne, null);
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            fragmentTransaction.commit();
        }

//        if(findViewById(R.id.places_list) != null){
//            detailPage = true;
//            getFragmentManager().popBackStack();
//
//            DetailsFragment detailFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.places_list);
//            if(detailFragment == null){
//                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//                detailFragment = new DetailsFragment();
//                ft.replace(R.id.places_list, detailFragment, null);
//                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
//                ft.commit();
//            }
//        }

    }
}
