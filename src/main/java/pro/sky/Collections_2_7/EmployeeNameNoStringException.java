package pro.sky.Collections_2_7;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Данные введены не верно!")
public class EmployeeNameNoStringException extends RuntimeException{
    public EmployeeNameNoStringException(String massage) {
        super(massage);
    }
}
