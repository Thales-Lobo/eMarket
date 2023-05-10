//Packages
package logic;

//Imports
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ApplicationScoped;
import java.io.Serializable;
import java.util.ArrayList;
import model.Product;

/**
 *
 * @author thaleslobo
 */
@ManagedBean
@ApplicationScoped
public class CatalogManager implements Serializable {
    private Product newProduct;
    private ArrayList<Product> products;

    //Constructors
    // <editor-fold desc="Constructors">
    public CatalogManager() {
        newProduct = new Product();
        products = new ArrayList<>();
    }
    // </editor-fold>
    
    //Setters
    // <editor-fold desc="Setters">
    public void setNewProduct(Product newProduct) {
        this.newProduct = newProduct;
    }
    
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    // </editor-fold>
    
    //Getters
    // <editor-fold desc="Getters">
    public Product getNewProduct() {
        return this.newProduct;
    }
    
    public ArrayList<Product> getProducts() {
        return this.products;
    }
    // </editor-fold>  
    
    public String createProduct() {
        Product prod = new Product(newProduct.getId(), newProduct.getName(), newProduct.getPrice());
        products.add(prod);
        newProduct = new Product();
        return "ProductCreated";
    }
}
