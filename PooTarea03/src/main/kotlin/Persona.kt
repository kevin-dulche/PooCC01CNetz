class Persona : CompaniaTelf, Mensajes {
    private var nombre: String = ""
    private var fecNac: Fecha? = null
//    se utiliza `?` para indicar que fecNac puede ser nulo
//    (ya que en Kotlin, por defecto, las propiedades no pueden tener valores nulos).

    constructor(compania: String, numero: String, nombre: String, fecNac: Fecha) : super(compania, numero) {
        this.nombre = nombre
        this.fecNac = fecNac
    }

    constructor()

    fun setNombre(nombre: String) {
        this.nombre = nombre
    }

    fun getNombre(): String {
        return nombre
    }

    fun setFecNac(fecNac: Fecha?) {
        this.fecNac = fecNac
    }

    fun getFecNac(): Fecha? {
        return fecNac
    }

    override fun enviarMensaje() {
        println("  $nombre ha enviado un mensaje")
    }

    override fun recibirMensaje() {
        println("  $nombre ha recibido un mensaje")
    }
}