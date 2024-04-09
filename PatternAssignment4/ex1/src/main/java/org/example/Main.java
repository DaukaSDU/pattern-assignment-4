package org.example;

import org.example.builder.NutritionPlanBuilder;
import org.example.director.NutritionPlanDirector;

public class Main {
    static NutritionPlanDirector director;
    public static void main(String[] args) {
        director = new NutritionPlanDirector();
        director.setBuilder(new NutritionPlanBuilder());
        director.createNutritionPlan();
    }
}
