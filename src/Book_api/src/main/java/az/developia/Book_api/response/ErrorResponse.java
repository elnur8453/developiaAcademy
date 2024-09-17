package az.developia.Book_api.response;

import java.time.LocalDateTime;
import java.util.List;

import az.developia.Book_api.models.MyFE;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
	private String message;
    private LocalDateTime timestamp;
    private int status;
    private String internalMessage;
    private List<MyFE> fieldErrors;
}