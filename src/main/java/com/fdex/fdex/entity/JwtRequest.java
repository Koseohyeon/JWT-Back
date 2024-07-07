package com.fdex.fdex.entity;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JwtRequest {
    private String username;
    private String password;
}