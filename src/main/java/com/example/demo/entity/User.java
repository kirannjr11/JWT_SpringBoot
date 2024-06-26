package com.example.demo.entity;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class User {
    private Long  id;
    private String name;
    private String email;

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
