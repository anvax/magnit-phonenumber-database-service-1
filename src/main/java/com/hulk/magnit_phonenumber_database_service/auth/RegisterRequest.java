package com.hulk.magnit_phonenumber_database_service.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String name;
    private String surname;
    private UUID bossId;
    private String department;
    private String phonenumber;
    private String email;
    private String password;
}
