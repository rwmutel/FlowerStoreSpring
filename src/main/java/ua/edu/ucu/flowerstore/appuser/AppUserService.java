package ua.edu.ucu.flowerstore.appuser;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AppUserService {
    private final AppUserRepository repository;
    @Autowired
    public AppUserService(AppUserRepository repository) {
        this.repository = repository;
    }
    public List<AppUser> getAppUsers() {
        return repository.findAll();
    }
    public void addUser(AppUser user) {
        if (repository.findUserByEmail(user.getEmail()).isEmpty()) {
            repository.save(user);
        }
    }
}
