import java.util.Scanner;

public class LatihanPrak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Masukkin satu kalimat: ");
        String kalimat = input.nextLine();
        int jumlahVokal = 0;
        String vokal = "aiueoAIUEO";
    
        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = kalimat.charAt(i);
            if (vokal.indexOf(huruf) != -1) {
                    jumlahVokal++;
                }
            }
    
            switch (jumlahVokal % 2) {
                case 0:
                    System.out.println("Jumlah vokal genap");
                    break;
                default:
                    System.out.println("Jumlah vokal ganjil");
                    break;
            }
    
            System.out.print("Kalimat terbalik: ");
            char[] karakter = kalimat.toCharArray();
            for (int i = karakter.length - 1; i >= 0; i--) {
                System.out.print(karakter[i]);
            }
            System.out.println();
    
            input.close();
        }
    }    