package Lab120;

public class CalculatorWithMemory extends Calculator {
    private double memory=0;

    public CalculatorWithMemory(double accumulator, double memory) {
        super(accumulator);
        this.memory = memory;
    }
    public void save(){
         memory=getAccumulator();
    }
    public void recall(){
        setAccumulator(memory);
    }
    public void clearMemory(){
        memory=0;
    }
    public double getMemory(){
        return memory;
    }
}
