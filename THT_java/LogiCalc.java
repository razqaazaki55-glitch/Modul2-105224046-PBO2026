import java.util.Scanner;

public class LogiCalc {
    public static void main(String[] args) throws Exception{
    
        Scanner input = new Scanner(System.in);

        //meminta input secara berurutan dari kasir menggunakan Scanner
        System.out.println("=== SISTEM LOGICALC FASTSEND ===");

        System.out.print("Masukkan Nama Klien: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Total Berat Barang: ");
        double TotalBerat = input.nextDouble();
        System.out.print("Masukkan Jarak Tujuan: ");
        int JarakTujuan = input.nextInt();
        System.out.print("Masukkan Jumlah Box: ");
        int JumlahBox = input.nextInt();

        System.out.println("\n=== DATA INPUT ===");
        System.out.println("Nama Klien: " + nama);
        System.out.println("Total Berat: " + TotalBerat);
        System.out.println("Jarak Tujuan: " + JarakTujuan);
        System.out.println("Jumlah Box: " + JumlahBox);

        //Manajemen Armada
        int Trukpenuh = JumlahBox / 150;
        int SisaBox = JumlahBox % 150;

        //Kalkulasi Biaya
        double TarifJarak = 15000;
        double TarifBerat = 5500;

        double dasarBiaya = (TarifJarak * JarakTujuan) + (TarifBerat * TotalBerat);
        double asuransi = dasarBiaya * 0.035;
        double TotalBayar = dasarBiaya + asuransi;

        int jam = JarakTujuan / 60;
        int menit = JarakTujuan % 60;

        System.out.println("\n=== RESI PENGIRIMAN ===");
        System.out.println("Klien : " + nama);
        System.out.println("Total Box : " + JumlahBox + " box");
        System.out.println("Kebutuhan Armada: " + Trukpenuh + " Truk Penuh dan sisa " + SisaBox + " box via Pikap.");
        System.out.println("Estimasi Waktu : " + jam + " Jam " + menit + " Menit (Asumsi 60km/jam)");

        System.out.println("\n=== RINCIAN BIAYA ===");
        System.out.printf("Dasar Biaya : Rp %.2f\n", dasarBiaya);
        System.out.printf("Asuransi (3.5%%) : Rp %.2f\n", asuransi);
        System.out.println("-----------------------------------");
        System.out.printf("TOTAL BAYAR : Rp %.2f\n", TotalBayar);
        System.out.println("===================================");
        input.close();
    }

}

