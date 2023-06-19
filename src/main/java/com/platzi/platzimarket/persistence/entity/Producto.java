package com.platzi.platzimarket.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    //Sin cambiar nombre
    private String nombre;
    private Boolean estado;
    //Modificando el nombre en la DB
    //anadimos el @Id debido a que es la clave primaria de la tabla
    @Id
    //anadimos que se autogenere el valor debido a que es el id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //el column significa que el nombre verdadero va alli en esa columna y el de la variable es mejor nombrado con buena practica
    @Column(name = "id_producto")
    private Integer idProducto;
    @Column(name = "id_categoria")
    private Integer idCategoria;
    @Column(name = "codigo_barras")
    private String codigoBarras;
    @Column(name = "precio_venta")
    private Double precioVenta;
    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    @ManyToOne
    @JoinColumn(name = "id_categoria",insertable = false,updatable = false)
    private Categoria categoria;

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }



    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
