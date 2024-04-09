package org.example.builder;

import org.example.pojo.NutritionPlan;

import java.util.List;

public class NutritionPlanBuilder implements Builder {
    private NutritionPlan nutritionPlan = new NutritionPlan();

    @Override
    public void setCaloricIntake(int caloricIntake) {
        nutritionPlan.setCaloricIntake(caloricIntake);
    }

    @Override
    public void setMacronutrient(int c, int p, int f) {
        nutritionPlan.setMacronutrient(c, p, f);
    }

    @Override
    public void setMealPlans(List<String> mealPlans) {
        nutritionPlan.setMealPlans(mealPlans);
    }

    @Override
    public void setFitnessGoal(String fitnessGoal) {
        nutritionPlan.setFitnessGoal(fitnessGoal);
    }

    @Override
    public void setDietaryRestrictions(List<String> dietaryRestrictions) {
        nutritionPlan.setDietaryRestrictions(dietaryRestrictions);
    }

    @Override
    public NutritionPlan build() {
        return nutritionPlan;
    }
}
