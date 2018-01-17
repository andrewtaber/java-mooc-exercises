
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class Storehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;
    
    public Storehouse() {
        this.productPrices = new HashMap<String, Integer>();
        this.productStock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        productPrices.put(product, price);
        productStock.put(product, stock);
    }
    
    public int price(String product) {
        if(productPrices.get(product) == null) {
            return -99;
        }
        return productPrices.get(product);
    }
    
    public int stock(String product) {
        if(productStock.get(product) == null) {
            return 0;
        }
        
        return productStock.get(product);
    }
    
    public boolean take(String product) {
        int stock = stock(product);
        if(stock > 0){
            productStock.replace(product, stock - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        return productStock.keySet();
    }
}

