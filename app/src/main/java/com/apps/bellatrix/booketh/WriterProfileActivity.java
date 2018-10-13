package com.apps.bellatrix.booketh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.bellatrix.booketh.Adapters.BooksProfileAdapter;

public class WriterProfileActivity extends AppCompatActivity {

    RecyclerView recViewBooks;
    ImageView ivUser;
    TextView tvNameUser, tvStarsUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writer_profile);

        recViewBooks = findViewById(R.id.recViewBooks);
        ivUser = findViewById(R.id.ivUser);
        tvNameUser = findViewById(R.id.tvNameUser);
        tvStarsUser = findViewById(R.id.tvStarsUser);

        User user = (User) getIntent().getSerializableExtra(getString(R.string.userLogin));
        ivUser.setImageDrawable(getDrawable(R.drawable.profile));
        tvNameUser.setText(user.getName());
        tvStarsUser.setText(String.valueOf(user.getRatingAsWriter()));

        recViewBooks.setLayoutManager(new LinearLayoutManager(this));
        BooksProfileAdapter adapter = new BooksProfileAdapter(user.booksWritten, this);
        recViewBooks.setAdapter(adapter);
    }
}
