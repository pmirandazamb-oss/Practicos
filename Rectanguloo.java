import java.util.Scanner;
public class Rectanguloo {
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Porfavor, ingrese la base del rectangulo");
    int base = sc.nextInt();

    System.out.println("Ahora digame la altura del rectangulo");
    int altura = sc.nextInt();

Rectangulo r = new Rectangulo(base, altura);

    System.out.println("El area del rectangulo es " + r.calcularArea());

     if (r.esCuadrado()){
        System.out.println("Este rectangulo SI es un cuadrado");

    } else {
        System.out.println("Este rectangulo NO es un cuadrado"); 
       }
    }
}

