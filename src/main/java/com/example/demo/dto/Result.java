package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {
    @JsonIgnore
    HttpStatus status;

    String code;
    String message;
    Object data;

    public Result(Object data) {
        this.status = HttpStatus.OK;
        this.code = "200000";
        this.message = "OK";
        this.data = data;
    }
}
