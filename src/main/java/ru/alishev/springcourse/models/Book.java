package ru.alishev.springcourse.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;

    @NotEmpty(message = "title message should not be empty")
    @Column(name = "title")
    private String title;

    private String 
}
