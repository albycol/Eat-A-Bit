package col.alb.eatabit.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import col.alb.eatabit.R;
import col.alb.eatabit.datamodel.FoodMenu;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.FoodMenuViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<FoodMenu> data;

    public MenuAdapter(Context context, ArrayList<FoodMenu> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public FoodMenuViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.item_foodmenu, viewGroup, false);
        return new FoodMenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodMenuViewHolder viewHolder, int i) {
        viewHolder.foodName.setText(data.get(i).getNameFood());
        viewHolder.description.setText(data.get(i).getDescription());

        viewHolder.foodName.setText(data.get(i).getNameFood());
        viewHolder.description.setText(data.get(i).getDescription());
        viewHolder.price.setText(data.get(i).getPrice()+"");


    }

    @Override
    public int getItemCount() {
        return data==null ? 0 : data.size();
    }

    public class FoodMenuViewHolder extends RecyclerView.ViewHolder {
        public TextView foodName;
        public TextView description;
        public TextView price;



        public FoodMenuViewHolder(@NonNull View itemView) {
            super(itemView);

            foodName=itemView.findViewById(R.id.food_name);
            description=itemView.findViewById(R.id.food_des);
            price=itemView.findViewById(R.id.food_price);
        }
    }
}
