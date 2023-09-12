# Polimorfismo
En el archivo `Ejercicios01/Prueba.java` creamos un arreglo de tipo Empleado y guardamos dentro un objeto empleado, un objeto licenciado, y otro objeto gerente, y accedemos al nombre, ya que solo podemos acceder a los atributos de tipo `Empleado` aunque tengamos de tipo `Licenciado` y `Gerente`

```Java
Empleado emp = new Empleado("Karla", 300, new Fecha(1, 1, 2001));
Licenciado lic = new Licenciado("Juan", 250, new Fecha(2, 2, 2002), "ventas");
Gerente ger = new Gerente("Dany", 600, new Fecha(3, 3, 2003), "desarrollo", 3000);
Empleado[] emps = new Empleado[3];
emps[0] = emp;
emps[1] = lic; //polimorfismo
//emps[2] = new Fecha(4, 4, 2004); Type mismatch: cannot convert from Fecha to Empleado // ERROR
emps[2] = ger; //polimorfismo
System.out.println("Nombre: " + emps[0].getNombre());
```
Para acceder a los atributos de licenciado (`depto`) hay que convertir ese objeto de emps[1] en tipo `Licenciado`

```Java
System.out.println("Nombre: " + emps[1].getNombre());
System.out.println("Depto: " + ((Licenciado)emps[1]).getDepto());
```

Con lo que nos impremire: 

```Bash
Nombre: Juan
Depto: ventas
```