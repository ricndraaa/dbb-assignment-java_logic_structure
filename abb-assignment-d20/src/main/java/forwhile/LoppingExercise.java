package forwhile;

import java.util.Scanner;

public class LoppingExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] harga = {10000,15000,20000};
        String[] menu = {"kebab","berjer","pitsa"};
        boolean lanjut = true;
        int total;

        while(lanjut){
            System.out.println("========================");
        for (int i = 0; i<menu.length; i++){
            System.out.println((i+1)+". "+menu[i]+" Rp "+harga[i]);
        }

        System.out.println("Pilih menu yang mana: ");
        int nomorMenu = sc.nextInt();

        System.out.println("Anda memilih menu "+nomorMenu+"\n");

        }
    }
}
