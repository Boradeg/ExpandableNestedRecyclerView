package com.example.expandablervnested2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DataModel> mList;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recyclervie);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();

        //list1
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("Pune-Satara Road Widening");
        nestedList1.add("Nipani-Chikodi Road Widening");
        nestedList1.add("Daund - Bhigwan Line Survey");
        nestedList1.add("Chyawanprash and Health Foods");


        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("Book");
        nestedList2.add("Pen");
        nestedList2.add("Office Chair");
        nestedList2.add("Pencil");
        nestedList2.add("Eraser");
        nestedList2.add("NoteBook");
        nestedList2.add("Map");
        nestedList2.add("Office Table");

        List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("Decorates");
        nestedList3.add("Tea Table");
        nestedList3.add("Wall Paint");
        nestedList3.add("Furniture");
        nestedList3.add("Bedsits");
        nestedList3.add("Certain");
        nestedList3.add("Namkeen and Snacks");
        nestedList3.add("Honey and Spreads");

//        List<String> nestedList4 = new ArrayList<>();
//        nestedList4.add("Pasta");
//        nestedList4.add("Spices");
//        nestedList4.add("Salt");
//        nestedList4.add("Chyawanprash");
//        nestedList4.add("Maggie");
//        nestedList4.add("Sauces and Ketchup");
//        nestedList4.add("Snacks");
//        nestedList4.add("Kurkure");
//
//        List<String> nestedList5 = new ArrayList<>();
//        nestedList5.add("Jams and Honey");
//        nestedList5.add("Pickles and Chutneys");
//        nestedList5.add("Readymade Meals");
//        nestedList5.add("Chyawanprash and Health Foods");
//        nestedList5.add("Pasta and Soups");
//        nestedList5.add("Sauces and Ketchup");
//        nestedList5.add("Namkeen and Snacks");
//        nestedList5.add("Honey and Spreads");
//
//        List<String> nestedList6 = new ArrayList<>();
//        nestedList6.add("Pasta");
//        nestedList6.add("Spices");
//        nestedList6.add("Salt");
//        nestedList6.add("Chyawanprash");
//        nestedList6.add("Maggie");
//        nestedList6.add("Sauces and Ketchup");
//        nestedList6.add("Snacks");
//        nestedList6.add("Kurkure");
//
//
//        List<String> nestedList7 = new ArrayList<>();
//        nestedList7.add("Decorates");
//        nestedList7.add("Tea Table");
//        nestedList7.add("Wall Paint");
//        nestedList7.add("Furniture");
//        nestedList7.add("Bedsits");
//        nestedList7.add("Certain");
//        nestedList7.add("Namkeen and Snacks");
//        nestedList7.add("Honey and Spreads");

        List<String> items = new ArrayList<>();
        items.add("State Public Works Department(SPWD)");
        items.add("Drone Survey");
        items.add("MMRDA Daund");

        mList.add(new DataModel(nestedList1 , items.get(0)));
        mList.add(new DataModel( nestedList2, items.get(1)));
        mList.add(new DataModel( nestedList3, items.get(2)));
//        mList.add(new DataModel(nestedList4 , items.get(3)));
//        mList.add(new DataModel(nestedList5, items.get(4)));
//        mList.add(new DataModel(nestedList6, items.get(5)));
//        mList.add(new DataModel(nestedList7 , items.get(6)));
        //mList.add(new DataModel(nestedList8 ,"Personal CareEmpty"));


        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);
    }
}