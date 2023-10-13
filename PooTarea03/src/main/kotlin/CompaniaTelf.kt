abstract class CompaniaTelf {
    private var compania: String = ""
    private var numero: String = ""

    constructor(compania: String, numero: String) {
        this.compania = compania
        this.numero = numero
    }

    constructor()

    fun setCompania(compania: String) {
        this.compania = compania
    }

    fun getCompania(): String {
        return compania
    }

    fun setNumero(numero: String) {
        this.numero = numero
    }

    fun getNumero(): String {
        return numero
    }
}