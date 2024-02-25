import java.util.ArrayList;
import java.util.Scanner;
public class Penjualan {
    private ArrayList<Produk> daftarProduk;

    public Penjualan(){
        daftarProduk = new ArrayList<>();
    }
    public void tambahBarangProduk(String menu, double harga, int qty){
        daftarProduk.add(new Produk(menu, harga, qty));
    }
    public void tampilBarangProduk(){
        for(Produk produk : daftarProduk){
            if(produk != null && !produk.isOutOfStock()){
                System.out.println(produk.getMenu()+"["+produk.getQty()+"]\t Rp. "+produk.getHarga());
            }else{
                System.out.println("Produk tidak tersedia atau stok habis");
            }
        }
    }
    public void beliMakanan(int id, int jumlah){
        if(id>=0 && id < daftarProduk.size()){
            Produk produk = daftarProduk.get(id);
            if(produk != null && !produk.isOutOfStock()){
                if(produk.getQty()>=jumlah){
                    produk.setQty(produk.getQty()-jumlah);
                    System.out.println("Pembelian berhasil: "+produk.getMenu()+" x"+jumlah+" jadi membayar Rp. "+ produk.getHarga()*jumlah);
                }else{
                    System.out.println("Stok tidak mencukupi"+produk.getMenu());
                }
            }else{
                System.out.println("item makanan tidak tersedia");
            }
        }else{
            System.err.println("ID makanan tidak valid");
        }
    }
    public void inputBarangProduk(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan menu makananan ");
        System.out.print("Masukkan nama makanan: ");
        String menu = scanner.nextLine();
        System.out.print("Masukkan harga makanan: ");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan stok makanan: ");
        int qty = scanner.nextInt();
        tambahBarangProduk(menu, harga, qty);
        System.err.println("Menu makanan berhasil di tambahkan!");
    }
    public void konfirmasiPesananLain(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah Anda ingin memesan item makanan lain? (ya/tidak): ");
        String konfirmasi = scanner.nextLine().toLowerCase();

        if (konfirmasi.equals("ya")) {
            System.out.print("Masukkan nama makanan yang ingin dibeli: ");
            String menu = scanner.nextLine();
            System.out.print("Masukkan harga makanan yang ingin di beli: ");
            double harga = scanner.nextDouble();
            System.out.print("jumlah makanan yang ingin dibeli: ");
            int jumlah = scanner.nextInt();
            tambahBarangProduk(menu, harga , jumlah);
            System.out.println("Pembelian berhasil: "+menu+"x"+jumlah+"jadi harga yang di beli adalah" +harga*jumlah);
        } else if (!konfirmasi.equals("tidak")) {
            System.out.println("Input tidak valid. Silakan masukkan 'ya' atau 'tidak'.");
            konfirmasiPesananLain(); // Recursive call to handle invalid input
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
