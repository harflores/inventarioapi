package com.danich.inventarioapi.Inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danich.inventarioapi.Inventario.model.Dispositivo;
import com.danich.inventarioapi.Inventario.service.DispositivoService;

@RestController
@RequestMapping("/api/inventario")
public class DispositivoController {
    @Autowired
    private DispositivoService dispositivoService;

    @GetMapping("/dispositivo/{numeroInventario}")
    public ResponseEntity<Dispositivo> obtenerDispositivo(@PathVariable String numeroInventario) {
        return dispositivoService.obtenerDispositivoPorNumeroInventario(numeroInventario)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
