import models.Album;
import models.Author;
import models.Quote;

import java.util.ArrayList;

public class BeanTest {

	public static void main(String[] args) {

		Album testAlbum = new Album(1, "Michael Jackson", "Thriller", 1982, 47.3f, "Pop, post-disco, funk, rock");

		Author testAuthor = new Author(1, "Stephen", "King");

		Quote quote1 = new Quote(1, "Hello", testAuthor);
		Quote quote2 = new Quote(2, "Goodbye" , new Author(2, "John", "Smith"));
		Quote quote3 = new Quote(3, "Aloha", new Author(3, "Jane", "Doe"));

		ArrayList<Quote> quotes = new ArrayList<>();
		quotes.add(quote1);
		quotes.add(quote2);
		quotes.add(quote3);

		for (Quote quote : quotes) {
			System.out.println("Author: " + quote.getAuthor().getFirstName() + " " + quote.getAuthor().getLastName());
			System.out.println("Quote: " + quote.getContent());
		}

	}
}
