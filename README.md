# Taller principios SOLID:
## Principio Abierto-Cerrado (OCP).
Consultas:
1. ¿Cumple la clase Figuras el Principio OCP. Justifica tu respuesta.
2. En caso de que no lo cumpla, modifica las clase para cumpla este criterio.
3. ¿Consideras que la tarea realizada es una refactorización? Justifica tu respuesta.
## Principio Liskov (LSK).
Consultas:
1. Crea un programa principal que ejecute los métodos de la clase Configuración. ✔
2. Cumple la clase Configuracion en Principio OCP. Justifica la respuesta.
   - Si cumple porque la clase esta abierta a nuevas funcionalidades sin tener que modificar el programa, como tenemos un valor de RecursosPersistentes
4. Cumple la clase Configuracion el Principio de Liskov. Justifica la respuesta.
   - No porque el principio dice que la herencia debe garantizar que cual quier objeto super, se logra cumplir con objeto de subclases
6. Refactoriza la aplicación para que cumpla el principio de Liskov. La solución a
este ejercicio lo puedes encontrar en: https://lassala.net/2010/11/04/a-goodexample-of-liskov-substitution-principle/
   ✔ 
8. Explica de forma general (independientemente del ejemplo) cual es el
problema y la solución propuesta.
- 
## Principio de Responsabilidad Única (SRP).
Ejercicio propuesto:
1. Refactoriza la aplicación para que cada responsabilidad quede aislada en una clase.
Indica qué cambios tendrías que realizar si el importeDeduccion se calculase en base al
importe de la factura:
Si (importeFactura>10000)
 importeDeduccion = (importeFactura * porcentajeDeduccion+3) / 100;
 sino importeDeduccion = (importeFactura * porcentajeDeduccion) / 100;
2. Indica los cambios que tendrías que realizar si el IVA cambiase del 16 al 18%.
3. Indica los cambios que tendrías que realizar si a las facturas de código 0, no se le
aplicase el IVA.
## Principio de Inversión de dependencia (DIP).
Consultas:
1.Cumple el principio de Inversión de dependencia. Justifica la respuesta.
2. En caso negativo, refactoriza el código par que cumpla el principio.
## Principio de Segregación de interfaces (ISP).
Consultas:
1. ¿Qué información necesitan las clases EmailSender y SMSSender de la clase Contacto
para realizar su tarea, y qué información recogen? Consideras que incumplen en
principio ISP.
 - la clase EmailSender únicamente le interesará la información del email del contacto,
y a la clase SMSSender
- Sí, incumple el principio, porque estamos obligando a las clases EmailSender y
SMSSender a depender de la interfaz de Contacto, cuando realmente solo utilizan una
propiedad
2. Refactoriza las clases anteriores, sustituyendo el parámetro Contacto, por una interfaz.
Esta interfaz tendrá los métodos necesarios para acceder a la información que necesita
en método. Modifica también la clase Contacto. ✔
3. Piensa que después de refactorización, la clase GmailAccount (con alguna modificación)
podrá ser enviada a la clase EmailSender pero no a la clase SMSSender.

public class GmailAccount {
 String name, emailAddress;
}
Crea un programa que permita invocar al método sendEmail de la clase EmailSender con
un objeto de la clase GmailAccount ✔
