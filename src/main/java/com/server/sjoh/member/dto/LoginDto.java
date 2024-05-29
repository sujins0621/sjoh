package com.server.sjoh.member.dto;



import lombok.*;



@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {


    private String userName;


    private String password;

}