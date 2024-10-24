import java.util.Scanner;

public class ParkingTicketMachine {
    private int balance;      
    private int ticketPrice;  
    private int ticketTime;   

    public ParkingTicketMachine(int ticketPrice) {
        this.ticketPrice = ticketPrice;
        this.balance = 0;
        this.ticketTime = 0;
    }

    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Uang berhasil dimasukkan. Saldo saat ini: " + balance);
        } else {
            System.out.println("Jumlah uang tidak valid. Masukkan jumlah yang lebih dari 0.");
        }
    }

    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice;
            balance -= ticketTime * ticketPrice;
            System.out.println("Tiket berhasil dikeluarkan. Waktu parkir yang dibeli: " + ticketTime + " jam.");
            System.out.println("Saldo sisa: " + balance);
        } else {
            System.out.println("Saldo tidak cukup untuk mengeluarkan tiket.");
        }
    }

    public int getTimePurchased() {
        return ticketTime;
    }

    public void printDetails() {
        System.out.println("Harga tiket per jam: " + ticketPrice);
        System.out.println("Saldo saat ini: " + balance);
        System.out.println("Waktu parkir yang dibeli: " + ticketTime + " jam");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan harga tiket parkir per jam:");
        int hargaTiket = scanner.nextInt();

        ParkingTicketMachine mesin1 = new ParkingTicketMachine(hargaTiket);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Masukkan Uang");
            System.out.println("2. Keluarkan Tiket");
            System.out.println("3. Cek Waktu Parkir yang Dibeli");
            System.out.println("4. Cek Saldo dan Detail Mesin");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah uang: ");
                    int amount = scanner.nextInt();
                    mesin1.insertMoney(amount);
                    break;
                case 2:
                    mesin1.issueTicket();
                    break;
                case 3:
                    System.out.println("Waktu parkir yang dibeli: " + mesin1.getTimePurchased() + " jam");
                    break;
                case 4:
                    mesin1.printDetails();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan mesin tiket parkir.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}
