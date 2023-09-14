# En python no se puede hacer sobrecarga de metodos ya que solo se conservara la ultima definicion de suma()
# Por eso mismo aquí le cambio el nombre a suma2 para dos valores y suma3 para dos valores
class MetodosSobrecarga:
    def main(self):
        ms = MetodosSobrecarga()
        res = ms.suma2(3, 5)
        print(res)
        res = ms.suma3(4, 7, 9)
        print(res)
        resf = ms.suma2(8, 9.9)
        print(resf)

    def suma2(self, a, b):
        res = a + b
        return res

    def suma3(self, a, b, c):
        res = a + b + c
        return res

# Crear una instancia de la clase y llamo al método main
ms = MetodosSobrecarga()
ms.main()