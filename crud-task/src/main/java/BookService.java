public interface BookService {

    public boolean validateAndSave(BookDto dto);
    public BookDto findByBookId(int bookId);

}
