package com.apps.bellatrix.booketh.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.apps.bellatrix.booketh.R;

import java.util.ArrayList;

public class ConnectionsAdapter extends RecyclerView.Adapter<ConnectionsAdapter.CHolder> {

    ArrayList<String> list;
    Context context;

    public ConnectionsAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CHolder(LayoutInflater.from(context).inflate(android.R.layout.activity_list_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CHolder cHolder, int i) {
        cHolder.text1.setText(list.get(i));
        cHolder.text1.setTextColor(context.getResources().getColor(android.R.color.black));
        cHolder.text1.setTextSize(20);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CHolder extends RecyclerView.ViewHolder{
        TextView text1;

        public CHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(android.R.id.text1);
        }
    }
}
