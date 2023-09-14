class Complejo:
    def __init__(self, real = None, imaginario = None):
        if real is None and imaginario is None:
            self.__real = None
            self.__imaginario = None
        else:
            self.__real = real
            self.__imaginario = imaginario

    def setReal(self, real):
        self.__real = real
    
    def getReal(self):
        return self.__real

    def setImaginario(self, imaginario):
        self.__imaginario = imaginario

    def getImaginario(self):
        return self.__imaginario
    
    def suma(self, otroComplejo):
        resultadoReal = self.__real + otroComplejo.__real
        resultadoImaginario = self.__imaginario + otroComplejo.__imaginario
        return Complejo(resultadoReal, resultadoImaginario)
    
    def resta(self, otroComplejo):
        resultadoReal = self.__real - otroComplejo.__real
        resultadoImaginario = self.__imaginario - otroComplejo.__imaginario
        return Complejo(resultadoReal, resultadoImaginario)
    
    def modulo(self):
        if self.__imaginario >= 0:
            return f"{self.__real} + {self.__imaginario}i"
        else:
            return f"{self.__real} - {abs(self.__imaginario)}i"