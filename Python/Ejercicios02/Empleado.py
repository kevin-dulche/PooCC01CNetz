from Fecha import *
class Empleado:
    def __init__(self, nombre = str, salario = float, fecNac = Fecha):
        self.__nombre = nombre
        self.__salario = salario
        self.__fecNac = fecNac

    def setNombre(self, nombre):
        self.__nombre = nombre

    def getNombre(self):
        return self.__nombre
    
    def setSalario(self, salario):
        self.__salario = salario

    def getSalario(self):
        return self.__salario
    
    def setFecNac(self, fecNac):
        self.__fecNac = fecNac

    def getFecNac(self):
        return self.__fecNac
    
    def calcQuincena(self):
        return self.__salario * 15