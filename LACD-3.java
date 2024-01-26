////EJERCICIOS EN LIVE CODING CON DAVID ALBERTO ROMERA

package org.generation.live2;

import java.util.Scanner;

public class LiveCodingDos {

    static class MangosNaranjas {

        private int mangos;
        private int naranjas;

        public MangosNaranjas(int mangos, int naranjas) {
            this.mangos = mangos;
            this.naranjas = naranjas;
        }

        public void imprimir() {
            int cajasMangos = mangos / getCantidadPorCaja(mangos);
            int cajasNaranjas = naranjas / getCantidadPorCaja(naranjas);

            System.out.println("El número de cajas es: " + (cajasMangos + cajasNaranjas));
            System.out.println("El número de mangos por caja es: " + getCantidadPorCaja(mangos));
            System.out.println("El número de naranjas por caja es: " + getCantidadPorCaja(naranjas));
        }

        private int getCantidadPorCaja(int cantidad) {
            return (cantidad == 0) ? 0 : (int) Math.ceil(cantidad / Math.max(cantidad, 1.0));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de mangos: ");
        int mangos = scanner.nextInt();

        System.out.println("Introduce el número de naranjas: ");
        int naranjas = scanner.nextInt();

        MangosNaranjas mangosNaranjas = new MangosNaranjas(mangos, naranjas);
        mangosNaranjas.imprimir();
    }
}