package minggu5;
import java.util.Scanner;
public class Siakad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, nilaiAkhirHuruf, Kualifikasi;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if (nilaiAkhir<=100 && nilaiAkhir>80) {
            nilaiAkhirHuruf = "A"; Kualifikasi = "Sangat Baik"; 
        }
        else if (nilaiAkhir<=80 && nilaiAkhir>73) {
            nilaiAkhirHuruf = "B+"; Kualifikasi = "Lebih dari Baik"; 
        }
        else if (nilaiAkhir<=73 && nilaiAkhir>65) {
            nilaiAkhirHuruf = "B"; Kualifikasi = "Baik"; 
        }
        else if (nilaiAkhir<=65 && nilaiAkhir>60) {
            nilaiAkhirHuruf = "C+"; Kualifikasi = "Lebih dari Cukup"; 
        }
        else if (nilaiAkhir<=60 && nilaiAkhir>50) {
            nilaiAkhirHuruf = "C"; Kualifikasi = "Cukup"; 
        }
        else if (nilaiAkhir<=50 && nilaiAkhir>39) {
            nilaiAkhirHuruf = "D"; Kualifikasi = "Kurang"; 
        }
        else {
            nilaiAkhirHuruf = "E"; Kualifikasi = "Gagal"; 
        }
        System.out.println("Nilai akhir huruf: "+ nilaiAkhirHuruf);
        System.out.println("Kualifikasi: "+ Kualifikasi);

        sc.close();
    }
}
