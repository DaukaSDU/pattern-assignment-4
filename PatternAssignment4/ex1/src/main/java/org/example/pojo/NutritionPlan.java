package org.example.pojo;

import java.util.List;
import java.util.stream.Collectors;

public class NutritionPlan {
    private int caloricIntake;
    private Macronutrient macronutrient;
    private List<String> mealPlans;
    private FitnessGoal fitnessGoal;
    private List<DietaryRestrictions> dietaryRestrictions;

    enum FitnessGoal {
        WEIGHT_LOSS, WEIGHT_GAIN, MAINTENANCE
    }

    enum DietaryRestrictions {
        GLUTEN_FREE, VEGAN, LACTOSE_FREE
    }

    class Macronutrient {
        private int carbohydrates;
        private int proteins;
        private int fats;
        public Macronutrient(int c, int p, int f) {
            carbohydrates = c;
            proteins = p;
            fats = f;
        }
        @Override
        public String toString() {
            return "{" +
                    "\n\t\tcarbohydrates=" + carbohydrates +
                    ", \n\t\tproteins=" + proteins +
                    ", \n\t\tfats=" + fats +
                    "\n\t}";
        }
    }

    public int getCaloricIntake() {
        return caloricIntake;
    }

    public void setCaloricIntake(int caloricIntake) {
        this.caloricIntake = caloricIntake;
    }

    public Macronutrient getMacronutrient() {
        return macronutrient;
    }

    public void setMacronutrient(int c, int p, int f) {
        this.macronutrient = new Macronutrient(c, p, f);
    }

    public List<String> getMealPlans() {
        return mealPlans;
    }

    public void setMealPlans(List<String> mealPlans) {
        this.mealPlans = mealPlans;
    }

    public FitnessGoal getFitnessGoal() {
        return fitnessGoal;
    }

    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = FitnessGoal.valueOf(fitnessGoal);
    }

    public List<DietaryRestrictions> getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setDietaryRestrictions(List<String> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions.stream()
                .map(DietaryRestrictions::valueOf)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "NutritionPlan{" +
                "\n\tcaloricIntake=" + caloricIntake +
                ", \n\tmacronutrient=" + macronutrient +
                ", \n\tmealPlans=" + mealPlans +
                ", \n\tfitnessGoal=" + fitnessGoal +
                ", \n\tdietaryRestrictions=" + dietaryRestrictions +
                "\n}";
    }
}
