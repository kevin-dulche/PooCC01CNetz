class PasaArregloPrimitivo:
    def main(self):
        pa = PasaArregloPrimitivo()
        # Solicitar datos
        valores = [4, 5, 1, 3, 2]
        # Logica de mi negocio
        med = pa.media(valores)
        # Obtener resultados
        print("La media de los valores es: " + str(med))

    # Este metodo calcula la media de un conjunto de valores
	# contenidos en un arreglo
    def media(self, vec):
        acum = 0
        for i in range(len(vec)):
            acum += vec[i]
        return acum / len(vec)
    
pasa_arreglo = PasaArregloPrimitivo()
pasa_arreglo.main()