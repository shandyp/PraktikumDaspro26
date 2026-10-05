import java.util.Scanner;

public class StudiKasus126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.printf("%-21s", "Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        System.out.printf("%-21s", "Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

        if (totalHarga > 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }

        totalBayar = totalHarga - diskon;

        System.out.printf("%-21s", "Total harga: ");
        System.out.println(totalHarga);
        System.out.printf("%-21s", "Diskon: ");
        System.out.println(diskon);
        System.out.printf("%-21s", "Total bayar: ");
        System.out.println(totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.printf("%-21s", "Kembalian: ");
            System.out.println(kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.printf("%-21s", "Uang kurang: ");
            System.out.println(kurang);

        }
    }
}
