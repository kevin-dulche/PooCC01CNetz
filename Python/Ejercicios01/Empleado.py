class Empleado:
    # Declaro variables en la clase
    def __init__(self):
        self.nombre = ""
        self.edad = 0
        self.salario = 0.0

    # Declaro un metodo
    def calculaISR(self):
        isr = self.salario * 30 * 0.15
        return isr