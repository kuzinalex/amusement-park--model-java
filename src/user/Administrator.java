package user;

import controller.AttractionManager;
import controller.ProductManager;
import controller.UserManager;

public class Administrator {
    private ProductManager productManager;
    private AttractionManager attractionManager;
    private UserManager userManager;

    public ProductManager getProductController() {
        return productManager;
    }

    public AttractionManager getAttractionController() {
        return attractionManager;
    }

    public UserManager getUserController() {
        return userManager;
    }
}
