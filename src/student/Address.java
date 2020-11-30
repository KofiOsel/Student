/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Objects;

/**
 *
 * @author kofi3
 */
class Address {
    private String  aptNum;
    private String streetNum;
    private String streetName;
    private String  city;
    private String province;
    private String zipcode;

    public Address() {
        this.aptNum = null;
        this.streetNum = null;
        this.streetName = null;
        this.city = null;
        this.province = null;
        this.zipcode = null;
    }
     public Address(String aptNum, String streetNum, String streetName, String city, String province, String zipcode) {
        this.aptNum = aptNum;
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.zipcode = zipcode;
    }
    public Address(Address address) {
        this.aptNum = address.aptNum;
        this.streetNum = address.streetNum;
        this.streetName = address.streetName;
        this.city = address.city;
        this.province = address.province;
        this.zipcode = address.zipcode;
        
    }
    /**public boolean equals(Address address) {
        return this.aptNum.equals(address.aptNum) && this.streetNum.equals(address.streetNum)
    }*/
       
    
    
    
    
}
