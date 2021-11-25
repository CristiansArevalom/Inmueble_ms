package com.misionTic.inmueble_ms.models;
import org.springframework.data.annotation.Id;


public class Inmueble {
    @Id
    private String id; // es string porque es el que genera automaticamente mongoDB
    private Double m2;
    private Integer estrato;
    private String direccion;
    private Double precioXDia;
    private Integer numeroHabitaciones;
    private Integer numeroBaños;
    private Boolean cocina;
    private String estado;
    private Integer calificacion;
    private String descripcion;
    private String username;
    private String idTipoInmueble;
    private String urlImagen;

    //Constructor sin tener en cuenta la URL de la imagen
    public Inmueble(String id, Double m2, Integer estrato, String direccion, Double precioXDia, Integer numeroHabitaciones, boolean cocina, String estado, Integer calificacion, String descripcion, String username, String idTipoInmueble) {
        this.id = id;
        this.m2 = m2;
        this.estrato = estrato;
        this.direccion = direccion;
        this.precioXDia = precioXDia;
        this.numeroHabitaciones = numeroHabitaciones;
        this.cocina = cocina;
        this.estado = estado;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
        this.idTipoInmueble = idTipoInmueble;
        this.username = username;

    }

    public Inmueble(String id, Double m2, Integer estrato, String direccion, Double precioXDia,Integer numeroHabitaciones, boolean cocina, String estado, Integer calificacion, String descripcion, String username, String idTipoInmueble, String urlImagen) {
        this.id = id;
        this.m2 = m2;
        this.estrato = estrato;
        this.direccion = direccion;
        this.precioXDia = precioXDia;
        this.numeroHabitaciones = numeroHabitaciones;
        this.cocina = cocina;
        this.estado = estado;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
        this.username = username;
        this.idTipoInmueble = idTipoInmueble;
        this.urlImagen = urlImagen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getM2() {
        return m2;
    }

    public void setM2(Double m2) {
        this.m2 = m2;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getPrecioXDia() {
        return precioXDia;
    }

    public void setPrecioXDia(Double precioXDia) {
        this.precioXDia = precioXDia;
    }

    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Integer getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(Integer numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

    public Boolean getCocina() {
        return cocina;
    }

    public void setCocina(Boolean cocina) {
        this.cocina = cocina;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdTipoInmueble() {
        return idTipoInmueble;
    }

    public void setIdTipoInmueble(String idTipoInmueble) {
        this.idTipoInmueble = idTipoInmueble;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}
