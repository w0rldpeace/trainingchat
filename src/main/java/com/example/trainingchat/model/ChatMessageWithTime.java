package com.example.trainingchat.model;

import com.example.trainingchat.enums.MessageType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessageWithTime {
    private MessageType type;
    private String content;
    private String sender;
    @JsonFormat(pattern="HH:mm:ss")
    private Date time = new Date();
    private String image;
    // Wenndu NUR ein Bild senden möchtest, dann neues Model. Sonst kann man das bestehende anpassen.
}
