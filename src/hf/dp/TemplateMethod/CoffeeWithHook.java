package hf.dp.TemplateMethod;

import java.io.BufferedReader;

public class CoffeeWithHook extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y"))
            return true;
        else
            return false;
    }
    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
        BufferedReader in = new BufferedReader(new java.io.InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (java.io.IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null)
            return "n";
        return answer;
    }
}
