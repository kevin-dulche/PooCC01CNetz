from Licenciado import *
class Empresa:
    def main(self):
        # Crea un objeto de tipo Fecha
        f1 = Fecha(14,2,2023)
        # Crea un objeto de tipo Empleado
        e1 = Empleado("Goku", 5600, f1)
        # Crea un objeto de tipo Licenciado
        l1 = Licenciado()
        l1.setNombre("Daniel")
        l1.setSalario(15000)
        l1.setFecNac(Fecha(28,2,2003))
        l1.setDepto("ventas")

        l2 = Licenciado("Marcos", 15000, Fecha(14,3,2000), "conta")

        print("********** Consulta del Emp **********")
        print("Nombre  : " + e1.getNombre())
        print("Salario : " + str(e1.getSalario()))
        print("F day   : " + str(e1.getFecNac().getDia()))
        print("F mounth: " + str(e1.getFecNac().getMes()))
        print("F year  : " + str(e1.getFecNac().getAño()))
        print("Paga    : " + str(e1.calcQuincena()))

        print("********** Consulta del Lic **********")
        print("Nombre  : " + l1.getNombre())
        print("Salario : " + str(l1.getSalario()))
        print("F dia   : " + str(l1.getFecNac().getDia()))
        print("F mes   : " + str(l1.getFecNac().getMes()))
        print("F año   : " + str(l1.getFecNac().getAño()))
        print("Depto   : " + l1.getDepto())
        print("Paga    : " + str(l1.calcQuincena()))

        print("********** Consulta del Lic **********")
        print("Nombre  : " + l2.getNombre())
        print("Salario : " + str(l2.getSalario()))
        print("F dia   : " + str(l2.getFecNac().getDia()))
        print("F mes   : " + str(l2.getFecNac().getMes()))
        print("F año   : " + str(l2.getFecNac().getAño()))
        print("Depto   : " + l2.getDepto())
        print("Paga    : " + str(l2.calcQuincena()))

prueba = Empresa()
prueba.main()