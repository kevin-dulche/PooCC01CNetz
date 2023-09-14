from Date import *
class Empleado:
    def __init__(self, name = None, salary = None, fecNac = None):
        if name is None and salary is None and fecNac is None:
            self.__name = None
            self.__salary = None
            self.__fecNac = None
        else:
            self.__name = name
            self.__salary = salary
            self.__fecNac = fecNac
    
    def setName(self, name):
        self.__name = name

    def getName(self):
        return self.__name
    
    def setSalary(self, salary):
        self.__salary = salary

    def getSalary(self):
        return self.__salary
    
    def setFecNac(self, fecNac):
        self.__fecNac = fecNac

    def getFecNac(self):
        return self.__fecNac
    
    def calcularQuincena(self):
        return self.__salary * 15