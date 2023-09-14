from AlcanceAtributos import *
def main():
    aa = AlcanceAtributos()
    aa.atributoPublico = "1111"
    aa.inicializaAP("2222")
    print("APublico     : " + aa.atributoPublico)
    print("APrivado     : " + aa.obtenerAP())

    ab = AlcanceAtributos("3333")
    print("APrivado     : " + ab.obtenerAP())

main()