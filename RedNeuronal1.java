/*
 * Implemente un algoritmo que le permita desplegar
1) El nombre del proyecto de su paper.
2) Defina lo que es una red neuronal
3) Cuales son los elementos que forma una red neuronal
4) Como utilizaron la red neuronal en el proyecto que usted ha seleccionado
5) Como utilizaria usted la red neuronal como mejoramiento al proyecto propuesto.
6) En que consistio el entrenamiento utilizando la red neuronal e indique
el algoritmo utilizado

 */
package redneuronal1;

/**
 *
 * @author JESSICA MARIBEL VEGA MASAPANTA
 */
import java.util.Scanner;
public class RedNeuronal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner (System.in);
        System.out.println("RED NEURNAL");

        System.out.println("1. Ingrese el nombre del proyecto");
        String nombredelproyecto=objeto.nextLine();

        System.out.println("2. Defina lo que es una red neuronal");
        String queesunaredneuronal=objeto.nextLine();

        System.out.println("3. Cuales son los elementos que forma una red neurnal");
        String elementos=objeto.nextLine();

        System.out.println("4. Como utilizaron la red neuronal en el proyecto "
                + "que usted ha seleccionado");
        String redneuronalenelproyecto=objeto.nextLine();

        System.out.println("5. Como utilizaria usted la red neuronal como "
                + "mejoramiento al proyecto propuesto");
        String mejoramientoaloroyecto=objeto.nextLine();

        System.out.println("6. En que consistio el entrenamiento utilizando la "
                + "red neuronal e indique el algoritmo utilizado");
        String algoritmoutilizado=objeto.nextLine();
    }

}
