package mongo.controller;
import mongo.model.User;
import mongo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "aulas")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
       userService.createUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable("id") String id) {
        Optional<User> user = userService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFindById(@PathVariable("id") String id) {
        userService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
    }
}
