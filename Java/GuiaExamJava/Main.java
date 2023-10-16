import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        est1.setNombre("Jose");
        est1.setEdad(25);
        est1.setNoId(123);
        est1.mostrarInformacion();
        est1.actualizarEdad(22);
        est1.mostrarInformacion();

        EstudianteGraduado EstGrad = new EstudianteGraduado("Pedro", 28, 456, "Ingeniero en Computacion", 2015);


        List objetos = new ArrayList();
        objetos.add(est1);
        objetos.add(EstGrad);
        System.out.println(objetos);

        Estudiante e1 = (Estudiante) objetos.get(0);
        e1.mostrarInformacion();

        EstudianteGraduado EG1 = (EstudianteGraduado) objetos.get(1);
        EG1.mostrarInformacion(false);

        try {
            int numero = 9/0;
            System.out.println(numero);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        try {
            int entFalla = (int) objetos.get(3);
            System.out.println(entFalla);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        } finally {
            System.out.println("La parte de excepciones termina aqui");
        }

        FileOutputStream archivoSalida;
        ObjectOutputStream objetoSalida;
        String nombreArchivo = "./archivoPersona.dat";

        try {
            archivoSalida = new FileOutputStream(nombreArchivo);
            objetoSalida = new ObjectOutputStream(archivoSalida);
            // cargo los objetos
            objetoSalida.writeObject(est1);
            objetoSalida.writeObject(EstGrad);
            objetoSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException e) {
            System.out.println("Error IOExcepcion: " + e.getMessage());
        }

        FileInputStream archivoEntrada;
        ObjectInputStream objetoEntrada;
        String nombreArchivo1 = "./archivoPersona.dat";

        try {
            archivoEntrada = new FileInputStream(nombreArchivo1);
            objetoEntrada = new ObjectInputStream(archivoEntrada);
            Estudiante a = (Estudiante)objetoEntrada.readObject();
            EstudianteGraduado b = (EstudianteGraduado)objetoEntrada.readObject();
            objetoEntrada.close();
            a.mostrarInformacion();
            b.mostrarInformacion(true);
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }
    }
}