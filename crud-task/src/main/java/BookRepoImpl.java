import com.xworkz.bookutils.BookDtoUtils;

import java.sql.*;

public class BookRepoImpl implements BookRepo{

    @Override
    public boolean save(BookDto dto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/playstore", "root","saanu@123");
            String query = "insert into BookDto(bookId,title,author,publicationYear,genre,isbn,price)"  +"values(?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,dto.getBookID());
            statement.setString(2,dto.getTitle());
            statement.setString(3, dto.getAuthor());
            statement.setInt(4,dto.getPublicationYear());
            statement.setString(5, dto.getGenre());
            statement.setString(6, dto.getISBN());
            statement.setInt(7,dto.getPrice());
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected>0){
                return true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    @Override
    public BookDto findByBookID(int bookId) {
        try {
            Connection connection = BookDtoUtils.getConnection();
            String query1 = "select * from bookdto where bookId = ?";
            PreparedStatement statement = connection.prepareStatement(query1);
            statement.setInt(1,bookId);
            ResultSet set = statement.executeQuery();
            BookDto book = new BookDto();
            while(set.next()){
                int returnId = set.getInt("bookId");
                String title = set.getString("title");
                String author = set.getString("author");
                int publicationYear = set.getInt("publicationYear");
                String genre = set.getString("genre");
                String ISBN = set.getString("ISBN");
                int price = set.getInt("price");

                book.setBookID(returnId);
                book.setTitle(title);
                book.setAuthor(author);
                book.setPublicationYear(publicationYear);
                book.setGenre(genre);
                book.setISBN(ISBN);
                book.setPrice(price);



            }
            return book;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public boolean updateAuthorByTitle(String title, String author) {
        Connection connection = BookDtoUtils.getConnection();
        String query3 = "update bookdto set author = ? where title = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query3);
            statement.setString(1,author);
            statement.setString(2,title);
            int rowsAffected = statement.executeUpdate();
            if(rowsAffected>0){
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean deleteByTitle(String title) {
        Connection connection = BookDtoUtils.getConnection();
        String query4 = "delete from bookdto where title = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query4);
            statement.setString(1,title);
            int rowsAffected = statement.executeUpdate();
            if(rowsAffected>0){
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
