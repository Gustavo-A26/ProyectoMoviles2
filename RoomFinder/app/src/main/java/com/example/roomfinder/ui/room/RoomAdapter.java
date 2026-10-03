package com.example.roomfinder.ui.room;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roomfinder.R;

import java.util.ArrayList;
import java.util.List;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RoomViewHolder> {

    private List<String> rooms = new ArrayList<>();

    public RoomAdapter(List<String> rooms){
        this.rooms = rooms;
    }

    @NonNull
    @Override
    public RoomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_room, parent, false);
        return new RoomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RoomViewHolder holder, int position) {
        String room = this.rooms.get(position);

        holder.cardRoomTitle.setText(room);
        holder.cardRoomDescription.setText("Descripción de prueba");
    }

    @Override
    public int getItemCount() {
        return this.rooms.size();
    }

    public static class RoomViewHolder extends RecyclerView.ViewHolder{
        ImageView cardRoomImage;
        TextView cardRoomTitle;
        TextView cardRoomDescription;

        public RoomViewHolder(@NonNull View itemView) {
            super(itemView);
            cardRoomImage = itemView.findViewById(R.id.cardRoomImage);
            cardRoomTitle = itemView.findViewById(R.id.cardRoomTitle);
            cardRoomDescription = itemView.findViewById(R.id.cardRoomDescription);
        }
    }

}
