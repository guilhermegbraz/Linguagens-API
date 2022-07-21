package br.com.alura.linguagensapi;

public class Linguagem {

    private final String title;
    private final String image;
    private int ranking;

    public Linguagem(String title, String urlImage, int ranking) {
        this.title = title;
        this.image = urlImage;
        this.ranking = ranking;
    }

    public int getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getUrlImage() {
        return image;
    }
}
