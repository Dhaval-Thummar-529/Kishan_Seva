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

public class DealerAdapter extends RecyclerView.Adapter<DealerAdapter.ViewHolder> {

    private Context context;
    private ArrayList<DealerModelClass> dealersModelClassArrayList;

    public DealerAdapter(Context context, ArrayList<DealerModelClass> dealersModelClassArrayList) {
        this.context = context;
        this.dealersModelClassArrayList = dealersModelClassArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dealers_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DealerModelClass modal = dealersModelClassArrayList.get(position);
        holder.dId.setText("Id: " + modal.getDealerid());
        holder.dName.setText("Name: " + modal.getDealername());
        holder.dDistrict.setText("District: " + modal.getDealerdistrict());
        holder.dBlock.setText("Block: " + modal.getDealerblock());
        holder.dAddress.setText("Address: " + modal.getDealeraddress());
        holder.dMobile.setText("Mobile: " + modal.getDealermobile());
        holder.dLicence.setText("Licence No: " + modal.getDealerlicence());
        holder.dLicenceBy.setText("Licence By: " + modal.getDealerlicenceby());
        holder.dDealingCrop.setText("Dealing Crop: " + modal.getDealerdealingcrop());

    }

    @Override
    public int getItemCount() {
        return dealersModelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView dId, dName, dDistrict, dBlock, dAddress, dMobile, dLicence, dLicenceBy, dDealingCrop;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            dId = itemView.findViewById(R.id.tvId);
            dName = itemView.findViewById(R.id.tvDealerName);
            dDistrict = itemView.findViewById(R.id.tvDealerDistrict);
            dBlock = itemView.findViewById(R.id.tvDealerBlock);
            dAddress = itemView.findViewById(R.id.tvDealerAddress);
            dMobile = itemView.findViewById(R.id.tvDealerMobile);
            dLicence = itemView.findViewById(R.id.tvDealerLicence);
            dLicenceBy = itemView.findViewById(R.id.tvDealerLicenceBy);
            dDealingCrop = itemView.findViewById(R.id.tvDealerCrop);
        }
    }
}
