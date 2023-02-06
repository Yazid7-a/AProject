/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.Review;
import datos.ReviewDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alumno Mañana
 */
@Stateless
public class ReviewServiceImpl implements ReviewService {

    @Inject
        private ReviewDao InterfazReview;
    
    @Override
    public List<Review> findAllReview() {
        return InterfazReview.findAllReview();
    }

    @Override
    public Review findReviewByID(Review review) {
        return InterfazReview.findReviewByID(review);
    }

    @Override
    public Review findReviewByUser(Review Review) {
        return InterfazReview.findReviewByUser(Review);
    }

    @Override
    public void insert(Review review) {
        InterfazReview.insert(review);
    }

    @Override
    public void updateReview(Review review) {
    InterfazReview.updateReview(review);
    }

    @Override
    public void deleteReview(Review review) {
      InterfazReview.deleteReview(review);
    }
    
}
