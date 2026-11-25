package ifelse;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int pin = 123456;
        int saldoTersedia = 850000;
        int kelipatanTarik = 50000;
        int maksTarik = 2000000;
        int sisaSaldo;

        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT PIN: ");
        int inputPin = sc.nextInt();

        if(inputPin == pin){
            System.out.println("Input Nominal Tarik Tunai: ");
            int nominalTarik = sc.nextInt();
            if(nominalTarik%50000 == 0){
                if(nominalTarik>maksTarik){
                    System.out.println("Diluar batas 1x penarikan");
                } else if (nominalTarik > saldoTersedia ){
                    System.out.println("Saldo anda kurang, silahkan kerja lebih keras lagi");
                } else {
                    sisaSaldo = saldoTersedia - nominalTarik;
                    System.out.println("Proses, mohon tunggu");
                    System.out.println("Penarikan berhasil, sisa saldo anda "+sisaSaldo);
                }
            } else {
                System.out.println("Nominal harus kelipatan 50.000, silahkan coba lagi");
            }
        } else {
            System.out.println("Password Salah, silahkan coba lagi");
        }

    }
}
