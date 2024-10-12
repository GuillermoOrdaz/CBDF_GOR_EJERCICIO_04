package com.upiiz.Reviews.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Repository;
import com.upiiz.Reviews.models.Reviews;

@Repository
public class ReviewsRepository {
    private List<Reviews> reviews = new ArrayList<Reviews>();
    private AtomicLong id = new AtomicLong();

    public Reviews guardar(Reviews review) {
        review.setId(id.incrementAndGet());
        reviews.add(review);
        return review;
    }

    public List<Reviews> obtenerTodas() {
        return reviews;
    }

    public Reviews obtenerPorId(Long id) {
        return reviews.stream().filter(review -> review.getId().equals(id)).findFirst().orElse(null);
    }

    public void eliminar(Long id) {
        reviews.removeIf(review -> review.getId().equals(id));
    }

    public Reviews actualizar(Reviews review){
        eliminar(review.getId());
        reviews.add(review);
        return review;
    }

}
