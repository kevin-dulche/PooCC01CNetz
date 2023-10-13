fun main() {
    // Inciso a)
    // Crea un arreglo de tipo CompaniaTelf de tamaño 3 e inicializandolo con objetos
    // de tipo Residencial, Casa y Persona cada objeto que pases al arreglo debe tener inicializados
    // sus atributos (puede ser desde los setters o el constructor).
    // Posteriormente imprime todos los elementos del arreglo y que se puedan ver todos los atributos de cada
    // objeto contenido y sus métodos implementados. Para la clase Fecha puedes tomar en
    // cuenta que el método toString imprime sus tres atributos.

    println("Inciso a)\n")

    val arregloPers = arrayOfNulls<CompaniaTelf?>(3)

    arregloPers[0] = Residencial("Telmex", "5513794682", 50, 3)
    arregloPers[1] = Casa("Izzi", "5528467913", 50, 1, 1)
    arregloPers[2] = Persona("At&t", "5512346789", "Juan", Fecha(15,6,1978))

    for (compania in arregloPers) {
        if (compania != null) {
            print("Compañía: ${compania.getCompania()}, Número: ${compania.getNumero()}, ")

            when (compania) {
                is Casa -> {
                    println("Tipo: Casa\n  Casas: ${compania.getCasas()}\n  Secciones: ${compania.getSecciones()}\n  Número de Casa: ${compania.getNumCasa()}")
                    compania.enviarMensaje()
                    compania.recibirMensaje()
                }

                is Residencial -> {
                    println("Tipo: Residencial\n  Casas: ${compania.getCasas()}\n" +
                            "  Secciones: ${compania.getSecciones()}")
                    compania.enviarMensaje()
                    compania.recibirMensaje()
                }

                is Persona -> {
                    println(
                        "Tipo: Persona\n  Nombre: ${compania.getNombre()}\n  Fecha de Nacimiento: ${
                            compania.getFecNac()?.toString() ?: "N/A"}"
                        // `?` es el operador de llamada segura en Kotlin. Si compania.getFecNac() es null,
                        // la expresión completa se evaluará como null.
                        // Esto es útil para evitar una excepción si getFecNac() devuelve null.
                        // ?: es el operador Elvis en Kotlin.
                        // Si la expresión de la izquierda es null,
                        // se utiliza el valor de la derecha como un valor de respaldo. En este caso,
                        // si compania.getFecNac() es null, se mostrará "N/A" en su lugar.
                    )
                    compania.enviarMensaje()
                    compania.recibirMensaje()
                }
            }
        }
        println("---------------------------------------------------------------------------------------------")
    }

    // Inciso b)
    // Crea un arreglo de tipo Zona de tamaño 3 e inicializa cada elemento del arreglo con objetos
    // de su propio tipo los cuales deben tener todos los atributos inicializados, para el atributo alumnos
    // la referencia debe apuntar a un arreglo de tipo Alumno de tamaño 2 con objetos de tipo Empresa y Departamento,
    // los objetos deben tener inicializados sus atributos.
    // Imprime todos los elementos del arreglo de tipo Grupo y que se puedan visualizar
    // todos los atributos contenidos en el objeto alojado en él

    val arregloZona = arrayOfNulls<Zona>(3)

    println("Inciso b)\n")

    arregloZona[0] = Zona(1160, "Isidro Fabela", Persona("Telcel", "5598764321", "Pedro", Fecha(1,2,1980)),
         empresa = arrayOf(
             Empresa("Totalplay", "123456", "Jose Carlos 16", "Pedros"),
             Departamento("Axtel", "987654", "San Martin 13", "Emerson", "Contabilidad")
         )
    )

    arregloZona[1] = Zona(1270, "El pocito", Persona("Unefon", "5510657499", "Leo", Fecha(1,9,2001)),
        empresa = arrayOf(
            Empresa("Axtel", "2874674351", "Ayala 32", "Juanas"),
            Departamento("Ya no se que poner profe", "9765487121", "San Juan 34", "Burger King", "Recursos Humanos")
        )
    )

    arregloZona[2] = Zona(1260, "Isidro Fabela", Persona("Telcel", "5598764321", "Luis", Fecha(15,4,1995)),
        empresa = arrayOf(
            Empresa("Pillofon", "54135467684", "Jose Carlos 16", "Felipes"),
            Departamento("Movistar", "4613579820", "Postes 11", "Trevia", "Produccion")
        )
    )

    for (zona in arregloZona) {
        if (zona != null) {
            println("CP: ${zona.getCp()}, Colonia: ${zona.getColonia()}, Compania: ${zona.getPersona()?.getCompania()}, Numero: ${zona.getPersona()?.getNumero()}, Nombre: ${zona.getPersona()?.getNombre()}, ${zona.getPersona()?.getFecNac()}")
            val empresas = zona.getEmpresa()
            if (empresas != null) {
                println("Empresas:")
                for (empresa in empresas) {
                    println("\n  Compañía: ${empresa.getCompania()}")
                    println("  Número: ${empresa.getNumero()}")
                    println("  Dirección: ${empresa.getDireccion()}")
                    println("  Nombre de la Empresa: ${empresa.getNombreEmp()}")
                    if (empresa is Departamento) {
                        println("  Tipo: Departamento")
                        println("  Nombre del Departamento: ${empresa.getDepto()}")
                    } else {
                        println("  Tipo: Empresa")
                    }
                }
            }
        }
        println("---------------------------------------------------------------------------------------------")
    }

    // Inciso c)
    // Crea un objeto de la clase CompaniaTelf , inicializa el objeto con los métodos setters y
    // después visualiza sus atributos

    println("Inciso c)\n")
    println("No se pueden crear objetos de una clase abstracta")

}