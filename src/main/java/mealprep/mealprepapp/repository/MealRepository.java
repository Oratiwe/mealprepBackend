package mealprep.mealprepapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mealprep.mealprepapp.entity.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
}
