package pbo1.pkg10118031.latihan36.objectoriented.targetsaldotabungan;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini berisi program Target Saldo Tabungan
 */
public class Tabungan {

    public int saldo;
    public int bunga;

    public double HitungBunga(int parSaldo, int parBunga) {
        return parSaldo * parBunga / 100;
    }

    public void HitungLamaSaldoTarget(int parSaldo, int parSaldoTarget) {
        int i = 1;
        while (parSaldo <= parSaldoTarget) {
            HitungBunga(parSaldo, bunga);
            parSaldo += HitungBunga(parSaldo, bunga);

            //format dan tampilkan output
            String mataUang = String.format("Rp.%,3d", parSaldo).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-" + i + " %s%n", mataUang);
            i++;
        }
    }
}
