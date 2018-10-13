package com.apps.bellatrix.booketh.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.apps.bellatrix.booketh.Book;
import com.apps.bellatrix.booketh.R;

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
    public void onBindViewHolder(@NonNull BookHolder bookHolder, int i) {
        bookHolder.tvBookName.setText(books.get(i).getName());
        bookHolder.tvFundingDaysLeft.setText("Funding days left: " + String.valueOf(books.get(i).getFundingDaysLeft()));
        bookHolder.tvPublishStatus.setText((books.get(i).isPublished()) ? "Published" : "Draft");
        bookHolder.tvPublishStatus.setTextColor((books.get(i).isPublished()) ? context.getColor(android.R.color.holo_green_light) : context.getColor(android.R.color.holo_red_light));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class BookHolder extends RecyclerView.ViewHolder {
        TextView tvBookName, tvFundingDaysLeft, tvPublishStatus;

        public BookHolder(@NonNull View itemView) {
            super(itemView);
            tvBookName = itemView.findViewById(R.id.tvBookName);
            tvFundingDaysLeft = itemView.findViewById(R.id.tvFundingDaysLeft);
            tvPublishStatus = itemView.findViewById(R.id.tvPublishStatus);
        }
    }
}
