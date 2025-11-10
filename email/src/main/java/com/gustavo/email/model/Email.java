package com.gustavo.email.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_EMAIL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private UUID userId;
    private String From;
    private String To;
    private String subject;
    @Column(columnDefinition = "BODY")
    private String body;
    private LocalDateTime sendDateEmail;
    private EmailStatus statusEmail;

}
