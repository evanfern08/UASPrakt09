public class Film09 {
    String kodeFilm;
    String judul;
    String genre;
    Double rating;

    public Film09(String kodeFilm, String judul, String genre, double rating) {
        this.kodeFilm = kodeFilm;
        this.judul = judul;
        this.genre = genre;
        this.rating = rating; 
    }

    public void tampilInformasi() {
        System.out.println("Kode Film       : " + kodeFilm);
        System.out.println("Judul Film      : " + judul);
        System.out.println("Genre           : " + genre);
        System.out.println("Rating          : " + rating);
    }
}