import math

class Punto:
    def __init__(self, coorX = None, coorY = None):
        # Constructor vacio
        if coorX is None and coorY is None:
            self.__coordenadaX = None
            self.__coordenadaY = None
        else:
            # Constructor con parametros
            self.__coordenadaX = coorX
            self.__coordenadaY = coorY

    def setCoorX(self, coorX):
        self.__coordenadaX = coorX

    def getCoorX(self):
        return self.__coordenadaX

    def setCoorY(self, coorY):
        self.__coordenadaY = coorY

    def getCoorY(self):
        return self.__coordenadaY

    def to_string_cartesianas(self):
        return str((self.__coordenadaX, self.__coordenadaY))

    def to_string_polares(self):
        r = str(round(math.sqrt(pow(self.__coordenadaX,2) + pow(self.__coordenadaY,2)), 2))
        a = str(self.switch(self.__coordenadaX, self.__coordenadaY))
        return ("(" + r + ", " + a + ")")
    
    def switch(self, x, y):
        if x > 0 and y >= 0:
            return str(round(math.atan(y/x) * 180 / math.pi)) + "°"
        elif x == 0 and y > 0:
            return "90°"
        elif x < 0:
            return str(round(math.atan(y/x) * 180 / math.pi + 180)) + "°"
        elif x == 0 and y < 0:
            return "270°"
        elif x > 0 and y < 0:
            return str(round(math.atan(y/x) * 180 / math.pi + 360)) + "°"
        else:
            return "Sin definir"