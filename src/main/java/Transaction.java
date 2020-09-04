import java.util.Date;
public class Transaction {
    public double unit;
    public double initialUnitPrice;
    public double transaactionDate;
    public Product product;


    public void currentValue(){
        //fecha
        Date transaactionDate = new Date();
        System.out.println(transaactionDate);


    }
}
