package Kata1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate fecha = LocalDate.of(2002,03,18);

        Kata1.Person alejandro = new Kata1.Person("Alejandro", fecha);

        System.out.printf(alejandro.getName()+ " tiene " + alejandro.getAge() + " años");
    }
}
