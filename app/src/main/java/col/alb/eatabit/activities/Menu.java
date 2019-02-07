package col.alb.eatabit.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import col.alb.eatabit.R;
import col.alb.eatabit.adapter.MenuAdapter;
import col.alb.eatabit.datamodel.FoodMenu;

public class Menu extends AppCompatActivity{
    RecyclerView foodmenuRv;
    RecyclerView.LayoutManager layoutManager;
    MenuAdapter adapterM;
    ArrayList<FoodMenu> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        foodmenuRv = findViewById(R.id.place_rvmenu);
        layoutManager = new LinearLayoutManager(this);
        adapterM = new MenuAdapter(this, getData());

        foodmenuRv.setLayoutManager(layoutManager);
        foodmenuRv.setAdapter(adapterM);
    }

    private ArrayList<FoodMenu> getData() {
        arrayList = new ArrayList<>();
        arrayList.add(new FoodMenu("Hamburger Special 90", "180 gr. with delicious meat", 6.99));
        arrayList.add(new FoodMenu("Hamburger Exxxtra", "300gr. with delicious meat", 9.99));
        arrayList.add(new FoodMenu("Hamburger Small", "90gr. with  meat (for gays)", 16.99));
        arrayList.add(new FoodMenu("Hamburger Vegan", "150gr. with no meat (for gays too)", 9.99));
        arrayList.add(new FoodMenu("Hamburger Vegan", "150gr. with no meat (for gays too)", 9.99));
        arrayList.add(new FoodMenu("Hamburger Italian Style", "600gr. with a lot of meat (Italian do it bigger)", 9.99));
        arrayList.add(new FoodMenu("Hamburger Italian Style", "600gr. with a lot of meat (Italian do it bigger)", 9.99));
        arrayList.add(new FoodMenu("Hamburger Italian Style", "600gr. with a lot of meat (Italian do it bigger)", 9.99));
        return arrayList;

    }


}

