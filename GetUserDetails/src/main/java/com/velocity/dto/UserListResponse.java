package com.velocity.dto;
import com.velocity.model.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class UserListResponse extends BaseResponse {
    private List<User> userList;
    public UserListResponse(List<User> user) {
        super(true);
        this.userList = user;
    }
}
