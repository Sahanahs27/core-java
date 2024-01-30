public interface BookRepo {
   public boolean save(BookDto dto);
   public BookDto findByBookID(int bookId);
   public boolean updateAuthorByTitle(String title, String author);
   public boolean deleteByTitle(String title);
}
