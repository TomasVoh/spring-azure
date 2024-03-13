package org.example.springazure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<User> findUser() {
        return ResponseEntity.ok(new User("Tomáš", "Vobořil", "Ahoj do světa dockeru"));
    }
}
