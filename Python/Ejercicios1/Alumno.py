class Alumno:
    def __init__(self, nombre = "", matricula = 1):
        self.nombre = nombre
        self.matricula = matricula

    def setNombre(self, nombre):
        self.nombre = nombre
    
    def getNombre(self):
        return self.nombre
    
    def setMatricula(self, matricula):
        self.matricula = matricula

    def getMatricula(self):
        return self.matricula