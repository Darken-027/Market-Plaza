package com.market_plaza.persistence.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {
    @Embedded
    private ComprasProductoPK id;

    private Integer cantidad;
    private Double total;
    private Boolean estado;
}
