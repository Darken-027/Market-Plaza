package com.market_plaza.persistence.entity;

import jakarta.persistence.Column;

import java.io.Serializable;

@Embedbable
public class ComprasProductoPK implements Serializable {

    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private Interger idProducto;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Interger getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Interger idProducto) {
        this.idProducto = idProducto;
    }
}
