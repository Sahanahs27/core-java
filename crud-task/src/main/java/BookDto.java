import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookDto {
    int bookID;
     String title;
     String author;
     int publicationYear;
     String genre;
     String ISBN;
     int price;
}
