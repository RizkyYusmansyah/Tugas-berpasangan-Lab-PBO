
/**
 * Merepresentasikan Obat Salep yang merupakan bagian dari Obat-obatan
 *
 *@author Rizky Yusmansyah (2208107010024), Reyan Andrea (2208107010014)
 * @version 13.11.2023
 * @since 10.11.2023
 */
public class ObatSalep extends Obat {

    /**
     * Constructor untuk membuat obat salep baru tanpa parameter
     */
    public ObatSalep() {
    }

    /**
     * Constructor untuk membuat obat salep baru dengan parameter
     * 
     * @param nama  nama dari obat salep
     * @param harga harga dari obat salep
     */
    public ObatSalep(String nama, int harga) {
        super(nama, harga); // dari superclass obat
    }

    /**
     * Method ini berfungsi untuk menampilkan cara pemakaian dari class obat salep
     */
    public void caraPakai() {
        System.out.println("Nt: Obat digunakan dengan cara dioleskan ke permukaan kulit secara merata");
    }

    /**
     * Method ini berfungsi untuk mencetak deskripsi dari obat salep
     * 
     * @param desc deskripsi dari obat salep
     */
    public void cetakDeskripsi(String desc) {
        super.setDeskripsi(desc);
        System.out.println(super.getDeskripsi());
    }
}
