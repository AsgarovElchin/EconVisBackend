package com.example.demo.models;

import javax.persistence.*;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Country country;
    
    @ManyToOne
    private Indicator indicator;
    
    @ManyToOne
    private Year year;
    
    private String data;

    // Getters and Setters
}
