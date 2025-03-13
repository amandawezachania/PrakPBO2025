import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       //belajar if - else
       
       boolean x = true;
       if(!x){
        System.out.println("ini adalah blok if");
       } else {
        System.out.println("ini adalah blok else");
       }

       boolean y = false;
       if(!y){
        System.out.println("ini adalah blok if");
       } else {
        System.out.println("ini adalah blok else");
       }

       int a = 10;
       if (a > 5){
        System.out.println("a lebih besar dari 5");
       } else{
        System.out.println("a lebih kecil dari 5");
       }

       Scanner input = new Scanner(System.in);
       System.out.println("Masukkan angka:");
       int nilai = input.nextInt();

       if(nilai > 80){
        System.out.println("Nilai anda A");
       }else if (nilai > 70){
        System.out.println("Nilai anda B");
       }else if (nilai > 60){
        System.out.println("Nilai anda C");
       }else if (nilai > 50){
        System.out.println("Nilai anda D");
       }else {
        System.out.println("Nilai anda E");
       }

       input.close();

       int day = 1;
       switch(day){
        case 1:
        System.out.println("Senin");
        break;
        case 2:
        System.out.println("Selasa");
        break;
        case 3:
        System.out.println("Rabu");
        break;
        case 4:
        System.out.println("Kamis");
        break;
        case 5:
        System.out.println("Jumat");
        break;
        case 6:
        System.out.println("Sabtu");
        break;
        case 7:
        System.out.println("Minggu");
        break;
        default :
        System.out.println("Hari tidak Valid");
       }

       String dayName = "Senin";
       switch(day){
        case 1:
        System.out.println("Senin");
        break;
        case 2:
        System.out.println("Selasa");
        break;
        case 3:
        System.out.println("Rabu");
        break;
        case 4:
        System.out.println("Kamis");
        break;
        case 5:
        System.out.println("Jumat");
        break;
        case 6:
        System.out.println("Sabtu");
        break;
        case 7:
        System.out.println("Minggu");

        break;
        default :
        System.out.println("Hari tidak Valid");
       }
       //belajar ternary operator
       int angka = 5;
       if (angka % 2 == 0){
        System.out.println("Angka genap");
       }else{
        System.out.println("Angka ganjil");
       }
       //ternary operator
       String hasil = (angka % 2 == 0)? " Angka genap" : "Angka ganjil";
       System.out.println(hasil);

       //foor loop
       for (int i = 0; i < 5; i++){
        System.out.println("Perulangan ke-" + i);
       }
       for (int i = 0; i < 5; i++){
        System.out.println("Perulangan ke-" + (i + 1));
       }

       //while loop
       int i = 0;
       while (i < 5){
        System.out.println("Perulangan ke-" + (i +1));
       }

       // do-while loop
       do{
        System.out.println("Perulangan ke-" + (i + 1));
        i++;
       }while (i < 5);

       // for-each loop
       int numbers[] = {1, 2, 3, 4, 5};
       for(int i : numbers){
        System.out.print(i);
       }

       //break ancontinue
       for (int i = 0; i < 5; i++){
        if (i ==3){
            break;
        }
        System.out.println("Perulangan ke-" + i);
       }
       for (int i = 0; i < 5; i++){
        if (i ==3){
            continue;
        }
        System.out.println("Perulangan ke-" + i);
       }
       while(true){
        System.out.println("pilih menu:");
        System.out.println("1. menu 1");
        System.out.println("2. menu 2");
        System.out.println("0. keluar");

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan pilihan");
        int pilihan = input.nextInt();
        switch (pilihan){
        case 1:
        System.out.println("anda memilih menu 1");
        break;
        case 2:
        System.out.println("anda memilih menu 2");
        break;
        case 0:
        System.out.println("anda keluar dari program");
        System.exit(0);
        break;
        default :
            System.out.println("Pilihan tidak valid");
        break;
       }
       }
   // int[] number = {1, 2, 3, 4, 5};
     //  numbers = new int[5];
       //numbers[0] = 10;
       //numbers[1] = 20;
       //  numbers[2] = 30;

       int[] number = {1, 2, 3, 4, 5};
       System.out.println(numbers[2]);
       numbers[2] = 10;
       System.out.println(numbers[2]);
       System.out.println(numbers.length);

       //string


    }}