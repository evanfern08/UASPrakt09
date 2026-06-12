public class FilmMain09 {
    public static void main(String[] args) {

        BinarySearchTreeFilm09 bst = new BinarySearchTreeFilm09();      // Membuat instance Binary Search Tree untuk menyimpan data film

        bst.add(new Film09("FL105", "Interstellar", "Sci-Fi", 8.6));
        bst.add(new Film09("FL102", "Coco", "Animation", 8.4));
        bst.add(new Film09("FL108", "Inception", "Sci-Fi", 8.8));
        bst.add(new Film09("FL101", "Up", "Animation", 8.3));
        bst.add(new Film09("FL104", "Parasite", "Thriller", 8.5));
        bst.add(new Film09("FL107", "Spirited Away", "Fantasy", 8.6));

        System.out.println("===== DATA FILM IN-ORDER =====");       // Menampilkan data film secara terurut berdasarkan kode film
        bst.traverseInOrder(bst.root);

        System.out.println("===== DATA FILM PRE-ORDER =====");      // Menampilkan data film dengan traversal pre-order
        bst.traversePreOrder(bst.root);

        System.out.println("Pencarian FL104 : "     // Mencari kode film FL104 dalam BST
                + (bst.find("FL104") ? "Ditemukan" : "Tidak Ditemukan"));

        System.out.println("Pencarian FL110 : "     // Mencari kode film FL110 dalam BST    
                + (bst.find("FL110") ? "Ditemukan" : "Tidak Ditemukan"));

        System.out.println("\nJumlah Film : "       // Menghitung jumlah film dalam BST
                + bst.hitungJumlahFilm(bst.root));

        Film09 terbaik = bst.cariRatingTertinggi(bst.root);     // Mencari film dengan rating tertinggi dalam BST

        System.out.println("\n===== FILM DENGAN RATING TERTINGGI =====");
        terbaik.tampilInformasi();
    }
}