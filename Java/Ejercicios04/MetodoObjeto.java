public class MetodoObjeto {
    public static void main(String[] args) {
        // Creo el objeto de su misma clase
        MetodoObjeto mo = new MetodoObjeto();
        
        // Creo objeto
        Celular c = new Celular();
        c.modelo = ("jaguei");
        c.activo = true;
        mo.recibeCelular(c);
    }

    public void recibeCelular(Celular c) {
        System.out.println("Modelo   : " + c.modelo);
        System.out.println("Precio   : " + c.precio);
        System.out.println("Activado : " + c.activo);
    }
}
