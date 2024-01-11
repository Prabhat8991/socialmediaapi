package com.socialmediaapi.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController public class PostResources {

    @Autowired PostRepository postRepository;

    protected PostResources(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @PostMapping("/post")
    public void createPost(Post post) {
        postRepository.save(post);
    }
}
