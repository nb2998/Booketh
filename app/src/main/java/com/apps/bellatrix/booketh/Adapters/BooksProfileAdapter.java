package com.apps.bellatrix.booketh.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.apps.bellatrix.booketh.AddBookActivity;
import com.apps.bellatrix.booketh.Book;
import com.apps.bellatrix.booketh.BookDetailsActivity;
import com.apps.bellatrix.booketh.R;
import com.apps.bellatrix.booketh.WriterProfileActivity;

import java.util.ArrayList;

public class BooksProfileAdapter extends RecyclerView.Adapter<BooksProfileAdapter.BookHolder> {

    ArrayList<Book> books;
    Context context;

    public BooksProfileAdapter(ArrayList<Book> books, Context context) {
        this.books = books;
        this.context = context;
    }

    @NonNull
    @Override
    public BookHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new BookHolder(LayoutInflater.from(context).inflate(R.layout.single_book_profile, viewGroup, false));
    }

    @SuppressLint("NewApi")
    @Override
    public void onBindViewHolder(@NonNull final BookHolder bookHolder, int i) {
        bookHolder.tvBookName.setText(books.get(i).getName());
        bookHolder.tvFundingDaysLeft.setText("Funding days left: " + String.valueOf(books.get(i).getFundingDaysLeft()));
        bookHolder.tvPublishStatus.setText((books.get(i).isPublished()) ? "Published" : "Draft");
        bookHolder.tvPublishStatus.setTextColor((books.get(i).isPublished()) ? context.getColor(android.R.color.holo_green_light) : context.getColor(android.R.color.holo_red_light));

        bookHolder.cardViewBookProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, BookDetailsActivity.class);
                intent.putExtra(context.getString(R.string.bookIntent), books.get(bookHolder.getAdapterPosition()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class BookHolder extends RecyclerView.ViewHolder {
        TextView tvBookName, tvFundingDaysLeft, tvPublishStatus;
        CardView cardViewBookProfile;

        public BookHolder(@NonNull View itemView) {
            super(itemView);
            tvBookName = itemView.findViewById(R.id.tvBookName);
            tvFundingDaysLeft = itemView.findViewById(R.id.tvFundingDaysLeft);
            tvPublishStatus = itemView.findViewById(R.id.tvPublishStatus);
            cardViewBookProfile = itemView.findViewById(R.id.cardViewBookProfile);
        }
    }
}
