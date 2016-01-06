# Custom Exception
Ejemplo aplicando Custom Exception
##Ejemplo
Se pueden generar exepciones personalizadas esto solo cuando se tengan reglas de negocio dentro de ellas.
Para generar una exepcion personalizada debemos crear una clase la cual se extendera de **Exception**:
```java
public class edadExcepcion extends Exception {

  public edadExcepcion(String mensaje){
      super(mensaje);
  }
  
}
```
A continuacion una vez que tengamos nuestra exepcion personalizada crearemos en nuestro Main una aplicacion para poder ver su uso:
```java
public class Main {
    public static void main(String[] args) throws edadExcepcion {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        final int EDAD_MAX = 100;

        if (edad < EDAD_MAX) {
            System.out.println("BIENVENIDO");
        }else{
            throw new edadExcepcion("Edad no permitida");
        }
    }
}
```
Como vimos en el ejercicio [throw & throws](https://github.com/Gamis214/trhow-trhowns-) hacemos uso de ellos para poder 
acceder a nuestra exepcion personalizada y agregando al metodo la herencia del throws por capa.
