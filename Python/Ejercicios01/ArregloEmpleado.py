from Empleado import *
from Date import *

class ArregloEmpleado:
    def main(self):

        emps = [None] * 3

        emp1 = Empleado("Kevin", float(430), Date(12,8,2003))

        emp2 = Empleado()
        emp2.setName("Uriel")
        emp2.setSalary(float(340))
        emp2.setFecNac(Date(8,12,2005))

        emps[0] = emp1

        emps[1] = emp2

        emp3 = Empleado("Javier", float(380), Date(29, 3, 1982))
        emps[2] = emp3

        for empleado in emps:
            print("**************************************************")
            print("Nombre              : " + empleado.getName())
            print("Salario             : " + str(empleado.getSalary()))
            print("Fecha de Nacimiento : " + str(empleado.getFecNac().getDay())+ "/" + str(empleado.getFecNac().getMounth()) + "/" + str(empleado.getFecNac().getYear()))
            print("Quincena            : " + str(empleado.calcularQuincena()))

clase = ArregloEmpleado()
clase.main()