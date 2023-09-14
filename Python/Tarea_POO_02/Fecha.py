class Fecha:
    def __init__(self, dia = None, mes = None, año = None):
        # Constructor vacio
        if dia is None and mes is None and año is None:
            self.__dia = None
            self.__mes = None
            self.__año = None
        else:
            # Constructor con parametros
            self.__dia = dia
            self.__mes = mes
            self.__año = año
        
    def setDia(self, dia):
        self.__dia = dia
    
    def getDia(self):
        return self.__dia
    
    def setMes(self, mes):
        self.__mes = mes
    
    def getMes(self):
        return self.__mes
    
    def setAño(self, año):
        self.__año = año

    def getAño(self):
        return self.__año

    def fechaCorta(self):
        return str(self.__dia + "/" + self.__mes + "/" + self.__año)

    def fechaLarga(self):
        fecha = self.__dia + " de "
        match self.__mes:
            case "01":
                fecha += "Enero de "
            case "02":
                fecha += "Febrero de "
            case "03":
                fecha += "Marzo de "
            case "04":
                fecha += "Abril de "
            case "05":
                fecha += "Mayo de "
            case "06":
                fecha += "Junio de "
            case "07":
                fecha += "Julio de "
            case "08":
                fecha += "Agosto de "
            case "09":
                fecha += "Septiembre de "
            case "10":
                fecha += "Octubre de "
            case "11":
                fecha += "Noviembre de "
            case "12":
                fecha += "Diciembre de "
        fecha += self.__año
        return fecha