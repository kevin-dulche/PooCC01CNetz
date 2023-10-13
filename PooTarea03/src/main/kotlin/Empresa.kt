open class Empresa : CompaniaTelf {
    private var direccion: String = ""
    private var nombreEmp: String = ""

    constructor(compania: String, numero: String, direccion: String, nombreEmp: String): super(compania, numero) {
        this.direccion = direccion
        this.nombreEmp = nombreEmp
    }

    constructor()

    fun setDireccion(direccion: String) {
        this.direccion = direccion
    }

    fun getDireccion(): String {
        return direccion
    }

    fun setNombreEmp(nombreEmp: String) {
        this.nombreEmp = nombreEmp
    }

    fun getNombreEmp(): String {
        return nombreEmp
    }
}