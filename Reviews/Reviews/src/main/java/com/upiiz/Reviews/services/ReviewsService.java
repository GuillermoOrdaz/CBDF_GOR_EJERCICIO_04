package com.upiiz.Reviews.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.upiiz.Reviews.models.Reviews;
import com.upiiz.Reviews.repository.ReviewsRepository;

@Service
public class ReviewsService {

    ReviewsRepository reviewsRepository;

    public ReviewsService(ReviewsRepository reviewsRepository){
        this.reviewsRepository = reviewsRepository;
    }

    public List<Reviews> getAllReviews(){
        return reviewsRepository.obtenerTodas();
    }

    public Reviews getReviewById(Long id){
        return reviewsRepository.obtenerPorId(id);
    }

    public Reviews createReviews(Reviews review){
        return reviewsRepository.guardar(review);
    }

    public Reviews updateReview(Reviews review){
        return reviewsRepository.actualizar(review);
    }

    public void deleteReview(Long id){
        reviewsRepository.eliminar(id);
    }
    
}
