//Packages
package model;

//Imports
import java.io.Serializable;

/**
 *
 * @author thaleslobo
 */
public class ShoppingCartItem implements Serializable {
    private Integer id;
    private Integer amount;
    private Product product;

    //Constructors
    // <editor-fold desc="Constructors">
    public ShoppingCartItem() {
    }

    public ShoppingCartItem(Integer id, Integer amount, Product product) {
        this.id = id;
        this.amount = amount;
        this.product = product;
    }
    // </editor-fold>
    
    //Setters
    // <editor-fold desc="Setters">
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    // </editor-fold>

    //Getters
    // <editor-fold desc="Getters">
    public Integer getId() {
        return this.id;
    }
        
    public Integer getAmount() {
        return this.amount;
    }

    public Product getProduct() {
        return this.product;
    }
    // </editor-fold>
}
