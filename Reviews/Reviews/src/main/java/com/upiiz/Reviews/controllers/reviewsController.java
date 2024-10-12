package com.upiiz.Reviews.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.upiiz.Reviews.services.ReviewsService;
import java.util.List;
import com.upiiz.Reviews.models.Reviews;


@RestController
@RequestMapping("/api/v1/reviews")
public class reviewsController {
    ReviewsService reviewsService;

    public reviewsController(ReviewsService reviewsService){
        this.reviewsService = reviewsService;
    }

    @GetMapping
    public ResponseEntity<List<Reviews>> getReviews(){
        return ResponseEntity.ok(reviewsService.getAllReviews());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reviews> getReview(@PathVariable Long id){
        return ResponseEntity.ok(reviewsService.getReviewById(id));
    }

    @PostMapping
    public ResponseEntity<Reviews> addReview(@RequestBody Reviews review){
        return ResponseEntity.ok(reviewsService.createReviews(review));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reviews> updateReview(@RequestBody Reviews review, @PathVariable Long id){
        review.setId(id);
        return ResponseEntity.ok(reviewsService.updateReview(review));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable Long id){
        reviewsService.deleteReview(id);
        return ResponseEntity.noContent().build();
    } 
}
