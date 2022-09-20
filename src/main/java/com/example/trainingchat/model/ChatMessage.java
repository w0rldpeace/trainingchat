package com.example.trainingchat.model;

import com.example.trainingchat.enums.MessageType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
/*
Unterschiedliche Messagetypen anlegen, Mit denen verschiedene Funktionen asugeführt werden.
 */
public class ChatMessage {
    @NotNull
    private MessageType type;
    private String content;
    @NotEmpty
    private String sender;
    private String image;
}
