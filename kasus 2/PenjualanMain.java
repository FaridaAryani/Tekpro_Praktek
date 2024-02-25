import java.util.Scanner;

public class PenjualanMain {
    public static void main(String[] args) {
        Penjualan penjualan = new Penjualan();

        Scanner scanner = new Scanner(System.in);

        // Menambahkan menu makanan dari input pengguna
        for (int i = 0; i < 10; i++) {
            penjualan.inputBarangProduk();
        }
        penjualan.tambahBarangProduk("Lemper", 5000, 10);// Menampilkan menu setelah penambahan
        penjualan.tampilBarangProduk();
        // penjualan.tampilBarangProduk();
        // Simulasi pembelian
        penjualan.beliMakanan(0, 6); // Membeli 3 Bala-Bala
        penjualan.tampilBarangProduk(); // Menampilkan menu setelah pembelian 
        // scanner.close();
        penjualan.konfirmasiPesananLain();
        scanner.close();
    }
}
