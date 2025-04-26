package com.example.pafbackend.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "posts")
public class Post {
    @Id
    private String id;
    private String userId;
    private Date timestamp;
    private String contentDescription;
    private String mediaLink;
    private String mediaType;
}

