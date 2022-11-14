package ua.edu.ucu.flowerstore.appuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class AppUserController {
    private final AppUserService appUserService;
    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }
    @GetMapping
    public List<AppUser> getUsers() {
        return this.appUserService.getAppUsers();
    }
    @PostMapping
    public void addUser(String name, String email, LocalDate dob) {
        this.appUserService.addUser(new AppUser(name, email, dob));
    }
}
