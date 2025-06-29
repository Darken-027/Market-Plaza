package com.market_plaza.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;

@Entity
@Table(name = "compras")
public class Compra {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_cliente")
    private String idCliente;


    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String Comentario;
    private String estado;

    
}

