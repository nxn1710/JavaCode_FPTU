package fulib.model;

/**
 * @date Jun 17, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Category {

    private String catId;
    private String catName;

    public Category() {
    }

    public Category(String catId, String catName) {
        this.catId = catId;
        this.catName = catName;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return "Category{" + "catId=" + catId + ", catName=" + catName + '}';
    }

}
