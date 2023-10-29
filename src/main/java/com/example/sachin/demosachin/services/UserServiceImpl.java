package com.example.sachin.demosachin.services;

import com.example.sachin.demosachin.entities.Scopes;
import com.example.sachin.demosachin.entities.Users;
import com.example.sachin.demosachin.models.requests.CreateUserReq;
import com.example.sachin.demosachin.models.response.ApiResponse;
import com.example.sachin.demosachin.repo.ScopesRepo;
import com.example.sachin.demosachin.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UsersRepo usersRepo;
    private final ScopesRepo scopesRepo;

    @Autowired
    public UserServiceImpl(UsersRepo usersRepo, ScopesRepo scopesRepo) {
        this.usersRepo = usersRepo;
        this.scopesRepo = scopesRepo;
    }

    @Override
    public String createUser() {
        Users user = new Users();
        user.setEmail("temp.email@at.in");
        user.setFirstName("lala");
        user.setLastName("te");
        user.setPhoneNumber("+919191991919");
        var savedUser = usersRepo.save(user);
        return savedUser.getId();
    }

    public ApiResponse createUser(CreateUserReq createUserReq) {
        ApiResponse apiResponse = new ApiResponse();
        if (createUserReq == null || createUserReq.getEmail() == null || createUserReq.getPhoneNumber() == null || createUserReq.getFirstName() == null) {
            apiResponse.setErrorCode(401);
            apiResponse.setErrorMessage("Something went wrong, Bad Request");
            return apiResponse;
        }
        apiResponse.setSuccess(true);
        Users user = new Users();
        user.setEmail(createUserReq.getEmail());
        user.setPhoneNumber(createUserReq.getPhoneNumber());
        user.setFirstName(createUserReq.getFirstName());
        user.setLastName(createUserReq.getLastName());
        Scopes scopes = new Scopes();
        List<String> userScopes = new ArrayList<>();
        userScopes.add("buy");
        userScopes.add("sell");
        userScopes.add("admin");
        user.setUserScopes(userScopes);
        usersRepo.save(user);
        scopes.setUserScopes(userScopes);
        scopesRepo.save(scopes);
        apiResponse.setData(user);
        return apiResponse;
    }
}
