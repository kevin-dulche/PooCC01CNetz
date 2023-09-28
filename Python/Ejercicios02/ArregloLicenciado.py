from Licenciado import *
class ArregloLicenciado:
    def main(self):
        lics = [Licenciado] * 3
        lics[0] = Licenciado("Godin", 300, Fecha(8, 1, 2000), "ventas")
        lics[1] = Licenciado("Perez", 299, Fecha(8, 3, 2000), "contabilidad")
        lics[2] = Licenciado("Danny", 301, Fecha(8, 4, 2000), "administracion")

        for licenciado in lics:
            print("********** Consulta del Lic **********")
            print("Nombre  : " + licenciado.getNombre())
            print("Salario : " + str(licenciado.getSalario()))
            print("F day   : " + str(licenciado.getFecNac().getDia()))
            print("F mounth: " + str(licenciado.getFecNac().getMes()))
            print("F year  : " + str(licenciado.getFecNac().getAño()))
            print("Depto   : " + licenciado.getDepto())
            print("Paga    : " + str(licenciado.calcQuincena()))
        
prueba = ArregloLicenciado()
prueba.main()