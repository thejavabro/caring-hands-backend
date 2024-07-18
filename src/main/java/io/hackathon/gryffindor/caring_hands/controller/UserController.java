package io.hackathon.gryffindor.caring_hands.controller;


import io.hackathon.gryffindor.caring_hands.entity.User;
import io.hackathon.gryffindor.caring_hands.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/caringhands")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/hi")
    public String hi() {
        return "Namaste";
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
           return ResponseEntity.badRequest().body(bindingResult.getFieldErrors());
        }

        User newUser = userService.registerUser(user);
        return ResponseEntity.ok(newUser);
    }


}