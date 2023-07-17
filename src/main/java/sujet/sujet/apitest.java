package sujet.sujet;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apitest")
public class apitest {
    @GetMapping
    public ResponseEntity<String> test(){
        System.out.println("working properly");
      return ResponseEntity.status(HttpStatus.OK).body("everything works");
    }


}
