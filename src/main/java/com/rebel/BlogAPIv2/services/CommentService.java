package com.rebel.BlogAPIv2.services;

import com.rebel.BlogAPIv2.enitities.Comment;
import com.rebel.BlogAPIv2.payloads.CommentDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CommentService
{
    //Creating comment for the specific post & for the specific User
    CommentDto addComment(CommentDto commentDto, Integer id, Integer poId);

    //Deleting comment
    void deleteComm(Integer coId);

    //getting all the comments
    List<CommentDto> getALlComments();
}
