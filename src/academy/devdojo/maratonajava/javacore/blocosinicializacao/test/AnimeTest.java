package academy.devdojo.maratonajava.javacore.blocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.blocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for(int episodio: anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }
        anime.getEpisodios();
    }
}
