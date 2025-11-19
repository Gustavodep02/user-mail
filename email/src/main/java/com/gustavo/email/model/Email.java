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

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private UUID userId;
    @Column(name = "email_from")
    private String From;
    @Column(name = "email_to")
    private String To;
    private String subject;
    private String body;
    private LocalDateTime sendDateEmail;
    private EmailStatus statusEmail;

}
