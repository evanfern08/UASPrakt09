public class Film09 {               // Class untuk menyimpan data film
    String kodeFilm;
    String judul;
    String genre;
    Double rating;

    public Film09(String kodeFilm, String judul, String genre, double rating) {   // Constructor untuk menginisialisasi data film
        this.kodeFilm = kodeFilm;
        this.judul = judul;
        this.genre = genre;
        this.rating = rating; 
    }

    public void tampilInformasi() {     // Method untuk menampilkan informasi film
        System.out.println("Kode Film       : " + kodeFilm);
        System.out.println("Judul Film      : " + judul);
        System.out.println("Genre           : " + genre);
        System.out.println("Rating          : " + rating);
    }
}