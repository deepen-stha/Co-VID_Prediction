package com.example.coronago;

public class UserHelperClass {

        //empty constructor
        public UserHelperClass(){
            // Default constructor required for calls to DataSnapshot.getValue(User.class)

        }

    // This is for the "Customers " table of firebase database
        String email,password,name,address,pincode,date,type,mobile;



    public UserHelperClass(String demail, String dmobile, String dpwd, String dname, String daddr, String dpincode, String ddob, String dtype){
            this.email=demail;
            this.password=dpwd;
            this.name=dname;
            this.address=daddr;
            this.pincode=dpincode;
            this.date=ddob;
            this.type=dtype;
            this.mobile = dmobile;
        }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


}
