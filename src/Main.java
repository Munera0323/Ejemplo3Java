//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        /*NO SE PUEDE REPETIR EL TIPO DE DATO(DOUBLE,STRING...) -
        AL MOMENTO DE ASIGNAR EL TIPO DE DATO Y LA VARIABLE GLOBAL YA NO SE PUEDE REPETIR
         */

    /*DESARROLLAR UN SISTEMA DE NOTAS PARA UN ESTUDIANTE QUE DESEA SABER SU NOTA FINAL(DE CADA MATERIA)
    EL SISTEMA DEBE PEDIR EL NOMBRE DEL ESTUDIANTE, EL DOCUMENTO Y EL PROGRAMA AL QUE ESTA MATRICULADO
    (MENU DE OPCIONES: DESARROLLODE SOFTWARE,DISEÑO GRAFICO, GASTRONOMIA)
    DEBE PERMITIR SELECCIONAR LA MATERIA (MENU DE OPCIONES:
    DESARROLLO: LOGICA,METODOLOGIAS,INTRODUCCION
    DISEÑO: TIPOGRAFIA,ICONOGRAFIA,SEMANTICA
    GASTRONOMIA: COSTOS, PANADERIA DULCE,COCINA INTERNACIONAL)
    EL CALCULO DE NOTAS ES DE LA SIGUIENTE MANERA:
    PARA CADA MATERIA HAY UN EXAMEN PARCIAL QUE EQUIVALE AL 20% DE LA NOTA, UN TALLER QUE EQUIVALE AL 30%
    DE LA NOTA Y UN EXAMEN FINAL QUE EQUIVALE AL 50% DE LA NOTA)
    UNA VEZ CALCULADA LA NOTA FINAL TENER EN CUENTA QUE:
    SI LA NOTA ESTA ENTRE 0 Y 2 EL ESTUDIANTE PIERDE DEFINITIVAMENTE
    SI LA NOTA ESTA ENTRE 2.1 Y 2.9 TIENE DERECHO A UN PLAN DE MEJORAMIENTO
    SI LA NOTA ES IGUAL O SUPERIOR A 3,ASI LE QUEDA LA MATERIA
    SI EL ESTUDIANTE HACE PLAN DE MEJORAMIENTO, LA NOTA MAXIMA DE LA MATERIA SERA 3
    EL SISTEMA DEBE DISCRIMINAR LA INFORMACION GENERAL DEL ESTUDIANTE: NOMBRE ESTUDIANTE, NOTA Y MATERIA*/

        double notaExamenParcial=0, notaTaller=0, notaFinal=0, notaMateria=0;
        String materia="materia";

System.out.println("SISTEMA DE NOTAS");
System.out.println("Ingrese el nombre de estudiante");
        String nombreEstudiante= leer.nextLine();
 System.out.println("Ingresa el documento del estudiante");
        String documentoEstudiante= leer.nextLine();
        System.out.println("Seleccione el programa: \n1- Desarrollo de software \n2- Diseño grafico \n3- Gastronomia");
             /* "1 - " para poder identificar una variable y hacer que sea mas facil
             * " \n " para colocarla cada mensaje en lineas diferentes*/

        String programa= leer.nextLine();
        switch (programa) {                  /* switch: etiqueta para condicional multiple*/
            case "1" :
                System.out.println("Programa de Desarrollo de software");
                System.out.println("Seleccione la materia: \n1- Metodologias Agiles \n2- Logica de programacion \n3- Introduccion a la programacion");
                   materia= leer.nextLine();
                   switch (materia) {
                       case "1":
                           System.out.println(" NOTA Metodologias Agiles");
                           System.out.println("nota examen parcial");
                            notaExamenParcial= leer.nextDouble();
                           System.out.println("nota Taller");
                            notaTaller= leer.nextDouble();
                           System.out.println("nota Final");
                            notaFinal= leer.nextDouble();
                           notaMateria=(notaExamenParcial*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                           System.out.println("El estudiante "+ nombreEstudiante + "tiene la siguiente nota en la materia de Metodologias Agiles: " +  notaMateria);
                           if (notaMateria>2){
                               System.out.println("perdió definitivamente");
                           } else if (notaMateria<2.9) {
                               System.out.println("Tiene derecho al plan de mejoramiento");
                           } else {
                               System.out.println("Asi le quedó la materia");
                           }

                           break;
                       case "2":
                           System.out.println("NOTA Logica de programacion");
                           System.out.println("nota examen parcial");
                            notaExamenParcial= leer.nextDouble();
                           System.out.println("nota Taller");
                           notaTaller= leer.nextDouble();
                           System.out.println("nota Final");
                            notaFinal= leer.nextDouble();
                            notaMateria=(notaExamenParcial*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                           System.out.println("El estudiante "+ nombreEstudiante + "tiene la siguiente nota en la materia de Logica de programacion: " +  notaMateria);
                           if (notaMateria>2){
                               System.out.println("perdió definitivamente");
                           } else if (notaMateria<2.9) {
                               System.out.println("Tiene derecho al plan de mejoramiento");
                           } else {
                               System.out.println("Asi le quedó la materia");
                           }
                           break;
                       case "3":
                           System.out.println("NOTA Introduccion a la programacion");
                           System.out.println("nota examen parcial");
                           notaExamenParcial= leer.nextDouble();
                           System.out.println("nota Taller");
                           notaTaller= leer.nextDouble();
                           System.out.println("nota Final");
                           notaFinal= leer.nextDouble();
                           notaMateria=(notaExamenParcial*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                           System.out.println("El estudiante "+ nombreEstudiante + "tiene la siguiente nota en la materia de Logica de programacion: " +  notaMateria);
                           if (notaMateria>2){
                               System.out.println("perdió definitivamente");
                           } else if (notaMateria<2.9) {
                               System.out.println("Tiene derecho al plan de mejoramiento");
                           } else {
                               System.out.println("Asi le quedó la materia");
                           }
                           break;
                   }
                break;


            case "2":
                System.out.println("Programa de Diseño grafico");
                System.out.println("Seleccione la materia: \n1- TIPOGRAFIA \n2- ICONOGRAFIA \n3- SEMANTICA");
                materia= leer.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println(" NOTA TIPOGRAFIA");
                        System.out.println("nota examen parcial");
                        notaExamenParcial= leer.nextDouble();
                        System.out.println("nota Taller");
                        notaTaller= leer.nextDouble();
                        System.out.println("nota Final");
                        notaFinal= leer.nextDouble();
                        notaMateria=(notaExamenParcial*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                        System.out.println("El estudiante "+ nombreEstudiante + "tiene la siguiente nota en la materia de TIPOGRAFIA: ");
                        System.out.println("la nota final de la materia es: " );
                        break;

                    case "2":
                        System.out.println(" NOTA ICONOGRAFIA");
                        System.out.println("nota examen parcial");
                        notaExamenParcial= leer.nextDouble();
                        System.out.println("nota Taller");
                        notaTaller= leer.nextDouble();
                        System.out.println("nota Final");
                        notaFinal= leer.nextDouble();
                        notaMateria=(notaExamenParcial*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                        System.out.println("El estudiante "+ nombreEstudiante + "tiene la siguiente nota en la materia de ICONOGRAFIA: ");
                        System.out.println("la nota final de la materia es: " );
                        break;

                    case "3":
                        System.out.println(" NOTA SEMANTICA");
                        System.out.println("nota examen parcial");
                        notaExamenParcial= leer.nextDouble();
                        System.out.println("nota Taller");
                        notaTaller= leer.nextDouble();
                        System.out.println("nota Final");
                        notaFinal= leer.nextDouble();

                        notaMateria=(notaExamenParcial*0.2)+(notaTaller*0.3)+(notaFinal*0.5);
                        System.out.println("El estudiante "+ nombreEstudiante + "tiene la siguiente nota en la materia de SEMANTICA: ");
                        System.out.println("la nota final de la materia es: " );



                        
                        break;
                }
                break;
            case "3":
                System.out.println("Programa de Gastronomia");
                break;

        }
    }
}
