class MiClase:
    def __init__(self):
        self.__atributo_privado = 10  # Atributo "privado" con doble guion bajo

objeto = MiClase()
print(objeto.__atributo_privado)  # Esto causará un error de atributo
print(objeto._MiClase__atributo_privado)  # Acceso forzado al atributo
