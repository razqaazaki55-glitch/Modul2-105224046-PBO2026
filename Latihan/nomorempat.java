import java.util.Scanner;

public class nomorempat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        int totalDetik = input.nextInt();
        int jam = totalDetik / 3600;
        int sisaDetik = totalDetik % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;

        System.out.println("Hasil konversi: " + jam + " Jam, " + menit + " Menit, " + detik + " Detik");

        input.close();
    }
}
