package mn.localtransport.ruralrides.controller;

import mn.localtransport.ruralrides.model.User;
import mn.localtransport.ruralrides.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // Бусад контроллерын методүүд
}