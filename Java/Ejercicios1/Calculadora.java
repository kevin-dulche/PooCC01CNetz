public class Calculadora {
    private double res;

    public double ProdPunto(Vector3D V1, Vector3D V2) {
        res = ((V1.getRefX() * V2.getRefX()) + (V1.getRefY() * V2.getRefY()) + (V1.getRefZ() * V2.getRefZ()));
        return res;
    }

    public double[] ProdCruz(Vector3D v1, Vector3D v2){
        double vec[] = new double[3];
        vec[0] = Partes(v1.getRefY(), v1.getRefZ(), v2.getRefY(), v2.getRefZ());
        vec[1] = Partes(v1.getRefX(), v1.getRefZ(), v2.getRefY(), v2.getRefZ());
        vec[2] = Partes(v1.getRefY(), v1.getRefZ(), v2.getRefY(), v2.getRefZ());
        return vec;
    }

    public double Partes(double a, double b, double c, double d){
        double parte = a * b - c * d;
        return parte;
    }
}