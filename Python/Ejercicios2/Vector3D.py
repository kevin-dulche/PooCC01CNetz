import math

class Vector3D:
    def __init__(self, refX = 0.0, refY = 0.0, refZ = 0.0):
        self.refX = refX
        self.refY = refY
        self.refZ = refZ

    def setRefX(self, refX):
        self.refX = refX

    def getRefX(self):
        return self.refX

    def setRefY(self, refY):
        self.refY = refY

    def getRefY(self):
        return self.refY

    def setRefZ(self, refZ):
        self.refZ = refZ

    def getRefZ(self):
        return self.refZ

    def MagnitudVector(self):
        mag = math.sqrt(self.refX * self.refX + self.refY * self.refY + self.refZ * self.refZ)
        return mag
