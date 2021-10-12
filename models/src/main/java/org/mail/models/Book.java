package org.mail.models;

public class Book {
    private int id;
    private int idAuthor;
    private String name;
    private String description;

    public Book(int id, int idAuthor, String name, String description) {
        this.id = id;
        this.idAuthor = idAuthor;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public int getIdAuthor() {
        return this.idAuthor;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "library.models.Book{" +
                "id=" + id +
                ", idAuthor=" + idAuthor +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
