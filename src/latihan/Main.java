package latihan;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner onit = new Scanner (System.in); 
        int pilihan;
        do{

             System.out.println("Menu :");
             System.out.println("1. angka->teks");
             System.out.println("2. teks->angka");
             System.out.println("3. keluar");
             System.out.print("1/2/3 : ");
             pilihan = input.nextInt();
            switch(pilihan){
                case 1 : 
                    convert at = new convert ();
                    System.out.print("Masukan angka(1-1000) : ");
                    int x = input.nextInt();
                    at.setAngka(x);
                    break;
                case 2:
                    convert ta = new convert ();
                    System.out.print("Masukan huruf : ");
                    String q = onit.nextLine();
                    ta.setTeks(q);
                    break;
                case 3 :
                    System.out.println("Anda keluar dari program");
                    break;
                    
                default : System.out.println("error"); 
            }
        }while(pilihan!=3);
    }
}

class ubah {
    private long angka;
    private int awal;
    private int akhir;
    private String sebut;
    private boolean cek = false;

    String ancil[] = {"satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh"};

    public ubah() {
    }
    public void setAngka(int angka) {
        if (angka <= 10) {
            System.out.println(ancil[angka - 1]);
        } else if (angka == 11) {
            System.out.println("sebelas");
        } else if (angka > 11 && angka < 20) {
            int b = angka % 10;
            System.out.println(ancil[b - 1] + " belas");
        } else if (angka >= 20 && angka < 100) {
            int c = angka / 10;
            int d = angka % 10;
            if (angka % 10 == 0) {
                System.out.println(ancil[c - 1] + " puluh");
            } else {
                System.out.println(ancil[c - 1] + " puluh " + ancil[d - 1]);
            }
        } else if (angka == 100) {
              System.out.println("seratus");
        } else if (angka > 100 && angka <= 110) {
            int e = angka % 100;
            System.out.println("seratus " + ancil[e - 1]);
        } else if (angka == 111){
            System.out.println("seratus sebelas");
        } else if (angka > 111 && angka < 120){
            int f = angka % 110;
            System.out.println("seratus " + ancil[f - 1] + " belas");
        } else if (angka >= 120 && angka < 200){
            int g = angka % 100;
            int h = g / 10;
            int i = g % 10;
            if (g % 10 == 0){
                System.out.println("seratus " + ancil[h-1] + " puluh");
            } else {
                System.out.println("seratus " + ancil[h-1] + " puluh " + ancil[i-1]);
            }
        } else if (angka >= 200 && angka < 1000){
            int j = angka / 100;
            int k = angka % 100;
            int l = k / 10;
            int m = k % 10;
            if (angka % 100 == 0){
                System.out.println(ancil[j-1] + " ratus");
            } else if (k % 10 == 0){
                System.out.println(ancil[j-1] + " ratus " + ancil[l-1] + " puluh");
            } else {
                System.out.println(ancil[j-1] + " ratus " + ancil[l-1] + " puluh " + ancil[m-1]);
            }
        } else if (angka == 1000) {
            System.out.println("seribu");
        }
    }

    public void setTeks(String a) {
        a.toLowerCase();
        for (int i = 0; i < ancil.length; i++) {
            if ((ancil[i].equals(a))) {
                int satuan = i + 1;
                System.out.println(satuan);
                this.cek=true;
                break;
            } else if (a.contains(ancil[i]) && a.contains("belas")) {
                int belasan = i + 1 + 10;
                System.out.println(belasan);
                this.cek=true;
                break;
            } else if (a.contains(ancil[i]) && a.contains("puluh")){
                int puluhan = (i + 1) * 10;
                System.out.println(puluhan);
                this.cek=true;
                break;
            } else if (a.contains(ancil[i]) && a.contains("ratus")){
                int ratusan = (i + 1) * 100;
                System.out.println(ratusan);
                this.cek=true;
                break;
            
            } else if (a.equals("sebelas")) {
                System.out.println("11");
                this.cek=true;
                break;
            } else if (a.equals("seratus")) {
                System.out.println("100");
                this.cek=true;
                break;
            } else if (a.equals("seribu")) {
                System.out.println("1000");
                this.cek=true;
                break;
            }
        }
        if(cek==false){
            
        for (int i = 0; i <ancil.length; i++) {
            if(a.substring(10).contains(ancil[i]))this.akhir=i+1;
        }
        for (int i = 0; i <ancil.length; i++) {
            if(a.substring(0,9).contains(ancil[i]))this.awal=(i+1)*10;
        }
        System.out.println(this.awal+this.akhir);
        }
    }
}