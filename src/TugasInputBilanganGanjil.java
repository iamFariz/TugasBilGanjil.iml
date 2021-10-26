import java.util.Random;
import java.util.Scanner;

public class TugasInputBilanganGanjil {

    public static void main(String[] args) {
        //Scanner input

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Sebuah Angka = ");
        int angka = input.nextInt();

        //ganjil adalah jika angka % 2 = 1
        if (angka % 2 == 1) {
            System.out.println("Angka " + angka + " Adalah Bilangan Ganjil");
        } else {
            System.out.println("Angka " + angka + " Bukan Bilangan Ganjil ");
        }
        if (angka > 1000) {
            System.out.println(" Angka " + angka + " Adalah Bilangan lebih dari 1000");
        } else {
            System.out.println(" Angka " + angka + " Adalah Bilangan kurang dari 1000");
        }
    }
}

