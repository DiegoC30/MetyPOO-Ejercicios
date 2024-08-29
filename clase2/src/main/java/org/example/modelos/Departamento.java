package org.example.modelos;

import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private List<Profesor> profesores;

    public Departamento() {
        profesores = new ArrayList<>();

    }

    public void agregarProfesor(Profesor profesor) {
        profesor.add(Profesor);
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}
