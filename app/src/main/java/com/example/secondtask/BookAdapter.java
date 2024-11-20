package com.example.secondtask;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private List<Book> bookList;

    public BookAdapter(List<Book> bookList) {
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_layout, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book = bookList.get(position);
        holder.titleView.setText(book.getTitle());
        holder.authorView.setText(book.getAuthor());
        holder.descriptionView.setText(book.getDescription());
        holder.imageView.setImageResource(book.getImageResource());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    static class BookViewHolder extends RecyclerView.ViewHolder {
        TextView titleView;
        TextView authorView;
        TextView descriptionView;
        ImageView imageView;

        public BookViewHolder(@NonNull View bookView) {
            super(bookView);
            titleView = bookView.findViewById(R.id.title);
            authorView = bookView.findViewById(R.id.author);
            descriptionView = bookView.findViewById(R.id.description);
            imageView = bookView.findViewById(R.id.image);
        }
    }
}
