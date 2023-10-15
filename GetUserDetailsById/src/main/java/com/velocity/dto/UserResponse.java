package com.velocity.dto;


import com.velocity.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserResponse extends BaseResponse {
    private User user;
    public UserResponse(User user) {
        super(true);
        this.user = user;
    }
    public UserResponse(boolean isSuccess) {
        super(isSuccess);
    }
}
