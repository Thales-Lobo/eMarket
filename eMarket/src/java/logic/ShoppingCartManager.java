//Packages
package logic;

//Imports
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import jakarta.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;
import model.Product;
import model.ShoppingCartItem;

/**
 *
 * @author thaleslobo
 */
@ManagedBean
@SessionScoped
public class ShoppingCartManager implements Serializable {
    private ArrayList<ShoppingCartItem> cartItems;
    private Product prodToAdd;

    //Constructors
    // <editor-fold desc="Constructors">
    public ShoppingCartManager() {
        this.prodToAdd = new Product();
        this.cartItems = new ArrayList<>();
    }
        
    public ShoppingCartManager(Product prodToAdd, ArrayList<ShoppingCartItem> cartItems) {
        this.prodToAdd = prodToAdd;
        this.cartItems = cartItems;
    }
    // </editor-fold>
    
    //Setters
    // <editor-fold desc="Setters">
    public void setProdToAdd(Product prodToAdd) {
        this.prodToAdd = prodToAdd;
    }
    public void setCartItems(ArrayList<ShoppingCartItem> cartItems) {
        this.cartItems = cartItems;
    }
    // </editor-fold>
    
    //Getters
    // <editor-fold desc="Getters">
    public Product getProdToAdd() {
        return this.prodToAdd;
    }
    public ArrayList<ShoppingCartItem> getCartItems() {
        return this.cartItems;
    }
    // </editor-fold>  
    
    @PostConstruct
    public void initCart() {
        //Optional: Default items
    }
    
    public String addToCart() {
        ShoppingCartItem cartItem = new ShoppingCartItem(prodToAdd.getId(), 1, prodToAdd);
        cartItems.add(cartItem);
        return "CartInitialized";
    }
}
