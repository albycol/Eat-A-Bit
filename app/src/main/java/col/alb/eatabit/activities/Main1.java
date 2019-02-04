package col.alb.eatabit.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

import col.alb.eatabit.R;
import col.alb.eatabit.adapter.Restaurant;

public class Main1 extends AppCompatActivity {
    RecyclerView restaurantRV;
    RecyclerView.LayoutManager layoutManager;
    Restaurant adapter;
    ArrayList<String> arrayList;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        restaurantRV=findViewById(R.id.places_rv);
        layoutManager=new LinearLayoutManager(this);
        adapter= new Restaurant(this, getData());

        restaurantRV.setLayoutManager(layoutManager);
        restaurantRV.setAdapter(adapter);
    }

    private ArrayList<String> getData() {
        arrayList=new ArrayList<>();
        arrayList.add("Mc Donald's");
        arrayList.add("Burger King");
        arrayList.add("KFC");
        arrayList.add("Subway");
        arrayList.add("Wendy's");
        arrayList.add("Pizza Hut");
        return arrayList;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.primo){
            startActivity(new Intent(this, Login.class));
            return true;
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

