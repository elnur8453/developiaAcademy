package az.developia.Book_api.response;

import az.developia.Book_api.entity.CustomerEntity;
import lombok.Data;

@Data
public class CustomerResponseDTO {

	private CustomerEntity customer;
}
