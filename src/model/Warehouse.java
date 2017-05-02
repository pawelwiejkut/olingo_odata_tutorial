package model;

/**
 * Created by pawelwiejkut on 02.05.2017.
 */
public class Warehouse {

    private Address address;
    private String  warehouseName;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }
}
