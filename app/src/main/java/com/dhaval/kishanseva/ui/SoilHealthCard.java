package com.dhaval.kishanseva.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

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
 * Use the {@link SoilHealthCard#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SoilHealthCard extends Fragment {

    private RecyclerView plantProtection;
    private SoilHealthAdapter adapter;
    private ArrayList<SoilHealthModal> arrayList;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SoilHealthCard() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SoilHealthCard.
     */
    // TODO: Rename and change types and number of parameters
    public static SoilHealthCard newInstance(String param1, String param2) {
        SoilHealthCard fragment = new SoilHealthCard();
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
        View view = inflater.inflate(R.layout.fragment_soil_health_card, container, false);
        plantProtection = view.findViewById(R.id.rvsoilHealth);
        arrayList = new ArrayList<>();
        adapter = new SoilHealthAdapter(requireActivity(), arrayList);
        plantProtection.setAdapter(adapter);

        getSoilLabData();

        return view;
    }

    private void getSoilLabData() {
        DatabaseReference db = FirebaseDatabase.getInstance().getReference("SoilLab");
        db.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot : snapshot.getChildren())
                {
                    SoilHealthModal soilHealthModal = dataSnapshot.getValue(SoilHealthModal.class);
                    arrayList.add(soilHealthModal);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}