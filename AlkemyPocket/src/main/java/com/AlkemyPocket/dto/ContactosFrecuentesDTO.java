package com.AlkemyPocket.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public class ContactosFrecuentesDTO {

    @Schema(example = "juan.perez")
    private String alias;

    @Schema(example = "0001234500001234567890")
    private String cvu;

    @Schema(example = "Juan")
    private String nombre;

    @Schema(example = "Pérez")
    private String apellido;

    public ContactosFrecuentesDTO(String alias, String cvu, String nombre, String apellido) {
        this.alias = alias;
        this.cvu = cvu;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y setters

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCvu() {
        return cvu;
    }

    public void setCvu(String cvu) {
        this.cvu = cvu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
