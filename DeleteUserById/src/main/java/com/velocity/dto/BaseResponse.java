package com.velocity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class BaseResponse implements Serializable {
    private String message;
    private boolean success = false ;
    private String transactionId;
    public BaseResponse(final boolean success){

        this.success = success;
    }
    public boolean getSuccess(){
        return success;
    }
}
