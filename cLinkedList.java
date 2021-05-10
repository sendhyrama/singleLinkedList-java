package linkedList1;
import java.util.Scanner;

public class cLinkedList {
    Scanner sc = new Scanner(System.in);
    cNode header; int js, pilih;
    String batas = "------------------------";

    public cLinkedList(cNode header) {
        this.header = header;
        this.js = 0;
    }

    public void addNode (cNode baru){
        if (header == null){
            header = baru;
        } else {
            baru.next = header;
            header = baru;
            js++;
        }
        System.out.println(batas+"\n#Penambahan sukses...");
    }

    public void delNodeFront(){
       if (header == null){
           System.out.println("#Data kosong...");
       }
       else {
           System.out.println("Nama : "+header.getNama());
           System.out.println("NPM  : "+header.getNPM());
           System.out.println("IPK  : "+header.getIPK());
           System.out.println("\n  (1) Ya || (2) Tidak");
           System.out.println(batas);
           System.out.print("pilih = ");
           pilih = sc.nextInt();
           System.out.println(batas);
           if (pilih == 1){
               cNode t = header.next;
               header = t = null;
               js--;
               System.out.println("#Penghapusan sukses...");
           }
           else {
               System.out.println("#Penghapusan batal...");
           }
       }
    }

    public void findNode(){
        System.out.println("(1) Nama");
        System.out.println("(2) NPM");
        System.out.println(batas);
        System.out.print("pilih = ");
        pilih = sc.nextInt();
        System.out.println(batas);
        if (pilih == 1){
            System.out.println("[CARI DATA > NAMA]");
            System.out.print("Masukkan Nama = ");
            String nama = sc.next();
            System.out.println(batas);
            int cari = 0;
            for (cNode t = header; t != null; t = t.next) {
                if (nama.contains(t.getNama())) {
                    System.out.println("#Data ditemukan...");
                    System.out.println("Nama : "+t.getNama());
                    System.out.println("NPM  : "+t.getNPM());
                    System.out.println("IPK  : "+t.getIPK());
                    cari++;
                }
            }
            if (cari == 0) {
                System.out.println("#Data tidak ditemukan...");
            }
        } else if (pilih == 2) {
            System.out.println("[CARI DATA > NPM]");
            System.out.print("Masukkan NPM  = ");
            String npm = sc.next();
            System.out.println(batas);
            int cari = 0;
            for (cNode t = header; t != null; t = t.next) {
                if (npm.contains(t.getNPM())) {
                    System.out.println("#Data ditemukan...");
                    System.out.println("Nama : "+t.getNama());
                    System.out.println("NPM  : "+t.getNPM());
                    System.out.println("IPK  : "+t.getIPK());
                    cari++;
                }
            }
            if (cari == 0) {
                System.out.println("#Data tidak ditemukan...");
            }
        }else System.out.println("#Invalid...");
    }
    
    public void print (){
        int row = 1;
        for (cNode t = header; t != null; t = t.next) {
            System.out.println("");
            System.out.println("Data ("+row+")");
            System.out.println("Nama : "+t.getNama()+" ");
            System.out.println("NPM  : "+t.getNPM()+" ");
            System.out.println("IPK  : "+t.getIPK()+" ");
            row++;
        }
    }
}
