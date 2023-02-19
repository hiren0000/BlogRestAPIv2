package com.rebel.BlogAPIv2.payloads;

import com.rebel.BlogAPIv2.enitities.Post;
import com.rebel.BlogAPIv2.enitities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto
{
    private Integer coId;

    private String content;

    private User user;

    private Post post;



}
