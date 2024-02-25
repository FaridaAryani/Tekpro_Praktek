public class makanan {
    private String nama;
    private double harga;
    private int stok;
    private static byte id=0;

    public makanan(String nama, double harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        id++;
    }
    public String getNama(){
        return nama;
    }
    public double getHarga(){
        return harga;
    }
    public int getStok(){
        return stok;
    }
    public boolean isOutOfStock(){
        return stok == 0;
    }
    public static byte getId(){
        return id;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
}
