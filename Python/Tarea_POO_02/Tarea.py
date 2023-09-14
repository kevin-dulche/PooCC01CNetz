from Punto import *
from Fecha import *
from Complejo import *
from Polinomio import *
from Rectangulo import *

from time import sleep

import os

class Tarea:
    def main(self):
        while True:
            os.system('cls')
            print("Menu")
            print("1. Coordenadas Cartesianas y polares")
            print("2. Fecha")
            print("3. Numeros Complejos")
            print("4. Suma de polinomios (grado dos)")
            print("5. Rectangulos")
            print("6. Salir")
            opcion = int(input("\nIngrese la opcion deseada: "))
            self.menu(opcion)
            
    def menu(self, opcion):
        match opcion:
            case 1:
                self.coordenadas()
                sleep(5)
            case 2:
                self.fecha()
                sleep(5)
            case 3:
                self.complejo()
                sleep(5)
            case 4:
                self.polinomio()
                sleep(5)
            case 5:
                self.rectangulo()
                sleep(5)
            case 6:
                os.system('cls')
                i = 0
                while i < 4:
                    print("Fin del programa")
                    print("Saliendo", end="")
                    for j in range(i):
                        print(".", end="")
                    sleep(1)
                    os.system('cls')
                    i += 1
                exit()
            case _:
                print("Respuesta invalida")
                sleep(5)

    def coordenadas(self):
        puntos = Punto()
        x = float(input("Dame el valor de la coordenada X: "))
        puntos.setCoorX(x)
        y = float(input("Dame el valor de la coordenada Y: "))
        puntos.setCoorY(y)
        print("Coordenadas cartesinas: " + puntos.to_string_cartesianas())
        print("Coordenadas polares: " + puntos.to_string_polares())
    
    def fecha(self):
        fecha = Fecha()
        print("Ingresaras una fecha DD MM AAAA")
        dia = input("Ingresa el dia(DD): ")
        mes = input("Ingresa el mes(MM): ")
        año = input("Ingresa el año(AAAA): ")
        fecha.setDia(dia)
        fecha.setMes(mes)
        fecha.setAño(año)
        print("Fecha abreviada: " + fecha.fechaCorta())
        print("Fecha extendida: " + fecha.fechaLarga())

    def complejo(self):
        complejo1 = Complejo()
        complejo1.setReal(int(input("Ingresa la parte real del primer numero complejo: ")))
        complejo1.setImaginario(int(input("Ingresa la parte imaginaria del primer numero complejo: ")))
        complejo2 = Complejo(int(input("Ingresa la parte real del segundo numero complejo: ")), int(input("Ingresa la parte imaginaria del segundo numero complejo: ")))
        complejoResultadoSuma1 = complejo1.suma(complejo2)
        complejoResultadoResta1 = complejo1.resta(complejo2)
        complejoResultadoModulo1 = complejo1.modulo()
        complejoResultadoModulo2 = complejo2.modulo()

        print("Complejo 1: " + "(" + str(complejo1.getReal()) + ", " + str(complejo1.getImaginario()) + "i)")
        print(f"Complejo 2: ({complejo2.getReal()}, {complejo2.getImaginario()}i)")
        print(f"Resultado de suma de Complejo 1 + Complejo 2: ({complejoResultadoSuma1.getReal()}, {complejoResultadoSuma1.getImaginario()}i)")
        print(f"Resultado de resta de Complejo 1 - Complejo 2: ({complejoResultadoResta1.getReal()}, {complejoResultadoResta1.getImaginario()}i)")
        print(f"Resultado del modulo de Complejo 1: {complejoResultadoModulo1}")
        print(f"Resultado del modulo de Complejo 2: {complejoResultadoModulo2}")

    def polinomio(self):
        pol1 = Polinomio([6,4,2])
        pol2 = Polinomio()
        coef = []
        for i in range(2, -1, -1):
            coef.append(int(input(f"Ingresa el coeficiente de grado{i}: ")))
        pol2.setCoeficientes(coef)
        print("Polinomio 1: " + str(pol1))
        print("Polinomio 2: " + str(pol2))
        polResultado = pol1.suma(pol2)
        print("La suma de los polinomios es: " + str(polResultado))
        x = int(input("Ingrese el valor con el cual evaluar el polinomio 2: "))
        resultado = pol2.evaluarPolinomio(x)
        print(f"El resultado de la evaluacion de: {pol2} con {x} es: {resultado}")
        print("Sus raices del polinomio 2 son: " + str(pol2.calcular_raices()))

    def rectangulo(self):
        x = int(input("Ingresa el valor de x para el punto 1(inf.izq.): "))
        y = int(input("Ingresa el valor de y para el punto 1(inf.izq.): "))
        v1 = (x, y)

        x = int(input("Ingresa el valor de x para el punto 2(inf.der.): "))
        v2 = (x, y)

        y = int(input("Ingresa el valor de y para el punto 3(sup.der.): "))
        v3 = (x, y)

        x = v1[0]
        v4 = (x, y)

        rectangulo1 = Rectangulo(v1, v2, v3, v4)
        print(f"El area del rectangulo es: {rectangulo1.area()}")
        x = int(input("Ingresa el valor a recorrer en x el rectangulo: "))
        y = int(input("Ingresa el valor a recorrer en y el rectangulo: "))
        rectangulo1.desplazar(x, y)
        print(rectangulo1)

        print("Desde el centro con esquina en (5, 2)")
        rectangulo2 = Rectangulo.desde_base_altura(5, 2)
        print(f"El area del rectangulo es: {rectangulo2.area()}")
        print("Desplazado en (1,1)")
        rectangulo2.desplazar(1, 1)
        print(rectangulo2)

# Intanciamos la clase Tarea y llamamos al metodo main
tarea = Tarea()
tarea.main()