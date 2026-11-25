package switchcase;

import java.util.Scanner;

public class SwitchCaseExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat Datang \n Menu Tersedia:\n 1. Kebab Rp. 10k  \n 2. Berjer Rp. 15k \n 3. Pitsa Rp. 20k \n Silahkan Pilih Pesanan [1-3]: ");
        int pilihanMenu = sc.nextInt();
        String opsiMenu;

        switch (pilihanMenu) {
            case 1:
                System.out.println("Jadikan Paket [ya/tidak]: ");
                opsiMenu = sc.next().toLowerCase();
                switch (opsiMenu) {
                    case "ya":
                        System.out.println("Pesanan kebab include Es teh dan Kentang Goreng, total: 25k, silahkan bayar ke kasir");
                        break;
                    case "tidak":
                        System.out.println("Total 10k, silahkan bayar ke kasir");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid, ketik ya atau tidak");
                }
                break;
            case 2:
                System.out.println("Jadikan Paket [ya/tidak]: ");
                opsiMenu = sc.next().toLowerCase();
                switch (opsiMenu) {
                    case "ya":
                        System.out.println("Pesanan berjer include Es teh dan Kentang Goreng, total: 30k, silahkan bayar ke kasir");
                        break;
                    case "tidak":
                        System.out.println("Total 15k, silahkan bayar ke kasir");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid, ketik ya atau tidak");
                }
                break;
            case 3:
                System.out.println("Jadikan Paket [ya/tidak]: ");
                opsiMenu = sc.next().toLowerCase();
                switch (opsiMenu) {
                    case "ya":
                        System.out.println("Pesanan pitsa include Es teh dan Kentang Goreng, total: 35k, silahkan bayar ke kasir");
                        break;
                    case "tidak":
                        System.out.println("Total 20k, silahkan bayar ke kasir");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid, ketik ya atau tidak");
                }
                break;
            default:
                System.out.println("menu tidak ada, coba lagi");
        }
    }
}
