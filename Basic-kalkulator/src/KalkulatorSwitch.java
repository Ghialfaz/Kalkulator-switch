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
        @SuppressWarnings("resource")
        Scanner inNum = new Scanner(System.in);
        String input = inNum.nextLine();

        switch (input) {
            case "*":
                System.out.println("-----PERKALIAN OUTPUT------");
                System.out.print("nilai : ");
                Scanner value1 = new Scanner(System.in);
                int hasil1 = value1.nextInt();
                System.out.print("nilai : ");
                Scanner value2 = new Scanner(System.in);
                int hasil2 = value2.nextInt();
                var Kali = hasil1 * hasil2;
                System.out.println("===========================");
                System.out.println("hasil : " + Kali);
                break;

            case "+":
                System.out.println("----PENJUMLAHAN OUTPUT-----");
                System.out.print("nilai : ");
                Scanner value3 = new Scanner(System.in);
                int hasil3 = value3.nextInt();
                System.out.print("nilai : ");
                Scanner value4 = new Scanner(System.in);
                int hasil4 = value4.nextInt();
                var Jumlah = hasil3 + hasil4;
                System.out.println("===========================");
                System.out.println("hasil : " + Jumlah);
                break;

            case "%":
                System.out.println("-----PEMBAGIAN OUTPUT------");
                System.out.print("nilai : ");
                Scanner value5 = new Scanner(System.in);
                int hasil5 = value5.nextInt();
                System.out.print("nilai : ");
                Scanner value6 = new Scanner(System.in);
                int hasil6 = value6.nextInt();
                var Bagi = hasil5 % hasil6;
                System.out.println("===========================");
                System.out.println("hasil : " + Bagi);
                break;

            case "-":
                System.out.println("----PENGURANGAN OUTPUT-----");
                System.out.print("nilai : ");
                Scanner value7 = new Scanner(System.in);
                int hasil7 = value7.nextInt();
                System.out.print("nilai : ");
                Scanner value8 = new Scanner(System.in);
                int hasil8 = value8.nextInt();
                var Kurang = hasil7 - hasil8;
                System.out.println("===========================");
                System.out.println("hasil : " + Kurang);
                break;

            case "/":
                System.out.println("-----HASILBAGI OUTPUT------");
                System.out.print("nilai : ");
                Scanner value9 = new Scanner(System.in);
                int hasil9 = value9.nextInt();
                System.out.print("nilai : ");
                Scanner value10 = new Scanner(System.in);
                int hasil10 = value10.nextInt();
                var hasilBagi = hasil9 / hasil10;
                System.out.println("===========================");
                System.out.println("hasil : " + hasilBagi);
                break;

            default:
                System.out.print("perintah tidak valid, ulangi? (Y/N): ");
                Scanner ulang = new Scanner(System.in);
                String ulangi = ulang.nextLine();

                if (ulangi.equalsIgnoreCase("Y")) {
                    mathCal();
                } else {
                    System.out.println("perintah dihentikan");
                }
                return;
        }

    }
}
