public class AdvancedCalculator extends IntCalculator{
    public AdvancedCalculator(int number){
        state=number;
    }

    public AdvancedCalculator divide(int number){
        state= (state/number);
        return this;
    }
    public AdvancedCalculator power(int number){
        state= state^number;
        return this;
    }

    public IntCalculator root(int number){
        state=state^(1/number);
        return this;
    }
}
