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

public class AgroAdvisoryAdapter extends RecyclerView.Adapter<AgroAdvisoryAdapter.ViewHolder> {
    private Context context;
    private ArrayList<AgroAdvisoryModel> agroAdvisoryModelArrayList;

    public AgroAdvisoryAdapter(Context context, ArrayList<AgroAdvisoryModel> agroAdvisoryModelArrayList) {
        this.context = context;
        this.agroAdvisoryModelArrayList = agroAdvisoryModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.agro_advisory_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        AgroAdvisoryModel agroAdvisoryModel = agroAdvisoryModelArrayList.get(position);
        holder.aNumber.setText("Advisor's No: "+agroAdvisoryModel.getAdvisornumber());
        holder.aName.setText(agroAdvisoryModel.getAdvisorname());
        holder.aLoc.setText(agroAdvisoryModel.getAdvisorlocation());

    }

    @Override
    public int getItemCount() {
        return agroAdvisoryModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView aName, aLoc, aNumber;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            aName = itemView.findViewById(R.id.tvAdvisorName);
            aLoc = itemView.findViewById(R.id.tvAdvisorLoc);
            aNumber = itemView.findViewById(R.id.tvAdvisorNumber);
        }
    }
}
