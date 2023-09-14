from Ciudadano import *
class Ciudad:
    def main():
        dom = Domicilio()
        dom.setCalle("Av. monte de las cruces")
        dom.setNum(14)
        dom.setCp(5760)

        print("Calle   : " + dom.getCalle())
        print("Numero  : " + str(dom.getNum()))
        print("CP      : " + str(dom.getCp()))

        c1 = Ciudadano()
        c1.setNombre("Alejandra")
        c1.setDomicilio(dom)

        print("\nNombre  : " + c1.getNombre())
        print("Calle   : " + c1.getDomicilio().getCalle())
        print("Numero  : " + str(c1.getDomicilio().getNum()))
        print("CP      : " + str(c1.getDomicilio().getCp()))


    main()