package com.fdex.fdex.entity;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//깃 연결
public class JwtRequest {
    private String username;
    private String password;
}