package com.example.onlineshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class BookListActivity extends AppCompatActivity {
    private ListView listView;
    private BookListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        listView = findViewById(R.id.books_listView);
    }
    //
    private List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        return books;
    }
}