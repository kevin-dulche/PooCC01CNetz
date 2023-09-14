from Vector3D import *
class OperacionesVectores3D:
    def calculaProductoPunto(self, v1 = Vector3D, v2 = Vector3D):
        res = (v1.getRefX() * v2.getRefX()) + (v1.getRefY() * v2.getRefY()) + (v1.getRefZ() * v2.getRefZ())
        return res
    
    def calculaProductoCruz(self, v1 = Vector3D, v2 = Vector3D):
        resVec = Vector3D()
        i = v1.getRefY() * v2.getRefZ() - v1.getRefZ() * v2.getRefY()
        j = v1.getRefX() * v2.getRefZ() - v1.getRefZ() * v2.getRefX()
        k = v1.getRefX() * v2.getRefY() - v1.getRefY() * v2.getRefX()
        resVec.setRefX(i)
        resVec.setRefY(j)
        resVec.setRefZ(k)
        return resVec