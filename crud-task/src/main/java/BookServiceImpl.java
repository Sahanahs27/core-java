public class BookServiceImpl implements  BookService{
    BookRepo repo = new BookRepoImpl();
    @Override
    public boolean validateAndSave(BookDto dto) {

        if (dto != null) {
            System.out.println("book is running");
            if (dto.getAuthor() != null && dto.getAuthor().length() >= 3) {
                System.out.println("book is running first step");
                if (dto.getTitle() != null && dto.getTitle().length() >= 10) {
                    System.out.println("book is running2");
                    if (dto.getBookID() > 0) {
                        System.out.println("book is running3");
                        if (dto.getPrice() > 2000) {
                            System.out.println("book is running4");
                            if (dto.getPublicationYear() > 2010) {
                                System.out.println("book is validated");
                              return repo.save(dto);

                            }
                         }

                        }
                    }
                }
            }
           System.out.println("book is not validated");
            return false;

        }

    @Override
    public BookDto findByBookId(int bookId) {
        if(bookId>0){
            System.out.println("id is valid");
            return repo.findByBookID(bookId);
        }
        System.out.println("id is not valid");
        return null;
    }
}
