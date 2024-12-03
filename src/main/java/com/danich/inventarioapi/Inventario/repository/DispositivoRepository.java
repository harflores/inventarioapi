package com.danich.inventarioapi.Inventario.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danich.inventarioapi.Inventario.model.Dispositivo;

@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo, String> {
    // Método de consulta personalizado si es necesario
}