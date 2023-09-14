public class MetodosSobrecarga {
    public static void main(String[] args) throws Exception {
        // Declaro el objeto de la misma clase
        MetodosSobrecarga ms = new MetodosSobrecarga();
        
        // Llamo a metodos de la misma clase
        int res = ms.suma(3, 5);
        System.out.println(res);
        res = ms.suma(4, 7, 9);
        System.out.println(res);
        double resf = ms.suma(8, 9.9);
        System.out.println(resf);
    }

    // Creo el metodo suma con dos variables en los parametros(dos int)
    public int suma(int a, int b) {
        int res = a + b;
        return res;
    }

    // Creo el metodo suma con tres variables en los parametros
    public int suma(int a, int b, int c) {
        int res = a + b + c;
        return res;
    }

    // Creo el metodo suma con dos variables en los parametros(uno int y otro double)
    public double suma(int a, double d) {
        double res = a + d;
        return res;
    }
}