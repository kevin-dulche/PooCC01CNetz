class AlcanceAtributos:
    def __init__(self, atributoPrivado = None):
        self.atributoPublico = None
        self.__atributoPrivado = atributoPrivado

    def inicializaAP(self, atributoPrivado):
        self.__atributoPrivado = atributoPrivado

    def obtenerAP(self):
        return self.__atributoPrivado