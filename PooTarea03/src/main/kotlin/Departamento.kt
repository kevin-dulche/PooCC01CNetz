class Departamento : Empresa {
    private var depto: String = ""

    constructor(compania: String, numero: String, direccion: String, nombreEmp: String, depto: String): super(compania, numero, direccion, nombreEmp) {
        this.depto = depto
    }

    constructor()

    fun setDepto(depto: String) {
        this.depto = depto
    }

    fun  getDepto(): String {
        return depto
    }
}