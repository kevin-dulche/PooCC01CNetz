from Empleado import *
class Licenciado(Empleado):
    def __init__(self, nombre = str, salario = float, fecNac = Fecha, depto = str):
        super().__init__(nombre, salario, fecNac)
        self.__depto = depto

    
    def setDepto(self, depto):
        self.__depto = depto

    def getDepto(self):
        return self.__depto
    
    def calcQuincena(self):
        return super().calcQuincena()