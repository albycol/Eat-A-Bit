package col.alb.eatabit.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import col.alb.eatabit.R;
import col.alb.eatabit.activities.Menu;
import col.alb.eatabit.datamodel.Restaurant;

public class RestaurantAdapter extends RecyclerView.Adapter {
    private LayoutInflater inflater;
    private ArrayList<Restaurant> data;
    private boolean isGrid;

    public RestaurantAdapter(Context context, ArrayList<Restaurant> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int layout = isGrid ? R.layout.item_restaurant_grid : R.layout.item_restaurant;
        View view = inflater.inflate(layout, viewGroup, false);
        return new RestaurantViewHolder(view);

    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        RestaurantViewHolder vh = (RestaurantViewHolder) viewHolder;
        vh.restaurantName.setText(data.get(i).getName());
        vh.restaurantImage.setImageResource(data.get(i).getImage());
        vh.restaurantAddress.setText(data.get(i).getAddress());
        vh.restaurantOrder.setText(data.get(i).getMinOrder() + "");
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public boolean isGrid() {
        return isGrid;
    }

    public void setGrid(boolean grid) {
        isGrid = grid;
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder {
        public TextView restaurantName;
        public ImageView restaurantImage;
        public TextView restaurantAddress;
        public TextView restaurantOrder;


        public RestaurantViewHolder(@NonNull final View itemView) {
            super(itemView);
            restaurantName = itemView.findViewById(R.id.restaurant_name);
            restaurantImage = itemView.findViewById(R.id.avatar_restaurant);
            restaurantAddress = itemView.findViewById(R.id.address);
            restaurantOrder = itemView.findViewById(R.id.minorder);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), Menu.class));
                }
            });


        }
    }


}