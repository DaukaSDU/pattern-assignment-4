package org.example.director;

import org.example.builder.Builder;

import java.util.ArrayList;
import java.util.Arrays;

public class NutritionPlanDirector implements Director {
    private Builder builder;

    @Override
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void createNutritionPlan() {
        builder.setCaloricIntake(100);
        builder.setMacronutrient(30, 30, 30);
        builder.setMealPlans(new ArrayList<>(Arrays.asList(new String[]{"Egg", "Milk", "Banana"})));
        builder.setFitnessGoal("WEIGHT_LOSS");
        builder.setDietaryRestrictions(new ArrayList<>(Arrays.asList(new String[]{"GLUTEN_FREE", "VEGAN"})));
        System.out.println("Nutrition plan created successfully");
        System.out.println(builder.build());
    }
}
