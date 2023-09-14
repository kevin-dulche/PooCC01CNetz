from Domicilio import *
class Ciudadano:
    def __init__(self, nombre = None, direccion = None):
        # Constructor vacio
            # Atributos privados
        if nombre is None and direccion is None:
            self.__nombre = nombre
            self.__direccion = direccion
            pass
        else:
             # Constructor con parámetros
            self.__nombre = nombre
            self.__direccion = direccion


    def setNombre(self, nombre):
        self.__nombre = nombre

    def getNombre(self):
        return self.__nombre
    
    def setDomicilio(self, direccion):
        self.__direccion = direccion

    def getDomicilio(self):
        return self.__direccion