import java.util.Scanner;
public class MainSurat12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat12 stack = new StackSurat12(10); 
        int pilihan;

        do {
            System.out.println("\nMenu Pengelolaan Surat Izin:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = input.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = input.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = input.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = input.nextInt();
                    Surat12 surat = new Surat12(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    Surat12 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat yang diproses:");
                        diproses.tampilkanInfo();
                    }
                    break;
                case 3:
                    Surat12 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat Izin Terakhir:");
                        terakhir.tampilkanInfo();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = input.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);
    }
}
