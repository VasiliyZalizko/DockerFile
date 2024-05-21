package ru.netology.dockerfile.repository;

import org.springframework.stereotype.Repository;
import ru.netology.dockerfile.model.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("Igor") && password.equals("1111")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("Oleg") && password.equals("2222")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("Yuriy") && password.equals("3333")) {
            Collections.addAll(authorities, Authorities.READ);
        } else if (user.equals("Vlad") && password.equals("4444")) {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}