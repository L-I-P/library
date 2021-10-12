package org.mail.controller;

import org.mail.models.Author;
import org.mail.models.Book;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> Books;
    private ArrayList<Author> Authors;
    public Library() {
        Books = new ArrayList<Book>();
        Authors = new ArrayList<Author>();
        for (int i = 0; i < 6; i++) {
            Author author = new Author(i, "firstName" + String.valueOf(i), "secondName" + String.valueOf(i));
            for (int j = 0; j < 3; j++) {
                Book book = new Book(j, author.getId(), "Book" + String.valueOf((i + 1) * 3 + j), "");
                Books.add(book);
            }
            Authors.add(author);
        }
    }

    public ArrayList<Book> getBooks() {
        return this.Books;
    }

    public ArrayList<Author> getAuthors() {
        return this.Authors;
    }
}
