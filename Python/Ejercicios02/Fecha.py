class Fecha:
    def __init__(self, dia = 0, mes = 0, año = 0):
        self.__dia = dia
        self.__mes = mes
        self.__año = año
        
    def setDia(self, dia):
        self.__dia = dia

    def getDia(self):
        return self.__dia
    
    def setMes(self, mes):
        self.__mes = mes

    def getMes(self):
        return self.__mes
    
    def setAño(self, año):
        self.__año = año
    
    def getAño(self):
        return self.__año