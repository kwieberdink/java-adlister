package models;

public class Album {

    private Long id;
    private String artist;
    private String name;
    private int releaseDate;
    private double sales;
    private String genres;

    public Album() {
    }

    public Album(Long id, String artist, String name, int releaseDate, double sales, String genres) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.genres = genres;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }
}