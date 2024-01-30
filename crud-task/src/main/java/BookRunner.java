public class BookRunner {
    public static void main(String args[]){
        BookService service = new BookServiceImpl();
        //BookDto dto = new BookDto(20,"mahabharatha1","abcdtyui",2026,"saanutyu","qwer",3500);
       // service.validateAndSave(dto);
        BookDto returnDto = service.findByBookId(2);
        System.out.println(returnDto);
    }
}
