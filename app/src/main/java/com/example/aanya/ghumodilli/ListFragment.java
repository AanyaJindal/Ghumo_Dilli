package com.example.aanya.ghumodilli;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        createList();
    }

    private void createList(){
        ArrayList<Places.Place> placeList;
        ListView placeListView;
        placeList = MainActivity.abc;
        placeListView = (ListView) getView().findViewById(R.id.frag_list);
        PlaceListAdapter placeListAdapter = new PlaceListAdapter(placeList);
        placeListView.setAdapter(placeListAdapter);
        placeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FragmentManager manager = getActivity().getSupportFragmentManager();
                manager.popBackStack();
                FragmentTransaction fragmentTransaction = manager.beginTransaction();
                DetailsFragment detailsFragment = DetailsFragment.newInstance(i);
                fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                fragmentTransaction.replace(R.id.places_detail,detailsFragment,null);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

    private class PlaceListAdapter extends BaseAdapter{
        class PlaceViewHolder{
            TextView placeName;
            ImageView placeImage;
        }
        private ArrayList<Places.Place> mPlaces;

        public PlaceListAdapter(ArrayList<Places.Place> mPlaces) {
            this.mPlaces = mPlaces;
        }

        @Override
        public int getCount() {
            return mPlaces.size();
        }

        @Override
        public Places.Place getItem(int i) {
            return mPlaces.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public int getItemViewType(int position) {
            return position%2;
        }

        @Override
        public int getViewTypeCount() {
            return 2;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            LayoutInflater li = LayoutInflater.from(getActivity());
            PlaceViewHolder placeViewHolder = new PlaceViewHolder();
            int type = getItemViewType(i);

            if(view==null){
                switch (type){
                    case 0:
                        view = li.inflate(R.layout.place_item_list,null);
                        break;
                    case 1:
                        view = li.inflate(R.layout.place_item_list_2,null);
                        break;
                }

                placeViewHolder.placeName = (TextView) view.findViewById(R.id.place_name);
                placeViewHolder.placeImage = (ImageView)view.findViewById(R.id.place_image);
                view.setTag(placeViewHolder);
            }else{
                placeViewHolder = (PlaceViewHolder) view.getTag();
            }
            Places.Place thisPlace = getItem(i);
            placeViewHolder.placeName.setText(thisPlace.name);
            placeViewHolder.placeImage.setImageResource(thisPlace.imageID);
            return view;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

}
