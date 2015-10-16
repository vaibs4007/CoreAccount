package com.ail.core.account.models;

import org.springframework.stereotype.Component;

/**
 * Created by vaibhav on 15/10/15.
 */
@Component
public class Address {

    private String key;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
    private String areaCode;
    private String landmark;
    private Boolean isDefault = false;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (!getKey().equals(address.getKey())) return false;
        if (!getLine1().equals(address.getLine1())) return false;
        if (getLine2() != null ? !getLine2().equals(address.getLine2()) : address.getLine2() != null) return false;
        if (!getCity().equals(address.getCity())) return false;
        if (!getState().equals(address.getState())) return false;
        if (!getCountry().equals(address.getCountry())) return false;
        if (!getAreaCode().equals(address.getAreaCode())) return false;
        if (getLandmark() != null ? !getLandmark().equals(address.getLandmark()) : address.getLandmark() != null)
            return false;
        return !(getIsDefault() != null ? !getIsDefault().equals(address.getIsDefault()) : address.getIsDefault() != null);

    }

    @Override
    public int hashCode() {
        int result = getKey().hashCode();
        result = 31 * result + getLine1().hashCode();
        result = 31 * result + (getLine2() != null ? getLine2().hashCode() : 0);
        result = 31 * result + getCity().hashCode();
        result = 31 * result + getState().hashCode();
        result = 31 * result + getCountry().hashCode();
        result = 31 * result + getAreaCode().hashCode();
        result = 31 * result + (getLandmark() != null ? getLandmark().hashCode() : 0);
        result = 31 * result + (getIsDefault() != null ? getIsDefault().hashCode() : 0);
        return result;
    }
}
