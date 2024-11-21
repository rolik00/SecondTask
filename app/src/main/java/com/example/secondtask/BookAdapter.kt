package com.example.secondtask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(private val bookList: List<Book>) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.book_layout, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bookList[position]
        holder.titleView.text = book.title
        holder.authorView.text = book.author
        holder.descriptionView.text = book.description
        holder.imageView.setImageResource(book.imageResource)
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    class BookViewHolder(bookView: View) : RecyclerView.ViewHolder(bookView) {
        val titleView: TextView = bookView.findViewById(R.id.title)
        val authorView: TextView = bookView.findViewById(R.id.author)
        val descriptionView: TextView = bookView.findViewById(R.id.description)
        val imageView: ImageView = bookView.findViewById(R.id.image)
    }
}
