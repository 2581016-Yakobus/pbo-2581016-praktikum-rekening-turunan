public class Rekening {

    private String nomor;
    private String pemilik;
    protected int saldo;

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }
        saldo = saldo + jumlah;
        return true;
    }

    public boolean tarik(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }
        if (jumlah > saldo) {
            return false;
        }
        saldo = saldo - jumlah;
        return true;
    }

    public void cetakInfo() {
        System.out.println(nomor + " | " + pemilik + " | " + formatRupiah(saldo));
    }

    protected static String formatRupiah(int jumlah) {
        String angka = String.format("%,d", jumlah);
        angka = angka.replace(',', '.');
        return "Rp" + angka;
    }
}