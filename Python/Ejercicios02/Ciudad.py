from Ciudadano import *
class Ciudad:
    def main():
        # Arreglo de clases
        # ds = [] <- Es un arreglo

        # Se crea un arreglo para 3 objetos de tipo Ciudadano
        ds = []
        # Primer caso
        c1 = Ciudadano("Juan Perez", Domicilio("BJ", 1, 1010))
        ds.append(c1)
        # Segundo caso
        ds.append(Ciudadano("Maria Perez", Domicilio("Iz", 2, 1020)))
        # Tercer caso
        d1 = Domicilio("CU", 3, 1030)
        c2 = Ciudadano("Juan Perez", d1)
        # ds.append(d1) <- esto si es posible pero no cumple con el unico tipo de dato que estamos manejando
        ds.append(c2)

        # Imprimir ese arreglo de tipo Ciudadano
        for i in range(len(ds)):
            print("******************************")
            print("Elemento del arreglo: " + str(i + 1))
            print("Nombre   : " + ds[i].getNombre())
            print("Calle    : " + ds[i].getDireccion().getCalle())
            print("Numero   : " + str(ds[i].getDireccion().getNum()))
            print("CP       : " + str(ds[i].getDireccion().getCp()))
    
    main()