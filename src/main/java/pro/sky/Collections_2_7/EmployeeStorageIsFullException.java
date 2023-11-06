package pro.sky.Collections_2_7;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Сотрудников уже много! Мест больше нет!")
// непроверяемое исключение
public class EmployeeStorageIsFullException extends RuntimeException{
    public EmployeeStorageIsFullException(String massage) {
        super(massage);
    }
}
