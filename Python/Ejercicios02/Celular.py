class Celular:
    def __init__(self):
        self.modelo = ""
        self.precio = 0.0
        self.activo = False

    def calculaIVA(self):
        iva = self.precio * 0.10
        return iva

    def descuento(self, porcentDesc):
        desc = self.precio * (porcentDesc * 0.01)
        return desc