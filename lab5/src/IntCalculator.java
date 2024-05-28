public class IntCalculator {

    public int state;

    public IntCalculator(){
        state=0;
    }
    public IntCalculator(int number){
        state = number;
    }

    public IntCalculator add(int number){
        state += number;
        return this;
    }
    public IntCalculator subtract(int number){
        state-=number;
        return this;
    }
    public IntCalculator multiply(int number){
        state*=number;
        return this;
    }
    public IntCalculator clear(){
        state =0;
        return this;
    }

    public int result(){
        return state;
    }
}
