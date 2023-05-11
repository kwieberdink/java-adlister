package models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Album;
import models.Author;
import models.Quote;

import java.util.ArrayList;
import java.util.Arrays;

public class BeanTest {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        // Instantiating albums
        Album album1 = new Album();
        album1.setId(1L);
        album1.setArtist("Taylor Swift");
        album1.setName("1989");
        album1.setReleaseDate(2014);
        album1.setSales(10.5);
        album1.setGenres("Pop, Rock, Electronic");

        Album album2 = new Album();
        album2.setId(2L);
        album2.setArtist("Adele");
        album2.setName("21");
        album2.setReleaseDate(2011);
        album2.setSales(30.1);
        album2.setGenres("Soul, Pop, Blues");

        Album album3 = new Album();
        album3.setId(3L);
        album3.setArtist("Ed Sheeran");
        album3.setName("÷");
        album3.setReleaseDate(2017);
        album3.setSales(20.2);
        album3.setGenres("Pop, Folk, Hip-hop");

        Album album4 = new Album();
        album4.setId(4L);
        album4.setArtist("Billie Eilish");
        album4.setName("When We All Fall Asleep, Where Do We Go?");
        album4.setReleaseDate(2019);
        album4.setSales(7.5);
        album4.setGenres("Pop, Electronic, Indie");

        Album album5 = new Album();
        album5.setId(5L);
        album5.setArtist("The Beatles");
        album5.setName("Abbey Road");
        album5.setReleaseDate(1969);
        album5.setSales(12.0);
        album5.setGenres("Rock, Pop, Psychedelic");

        ArrayList<Album> albums = new ArrayList<>(Arrays.asList(album1, album2, album3, album4, album5));
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(albums));

        // Instantiating Authors

        Author author1 = new Author();
        author1.setId(1L);
        author1.setFirstName("William");
        author1.setLastName("Shakespeare");

        Author author2 = new Author();
        author2.setId(2L);
        author2.setFirstName("Mark");
        author2.setLastName("Twain");

        Author author3 = new Author();
        author3.setId(3L);
        author3.setFirstName("Oscar");
        author3.setLastName("Wilde");

        Author author4 = new Author();
        author4.setId(4L);
        author4.setFirstName("Virginia");
        author4.setLastName("Woolf");

        Author author5 = new Author();
        author5.setId(5L);
        author5.setFirstName("Ernest");
        author5.setLastName("Hemingway");

        ArrayList<Author> authors = new ArrayList<>(Arrays.asList(author1, author2, author3, author4, author5));
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(authors));

        // Instantiating Quotes
        Quote quote1 = new Quote();
        quote1.setId(1L);
        quote1.setContent("To be, or not to be: that is the question");
        quote1.setAuthor(author1);

        Quote quote2 = new Quote();
        quote2.setId(2L);
        quote2.setContent("All the world's a stage, and all the men and women merely players.");
        quote2.setAuthor(author1);

        Quote quote3 = new Quote();
        quote3.setId(3L);
        quote3.setContent("The secret of getting ahead is getting started.");
        quote3.setAuthor(author2);

        Quote quote4 = new Quote();
        quote4.setId(4L);
        quote4.setContent("Age is an issue of mind over matter. If you don't mind, it doesn't matter.");
        quote4.setAuthor(author2);

        Quote quote5 = new Quote();
        quote5.setId(5L);
        quote5.setContent("Be yourself; everyone else is already taken.");
        quote5.setAuthor(author3);

        Quote quote6 = new Quote();
        quote6.setId(6L);
        quote6.setContent("I have nothing to declare except my genius.");
        quote6.setAuthor(author3);

        Quote quote7 = new Quote();
        quote7.setId(7L);
        quote7.setContent("One cannot think well, love well, sleep well, if one has not dined well.");
        quote7.setAuthor(author4);

        Quote quote8 = new Quote();
        quote8.setId(8L);
        quote8.setContent("A woman must have money and a room of her own if she is to write fiction.");
        quote8.setAuthor(author4);

        Quote quote9 = new Quote();
        quote9.setId(9L);
        quote9.setContent("The world breaks everyone, and afterward, some are strong at the broken places.");
        quote9.setAuthor(author5);

        Quote quote10 = new Quote();
        quote10.setId(10L);
        quote10.setContent("The first draft of anything is shit.");
        quote10.setAuthor(author5);

        ArrayList<Quote> authorFivesQuotes = new ArrayList<>(Arrays.asList(quote9, quote10));
        author5.setQuotes(authorFivesQuotes);

        ArrayList<Quote> quotes = new ArrayList<>(Arrays.asList(quote1, quote2, quote3, quote4, quote5, quote6, quote7, quote8, quote9, quote10));
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(quotes));
//        for(Quote quote : quotes) {
//            System.out.printf("%nAuthor: %s %s%nQuote: %s%n%n", quote.getAuthor().getFirstName(), quote.getAuthor().getLastName(), quote.getContent());
//        }

    }
}