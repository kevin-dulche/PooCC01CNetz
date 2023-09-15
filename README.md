# PooCC01CNetz
Trabajos, Tareas y exámenes del curso de POO

## Herencia
Se hece en Java con la palabra `extends` hacia el archivo del cual hereda.

Ejemplo:
```Java
public class Licenciado extends Empleado
```

En este ejemplo `Licenciado` hereda de `Empleado` sus atributos y metodos.

Para acceder a estos se hace uso de la palabra `super`

```Java
public Licenciado(String nombre, double salario, Date fecNac, String depto){
    super(nombre, salario, fecNac);
    this.depto = depto;
}
```

Inciso `e)` del Examen 2:

(`Insertar imagen aquí`) //Pendiente