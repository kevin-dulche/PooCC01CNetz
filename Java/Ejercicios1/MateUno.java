public class MateUno {
    public static void main(String[] args) throws Exception {
        double res;
        double vec[] = new double[3];
        Vector3D v1 = new Vector3D();
        v1.setRefX(3);
        v1.setRefY(5);
        v1.setRefZ(2);

        System.out.println("Componente X: " + v1.getRefX());
        System.out.println("Componente Y: " + v1.getRefY());
        System.out.println("Componente Z: " + v1.getRefZ());

        Vector3D v2 = new Vector3D(2, 3, 4);
        System.out.println("\nComponente X: " + v2.getRefX());
        System.out.println("Componente Y: " + v2.getRefY());
        System.out.println("Componente Z: " + v2.getRefZ());

        Calculadora v3 = new Calculadora();

        res = v3.ProdPunto(v1, v2);
        System.out.println("Resultado de producto punto: " + res);
        vec = v3.ProdCruz(v1, v2);
        System.out.println("Resultado de producto cruz: i(" + vec[0] + ") + j(" + vec[1] + ") + k(" + vec[2] + ")");
    }
}   