public class FilmMain09 {
    public static void main(String[] args) {

        BinarySearchTreeFilm09 bst = new BinarySearchTreeFilm09();

        bst.add(new Film09("FL105", "Interstellar", "Sci-Fi", 8.6));
        bst.add(new Film09("FL102", "Coco", "Animation", 8.4));
        bst.add(new Film09("FL108", "Inception", "Sci-Fi", 8.8));
        bst.add(new Film09("FL101", "Up", "Animation", 8.3));
        bst.add(new Film09("FL104", "Parasite", "Thriller", 8.5));
        bst.add(new Film09("FL107", "Spirited Away", "Fantasy", 8.6));

        System.out.println("===== DATA FILM IN-ORDER =====");
        bst.traverseInOrder(bst.root);

        System.out.println("===== DATA FILM PRE-ORDER =====");
        bst.traversePreOrder(bst.root);

        System.out.println("Pencarian FL104 : "
                + (bst.find("FL104") ? "Ditemukan" : "Tidak Ditemukan"));

        System.out.println("Pencarian FL110 : "
                + (bst.find("FL110") ? "Ditemukan" : "Tidak Ditemukan"));

        System.out.println("\nJumlah Film : "
                + bst.hitungJumlahFilm(bst.root));

        Film09 terbaik = bst.cariRatingTertinggi(bst.root);

        System.out.println("\n===== FILM DENGAN RATING TERTINGGI =====");
        terbaik.tampilInformasi();
    }
}