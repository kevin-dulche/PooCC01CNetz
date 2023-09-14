class Rectangulo:
    def __init__(self, punto1, punto2, punto3, punto4):
        self.p1 = punto1
        self.p2 = punto2
        self.p3 = punto3
        self.p4 = punto4

    @classmethod
    def desde_base_altura(cls, base, altura):
        punto1 = (0, 0)
        punto2 = (base, 0)
        punto3 = (base, altura)
        punto4 = (0, altura)
        return cls(punto1, punto2, punto3, punto4)

    def area(self):
        base = self.p2[0] - self.p1[0]
        altura = self.p4[1] - self.p1[1]
        return base * altura

    def desplazar(self, dx, dy):
        self.p1 = (self.p1[0] + dx, self.p1[1] + dy)
        self.p2 = (self.p2[0] + dx, self.p2[1] + dy)
        self.p3 = (self.p3[0] + dx, self.p3[1] + dy)
        self.p4 = (self.p4[0] + dx, self.p4[1] + dy)

    def __str__(self):
        return f"Punto 1: {self.p1}, Punto 2: {self.p2}, Punto 3: {self.p3}, Punto 4: {self.p4}"