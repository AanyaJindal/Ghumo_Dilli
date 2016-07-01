package com.example.aanya.ghumodilli;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsFragment extends Fragment {

    public static final String PLACE_ID = "anything bro";

    ImageView imgVar;
    TextView tvNameVar, tvDescriptionVar, tvTimingsVar, tvEntryFeesVar, tvlocationVar, tvWikiLink, tvDelhiLink, tvOtherLiink, tvContactVar;
    Button btLeft, btRight;
    private int currImage = 0;

    public DetailsFragment() {
        // Required empty public constructor
    }

    public static DetailsFragment newInstance(int placeId) {

        Bundle args = new Bundle();
        DetailsFragment fragment = new DetailsFragment();
        args.putInt(PLACE_ID, placeId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_details, container, false);
        imgVar = (ImageView) rootView.findViewById(R.id.img_var);
        tvNameVar = (TextView) rootView.findViewById(R.id.tv_name_var);
        tvDescriptionVar = (TextView) rootView.findViewById(R.id.tv_description_var);
        tvTimingsVar = (TextView) rootView.findViewById(R.id.tv_timings_var);
        tvEntryFeesVar = (TextView) rootView.findViewById(R.id.tv_entry_fees_var);
        tvlocationVar = (TextView) rootView.findViewById(R.id.tv_location_var);
        tvWikiLink = (TextView) rootView.findViewById(R.id.tv_wiki_link);
        tvDelhiLink = (TextView) rootView.findViewById(R.id.tv_delhi_link);
        tvOtherLiink = (TextView) rootView.findViewById(R.id.tv_other_link);
        tvContactVar = (TextView) rootView.findViewById(R.id.tv_contact_var);
        btLeft = (Button) rootView.findViewById(R.id.bt_left);
        btRight = (Button) rootView.findViewById(R.id.bt_right);

        int a = getArguments().getInt(PLACE_ID, 0);

        final Places.Place place = MainActivity.abc.get(a);



        imgVar.setImageResource(place.bigImageID[currImage]);
        tvNameVar.setText(place.name);
        tvDescriptionVar.setText(place.description);
        tvTimingsVar.setText(place.timings);
        tvEntryFeesVar.setText(place.entryFees+"");
        tvlocationVar.setText(place.location);
        tvContactVar.setText(place.contact);

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = place.wikiLink;
                switch (v.getId()) {
                    case R.id.tv_wiki_link:
                        url = place.wikiLink;
                        break;
                    case R.id.tv_delhi_link:
                        url = place.delhiLink;
                        break;
                    case R.id.tv_other_link:
                        url = place.otherLink;
                        break;
                }
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        };

        tvWikiLink.setOnClickListener(ocl);
        tvDelhiLink.setOnClickListener(ocl);
        tvOtherLiink.setOnClickListener(ocl);


        tvlocationVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse(place.mapLocation);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        tvContactVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+place.contact));
                startActivity(intent);
            }
        });

        btRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currImage++;
                if(currImage==4){
                    currImage=0;
                }
                imgVar.setImageResource(place.bigImageID[currImage]);
            }
        });

        btLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currImage--;
                if(currImage==-1){
                    currImage=3;
                }
                imgVar.setImageResource(place.bigImageID[currImage]);
            }
        });

        return rootView;
    }

}
