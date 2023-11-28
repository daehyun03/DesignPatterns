package hf.dp.TemplateMethod;

public class TeaWithHook extends CaffeineBeverage {
    public void brew() {
        System.out.println("Steeping the tea");
    }
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
    public boolean customerWantsCondiments() {
        return false;
    }
}
