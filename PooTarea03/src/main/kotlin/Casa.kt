class Casa : Residencial {
    private var numCasa: Int = 0

    constructor(compania: String, numero: String, casas: Int, secciones: Int,numCasa: Int): super(compania, numero, casas,secciones) {
        this.numCasa = numCasa
    }

    constructor()

    fun setNumCasa(numCasa: Int) {
        this.numCasa = numCasa
    }

    fun getNumCasa(): Int {
        return numCasa
    }
}