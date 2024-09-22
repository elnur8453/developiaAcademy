package az.developia.Book_api.entity;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	private String name;

	private String phone;
	
	private Integer orderCount;
}
