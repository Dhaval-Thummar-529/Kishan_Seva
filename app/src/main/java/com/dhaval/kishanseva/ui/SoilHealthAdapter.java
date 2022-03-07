package com.dhaval.kishanseva.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.dhaval.kishanseva.R;

import java.util.ArrayList;

public class SoilHealthAdapter extends RecyclerView.Adapter<SoilHealthAdapter.ViewModel> {

    private Context context;
    private ArrayList<SoilHealthModal> soilHealthModallist;

    public SoilHealthAdapter(Context context, ArrayList<SoilHealthModal> soilHealthModallist) {
        this.context = context;
        this.soilHealthModallist = soilHealthModallist;
    }

    @NonNull
    @Override
    public ViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.soil_health_card_item, parent, false);

        return new ViewModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewModel holder, int position) {
        SoilHealthModal modal = soilHealthModallist.get(position);
        holder.sid.setText("id: " + modal.getSerialNumber());
        holder.sname.setText(modal.getLabName());
        holder.snumber.setText("Phone number :" + modal.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return soilHealthModallist.size();
    }

    public class ViewModel extends RecyclerView.ViewHolder {

        private TextView sid, sname, snumber;

        public ViewModel(@NonNull View itemView) {
            super(itemView);
            sid = itemView.findViewById(R.id.tvSoilSerialNumber);
            sname = itemView.findViewById(R.id.tvSoilLabName);
            snumber = itemView.findViewById(R.id.tvSoilPhoneNumber);
        }
    }
}
