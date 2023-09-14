class Estadistica:
    def main(self):
        e = Estadistica()
        arreglo = [1.2, 2.4, 3.6, 4.8]
        med = e.media(arreglo)
        print("La media es:", med)

    def media(self, vec):
        acum = 0
        for value in vec:
            acum += value
        med = acum / len(vec)
        return med

if __name__ == "__main__":
    est = Estadistica()
    est.main()
