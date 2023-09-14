public class MiNegocioLibros {
    public static void main(String[] args) {
        Libro lib = new Libro();
        lib.setIsbn("ABC123HDF");
        lib.setTitulo("Calculo Diferencial");
        lib.setAutor("Netz Romero");
        // Visualiza los atributos con el metodo imprimirAtributos
        lib.imprimirAtributos();
        // Visualiza los atributos con los getters
        System.out.println("ISBN    : " + lib.getIsbn());
        System.out.println("Titulo  : " + lib.getTitulo());
        System.out.println("Autor   : " + lib.getAutor());
    }
}