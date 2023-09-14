from Alumno import *
class Escuela:
    alu = Alumno()
    alu.setNombre("Juan")
    alu.setMatricula(12345)
    print("Nombre: " + str(alu.getNombre()))
    print("Matricula: " + str(alu.getMatricula()))
