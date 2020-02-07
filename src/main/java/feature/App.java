package feature;

public class App {

    public static void main(String[] args) {
        FeatureService functionService = new FeatureService();
        System.out.println(functionService.available(FunctionKey.EDIT));
    }
}
