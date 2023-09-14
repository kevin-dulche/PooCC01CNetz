public class Ciudad{
    public static void main(String[] args) {
        Domicilio dom = new Domicilio();
        dom.setCalle("Av. monte de las cruces");
        dom.setNum(14);
        dom.setCp(5760);

        System.out.println("Calle   : " + dom.getCalle());
        System.out.println("Numero  : " + dom.getNum());
        System.out.println("CP      : " + dom.getCp());

        Ciudadano c1 = new Ciudadano();
        c1.setNombre("Alejandra");
        c1.setDomicilio(dom);

        System.out.println("\nNombre  : " + c1.getNombre());
        System.out.println("Calle   : " + c1.getDomicilio().getCalle());
        System.out.println("Numero  : " + c1.getDomicilio().getNum());
        System.out.println("CP      : " + c1.getDomicilio().getCp());
    }
}