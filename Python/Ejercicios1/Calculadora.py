class Calculadora:
    def ProdPunto(self, V1, V2):
        res = ((V1.getRefX() * V2.getRefX()) + (V1.getRefY() * V2.getRefY()) + (V1.getRefZ() * V2.getRefZ()))
        return res
    
    def ProdCruz(self, V1, V2):
        vec = [0, 0, 0]
        vec[0] = self.Partes(V1.getRefY(), V1.getRefZ(), V2.getRefY(), V2.getRefZ())
        vec[1] = self.Partes(V1.getRefX(), V1.getRefZ(), V2.getRefY(), V2.getRefZ())
        vec[2] = self.Partes(V1.getRefY(), V1.getRefZ(), V2.getRefY(), V2.getRefZ())
        return vec

    def Partes(self, a, b, c, d):
        parte = a * b - c * d
        return parte