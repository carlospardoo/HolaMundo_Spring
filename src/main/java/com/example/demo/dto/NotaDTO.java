package com.example.demo.dto;

import com.example.demo.model.Nota;

public class NotaDTO {
    private String titulo;

    private String contenido;

    

    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getContenido() {
        return contenido;
    }



    public void setContenido(String contenido) {
        this.contenido = contenido;
    }



    public Nota getNota(){
        Nota nota = new Nota();
        nota.setTitulo(this.titulo);
        nota.setContenido(this.contenido);

        return nota;
    }
}
