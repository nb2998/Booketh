package com.apps.bellatrix.booketh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import com.apps.bellatrix.booketh.Adapters.ConnectionsAdapter;

import java.util.ArrayList;

public class ConnectionActivity extends AppCompatActivity {

    RecyclerView recViewConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);

        recViewConnect = findViewById(R.id.recViewConnect);


        ArrayList<String> peopleKnown = new ArrayList<>();
        peopleKnown.add("Prerna");
        peopleKnown.add("Dilsheen");
        peopleKnown.add("Aakarshita");
        peopleKnown.add("Nishtha");
        peopleKnown.add("Akanksha");
        peopleKnown.add("Lalalala");
        recViewConnect.setLayoutManager(new LinearLayoutManager(this));
        recViewConnect.setAdapter(new ConnectionsAdapter(peopleKnown, this));
    }
}
