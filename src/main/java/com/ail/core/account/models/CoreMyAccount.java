package com.ail.core.account.models;

import com.sun.istack.internal.NotNull;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by vaibhav on 15/10/15.
 */
public class CoreMyAccount {


    @Id
    String id;
    @NotNull
    private String firstName;


    private List<Address> addresses;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
