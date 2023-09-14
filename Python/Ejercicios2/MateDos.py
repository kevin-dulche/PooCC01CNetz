from OperacionesVectores3D import *
from Vector3D import *
class MateDos:
    def main():
        ov = OperacionesVectores3D()
        a = Vector3D(2, 4, 5)
        b = Vector3D(-1, 1, 2)
        # Calcula el producto punto de dos vectores
        res = ov.calculaProductoPunto(a, b)
        print("Resultado producto punto de a y b: " + str(res))
        # Calcula el producto cruz de dos vectores
        c = ov.calculaProductoCruz(a, b)
        print("Componente X: " + str(c.getRefX()))
        print("Componente Y: " + str(c.getRefY()))
        print("Componente Z: " + str(c.getRefZ()))
    
    main()