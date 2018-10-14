package com.apps.bellatrix.booketh;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.bellatrix.booketh.Adapters.BooksProfileAdapter;

public class WriterProfileActivity extends AppCompatActivity {

    RecyclerView recViewBooks;
    ImageView ivUser;
    TextView tvNameUser, tvStarsUser;
    Button btnAddBook, btnTransactions;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writer_profile);

        recViewBooks = findViewById(R.id.recViewBooks);
        ivUser = findViewById(R.id.ivUser);
        tvNameUser = findViewById(R.id.tvNameUser);
        tvStarsUser = findViewById(R.id.tvStarsUser);
        btnAddBook = findViewById(R.id.btnAddBook);
        btnTransactions = findViewById(R.id.btnTransactions);

        final User user = (User) getIntent().getSerializableExtra(getString(R.string.userLogin));
        ivUser.setImageDrawable(getDrawable(R.drawable.profile));
        tvNameUser.setText(user.getName());
        tvStarsUser.setText("Rating: "+String.valueOf(user.getRatingAsWriter())+" out of 5");

        recViewBooks.setLayoutManager(new LinearLayoutManager(this));
        BooksProfileAdapter adapter = new BooksProfileAdapter(user.booksWritten, this);
        recViewBooks.setAdapter(adapter);

        btnAddBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WriterProfileActivity.this, AddBookActivity.class);
                intent.putExtra(getString(R.string.userLogin), user);
                startActivity(intent);
            }
        });

        btnTransactions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WriterProfileActivity.this, TransactionHistoryActivity.class);
                intent.putExtra(getString(R.string.userLogin), user);
                startActivity(intent);
            }
        });
    }
}
