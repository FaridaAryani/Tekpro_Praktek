public class Restaurant{
    private makanan[] menuMakanan;

    public Restaurant(){
        menuMakanan = new makanan[10];
    }
    public void tambahMenuMakanan(String nama, double harga, int stok){
        menuMakanan[makanan.getId()] = new makanan(nama,harga,stok);
    }
    public void tampilMenuMakanan(){
        for(int i = 0; i <makanan.getId(); i++){
            makanan Makanan = menuMakanan[i];
            if(Makanan != null && !Makanan.isOutOfStock()){
                System.out.println(Makanan.getNama()+"["+Makanan.getStok()+"]\t Rp. " + Makanan.getHarga());
            }
        }
    }
    public void beliMakanan(int id, int jumlah){
        if(id>=0 && id < makanan.getId()){
            makanan Makanan = menuMakanan[id];
            if(Makanan != null && !Makanan.isOutOfStock()){
                if(Makanan.getStok() >= jumlah){
                    Makanan.setStok(Makanan.getStok()-jumlah);
                    System.out.println("Pembelian berhasil: "+Makanan.getNama()+"x"+jumlah);
                }else{
                    System.out.println("Stok tidak mencukupi untuk pembelian: "+ Makanan.getNama());
                }
            }else{
                System.out.println("item makanan tidak ada");
            }
        }else{
            System.out.println("ID makanan tidak valid");
        }
    }
}