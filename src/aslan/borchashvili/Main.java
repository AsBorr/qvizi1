package aslan.borchashvili;

public class Main {
    public static void main(String[] args) {
        CalculatorService Calculator = new CalculatorService();
        // ფიგურულ ფრჩხილებში რაც ხდება, ფიგურულ ფრჩხილებში რჩება, ნუ ამ შემთხვევაში მაინც...
        { // მოქმედებები მთელ რიცხვებზე
            int x = 14;
            int y = 7;
            Calculator.sum(x, y);
            Calculator.divide(x, y);
        }
        { // მოქმედებები ნამდვილ რიცხვებზე
            double x = 12.5;
            double y = 2.5;
            Calculator.sum(x, y);
            Calculator.divide(x, y);
        }
    }
}
