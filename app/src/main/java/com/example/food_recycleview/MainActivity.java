package com.example.food_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.food_recycleview.Adapters.RecipeAdaper;
import com.example.food_recycleview.Model.RecepiModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.Recycle_View);

     ArrayList <RecepiModel> list = new ArrayList<>();
     list.add(new RecepiModel(R.drawable.img2, "Bugger"));
     list.add(new RecepiModel(R.drawable.img3, "Bugger"));
     list.add(new RecepiModel(R.drawable.img4, "Bugger"));
     list.add(new RecepiModel(R.drawable.img1, "Bugger"));
     list.add(new RecepiModel(R.drawable.img2, "Bugger"));
     list.add(new RecepiModel(R.drawable.img3, "Bugger"));

        RecipeAdaper adaper = new RecipeAdaper(list,this);
        recyclerView.setAdapter(adaper);

        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }
}