package com.example.demo.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class JwtResponse {
    private String jwtToken;
    private String username;

}
