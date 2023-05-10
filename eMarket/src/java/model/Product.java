//Packages
package model;

//Imports
import java.io.Serializable;

/**
 *
 * @author thaleslobo
 */
public class Product implements Serializable {
    private Integer id;
    private String name;
    private Double price;

    //Constructors
    // <editor-fold desc="Constructors">
    public Product() {
    }

    public Product(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    // </editor-fold>
    
    //Setters
    // <editor-fold desc="Setters">
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    // </editor-fold>

    //Getters
    // <editor-fold desc="Getters">
    public Integer getId() {
        return this.id;
    }
        
    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
    // </editor-fold>
}
