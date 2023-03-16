import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Nama \t: Rama Pramudya Wibisana\n");
        System.out.print("NPM \t: 2022320019\n");
        System.out.print("Kelas \t: FI22B\n");

        double LuasLingkaran, LuasPersegiPanjang, phi=3.14;
        int r, p, l;

        System.out.print("\n(LINGKARAN) Masukkan jari-jari lingkaran : ");
        r = input.nextInt();

        System.out.print("\n(PERSEGI PANJANG) Masukkan panjang persegi panjang : ");
        p = input.nextInt();
        System.out.print("(PERSEGI PANJANG) Masukkan lebar persegi panjang : ");
        l = input.nextInt();

        LuasPersegiPanjang = p*l;
        LuasLingkaran = phi*r*r;

        System.out.println("\n======================================================");
        System.out.println("PROGRAM PERHITUNGAN LUAS LINGKARAN DAN PERSEGI PANJANG");
        System.out.println("======================================================");
        System.out.println("Luas lingkaran adalah : " + LuasLingkaran);
        System.out.println("Luas persegi panjang adalah : " + LuasPersegiPanjang);

        input.close();
    }
}
