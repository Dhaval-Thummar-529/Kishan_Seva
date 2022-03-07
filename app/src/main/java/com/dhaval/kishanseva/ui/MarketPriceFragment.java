package com.dhaval.kishanseva.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dhaval.kishanseva.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MarketPriceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MarketPriceFragment extends Fragment {

    private FirebaseDatabase db;
    private DatabaseReference dataBaseReference;
    private MarketPriceAdapter marketPriceAdapter;
    private ArrayList<MarketPriceModal> marketPriceModalArrayList;
    private RecyclerView marketRV;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MarketPriceFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MarketPriceFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MarketPriceFragment newInstance(String param1, String param2) {
        MarketPriceFragment fragment = new MarketPriceFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_market_price, container, false);

        marketRV = view.findViewById(R.id.rvMarketPrice);
        marketPriceModalArrayList = new ArrayList<>();
        marketPriceAdapter = new MarketPriceAdapter(requireActivity(), marketPriceModalArrayList);
        marketRV.setAdapter(marketPriceAdapter);

        //marketPriceModalArrayList.add(new MarketPriceModal("wheat","03 Mar,2022","Vadodara","2700/Q"));

        getPrices();

        return view;
    }

    private void getPrices() {
        db = FirebaseDatabase.getInstance();
        dataBaseReference = db.getReference("marketprice");
        marketPriceModalArrayList.clear();

        dataBaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    MarketPriceModal mmarketPriceModal = dataSnapshot.getValue(MarketPriceModal.class);
                    marketPriceModalArrayList.add(mmarketPriceModal);
                    Log.d("check data", "fetched");
                }
                marketPriceAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}