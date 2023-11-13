
/**
 * Merepresentasikan Obat Cair yang merupakan bagian dari Obat-obatan
 *
 * @author Rizky Yusmansyah (2208107010024), Reyan Andrea (2208107010014)
 * @version 13.11.2023
 * @since 10.11.2023
 */
public class ObatCair extends Obat {

    /**
     * Constructor untuk membuat obat cair baru tanpa parameter
     */
    public ObatCair() {
    }

    /**
     * Constructor untuk membuat obat cair baru dengan parameter
     * 
     * @param nama  nama dari obat cair
     * @param harga harga dari obat cair
     */
    public ObatCair(String nama, int harga) {
        super(nama, harga); // dari superclass obat
    }

    /**
     * Method ini berfungsi untuk menampilkan cara pemakaian dari class obat cair
     */
    public void caraPakai() {
        System.out.println("Nt: Obat digunakan dengan cara diminum dan dikocok terlebih dahulu");
    }

    /**
     * Method ini berfungsi untuk mencetak deskripsi dari obat cair
     * 
     * @param desc deskripsi dari obat cair
     */
    public void cetakDeskripsi(String desc) {
        super.setDeskripsi(desc);
        System.out.println(super.getDeskripsi());
    }
}
