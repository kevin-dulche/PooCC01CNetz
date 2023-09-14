from Celular import *
class MetodoObjeto:
    def main(self):
        c = Celular()
        c.modelo = "jaguei"
        c.activo = True
        mo.recibeCelular(c)

    def recibeCelular(self, c):
        print("Modelo   : " + str(c.modelo))
        print("Precio   : " + str(c.precio))
        print("Activado : " + str(c.activo))

if __name__ == "__main__":
    mo = MetodoObjeto()
    mo.main()