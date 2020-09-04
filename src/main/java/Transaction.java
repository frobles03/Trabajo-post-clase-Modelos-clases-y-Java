import java.util.Date;
public class Transaction {
    private double unit;
    private double initialUnitPrice;
    private double transaactionDate;
    private Product product;


    public void currentValue(){
        //fecha
        Date transaactionDate = new Date();
        System.out.println(transaactionDate);


    }
}
