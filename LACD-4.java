/////EJERCICIO LIVE CODING CON DAVID ALBERTO

package org.generation.livecoding4;

public class LiveCodingCuatro {

    static class FizzBuzz {

        public static void imprimir() {
            for (int i = 1; i <= 100; i++) {
                String salida = "";
                if (i % 3 == 0) {
                    salida += "Fizz";
                }
                if (i % 5 == 0) {
                    salida += "Buzz";
                }
                if (salida.isEmpty()) {
                    salida += i;
                }
                System.out.println(salida);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.imprimir();
    }
}