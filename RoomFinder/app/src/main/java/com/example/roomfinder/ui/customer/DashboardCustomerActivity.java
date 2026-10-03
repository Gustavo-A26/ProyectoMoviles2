package com.example.roomfinder.ui.customer;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roomfinder.R;
import com.example.roomfinder.ui.room.RoomAdapter;

import java.util.ArrayList;
import java.util.List;

public class DashboardCustomerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard_customer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        load();
    }

    protected void load(){
        List<String> rooms = new ArrayList<>();
        rooms.add("Habitación Universitaria");
        rooms.add("Habitación Amoblada");
        rooms.add("Habitación Económica");
        rooms.add("Habitación Privada");
        rooms.add("Habitación Compartida");
        RoomAdapter roomAdapter = new RoomAdapter(rooms);
        recyclerView = this.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(roomAdapter);

    }
}