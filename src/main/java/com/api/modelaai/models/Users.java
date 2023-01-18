package com.api.modelaai.models;

import com.api.modelaai.DTOs.UserDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Users
{
    public Users(UserDTO data) {
        this.name = data.name();
        this.email = data.email();
        this.password = data.password();

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)

    private  String name;
    @Column(length = 50, nullable = false)
    private String email;
    @Column(length = 30, nullable = false)
    private String password;

}
