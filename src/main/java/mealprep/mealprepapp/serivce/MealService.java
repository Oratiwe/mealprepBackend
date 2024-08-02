//package mealprep.mealprepapp.serivce;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import mealprep.mealprepapp.entity.Meal;
//import mealprep.mealprepapp.repository.UserRepository;
//
//@Service
//public class MealService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public List<Meal> getAllMeals() {
//        return userRepository.findAll();
//    }
//
//    public Meal getMealById(Long id) {
//        return userRepository.findById(id).orElse(null);
//    }
//
//    public Meal saveMeal(Meal meal) {
//        return userRepository.save(meal);
//    }
//
//    public Meal voteMeal(Long id) {
//        Meal meal = userRepository.findById(id).orElse(null);
//        if (meal != null) {
//            meal.setVotes(meal.getVotes() + 1);
//            userRepository.save(meal);
//        }
//        return meal;
//    }
//}
