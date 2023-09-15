package Examen2Java;

public class CentroVacacional {
    public static void main(String[] args) {
        // a)
        PersonalAlojamineto pa1 = new PersonalAlojamineto("Kevin", new Fecha(14, 7, 2020), 123 , 1234);
        // b)
        PersonalAlojamineto pa2 = new PersonalAlojamineto();
        pa2.setNombre("Leonardo");
        pa2.setFechaIngresoC(new Fecha(19, 3, 2021));
        pa2.setIdPersonal(456);
        pa2.setSalarioSem(1234);
        System.out.println("Nombre de pa2           : "+ pa2.getNombre());
        System.out.println("Fecha de Ingreso de pa2 : "+ pa2.getFechaIngresoC().getDia() + "/" + pa2.getFechaIngresoC().getMes() + "/" + pa2.getFechaIngresoC().getAño());
        System.out.println("IdPersonal de pa2       : " + pa2.getIdPersonal());
        System.out.println("Salario semanal de pa2  : " + pa2.getSalarioSem());

        // c)
        PersonasCentroVac[] pcv = new PersonasCentroVac[3];
        pcv[0] = new PersonasCentroVac("Julio", new Fecha(1, 2, 2015));
        pcv[1] = new PersonasCentroVac("Ezequiel", new Fecha(2, 3, 2018));
        pcv[2] = new PersonasCentroVac("Mario", new Fecha(3, 4, 2022));

    }

    // d)
    public static void imprimeAtributos(PersonasCentroVac[] psv){
        for (PersonasCentroVac personas : psv) {
            System.out.println("*********************************");
            System.out.println("Nombre                  : " + personas.getNombre());
            System.out.println("Dia de Ingreso          : " + personas.getFechaIngresoC().getDia() + "/" + personas.getFechaIngresoC().getMes() + "/" + personas.getFechaIngresoC().getAño());
        }
    }

    // El inciso e) estará en el README.md
}