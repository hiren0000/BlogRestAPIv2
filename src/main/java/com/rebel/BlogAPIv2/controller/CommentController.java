package com.rebel.BlogAPIv2.controller;

import com.rebel.BlogAPIv2.enitities.Comment;
import com.rebel.BlogAPIv2.payloads.ApiResponse;
import com.rebel.BlogAPIv2.payloads.CommentDto;
import com.rebel.BlogAPIv2.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class CommentController
{
    @Autowired
    private CommentService service;


    // Crating new Comment
    @PostMapping("/users/{id}/posts/{poId}/comments")
    public ResponseEntity<CommentDto> addComment(@RequestBody CommentDto commentDto, @PathVariable Integer id, @PathVariable Integer poId)
    {
        CommentDto comment = this.service.addComment(commentDto, id, poId);

        return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }

    //get all the comments
    @GetMapping("/comments")
    public ResponseEntity<List<CommentDto>> getListOfComments()
    {
        List<CommentDto> comments = this.service.getALlComments();

        return new ResponseEntity<List<CommentDto>>(comments, HttpStatus.FOUND);
    }

    //Delete Comment
    @DeleteMapping("/comments/{coId}")
    public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer coId)
    {
        this.service.deleteComm(coId);

        return new ResponseEntity<>(new ApiResponse("successfully deleted comment !!", true), HttpStatus.OK);
    }
}
