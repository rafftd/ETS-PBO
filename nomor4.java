import java.util.ArrayList;
import java.util.List;

public class FoodOrder {
    private List<String> menuItems; 
    private List<Double> menuPrices; 
    private List<String> selectedItems; 
    private double totalPrice;       
    private boolean isPaid;          

    public FoodOrder() {
        this.menuItems = new ArrayList<>();
        this.menuPrices = new ArrayList<>();
        this.selectedItems = new ArrayList<>();
        this.totalPrice = 0.0;
        this.isPaid = false;

        addMenuItem("Ayam", 5000);
        addMenuItem("Mie", 2500);
        addMenuItem("Kentang Goreng", 1500);
    }

    private void addMenuItem(String item, double price) {
        menuItems.add(item);
        menuPrices.add(price);
    }

    public void selectItem(int index) {
        if (index >= 0 && index < menuItems.size()) {
            selectedItems.add(menuItems.get(index));
            totalPrice += menuPrices.get(index);
            System.out.println(menuItems.get(index) + " berhasil ditambahkan ke pesanan.");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
    public void markAsPaid() {
        isPaid = true;
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public List<Double> getMenuPrices() {
        return menuPrices;
    }

    public List<String> getSelectedItems() {
        return selectedItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean isPaid() {
        return isPaid;
    }
}

public class FoodOrderDemo {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Pilih Item");
            System.out.println("2. Lihat Daftar Pesanan");
            System.out.println("3. Lihat Total Harga");
            System.out.println("4. Tandai Sebagai Sudah Dibayar");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Menu:");
                    List<String> items = order.getMenuItems();
                    List<Double> prices = order.getMenuPrices();
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println((i + 1) + ". " + items.get(i) + " - Rp" + prices.get(i));
                    }

                    System.out.print("Pilih nomor menu yang ingin ditambahkan: ");
                    int menuItemIndex = scanner.nextInt() - 1;
                    order.selectItem(menuItemIndex);
                    break;
                case 2:
                    System.out.println("Daftar Pesanan:");
                    for (String menuItem : order.getSelectedItems()) {
                        System.out.println("- " + menuItem);
                    }
                    break;
                case 3:
                    System.out.println("Total Harga: Rp" + order.getTotalPrice());
                    break;
                case 4:
                    order.markAsPaid();
                    if (order.isPaid()) {
                        System.out.println("Pesanan sudah dibayar.");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi pemesanan makanan.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}

