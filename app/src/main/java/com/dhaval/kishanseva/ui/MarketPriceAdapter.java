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

public class MarketPriceAdapter extends RecyclerView.Adapter<MarketPriceAdapter.ViewHolder> {

    private Context context;
    private ArrayList<MarketPriceModal> marketPriceModalArrayList;

    public MarketPriceAdapter(Context context, ArrayList<MarketPriceModal> marketPriceModalArrayList) {
        this.context = context;
        this.marketPriceModalArrayList = marketPriceModalArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.market_price_list, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MarketPriceModal modal = marketPriceModalArrayList.get(position);
        holder.crpName.setText(modal.getCropname());
        holder.crpPrice.setText(modal.getPrice());
        holder.loc.setText(modal.getLocation());
        holder.date.setText(modal.getDate());
    }

    @Override
    public int getItemCount() {
        return marketPriceModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView crpName, date, loc, crpPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            crpName = itemView.findViewById(R.id.tvMarketCropName);
            date = itemView.findViewById(R.id.tvDate);
            loc = itemView.findViewById(R.id.tvLocationMarket);
            crpPrice = itemView.findViewById(R.id.tvMP);
        }
    }
}
