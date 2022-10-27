package userservices.service;

import userservices.entity.User;
import userservices.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    //read
    public List<User> getUsers(Pageable pageable){
        Pageable thePageable = pageable.withPage(0);
        if(pageable.getPageNumber() > 0) {
            thePageable = pageable.withPage(pageable.getPageNumber() - 1);
        }




        List<User> userList = new ArrayList<>();
        userRepo.getAllUser(userList).forEach(user -> userList.add(user));
        return userList;
    }

    //create
    public User createUser(User user){
        return userRepo.save(user);
    }

    public Optional<User> getById(Long id) {
        return userRepo.findById(id);
    }
}
