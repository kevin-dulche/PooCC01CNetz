class Libro:
    def __init__(self, isbn = "", titulo = "", autor = ""):
        self.isbn = isbn
        self.titulo = titulo
        self.autor = autor

    def setIsbn(self, isbn):
        self.isbn = isbn

    def getIsbn(self):
        return self.isbn
    
    def setTitulo(self, titulo):
        self.titulo = titulo

    def getTitulo(self):
        return self.titulo
    
    def setAutor(self, autor):
        self.autor = autor

    def getAutor(self):
        return self.autor
    
    def imprimirAtributos(self):
        print("ISBN    : " + self.isbn)
        print("Titulo  : " + self.titulo)
        print("Autor   : " + self.autor)