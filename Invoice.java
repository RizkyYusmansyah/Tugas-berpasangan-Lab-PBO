
/**
 * Merepresentasikan Invoice yaitu bill dari obat-obatan
 * yang dipesan dari Layanan Apotek DoubleR berbasis Online oleh pelanggan
 *
 * @author Rizky Yusmansyah (2208107010024), Reyan Andrea (2208107010014)
 * @version 13.11.2023
 * @since 10.11.2023
 */
public class Invoice {

    /**
     * Constructor untuk membuat Invoice baru tanpa parameter
     */
    public Invoice() {
    }

    /**
     * Method ini berfungsi untuk mencetak invoice dari pemesanan obat
     * 
     * @param jumlah jumlah dari obat
     * @param harga  harga dari obat
     */
    public void cetakInvoice(int jumlah, int harga) {
        System.out.println("TOTAL BARANG\t: " + jumlah);
        System.out.println("TOTAL HARGA\t: Rp " + harga);
    }
}
