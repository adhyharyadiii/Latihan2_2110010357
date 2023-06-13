
package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa adhy = new Mahasiswa("2110010357", "M. Adhy Haryadi", "TI");
        
        System.out.println("NPM: "+adhy.npm);
        System.out.println("Nama: "+adhy.nama);
        System.out.println("Prodi: "+adhy.prodi);
    }
}
