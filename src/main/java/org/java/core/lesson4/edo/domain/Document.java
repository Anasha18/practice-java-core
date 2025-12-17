package org.java.core.lesson4.edo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {
    private UUID id;
    private String title;
    private byte[] encryptedContent;
    private String passwordHash;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
