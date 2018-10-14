package com.apps.bellatrix.booketh.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.apps.bellatrix.booketh.AddBookActivity;
import com.apps.bellatrix.booketh.Book;
import com.apps.bellatrix.booketh.BookDetailsActivity;
import com.apps.bellatrix.booketh.R;
import com.apps.bellatrix.booketh.WriterProfileActivity;

import java.util.ArrayList;

public class BookPageAdapter extends RecyclerView.Adapter<BookPageAdapter.BookHolder> {

    ArrayList<Book> books;
    Context context;

    public BookPageAdapter(ArrayList<Book> books, Context context) {
        this.books = books;
        this.context = context;
    }

    @NonNull
    @Override
    public BookHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new BookHolder(LayoutInflater.from(context).inflate(R.layout.single_row_book_fund, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final BookHolder bookHolder, int i) {
        bookHolder.ivBook.setImageDrawable(context.getDrawable(R.drawable.book_sample));
        bookHolder.tvBookName.setText(books.get(i).getName());

        bookHolder.cardViewBookFund.setOnClickListener(new View.OnClickListener() {
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


    class BookHolder extends RecyclerView.ViewHolder{
        ImageView ivBook;
        TextView tvBookName;
        LinearLayout bookLayout;
        CardView cardViewBookFund;

        public BookHolder(@NonNull View itemView) {
            super(itemView);
            ivBook = itemView.findViewById(R.id.ivBook);
            tvBookName = itemView.findViewById(R.id.tvBookName);
            bookLayout = itemView.findViewById(R.id.bookLayout);
            cardViewBookFund = itemView.findViewById(R.id.cardViewBookFund);
        }
    }
}
