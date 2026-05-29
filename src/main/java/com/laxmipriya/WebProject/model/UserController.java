package com.laxmipriya.WebProject.model;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.laxmipriya.WebProject.model.User;
import com.laxmipriya.WebProject.model.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;
    public UserController() {
        userService = new UserService();
    }
    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
