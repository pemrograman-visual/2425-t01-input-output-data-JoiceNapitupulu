// 12S24020 - Joice Anastasya Napitupulu
// 12S24014 - Arion Dippos Pandapotan Manurung

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, penerbit, formatbuku;
        int tahunterbit, stok;
        double hargapembelian, minimummargin, rating;

        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = input.nextInt();
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        hargapembelian = input.nextDouble();
        minimummargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating);
    }
}
