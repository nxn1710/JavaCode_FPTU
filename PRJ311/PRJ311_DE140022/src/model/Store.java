package model;

import java.io.Serializable;

/**
 * @date Jul 31, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Store implements Serializable{
    private String storeID;
    private String storeName;
    private String address;
    private String phone;

    public Store() {
    }

    public Store(String storeID, String storeName, String address, String phone) {
        this.storeID = storeID;
        this.storeName = storeName;
        this.address = address;
        this.phone = phone;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Store{" + "storeID=" + storeID + ", storeName=" + storeName + ", address=" + address + ", phone=" + phone + '}';
    }
    
    
}
