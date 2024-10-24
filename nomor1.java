// Kelas induk
class Kendaraan {
    private String nama;
    private int roda;

    public Kendaraan(String nama, int roda) {
        this.nama = nama;
        this.roda = roda;
    }

    public String getNama() {
        return nama;
    }

    public int getRoda() {
        return roda;
    }

    public String deskripsi() {
        return nama + " memiliki " + roda + " roda.";
    }
}

// Kelas turunan
class Mobil extends Kendaraan {
    private String bahanBakar;

    public Mobil(String nama, int roda, String bahanBakar) {
        super(nama, roda);
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    @Override
    public String deskripsi() {
        return getNama() + " memiliki " + getRoda() + " roda dan menggunakan " + bahanBakar + " sebagai bahan bakarnya.";
    }
}

// Demo
public class DemoPewarisan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 4, "bensin");
        System.out.println(mobil.deskripsi());
    }
}
