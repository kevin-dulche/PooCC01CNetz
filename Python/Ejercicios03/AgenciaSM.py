from Automovil import Automovil

class AgenciaSM:
    def main(self):
        # Crear un objeto de tipo automovil
        a1 = Automovil()
        a1.modelo = "Prius"
        a1.precio = 350000
        a1.anio = 2022
        print("Modelo      :", a1.modelo)
        print("Precio      :", a1.precio)
        print("Anio        :", a1.anio)
        res = a1.verifica(2023)
        print("Verifica    :", res, "\n")

        a2 = Automovil("Chevy", 70000)
        print("Modelo      :", a2.modelo)
        print("Precio      :", a2.precio)
        print("Anio        :", a2.anio)
        res2 = a2.verifica(2023)
        print("Verifica    :", res2)

if __name__ == "__main__":
    agencia = AgenciaSM()
    agencia.main()
