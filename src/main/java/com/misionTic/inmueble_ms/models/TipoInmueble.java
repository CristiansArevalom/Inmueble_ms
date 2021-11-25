package com.misionTic.inmueble_ms.models;

import org.springframework.data.annotation.Id;


public class TipoInmueble {
    @Id
    private String id;
    private String nombre;
    private String descripcion;

    public TipoInmueble(String id, String nombre, String descripcion){
        this.id = id;
        this.nombre = nombre;
        this.descripcion=descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Descripcion) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return nombre;
    }

    public void setDescripcion(String Descripcion) {
        this.nombre = Descripcion;
    }

}
