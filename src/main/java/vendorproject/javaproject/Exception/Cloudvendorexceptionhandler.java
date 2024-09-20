package vendorproject.javaproject.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.http.HttpRequest;
@ControllerAdvice
public class Cloudvendorexceptionhandler {
    @ExceptionHandler
    public ResponseEntity<Object> handlecloudvendornotfoundexception(Cloudvendornotfoundexception cloudvendornotfoundexception){
        Cloudvendorexception cloudvendorexception=new Cloudvendorexception(
                cloudvendornotfoundexception.getMessage(),
                cloudvendornotfoundexception.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(cloudvendorexception,HttpStatus.NOT_FOUND);
    }
}
