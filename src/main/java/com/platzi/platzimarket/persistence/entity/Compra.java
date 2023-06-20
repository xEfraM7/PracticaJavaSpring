package com.platzi.platzimarket.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {
    //sin modificar nombre
    private LocalDateTime fecha;
    private String estado;
    private String comentario;

    //modificando el nombre
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;
    @Column(name = "id_cliente")
    private String idCliente;
    @Column(name = "medio_pago")
    private String medioPago;

    @ManyToOne
    @JoinColumn(name = "id_cliente", updatable = false, insertable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "compra", cascade = {CascadeType.ALL})
    private List<ComprasProducto> productos;


    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ComprasProducto> getProductos() {
        return productos;
    }

    public void setProductos(List<ComprasProducto> productos) {
        this.productos = productos;
    }
}
