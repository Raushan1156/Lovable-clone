package com.codingshuttle.projects.lovable_clone.entity;

import java.time.Instant;

public class ChatSession {
    Project project;
    User user;
    String title;

    Instant createAt;
    Instant updatedAt;
    Instant deletedAt;
}
