package org.example;

import org.example.modelos.Curso;
import org.example.modelos.Departamento;
import org.example.modelos.Profesor;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Curso curso =new Curso(  "Metodologia y POO");
        Profesor dimitrick =new Profesor("dimitrick navarro");
        dimitrick.enseñar(curso);
        departamento fia =new Departamento();
        fia.setNombre("FIA");
        Profesor ivan =new Profesor("ivan arguello");
        fia.agregarProfesor(ivan);
        fia.agregarProgesor(dimitrick);
        System.out.println(fia.getnombre());
        for(Profesor doc : fia.getProfesors())
            System.out.println(doc.getNombre());


}
