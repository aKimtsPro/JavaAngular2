package demo.poo.enumeration;

public enum Genre {

    ROCK("johny"), // = 0
    CLASSIQUE("chopin"), // = 1
    HIP_HOP("tupac"); // = 2

    private String meilleurArtiste;

    Genre(String meilleurArtiste) {
        this.meilleurArtiste = meilleurArtiste;
    }

    public String getMeilleurArtiste() {
        return meilleurArtiste;
    }

    public void setMeilleurArtiste(String meilleurArtiste) {
        this.meilleurArtiste = meilleurArtiste;
    }
}
