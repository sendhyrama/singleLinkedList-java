package linkedList1;
import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        cNode node;
        cLinkedList LL = new cLinkedList (null);
        int pilih; String batas = "------------------------";
        
        do{
            System.out.println("");
            System.out.println("========================");
            System.out.println("     MENU MAHASISWA     ");
            System.out.println("========================");
            System.out.println("(1) Tambah data");
            System.out.println("(2) Hapus data");
            System.out.println("(3) Cari data");
            System.out.println("(4) Cetak data");
            System.out.println("(5) Selesai");
            System.out.println(batas);
            System.out.print("pilih = ");
            pilih = sc.nextInt();
            System.out.println(batas);

            switch(pilih){
                case 1 :
                    System.out.println("[TAMBAH DATA]");
                    System.out.print("Masukkan Nama = ");
                    String nama = sc.next();
                    System.out.print("Masukkan NPM  = ");
                    String npm = sc.next();
                    System.out.print("Masukkan IPK  = ");
                    double ipk = sc.nextDouble();
                    node = new cNode (nama, npm, ipk);
                    LL.addNode(node);
                    break;           
                    
                case 2 :
                    System.out.println("[HAPUS DATA]");
                    LL.delNodeFront();
                    break;
                    
                case 3 :
                    System.out.println("[CARI DATA]");
                    LL.findNode();
                    break;
                    
                case 4 : 
                    System.out.println("[CETAK DATA]");
                    LL.print();
                    break;
            }
        } while (pilih!=5);
    }
}
