package az.developia.Book_api.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  private Long id;
  
  private String name;
  
  private double price;
  
  private Integer pageCount;
  
  private String author;
  
  private String creator;
  
  private LocalDateTime registerDate;

}
