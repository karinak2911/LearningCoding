package arrayOfObjects;

/**
 *
 * @author Navi
 */
public class StockItem {
    private String description; 
    private int costPrice; 
    private int numberInStock; 
    private static double markUp = 0.25; 

    public StockItem(String description, int costPrice, int numberInStock) {
        this.description = description;
        this.costPrice = costPrice;
        this.numberInStock = numberInStock;
    }
    
    private String stockCode = this.description.substring(0, 3) +  String.valueOf(Math.random() * 10).substring(0) + String.valueOf(Math.random() * 10).substring(0) + String.valueOf(Math.random() * 10).substring(0); 
    
    public String getStockCode(){ 
        return stockCode; 
    }
    
    
    public double getSellingPrice(){  
       double markUpOnItem = this.costPrice * markUp;
       double sellingPrice = markUpOnItem + this.costPrice; 
       return sellingPrice; 
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }
    
    
}
