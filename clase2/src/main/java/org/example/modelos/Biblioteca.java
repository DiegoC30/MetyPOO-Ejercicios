package org.example.modelos;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca {

    private List<Libro> libros = new ArrayList<>();

    // Metodo para agregar un libro a la biblioteca
    public void agregarLibro(String titulo) {
        libros.add(new Libro(titulo));
    }

    // Metodo para mostrar los libros en la biblioteca
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }

    // Clase interna no estática 
    private class Libro {
        private String titulo;

        public Libro(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }
    }
}

