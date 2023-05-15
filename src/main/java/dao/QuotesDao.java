package dao;

import com.mysql.cj.jdbc.Driver;
import models.Author;
import models.Quote;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuotesDao implements Quotes{
    private final Connection connection;

    public QuotesDao(){
        try{
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Quote> all() {
        Authors authorsDao = new AuthorsDao();
        List<Quote> quotes = new ArrayList<>();
        List<Author> authors = authorsDao.all();
        try {
            //create statement
            Statement statement = connection.createStatement();
            //execute statement
            ResultSet resultSet = statement.executeQuery("SELECT * FROM codeup_test_db.quotes");
            //iterate over the resultSet
            while (resultSet.next()) {
                int author_id = resultSet.getInt("author_id");
                Author quoteAuthor = null;
                for (Author author : authors){
                    if (author.getId() == author_id) {
                        quoteAuthor = author;
                    }
                }

                Quote quote = new Quote(

                        resultSet.getLong("id"),
                        resultSet.getString("content"),
                        quoteAuthor
                );
                quotes.add(quote);
            }
        } catch (SQLException sqlx) {
            throw new RuntimeException("Error connecting to database", sqlx);
        }
        return quotes;
    }

    @Override
    public void insert(Quote quote) {

    }
}