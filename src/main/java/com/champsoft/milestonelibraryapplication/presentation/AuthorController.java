package com.champsoft.milestonelibraryapplication.presentation;

import com.champsoft.milestonelibraryapplication.business.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
@CrossOrigin(origins = "*")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService)
    {
        this.authorService = authorService;
    }

    @GetMapping
    public ResponseEntity<List<AuthorResponseModel>> getAllAuthors() {
        List<AuthorResponseModel> authors = authorService.getAllAuthors();
        return ResponseEntity.ok(authors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorResponseModel> getAuthorById(@PathVariable Long id) {
        AuthorResponseModel author = authorService.getAuthorById(id);
        return ResponseEntity.ok(author);
    }

    @PostMapping
    public ResponseEntity<AuthorResponseModel> addAuthor(@Validated @RequestBody AuthorRequestModel authorRequestModel) {
        AuthorResponseModel createdAuthor = authorService.addAuthor(authorRequestModel);
        URI location = URI.create("/api/authors/" + createdAuthor.getAuthorId());
        return ResponseEntity.created(location).body(createdAuthor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AuthorResponseModel> updateAuthor(
            @PathVariable Long id,
            @Validated @RequestBody AuthorRequestModel authorRequestModel) {
        AuthorResponseModel updatedAuthor = authorService.updateAuthor(id, authorRequestModel);
        return ResponseEntity.ok(updatedAuthor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
        return ResponseEntity.noContent().build();
    }

}