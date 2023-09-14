from Domicilio import *
class PasaArregloClase:
    def main(self):
        pac = PasaArregloClase()
        dms = [None] * 3
        dms[0] = (Domicilio("Calle uno", 1, 1011))
        dms[1] = (Domicilio("Calle dos", 2, 1012))
        dms[2] = (Domicilio("Calle tre", 3, 1013))
        pac.imprimeDomicilio(dms)
        
    def imprimeDomicilio(self, dom):
        for i in range(len(dom)):
            print("******************************")
            print("Elemento del arreglo: " + str(i + 1))
            print("Calle    : " + dom[i].getCalle())
            print("Numero   : " + str(dom[i].getNum()))
            print("CP       : " + str(dom[i].getCp()))


pasa_arreglo = PasaArregloClase()
pasa_arreglo.main()