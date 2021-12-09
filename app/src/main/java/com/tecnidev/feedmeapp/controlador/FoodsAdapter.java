package com.tecnidev.feedmeapp.controlador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tecnidev.feedmeapp.R;
import com.tecnidev.feedmeapp.modelo.PublicacionesDTO;

import java.util.List;

public class FoodsAdapter extends RecyclerView.Adapter<FoodsAdapter.ViewHolder> {

    // Static class from ViewHolder to bind item_foood layout
    public static class ViewHolder extends RecyclerView.ViewHolder{

        // Item_Food Attributes
        private ImageView imagen;
        private TextView nombreAlimento, tipoAlimento, fechaVencimiento, descripcion, precio;

        // Constructor
        public ViewHolder(View itemView){
            super(itemView);
            imagen = itemView.findViewById(R.id.imageViewFood);
            nombreAlimento = itemView.findViewById(R.id.textViewFoodTitle);
            tipoAlimento = itemView.findViewById(R.id.textViewFoodType);
            fechaVencimiento = itemView.findViewById(R.id.textViewFoodExpiration);
            descripcion = itemView.findViewById(R.id.textViewFoodDescription);
            precio = itemView.findViewById(R.id.textViewFoodPrice);
        }
    }

    // Attributes
    public List<PublicacionesDTO> publicacionesDTOList;

    // Constructor for FoodsAdapter
    public FoodsAdapter(List<PublicacionesDTO> publicacionesDTOList) {
        this.publicacionesDTOList = publicacionesDTOList;
    }

    // Inflate(put a layout into another) a new item of content to list
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    // Bind content for each item
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // TODO: To implement bitmap for each image from "publicacionesDTO" model
        //holder.imagen.setImageResource(publicacionesDTOList.get(position));
        holder.nombreAlimento.setText(publicacionesDTOList.get(position).getNombreAlimento());
        holder.tipoAlimento.setText(publicacionesDTOList.get(position).getTipoAlimento());
        holder.fechaVencimiento.setText(publicacionesDTOList.get(position).getFechaVencimiento());
        // Set sub-string of descripcion to 50 letters
        holder.descripcion.setText(publicacionesDTOList.get(position).getDescripcion().substring(0, 50));
        holder.precio.setText(publicacionesDTOList.get(position).getPrecio());
    }

    // Determinates amount of items to process them
    @Override
    public int getItemCount() {
        return publicacionesDTOList.size();
    }
}
