package ua.edu.ucu.flowerstore.appuser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("apu/v1/user")
public class AppUserController {
    private AppUserService appUserService;
    @GetMapping
    public List<AppUser> getUsers() {
        return this.appUserService.getAppUsers();
    }
    @PostMapping
    public void addUser(AppUser user) {
        this.appUserService.addUser(user);
    }
}
