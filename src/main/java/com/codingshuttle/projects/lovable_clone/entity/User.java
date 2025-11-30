package com.codingshuttle.projects.lovable_clone.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class User {
    private Long id;

    private String email;
    private String passwordHash;
    private String name;

    private String avatarUrl;

    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt; // soft delete: just update the value in db instead of deleting
}
