package com.dhaval.kishanseva.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dhaval.kishanseva.R;

import java.util.ArrayList;

public class ColdAdapter extends RecyclerView.Adapter<ColdAdapter.ViewHolder> {

    private Context context;
    private ArrayList<ColdModel> coldModelArrayList;

    public ColdAdapter(Context context, ArrayList<ColdModel> coldModelArrayList) {
        this.context = context;
        this.coldModelArrayList = coldModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cold_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ColdModel modal = coldModelArrayList.get(position);
        holder.cCap.setText(modal.getCapacity());
        holder.cLoc.setText(modal.getLocation());
        holder.cName.setText(modal.getName());

    }

    @Override
    public int getItemCount() {
        return coldModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView cName,cLoc,cCap;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
         cCap = itemView.findViewById(R.id.tvColdCapacity);
         cName = itemView.findViewById(R.id.tvColdName);
         cLoc = itemView.findViewById(R.id.tvColdLocation);
        }
    }
}
