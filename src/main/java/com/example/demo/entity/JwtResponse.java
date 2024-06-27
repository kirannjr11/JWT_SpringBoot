package com.example.demo.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class JwtResponse {
    private String jwtToken;
    private String username;

}
