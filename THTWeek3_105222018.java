import java.util.Scanner;

public class THTWeek3_105222018{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = input.nextInt();
        input.nextLine(); 

        for (int i = 1; i <= jumlahKaryawan; i++) {
            System.out.println("\nData Karyawan ke-" + i);
            
            System.out.print("ID Karyawan: ");
            String idKaryawan = input.nextLine();
            
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("Shift Kerja (Pagi/Siang/Malam): ");
            String shift = input.nextLine().toLowerCase();
            
            double tarifPerJam;
            switch (shift) {
                case "pagi":
                    tarifPerJam = 30000;
                    break;
                case "siang":
                    tarifPerJam = 35000;
                    break;
                case "malam":
                    tarifPerJam = 40000;
                    break;
                default:
                    System.out.println("Shift kerja tidak valid!");
                    continue;
            }

            double jamKerja;
            while (true) {
                System.out.print("Total Jam Kerja dalam Seminggu: ");
                jamKerja = input.nextDouble();
                if (jamKerja >= 0) {
                    break;
                }
                System.out.println("Jam kerja tidak boleh negatif!");
            }

            int absen;
            while (true) {
                System.out.print("Jumlah Hari Absen: ");
                absen = input.nextInt();
                if (absen >= 0 && absen <= 7) {
                    break;
                }
                System.out.println("Jumlah hari absen harus antara 0-7!");
            }
            input.nextLine();

            double gajiDasar = jamKerja * tarifPerJam;

            double lembur = (jamKerja > 40) ? (jamKerja - 40) * (1.5 * tarifPerJam) : 0;

            double potonganPersen = (jamKerja < 30) ? 0.1 * gajiDasar : 0;

            double potonganAbsen = absen * 100000;

            double totalGaji = (gajiDasar + lembur) - (potonganPersen + potonganAbsen);
        
            System.out.println("\n=== Laporan Gaji Karyawan ===");
            System.out.println("ID Karyawan   : " + idKaryawan);
            System.out.println("Nama          : " + nama);
            System.out.println("Shift Kerja   : " + shift.substring(0, 1).toUpperCase() + shift.substring(1));
            System.out.println("Total Jam Kerja : " + jamKerja);
            System.out.println("Jumlah Absen    : " + absen);
            System.out.println("Total Gaji      : Rp " + String.format("%,.2f", totalGaji));
        }

        input.close();
    }
}
