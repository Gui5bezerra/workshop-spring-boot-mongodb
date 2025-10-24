package com.bezerragui.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezerragui.workshopmongo.domain.Post;
import com.bezerragui.workshopmongo.repository.PostRepository;
import com.bezerragui.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    // Buscar todos os posts
    public List<Post> findAll() {
        return repo.findAll();
    }

    // Buscar post pelo ID
    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}

