package com.kali.jpa.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_product")

public class Product {

    @Id
    private Long idProduct;
    private String name;
    private String brand;
    private Boolean expired;
    private Float price;

    // RELACION
    @ManyToOne
    @JoinColumn(
            name = "id",
            referencedColumnName = "id_local"
    )
    private Local local;

}
