package com.apps.bellatrix.booketh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnConnect, btnDiscover, btnAdvertise, btnFund;
    User userLoggedIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConnect = findViewById(R.id.btnConnect);
        btnDiscover = findViewById(R.id.btnDiscover);
        btnAdvertise = findViewById(R.id.btnAdvertise);
        btnFund = findViewById(R.id.btnFund);

        btnConnect.setOnClickListener(this);
        btnDiscover.setOnClickListener(this);
        btnAdvertise.setOnClickListener(this);
        btnFund.setOnClickListener(this);

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Void and voices", "This is a book about sufferings of an abandaned dog.", "This is chapter 1..", 1));
        userLoggedIn = new User("Nishtha", 3.5, 1, bookList, 1);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menuProfile) {
            Intent intent = new Intent(MainActivity.this, WriterProfileActivity.class);
            intent.putExtra(getString(R.string.userLogin), userLoggedIn);
            startActivity(intent);
            return true;
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnConnect) {

        } else if (view.getId() == R.id.btnAdvertise) {

        } else if (view.getId() == R.id.btnDiscover) {

        } else if (view.getId() == R.id.btnFund) {
            Intent intent = new Intent(MainActivity.this, AvailableToFundActivity.class);
            startActivity(intent);
        }
    }
}
