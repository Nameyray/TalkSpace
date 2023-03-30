package com.moringaschool.talkspace.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.talkspace.Fragments.ForumsFragment;
import com.moringaschool.talkspace.Models.ForumsModel;
import com.moringaschool.talkspace.R;

import java.util.ArrayList;

public class MentalHealth extends RecyclerView.Adapter<MentalHealth.ViewHolder> {
    Context context;
    ArrayList<ForumsModel> list;

    public MentalHealth(Context context, ArrayList<ForumsModel> list, ForumsFragment forumsFragment) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MentalHealth.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.forums_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MentalHealth.ViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.imageView2);
            name = itemView.findViewById(R.id.text);
        }
    }
}