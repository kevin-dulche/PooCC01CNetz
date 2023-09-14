public class Estadistica {
    public static void main(String[] args) {
        // Declaro un objeto
        Estadistica e = new Estadistica();

        // Declarar un arreglo
        double []arreglo = {1.2, 2.4, 3.6, 4.8};
        
        // Accedo al metodo media
        double med = e.media(arreglo);
        System.out.println("La media es: " + med);
    }

    // Declaro el metodo media
    public double media(double[] vec) {
        double med, acum = 0;
        for (int index = 0; index < vec.length; index++) {
            acum = acum + vec[index];            
        }
        med = acum / vec.length;
        return med;
    }
}