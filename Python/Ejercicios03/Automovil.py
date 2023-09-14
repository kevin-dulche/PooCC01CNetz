class Automovil:
    # Constructor
    def __init__(self, modelo="", precio=0):
        self.modelo = modelo
        self.precio = precio
        self.anio = 2023

    # Metodo
    def verifica(self, anio_act):
        verif = anio_act - self.anio
        if verif < 2:
            return False
        return True
