import java.util.Scanner;

public class PrincipalDos {
    public Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        PrincipalDos pd = new PrincipalDos();
        Fecha[] fs = new Fecha[3];
        pd.inicializaFechas(fs);
        System.out.println("Mes: " + fs[2].getMes());
    }

    public void inicializaFechas(Fecha[] fs){
        for (int i = 0; i < fs.length; i++) {
            Fecha f = new Fecha();
            System.out.print("Dame el dia: ");
            int dia = teclado.nextInt();
            f.setDia(dia);
            System.out.print("Dame el mes: ");
            int mes = teclado.nextInt();
            f.setMes(mes);
            System.out.print("Dame el anio: ");
            int anio = teclado.nextInt();
            f.setAnio(anio);
            fs[i] = f;
        }
    }

    public Fecha[] regresaFechas(){
        Fecha[] fs = (new Fecha(1, 1, 2001), new Fecha(2, 2, 2000), new Fecha(3, 3, 1999));
        return fs;
    }
}