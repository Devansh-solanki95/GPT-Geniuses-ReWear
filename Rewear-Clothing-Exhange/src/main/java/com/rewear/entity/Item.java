package com.rewear.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String category;
    private String size;
    private String type;
    private String condition;
    private String tags;
    private String imageUrl; // Mock image URL for now

    @ManyToOne
    private User owner;

    // Getters and Setters
}

