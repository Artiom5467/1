package com.example.demomaven.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Component {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String type; // CPU, GPU, RAM, etc.
    private int powerConsumption; // in watts
    private String description;
    
    // Constructor without id for creating new components
    public Component(String name, String type, int powerConsumption, String description) {
        this.name = name;
        this.type = type;
        this.powerConsumption = powerConsumption;
        this.description = description;
    }
}