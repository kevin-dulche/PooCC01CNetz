class Fecha {
    private var dia: Int = 0
    private var mes: Int = 0
    private var anio: Int = 0

    constructor(dia: Int, mes: Int, anio: Int) {
        this.dia = dia
        this.mes = mes
        this.anio = anio
    }

    constructor()

    fun setDia(dia: Int) {
        this.dia = dia
    }

    fun getDia(): Int {
        return dia
    }

    fun setMes(mes: Int) {
        this.mes = mes
    }

    fun getMes(): Int {
        return mes
    }

    fun setAnio(anio: Int) {
        this.anio = anio
    }

    fun getAnio(): Int {
        return anio
    }

    override fun toString(): String {
        return "[dia=$dia, mes=$mes, anio=$anio]"
    }
}