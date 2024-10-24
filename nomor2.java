public class Book {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String namaPenerbit;
    private String kategoriBuku;

    // Konstruktor untuk menginisialisasi atribut
    public Book(String judul, String penulis, int tahunTerbit, String namaPenerbit, String kategoriBuku) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.namaPenerbit = namaPenerbit;
        this.kategoriBuku = kategoriBuku;
    }

    // Metode untuk mencetak detail buku
    public void printDetails() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Nama Penerbit: " + namaPenerbit);
        System.out.println("Kategori Buku: " + kategoriBuku);
    }

    public static void main(String[] args) {
        // Membuat obyek Book dan mencetak detailnya
        Book buku = new Book("Ets Pbo", "Rafif Tharq", 2024, "Maju Bersama", "Pendidikan");
        buku.printDetails();
    }
}
