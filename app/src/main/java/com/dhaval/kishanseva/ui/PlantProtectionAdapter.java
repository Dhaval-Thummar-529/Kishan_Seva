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

public class PlantProtectionAdapter extends RecyclerView.Adapter<PlantProtectionAdapter.ViewHolder> {
    private Context context;
    private ArrayList<PlantProtectionModel> plantProtectionModelArrayList;

    public PlantProtectionAdapter(Context context, ArrayList<PlantProtectionModel> plantProtectionModelArrayList) {
        this.context = context;
        this.plantProtectionModelArrayList = plantProtectionModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.plant_protection_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        PlantProtectionModel model = plantProtectionModelArrayList.get(position);

        holder.ppName.setText(model.getSchemename());
        holder.ppType.setText(model.getSchemeby());
        holder.ppAssistance.setText(model.getSchemeassistance());

    }

    @Override
    public int getItemCount() {
        return plantProtectionModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView ppName, ppType, ppAssistance;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ppName = itemView.findViewById(R.id.tvPlantProtectionSchemeName);
            ppType = itemView.findViewById(R.id.tvPlantProtectionType);
            ppAssistance = itemView.findViewById(R.id.tvPlantProtectionAssistance);
        }
    }
}
