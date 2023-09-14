from Libro import *
class MiNegocioLibros:
    def main():
        lib = Libro()
        lib.setIsbn("ABC123HDF")
        lib.setTitulo("Calculo Diferencial")
        lib.setAutor("Netz Romero")
        # Visualiza los atributos con el metodo imprimirAtributos
        lib.imprimirAtributos()
        # Visualiza los atributos con los getters
        print("ISBN    : " + lib.getIsbn())
        print("Titulo  : " + lib.getTitulo())
        print("Autor   : " + lib.getAutor())
    
    main()