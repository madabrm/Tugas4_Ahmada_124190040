package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class TankAdapter extends RecyclerView.Adapter<com.example.myapplication.TankAdapter.ViewHolder> {
    private ListFragment context;
    private ArrayList<com.example.myapplication.TankModel> tankModels;

    public TankAdapter(ListFragment context) {
        this.context = context;
    }

    public ArrayList<com.example.myapplication.TankModel> getTankModels() {
        return tankModels;
    }

    public void setTankModels(ArrayList<com.example.myapplication.TankModel> tankModels) {
        this.tankModels = tankModels;
    }

    @NonNull
    @Override
    public com.example.myapplication.TankAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cetak, parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.myapplication.TankAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(getTankModels().get(position).getGambarTank()).into(holder.gambar);
        holder.text.setText(getTankModels().get(position).getNamaTank());
    }

    @Override
    public int getItemCount() {
        return getTankModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.cetak_gambar);
            text = itemView.findViewById(R.id.cetak_text);
        }
    }
}
