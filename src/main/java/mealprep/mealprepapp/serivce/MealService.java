package mealprep.mealprepapp.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mealprep.mealprepapp.entity.Meal;
import mealprep.mealprepapp.repository.MealRepository;

@Service
public class MealService {

    @Autowired
    private MealRepository mealRepository;

    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }

    public Meal getMealById(Long id) {
        return mealRepository.findById(id).orElse(null);
    }

    public Meal saveMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    public Meal voteMeal(Long id) {
        Meal meal = mealRepository.findById(id).orElse(null);
        if (meal != null) {
            meal.setVotes(meal.getVotes() + 1);
            mealRepository.save(meal);
        }
        return meal;
    }
}
