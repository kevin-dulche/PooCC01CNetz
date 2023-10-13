class Zona {
    private var cp: Int = 0
    private var colonia: String = ""
    private var persona:Persona? = null
    private var empresa: Array<Empresa>? = null

    constructor(cp: Int, colonia: String, persona: Persona, empresa: Array<Empresa>) {
        this.cp = cp
        this.colonia = colonia
        this.persona = persona
        this.empresa = empresa
    }

    constructor()

    fun setCp(cp:Int) {
        this.cp = cp
    }

    fun getCp(): Int {
        return cp
    }

    fun setColonia(colonia: String) {
        this.colonia = colonia
    }

    fun getColonia(): String {
        return colonia
    }

    fun setPersona(persona: Persona) {
        this.persona = persona
    }

    fun getPersona(): Persona? {
        return persona
    }

    fun setEmpresa(empresa: Array<Empresa>) {
        this.empresa = empresa
    }

    fun getEmpresa(): Array<Empresa>? {
        return empresa
    }
}