package com.server.sjoh.member.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {


    private String userName;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)


    private String password;



    private String nickname;

}