
public class Main {
    public static void main(String args[]){
        AdvancedCalculator calculator = new AdvancedCalculator(0);
        int result = calculator.add(5).subtract(6).multiply(1).subtract(4).result();
        System.out.println("a) " + result);

        AdvancedCalculator advancedCalculator = new AdvancedCalculator(10);
        int result2 = advancedCalculator.divide(4).power(2).root(2).add(23).result();
        System.out.println("b) "+result2);
    }
}
