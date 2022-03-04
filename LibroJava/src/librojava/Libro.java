/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojava;

/**
 * Una clase para saber los datos sobre libros, su autor, el número de ejemplares y los libros que son prestados.
 * @version 1.0 03/03/2022
 * @author diurno
 */
public class Libro {
     /**
     * Propiedades pertenecientes a un libro
     */
    
     private String titulo; // Título del libro.
    private String autor; // Autor del libro.
    private int ejemplares; // Ejemplares del libro.
    private int prestados; // Libros que han sido prestados.


    /**
     * Constructor por defecto de la clase
     */
    public Libro() {
    }
    
    
    /**
     * Constructor con parámetros de la clase 
     * @param titulo es el nombre del libro establecido mediante una cadena.
     * @param autor es el nombre de la persona que escribió el libro establecido mediante en una cadena.
     * @param ejemplares número de ejemplares que existen de un libro.
     * @param prestados número de libros que han sido prestados.
     */
    public Libro(String titulo, String autor, int ejemplares, int prestados) {                                    
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

   
    public String getAutor() {
        return autor;
    }

    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

   
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    
    public int getPrestados() {
        return prestados;
    }
    
    
    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    
    public String getTitulo() {
        return titulo;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public boolean prestamo() {
        boolean prestado = true;
        if (prestados < ejemplares) {
            prestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    
    public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }

    
    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor +
                  "\nejemplares: " + ejemplares + "\nprestados: " + prestados;                                    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
