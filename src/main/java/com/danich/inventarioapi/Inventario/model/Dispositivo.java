package com.danich.inventarioapi.Inventario.model;
import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Dispositivos")
@Getter
@Setter
public class Dispositivo {
    @Id
    @Column(name = "numero_inventario")
    private String numeroInventario;

    @Column(name = "tipo_dispositivo")
    private String tipoDispositivo;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "numero_serie")
    private String numeroSerie;

    @Column(name = "sistema_operativo")
    private String sistemaOperativo;

    @Column(name = "procesador")
    private String procesador;

    @Column(name = "ram")
    private String ram;

    @Column(name = "fecha_adquisicion")
    private LocalDate fechaAdquisicion;

    @Column(name = "fecha_garantia_hasta")
    private LocalDate fechaGarantiahasta;

    @Column(name = "estado_actual")
    private String estadoActual;

    @Column(name = "ubicacion_fisica")
    private String ubicacionFisica;

    @Column(name = "fecha_ultimo_mantenimiento")
    private LocalDate fechaUltimoMantenimiento;

    @Column(name = "fecha_proximo_mantenimiento")
    private LocalDate fechaProximoMantenimiento;

    // Getters y Setters
    public String getNumeroInventario() {
        return numeroInventario;
    }

    public void setNumeroInventario(String numeroInventario) {
        this.numeroInventario = numeroInventario;
    }

    // (Continúan los getters y setters para todos los campos)
}