package com.example.lab1.entity;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public Integer nroPedido;
    public String tipoServicio;
    public String nombreCliente;
    public Integer tiempoEstimado;
    public List<Platos> platos;
    public String estado;

    public Pedido(Integer nroPedido, String tipoServicio, String nombreCliente, Integer tiempoEstimado, List<Platos> platos,  String estado) {
        this.nroPedido = nroPedido;
        this.tipoServicio = tipoServicio;
        this.nombreCliente = nombreCliente;
        this.tiempoEstimado = tiempoEstimado;
        this.platos = new ArrayList<>();
        this.estado = estado;
    }
}
