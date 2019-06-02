package com.superrr.superb;

import android.app.Application;

import java.util.ArrayList;

public class GlobalClass extends Application {

    private int basicwash;
    private int premiumwash;
    private int internalcleaning;
    private int paintprotection;
    private int rubbingglaze;
    private int acsanitization;
    private int enginecoating;
    private int alloywheel;
    private int seattreatment;
    private int headlightrestoration;

    private String selectedCar;

    private ArrayList<String> list = new ArrayList<String>();

    private int total = 0;

    private String name;
    private String phone;
    private String email;
    private String address;
    private String date;
    private String time;

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(String service) {
        this.list.add(service);
    }

    public int getTotal() {
        return total;
    }

    public void addToTotal(int i) {
        this.total = total+i;
    }
    public void subFromTotal(int i){
        this.total = total-i;
    }

    public void clearTotal(){
        this.total = 0;
    }

    public void clearAllServices(){
        this.basicwash = 0;
        this.premiumwash = 0;
        this.internalcleaning = 0;
        this.paintprotection = 0;
        this.rubbingglaze = 0;
        this.acsanitization = 0;
        this.enginecoating = 0;
        this.alloywheel = 0;
        this.seattreatment = 0;
        this.headlightrestoration = 0;
        this.list.clear();
    }



    public String getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(String selectedCar) {
        this.selectedCar = selectedCar;
    }

    public int getBasicwash() {
        return this.basicwash;
    }

    public void setBasicwash(int i) {
        this.basicwash = i;
        if(i == 0){
            this.list.remove("Basic Car Wash");
        }else {
            this.list.add("Basic Car Wash");
        }

    }

    public int getPremiumwash() {
        return premiumwash;
    }

    public void setPremiumwash(int i) {
        this.premiumwash = i;
        if(i == 0){
            this.list.remove("Premium Car Wash");
        }else {
            this.list.add("Premium Car Wash");
        }
    }

    public int getInternalcleaning() {
        return internalcleaning;
    }

    public void setInternalcleaning(int i) {
        this.internalcleaning = i;
        if(i == 0){
            this.list.remove("Internal Cleaning");
        }else {
            this.list.add("Internal Cleaning");
        }
    }

    public int getPaintprotection() {
        return paintprotection;
    }

    public void setPaintprotection(int i) {
        this.paintprotection = i;
        if(i == 0){
            this.list.remove("Paint Protection Coating");
        }else {
            this.list.add("Paint Protection Coating");
        }
    }

    public int getRubbingglaze() {
        return rubbingglaze;
    }

    public void setRubbingglaze(int i) {
        this.rubbingglaze = i;
        if(i == 0){
            this.list.remove("Superb Rubbing and Glaze");
        }else {
            this.list.add("Superb Rubbing and Glaze");
        }
    }

    public int getAcsanitization() {
        return acsanitization;
    }

    public void setAcsanitization(int i) {
        this.acsanitization = i;
        if(i == 0){
            this.list.remove("A.C Sanitization");
        }else {
            this.list.add("A.C Sanitization");
        }
    }

    public int getEnginecoating() {
        return enginecoating;
    }

    public void setEnginecoating(int i) {
        this.enginecoating = i;
        if(i == 0){
            this.list.remove("Engine Coating");
        }else {
            this.list.add("Engine Coating");
        }
    }

    public int getAlloywheel() {
        return alloywheel;
    }

    public void setAlloywheel(int i) {
        this.alloywheel = i;
        if(i == 0){
            this.list.remove("Alloy Wheel Treatment");
        }else {
            this.list.add("Alloy Wheel Treatment");
        }
    }

    public int getSeattreatment() {
        return seattreatment;
    }

    public void setSeattreatment(int i) {
        this.seattreatment = i;
        if(i == 0){
            this.list.remove("Upholstery Correction");
        }else {
            this.list.add("Upholstery Correction");
        }
    }

    public int getHeadlightrestoration() {
        return headlightrestoration;
    }

    public void setHeadlightrestoration(int i) {
        this.headlightrestoration = i;
        if(i == 0){
            this.list.remove("Headlight Restoration");
        }else {
            this.list.add("Headlight Restoration");
        }
    }
}
