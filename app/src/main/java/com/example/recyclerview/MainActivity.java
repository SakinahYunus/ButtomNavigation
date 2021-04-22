package com.example.recyclerview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<HarryPotter> hapo = new ArrayList<>();

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_harrypotter);
        recyclerView.setHasFixedSize(true);
        hapo.addAll(HarryPotterData.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(hapo);
        recyclerView.setAdapter(listAdapter);

        listAdapter.setOnItemClickCallback(new ListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(HarryPotter data) {
                showSelectedHarrypotter(data);
            }
        });
    }
    private void showSelectedHarrypotter(HarryPotter harryPotter) {
        Toast.makeText(this, "Show Detail  " + harryPotter.getKarakter(), Toast.LENGTH_SHORT).show();
    }
}