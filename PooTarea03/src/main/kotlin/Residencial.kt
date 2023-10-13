open class Residencial : CompaniaTelf, Mensajes {
    private var casas: Int = 0
    private  var secciones: Int = 0

    constructor(compania: String, numero: String, casas: Int, secciones: Int): super(compania, numero) {
        this.casas = casas
        this.secciones = secciones
    }

    constructor()

    fun setCasas(casas: Int) {
        this.casas = casas
    }

    fun getCasas(): Int {
        return casas
    }

    fun setSecciones(secciones: Int) {
        this.secciones = secciones
    }

    fun getSecciones(): Int {
        return secciones
    }

    override fun enviarMensaje() {
        println("  Mensaje enviado")
    }

    override fun recibirMensaje() {
        println("  Mensaje recibido")
    }
}