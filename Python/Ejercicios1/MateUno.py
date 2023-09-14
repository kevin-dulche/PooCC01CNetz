from Vector3D import *
from Calculadora import *
class MateUno:
    vec = [0.0, 0.0, 0.0]
    v1 = Vector3D()
    v1.setRefX(3)
    v1.setRefY(5)
    v1.setRefZ(2)

    print("Componente X: " + str(v1.getRefX()))
    print("Componente Y: " + str(v1.getRefY()))
    print("Componente Z: " + str(v1.getRefZ()))

    v2 = Vector3D(2, 3, 4)
    print("\nComponente X: " + str(v2.getRefX()))
    print("Componente Y: " + str(v2.getRefY()))
    print("Componente Z: " + str(v2.getRefZ()))

    v3 = Calculadora()
    res = v3.ProdPunto(v1, v2)
    print("Resultado de producto punto: " + str(res))
    vec = v3.ProdCruz(v1, v2)
    print("Resultado de producto cruz: i(" + str(vec[0]) + ") + j(" + str(vec[1]) + ") + k(" + str(vec[2]) + ")")