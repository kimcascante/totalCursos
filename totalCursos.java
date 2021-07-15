package Semana6;

/**
 * Nombre del programa: 
 * Descripcion: Leer, mientras se desee continuar, las notas de un estudiante y al final imprimir 
    el número de cursos ganados, el número de cursos perdidos y el promedio general. Cursos ganados 
    son aquellos >= 70 y perdidos son aquellos < 70.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp3w6 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        double nota=0;
        int continuar;
        double promedio=0;
        int cursosGanados=0;
        int cursosPerdidos=0;
        double sumaNotas=0;

        escribir.println("Digite 1 si desea empezar o 0 para terminar:");
        continuar = Integer.parseInt(leer.readLine());

        for (int count=1; continuar==1; count++){
            escribir.println("Digite la nota del estudiante:");
            nota = Double.parseDouble(leer.readLine());
            //nota = nota + Double.parseDouble(leer.readLine());

            if (nota >= 70){
                cursosGanados = cursosGanados + 1;
            } else {
                cursosPerdidos = cursosPerdidos +1;
            }

            escribir.println("Digite 1 si desea continuar o 0 para terminar:");
            continuar = Integer.parseInt(leer.readLine());

            sumaNotas = sumaNotas + nota;

            if (continuar == 0){
                promedio = sumaNotas / count;
            }
            
            /*if (continuar == 1){
                if (nota >= 70){
                    cursosGanados = countCursos +1;
                } else {
                    cursosPerdidos = countCursos +1;
                }
            } else {
                promedio = nota / count;
                if (nota >= 70){
                    cursosGanados = countCursos +1;
                } else {
                    cursosPerdidos = countCursos +1;
                }
            }*/
        }
        
        
        escribir.println("El numero de cursos ganados es de: " +cursosGanados);
        escribir.println("El numero de cursos perdidos es de: " +cursosPerdidos);
        escribir.println("El promedio de sus notas es: " +promedio);
    }
}