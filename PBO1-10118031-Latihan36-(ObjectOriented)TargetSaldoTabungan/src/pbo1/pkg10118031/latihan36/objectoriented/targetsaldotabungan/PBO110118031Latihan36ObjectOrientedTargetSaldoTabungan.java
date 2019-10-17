package pbo1.pkg10118031.latihan36.objectoriented.targetsaldotabungan;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini berisi program Target Saldo Tabungan
 */
public class PBO110118031Latihan36ObjectOrientedTargetSaldoTabungan {

    public static void main(String[] args) {

        Tabungan tab = new Tabungan();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungLamaSaldoTarget(tab.saldo, saldoTarget);

    }

}
