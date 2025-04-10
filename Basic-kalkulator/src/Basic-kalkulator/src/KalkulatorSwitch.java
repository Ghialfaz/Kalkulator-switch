import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args) {
        mathCal();
    }

    static void mathCal() {
        /**
         * user memilih ingin menggunakan metode apa (+,*,-,%,/)
         * jika user memilih perkalian maka akan masuk ke case perkalian
         * di dalam case perkalian user akan diminta memili 2 nilai yang akan dikalikan
         */
        System.out.println("+++++++++KALKULATOR++++++++");
        System.out.println("===========================");
        System.out.print("(*, +, -, %, /) : ");
        Scanner inNum = new Scanner(System.in);
        String input = inNum.nextLine();
        int value1;
        int value2;
        String nilaiOutput = "Nilai :";

        switch (input) {
            case "*":
                System.out.println("-----PERKALIAN OUTPUT------");
                System.out.print(nilaiOutput);
                value1 = inNum.nextInt();
                System.out.print(nilaiOutput);
                value2 = inNum.nextInt();
                var Kali = value1 * value2;
                System.out.println("===========================");
                System.out.println("Hasil : " + Kali);
                mathCal();
                break;

            case "+":
                System.out.println("----PENJUMLAHAN OUTPUT-----");
                System.out.print(nilaiOutput);
                value1 = inNum.nextInt();
                System.out.print(nilaiOutput);
                value2 = inNum.nextInt();
                var Jumlah = value1 + value2;
                System.out.println("===========================");
                System.out.println("Hasil : " + Jumlah);
                mathCal();
                break;

            case "%":
                System.out.println("-----PEMBAGIAN OUTPUT------");
                System.out.print(nilaiOutput);
                value1 = inNum.nextInt();
                System.out.print(nilaiOutput);
                value2 = inNum.nextInt();
                var Bagi = value1 % value2;
                System.out.println("===========================");
                System.out.println("Hasil : " + Bagi);
                mathCal();
                break;

            case "-":
                System.out.println("----PENGURANGAN OUTPUT-----");
                System.out.print(nilaiOutput);
                value1 = inNum.nextInt();
                System.out.print(nilaiOutput);
                value2 = inNum.nextInt();
                var Kurang = value1 - value2;
                System.out.println("===========================");
                System.out.println("Hasil : " + Kurang);
                mathCal();
                break;

            case "/":
                System.out.println("-----HASILBAGI OUTPUT------");
                System.out.print(nilaiOutput);
                value1 = inNum.nextInt();
                System.out.print(nilaiOutput);
                value2 = inNum.nextInt();
                var hasilBagi = value1 / value2;
                System.out.println("===========================");
                System.out.println("Hasil : " + hasilBagi);
                mathCal();
                break;

            default:
                System.out.print("perintah tidak valid, ulangi? (Y/N): ");
                String ulangi = inNum.nextLine();
                if (ulangi.equalsIgnoreCase("Y")) {
                    mathCal();
                } else {
                    System.out.println("perintah dihentikan");
                }
        }
        inNum.close();
    }
}
