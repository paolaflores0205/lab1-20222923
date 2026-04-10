package com.example.lab1.controller;

import com.example.lab1.entity.Pedido;
import com.example.lab1.entity.Platos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class PedidoController {
    List<Pedido> pedidos = new ArrayList<>();

    @GetMapping("/crear")
    public String crearPedido(Model model){
        Platos p1 = new Platos("Ensalada César", 12.5, 10,"Entrada");
        Platos p2 = new Platos("Sopa de Verduras", 9.0, 8,"Entrada");
        Platos p3 = new Platos("Lomo Saltado", 25.0, 20,"Plato Principal");
        Platos p4 = new Platos("Arroz Chaufa", 18.5, 15,"Plato Principal");
        Platos p5 = new Platos("Limonada", 6.0, 3,"Bebida");

        List<Platos> platos = new ArrayList<>();
        platos.add(p1);
        platos.add(p2);
        platos.add(p3);
        platos.add(p4);
        platos.add(p5);

        List<String> tipos = new ArrayList<>();
        tipos.add("PARA_LLEVAR");
        tipos.add("EN_MESA");

        model.addAttribute("platos", platos);
        model.addAttribute("tipos", tipos);
        return "crearPedido";

    }

    @PostMapping("/guardarPedido")
    public String guardarPedido(Model model, @RequestParam("codigo") int codigo,
                                @RequestParam("nombreCliente") String nombreCliente,
                                @RequestParam("servicio") String servicio,
                                @RequestParam("platos") List<Platos> platos){
        Integer tiempoEstimado = 0;
        for (Platos p : platos) {
            tiempoEstimado = tiempoEstimado + p.tiempoPrep;
        }
        Pedido pedido = new Pedido(codigo, nombreCliente, servicio, tiempoEstimado,platos,"Creado");
        pedidos.add(pedido);
        model.addAttribute("pedido", pedido);
        model.addAttribute("platos", platos);
        return "resumen";


    }

    @GetMapping("/historialPedidos")
    public String historialPedidos(Model model, Pedido pedido){
        ArrayList<Pedido> pedidos = new ArrayList<>();


    }
    @GetMapping("/resumen")
    public String resumen(Model model, @RequestParam("codigo") int codigo){

        return "resumen";

    }


}
