package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerView_Demo_Helper extends RecyclerView.Adapter<RecyclerView_Demo_Helper.ViewHolder>
{
    Context context;
    ArrayList<Model> list;
    RecyclerView_Demo_Helper(Context context, ArrayList<Model> list)
    {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public RecyclerView_Demo_Helper.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(context).inflate(R.layout.custom_layout, parent, false);
         ViewHolder viewHolder = new ViewHolder(view);
         return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView_Demo_Helper.ViewHolder holder, int position) {

        holder.name.setText(list.get(position).name);
        holder.phoneNo.setText(list.get(position).phoneNo);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, phoneNo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            phoneNo = itemView.findViewById(R.id.phoneNo);
        }
    }
}
