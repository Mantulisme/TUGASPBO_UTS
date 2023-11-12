package UTSPBO1;
public class HewanDemo {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        System.out.println("Suara Kucing: ");
        kucing.bersuara();

        System.out.println("\nSuara Anjing: ");
        anjing.bersuara();
    }
}
