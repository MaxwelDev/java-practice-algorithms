/*
        Make a program that reads three floating point values: A, B and C. Then, calculate and show:

        a) the area of the rectangle triangle that has base A and height C.
        b) the area of the radius's circle C. (pi = 3.14159)
        c) the area of the trapezium which has A and B by base, and C by height.
        d) the area of ​​the square that has side B.
        e) the area of the rectangle that has sides A and B.

        Input

        The input file contains three double values with one digit after the decimal point.

        3.0 4.0 5.2

        Output

        The output file must contain 5 lines of data. Each line corresponds to one of the areas described above,
        always with a corresponding message (in Portuguese) and one space between the two points and the value.
        The value calculated must be presented with 3 digits after the decimal point.

        TRIANGULO: 7.800
        CIRCULO: 84.949
        TRAPEZIO: 18.200
        QUADRADO: 16.000
        RETANGULO: 12.000

        Exercise number in the website: 1012
*/
package uri;

import java.util.Locale;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        String[] vet = input.nextLine().split(" ");
        input.close();

        float a = Float.parseFloat(vet[0]);
        float b = Float.parseFloat(vet[1]);
        float c = Float.parseFloat(vet[2]);

        float triangle = (a*c)/2;
        float circle = (float) (Math.pow(c, 2) * 3.14159);
        float trapezium = (((a + b) * c) / 2);
        float square = (float) Math.pow(b, 2);
        float rectangle = a * b;

        System.out.printf("TRIANGULO: %.3f\n", triangle);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapezium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RETANGULO: %.3f\n", rectangle);
    }
}