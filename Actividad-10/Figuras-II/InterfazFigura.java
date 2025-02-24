interface InterfazFigura {
    
    void dibujar(); // Método abstracto
    
    /* Y aquí si podemos usar la implementación determinada */
    default void mostrarInfo() { // Implementación predeterminada
        System.out.println("Esto es una figura");
    }
}
