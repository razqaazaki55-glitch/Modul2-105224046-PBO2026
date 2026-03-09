import java.util.Scanner;

public class nomorsatu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang ruangan: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar ruangan: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi ruangan: ");
        double tinggi = input.nextDouble();
        // Hitung luas 4 sisi dinding
        double luasDinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
        // Hitung kebutuhan cat
        double kebutuhanCat = luasDinding / 10;
        // Pembulatan ke atas
        double literCat = Math.ceil(kebutuhanCat);

        // Output
        System.out.println("Luas permukaan dinding: " + luasDinding + " meter persegi");
        System.out.println("Kebutuhan cat yang diperlukan: " + literCat + " liter");

        input.close();
    }
}
