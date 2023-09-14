import math
class Polinomio:
    def __init__(self, coeficientes = None):
        if coeficientes is None:
            self.__coeficientes = None
        elif len(coeficientes) != 3:
            raise ValueError("Se requieren exactamente tres coeficientes (a, b, c)")
        else:
            self.__coeficientes = coeficientes
    
    def setCoeficientes(self, coeficientes):
        if len(coeficientes) != 3:
            raise ValueError("Se requieren exactamente tres coeficientes (a, b, c)")
        self.__coeficientes = coeficientes
        pass

    def getCoeficientes(self):
        return self.__coeficientes

    def __str__(self):
        a, b, c = self.__coeficientes
        return f"{a}x^2 + {b}x + {c}"
    
    def suma(self, otroPolinomio):
        # Validamos que sea un polinomio el objeto recibido
        if not isinstance(otroPolinomio, Polinomio):
            raise ValueError("El segundo objeto debe ser un Polinomio")
        suma_coeficientes = [self.__coeficientes[0] + otroPolinomio.__coeficientes[0], self.__coeficientes[1] + otroPolinomio.__coeficientes[1], self.__coeficientes[2] + otroPolinomio.__coeficientes[2]]
        return Polinomio(suma_coeficientes)
    
    def evaluarPolinomio(self, x):
        a, b, c = self.__coeficientes
        return a * x**2 + b * x + c
    
    def calcular_raices(self):
        a, b, c = self.__coeficientes
        discriminante = b**2 - 4*a*c
    
        if discriminante > 0:
            x1 = (-b + math.sqrt(discriminante)) / (2*a)
            x2 = (-b - math.sqrt(discriminante)) / (2*a)
            return (x1, x2)
        elif discriminante == 0:
            x = -b / (2*a)
            return (x)
        else:
            return ("-No tiene raices")