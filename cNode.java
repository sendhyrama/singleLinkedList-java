package linkedList1;

public class cNode {
    private String nama;
    private String npm;
    private double ipk;    
    cNode next;

    public cNode(String nama, String npm, double ipk) {
        this.nama = nama;
        this.npm = npm;
        this.ipk = ipk;
        next = null;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNPM(String npm) {
        this.npm = npm;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getNPM() {
        return npm;
    }

    public double getIPK() {
        return ipk;
    }
    
}
