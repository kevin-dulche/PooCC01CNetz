class Domicilio:
    def __init__(self, calle=None, num=None, cp=None):
        # Constructor vacio
            # Atributos privados
        if calle is None and num is None and cp is None:
            self.__calle = calle
            self.__num = num
            self.__cp = cp
        else:
            # Constructor con parámetros
            self.__calle = calle
            self.__num = num
            self.__cp = cp
    
    def setCalle(self, calle):
        self.__calle = calle

    def getCalle(self):
        return self.__calle
    
    def setNum(self, num):
        self.__num = num

    def getNum(self):
        return self.__num
    
    def setCp(self, cp):
        self.__cp = cp

    def getCp(self):
        return self.__cp
    
    def imprimeDomicilio(self):
        print("Calle    : " + self.__calle)
        print("Numero   : " + self.__num)
        print("CP       : " + self.__cp)