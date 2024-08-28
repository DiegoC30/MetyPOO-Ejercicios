package org.example;

public class Estudiante {
    // Atributos
    String nombre;
    String apellido;
    int edad;
    String asignatura;
    int corte1;
    int corte2;
    int corte3;


    public double obtenerNotaFinal() {
        return (corte1 + corte2 + corte3) / 3.0;
    }


    public String evaluarNotaFinal() {
        double notaFinal = obtenerNotaFinal();
        if (notaFinal <= 70) {
            return "Reprobado";
        } else {
            return "Aprobado";
        }
    }


    public boolean evaluarConvocatoria() {
        return obtenerNotaFinal() > 70;
    }


    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Corte 1: " + corte1);
        System.out.println("Corte 2: " + corte2);
        System.out.println("Corte 3: " + corte3);
        System.out.println("Nota Final: " + obtenerNotaFinal());
        System.out.println("Evaluación: " + evaluarNotaFinal());
    }


    public static void main(String[] args) {
        // Crear una instancia de Estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Diego";
        estudiante.apellido = "Caceres";
        estudiante.edad = 20;
        estudiante.asignatura = "Programacion Orientado a Objetos";
        estudiante.corte1 = 80;
        estudiante.corte2 = 75;
        estudiante.corte3 = 90;


        estudiante.mostrarInformacion();


        if (estudiante.evaluarConvocatoria()) {
            System.out.println("El estudiante pasa a la convocatoria.");
        } else {
            System.out.println("El estudiante no pasa a la convocatoria.");
        }
    }
}
