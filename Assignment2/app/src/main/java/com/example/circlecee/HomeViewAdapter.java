package com.example.circlecee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeViewAdapter extends RecyclerView.Adapter<HomeViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<circle> mData;

    public HomeViewAdapter(Context mContext, List<circle> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mIntlater=LayoutInflater.from(mContext);
        view= mIntlater.inflate(R.layout.circle,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.circle_title.setText(mData.get(position).getName());
        holder.img.setImageResource(mData.get(position).getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView circle_title;
        ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            circle_title=(TextView) itemView.findViewById(R.id.circle_title);
            img=(ImageView) itemView.findViewById(R.id.circle_image);
        }
    }
}
