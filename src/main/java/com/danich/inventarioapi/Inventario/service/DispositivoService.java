package com.danich.inventarioapi.Inventario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danich.inventarioapi.Inventario.model.Dispositivo;
import com.danich.inventarioapi.Inventario.repository.DispositivoRepository;

import java.util.Optional;

@Service
public class DispositivoService {
    @Autowired
    private DispositivoRepository dispositivoRepository;

    public Optional<Dispositivo> obtenerDispositivoPorNumeroInventario(String numeroInventario) {
        return dispositivoRepository.findById(numeroInventario);
    }
}
