package com.codingshuttle.projects.lovable_clone.entity;

import com.codingshuttle.projects.lovable_clone.enums.MessageRoleEnum;

import java.time.Instant;

public class ChatMessage {
    Long id;

    ChatSession chatSession;

    String content;
    MessageRoleEnum messageRoleEnum;
    String toolCalls; // JSON array of Tools called
    Integer tokensUsed;

    Instant createdAt;

}
