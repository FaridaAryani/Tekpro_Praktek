public class Produk{
    public String menu;
    public double harga;
    public int qty;
    public static byte id=0;
    public Produk(String menu, double harga, int qty){
        this.menu = menu;
        this.harga = harga;
        this.qty = qty;
        id++;
    }
    public String getMenu(){
        return menu;
    }
    public double getHarga(){
        return harga;
    }
    public int getQty(){
        return qty;
    }
    public boolean isOutOfStock(){
        return qty == 0;
    }
    public static byte getId(){
        return id;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
}