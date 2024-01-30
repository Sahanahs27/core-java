public interface BookService {

    public boolean validateAndSave(BookDto dto);
    public BookDto findByBookId(int bookId);
    public boolean updateAuthorByTitle(String title, String author);
    public boolean deleteByTitle(String title);

}
