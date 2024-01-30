public interface BookRepo {
   public boolean save(BookDto dto);
   public BookDto findByBookID(int bookId);
}
