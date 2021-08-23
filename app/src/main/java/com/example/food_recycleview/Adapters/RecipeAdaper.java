package com.example.food_recycleview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_recycleview.Model.RecepiModel;
import com.example.food_recycleview.R;

import java.util.ArrayList;

public class RecipeAdaper extends RecyclerView.Adapter<RecipeAdaper.viewHolder> {
  ArrayList<RecepiModel>list;
  Context context;

    public RecipeAdaper(ArrayList<RecepiModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override


    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclarview , parent ,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        RecepiModel model = list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());


        switch (position){

            case 0:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(context,"Image one is clicked",Toast.LENGTH_LONG).show();

                    }
                });


                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context,"click your own product",Toast.LENGTH_LONG).show();
                    }
                });

                break;



            case 1:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(context,"Image two is clicked",Toast.LENGTH_LONG).show();

                    }
                });


                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context,"click your own product",Toast.LENGTH_LONG).show();
                    }
                });

                break;
            default:
        }




    }

    @Override
    public int getItemCount() {
        return list.size();
    }




    public class  viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public viewHolder(@NonNull View itemview) {
            super(itemview);
            imageView = itemview.findViewById(R.id.imag1);
            textView = itemview.findViewById(R.id.textview);

        }
    }

}
