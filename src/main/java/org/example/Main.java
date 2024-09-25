package org.example;

import org.example.MODELOS.Apartamento;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("*****************************");
        System.out.println("DATOS DEL APARTAMENTO: ");
        System.out.println("*****************************");

        System.out.println("***Bienvenido Usuario***");

        Scanner lea = new Scanner(System.in);
        Apartamento apartamento = new Apartamento();

        System.out.print("DIGITA EL ID: ");
        apartamento.setId(lea.nextLong());
        System.out.print("Su id es: " + apartamento.getId());

        System.out.print("DIGITA LA DIRECCION: ");
        apartamento.setDireccion(lea.nextLine());
        System.out.print("Su direccion es: " + apartamento.getDireccion());

        System.out.print("DIGITA EL ARRENDATARIO: ");
        apartamento.setArrendatario(lea.nextLine());
        System.out.print("El arrendatario es: " + apartamento.getArrendatario());

        System.out.print("DIGITA EL NUMERO DE HABITACIONES: ");
        apartamento.setNumeroHabitaciones(lea.nextInt());
        System.out.print("El numero de habitaciones es: " + apartamento.getNumeroHabitaciones());

        System.out.print("DIGITA EL PRECIO: ");
        apartamento.setPrecio((int) lea.nextDouble());
        System.out.print("El arrendatario es: " + apartamento.getPrecio());

        System.out.print("DIGITA LA FECHA DE ANTIGUEDAD: ");
        apartamento.setAntiguedad(());
        System.out.print("La fecha es: " + apartamento.getAntiguedad());

        System.out.print("DIGITA LA DISPONIBILIDAD: ");
        apartamento.setDisponibilidad(lea.hasNextBoolean());
        System.out.print("la disponibilidad es: " + apartamento.getDisponibilidad());



    }
}