from Celular import *
# Crear un celular
def main():
    cel1 = Celular()
    cel1.modelo = "Honnor"
    cel1.precio = 2499.99
    cel1.activo = False

    iva = cel1.calculaIVA()
    des = cel1.descuento(10)

    print("Modelo   : " + cel1.modelo)
    print("Precio   : " + str(cel1.precio))
    print("Activo   : " + str(cel1.activo))
    print("***************************")
    print("IVA      : " + str(iva))
    print("Descuento: " + str(des))

main()