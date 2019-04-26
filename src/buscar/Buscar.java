package buscar;

import java.util.Scanner;

public class Buscar {

    public static void main(String[] args) {

        Programa o = new Programa();

        int[] a = o.Array();

        Scanner reader = new Scanner(System.in);

        System.out.println("Inserte el número que desea buscar: ");
        int num = reader.nextInt();
        reader.nextLine();

        int pos = o.Buscar(a, num, 0) + 1;

        if (pos == 0) {
            System.out.println("El número buscado no se encuentra en el arreglo");
        } else {
            System.out.println("El número buscado se encuentra en la posición: " + pos);
        }

    }

}
