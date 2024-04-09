package com.example.demo.services;

import com.example.demo.domain.Post;
import com.example.demo.domain.User;
import com.example.demo.dto.UserDTO;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;


    public Post findById(String id) {
//   Optional<User> user = repository.findById(id);
//        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }}