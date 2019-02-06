package col.alb.eatabit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

import col.alb.eatabit.R;
import col.alb.eatabit.adapter.RestaurantAdapter;
import col.alb.eatabit.datamodel.Restaurant;

public class Main1 extends AppCompatActivity {
    RecyclerView restaurantRV;
    RecyclerView.LayoutManager layoutManager;
    RestaurantAdapter adapter;
    ArrayList<Restaurant> arrayList;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        restaurantRV=findViewById(R.id.places_rv);
        layoutManager=new LinearLayoutManager(this);
        adapter= new RestaurantAdapter(this, getData());

        restaurantRV.setLayoutManager(layoutManager);
        restaurantRV.setAdapter(adapter);
    }

    private ArrayList<Restaurant> getData() {
        arrayList=new ArrayList<>();
        arrayList.add(new Restaurant(R.drawable.panino, "McDonald's", "hflkhvrkò", 10.5));
        arrayList.add(new Restaurant(R.drawable.panino4, "Burger King", "gyguighui", 13.50));
        arrayList.add(new Restaurant(R.drawable.panino3, "KFC", "hflkhvrkò", 10.5));
        arrayList.add(new Restaurant(R.drawable.panino2, "Subway's", "kdnfdnfd", 18));
        arrayList.add(new Restaurant(R.drawable.pizza, "Wendy's", "djfndfjnd", 16));
        return arrayList;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.primo){
            startActivity(new Intent(this, Login.class));
            return true;
        } else if (item.getItemId() == R.id.type_list){
            adapter.setGrid(!adapter.isGrid());
            layoutManager = adapter.isGrid() ? new GridLayoutManager(this, 2) : new LinearLayoutManager(this);
            restaurantRV.setAdapter(adapter);
            restaurantRV.setLayoutManager(layoutManager);
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mymenu = getMenuInflater();
        mymenu.inflate(R.menu.menu_actionbar, menu);
        return true;
    }
}

