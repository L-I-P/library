package org.mail.controller;

import com.google.gson.Gson;
import org.mail.models.Author;
import org.mail.models.Book;

public class Application {
    public static void main(String[] args) {
        Library library = LibrarayFactory.getLibrary();
        Gson gson = new Gson();
        String result = "";
        for (Author author : library.getAuthors()) {
            if (args[0].equals(author.getFirstName())) {
                for(Book book : library.getBooks()) {
                    if (book.getIdAuthor() == author.getId()) {
                        result += gson.toJson(book);
                    }
                }
            }
        }
        if (result == "") {
            System.out.println("Книги не найдены.");
        } else {
            System.out.println(result);
        }
    }
}
