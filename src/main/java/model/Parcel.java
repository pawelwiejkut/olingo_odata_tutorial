package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by pawelwiejkut on 02.05.2017.
 */
public class Parcel {

    private Address senderAddress;
    private Address reciverAddress;
    private Set<Warehouse> warehouse;
    private String  content;

    public Address getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(Address senderAddress) {
        this.senderAddress = senderAddress;
    }

    public Address getReciverAddress() {
        return reciverAddress;
    }

    public void setReciverAddress(Address reciverAddress) {
        this.reciverAddress = reciverAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set getWarehouse() {
        if (warehouse == null) {
            warehouse = new HashSet();
        }
        return warehouse;
    }

    public void addGoods(Warehouse warehouse) {
        getWarehouse().add(warehouse);
    }

}

