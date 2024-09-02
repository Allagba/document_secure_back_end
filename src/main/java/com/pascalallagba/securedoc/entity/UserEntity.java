package com.pascalallagba.securedoc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@JsonInclude(NON_DEFAULT)
public class User extends Auditable{
@Column(unique = true, nullable = false, updatable = false)
    private String userId;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private String bio;
    private String phone;
    private String imageUrl;
    private LocalDateTime lastLogin;
    private Integer loginAttempts;
    private Boolean accountNonLocked;
    private Boolean accountNonExpired;
    private Boolean enabled;
    private Boolean mfa;
    @JsonIgnore
    private String qrCodeSecret;
    @Column(columnDefinition = "TEXT")
    private String qrCodeImageUri;
    private String password;
    private String roles; //TODO: Create Role class an map here with JPA
}
