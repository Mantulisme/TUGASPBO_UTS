package UTSPBO1;
public abstract class Hewan {
    public String jenisSuara;

    public Hewan() {
        inisialisasiSuara();
    }

    protected abstract void inisialisasiSuara();

    public void bersuara() {
        System.out.println(jenisSuara);
    }
}
