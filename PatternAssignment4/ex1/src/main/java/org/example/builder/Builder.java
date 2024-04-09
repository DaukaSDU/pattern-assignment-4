package org.example.builder;

import org.example.pojo.NutritionPlan;

import java.util.List;

public interface Builder {
    void setCaloricIntake(int caloricIntake);
    void setMacronutrient(int c, int p, int f);
    void setMealPlans(List<String> mealPlans);
    void setFitnessGoal(String fitnessGoal);
    void setDietaryRestrictions(List<String> dietaryRestrictions);
    NutritionPlan build();
}
