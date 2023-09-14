from Empleado import *

class MiNegocio:
    # Declaro un nuevo objeto
    e1 = Empleado()

    # Inicializo sus variables
    e1.nombre = "Juan"
    e1.edad = 33
    e1.salario = 128.13

    # Imprimo los datos
    print("Su nombre es: " + str(e1.nombre))
    print("Su edad es: " + str(e1.edad))
    print("Su salario es: " + str(e1.salario))

    # Llamo al metodo calculaISR
    isr = e1.calculaISR()
    print("Su isr es: " + str(isr))

    # Declaro un nuevo objeto
    e1 = Empleado()

    # Inicializo sus variables
    e1.nombre = "Karla"
    e1.edad = 38
    e1.salario = 359.14

    # Imprimo los datos
    print("Su nombre es: " + str(e1.nombre))
    print("Su edad es: " + str(e1.edad))
    print("Su salario es: " + str(e1.salario))

    # Llamo al metodo calculaISR
    isr = e1.calculaISR()
    print("Su isr es: " + str(isr))