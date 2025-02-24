abstract class Figura {
    abstract void dibujar(); // Método abstracto
    
    //Esto genera error de compilación
     default void mostrarInfo() { // Método concreto
        System.out.println("Esto es una figura");
    }

    /* NO ES LA MEJOR ALTERNATIVA PARA AGREGAR UN MÉTODO PREDETERMINADO, PARA
     * ESTO ES MEJOR LA INTERFAZ
     */
}

