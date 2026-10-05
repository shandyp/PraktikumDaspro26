import java.util.Scanner;

public class StudiKasus226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan, jmlDokumen, peringkatJuara, pesan;
        boolean statusPendanaanPKM;

        System.out.print("Nama mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen: ");
        jmlDokumen = sc.nextLine();
        System.out.print("Peringkat juara: ");
        peringkatJuara = sc.nextLine();

       if (jenisKegiatan.equalsIgnoreCase("BELMAWA") 
        || jenisKegiatan.equalsIgnoreCase("BAKORMA") 
        || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            if (peringkatJuara.equalsIgnoreCase("1") 
                || peringkatJuara.equalsIgnoreCase("2") 
                || peringkatJuara.equalsIgnoreCase("3")) {
                if (jmlDokumen.equalsIgnoreCase("4")) {
                    pesan = "Dana pendanaan diberikan";
                } else {
                    pesan = "Dokumen tidak lengkap, Dana pendanaan tidak diberikan";
                }
            } else {
                pesan = "Dana pendanaan tidak diberikan";
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status Pendanaan PKM (true/false): ");
             statusPendanaanPKM = sc.nextBoolean();
            if (statusPendanaanPKM) {
                if (jmlDokumen.equalsIgnoreCase("4")) {
                    pesan = "Dokumen lengkap, Dana pendanaan diberikan";
                } else {
                    pesan = "Dokumen tidak lengkap, Dana pendanaan tidak diberikan";
                }
            } else {
                statusPendanaanPKM = false;
                pesan = "Tidak lolos, Dana pendanaan tidak diberikan";
            }
        } else {
            statusPendanaanPKM = false;
            pesan = "Jenis kegiatan tidak memenuhi syarat";
        }
        
        System.out.println("Pesan: " + pesan);

    }
}
