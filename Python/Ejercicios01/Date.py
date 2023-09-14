class Date:
    def __init__(self, day = None, mounth = None, year = None):
        if day is None and mounth is None and year is None:
            self.__day = None
            self.__mounth = None
            self.__year = None
        else:
            self.__day = day
            self.__mounth = mounth
            self.__year = year
    
    def setDay(self, day):
        self.__day = day

    def getDay(self):
        return self.__day
    
    def setMounth(self, mounth):
        self.__mounth = mounth

    def getMounth(self):
        return self.__mounth
    
    def setYear(self, year):
        self.__year = year

    def getYear(self):
        return self.__year