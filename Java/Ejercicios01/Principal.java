public class Principal {
    public static void main(String[] args) throws Exception {
        // Creacion del objeto

        // Estructura
        // tipoDeObjeto nombreObjeto = new tipoDeObjeto()
        MiObjeto obj = new MiObjeto();

        //Acceso a los datos del objeto creado
        obj.valor = 10;
        obj.cantidad = 3.14;

        // Imprimo datos del objeto
        System.out.println("Valor de mi objeto es: " + obj.valor);
        System.out.println("Cantidad de mi objeto es: " + obj.cantidad);
        
        // LLamo al metodo miMetodo
        obj.miMetodo("Hola K ase");
    }
}
