package com.kali.jpa.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "local")


public class Local {

    @Id
    @Column(name = "id_local")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String floor;


}
