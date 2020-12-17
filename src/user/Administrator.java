package user;

import controller.AttractionController;
import controller.ProductController;
import controller.UserController;

public class Administrator {
    private ProductController productController;
    private AttractionController attractionController;
    private UserController userController;

    public ProductController getProductController() {
        return productController;
    }

    public AttractionController getAttractionController() {
        return attractionController;
    }

    public UserController getUserController() {
        return userController;
    }
}
