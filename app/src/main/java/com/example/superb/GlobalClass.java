package com.example.superb;

import android.app.Application;

public class GlobalClass extends Application {

    public int basicwash;
    private int premiumwash;
    private int internalcleaning;
    private int paintprotection;
    private int rubbingglaze;
    private int acsanitization;
    private int enginecoating;
    private int alloywheel;
    private int seattreatment;
    private int headlightrestoration;

    boolean btn_txt = false;

    public boolean isBtn_txt() {
        return btn_txt;
    }

    public boolean setBtn_txt_true(){
        return btn_txt = true;
    }

    public boolean setBtn_txt_false(){
        return  btn_txt = false;
    }

    public void setBtn_txt(boolean btn_txt) {
        this.btn_txt = btn_txt;
    }

    public int getBasicwash() {
        return this.basicwash;
    }

    public void setBasicwash(int i) {
        this.basicwash = i;

    }

    public int getPremiumwash() {
        return premiumwash;
    }

    public void setPremiumwash(int i) {
        this.premiumwash = i;
    }

    public int getInternalcleaning() {
        return internalcleaning;
    }

    public void setInternalcleaning(int i) {
        this.internalcleaning = i;
    }

    public int getPaintprotection() {
        return paintprotection;
    }

    public void setPaintprotection(int i) {
        this.paintprotection = i;
    }

    public int getRubbingglaze() {
        return rubbingglaze;
    }

    public void setRubbingglaze(int i) {
        this.rubbingglaze = i;
    }

    public int getAcsanitization() {
        return acsanitization;
    }

    public void setAcsanitization(int i) {
        this.acsanitization = i;
    }

    public int getEnginecoating() {
        return enginecoating;
    }

    public void setEnginecoating(int i) {
        this.enginecoating = i;
    }

    public int getAlloywheel() {
        return alloywheel;
    }

    public void setAlloywheel(int i) {
        this.alloywheel = i;
    }

    public int getSeattreatment() {
        return seattreatment;
    }

    public void setSeattreatment(int i) {
        this.seattreatment = i;
    }

    public int getHeadlightrestoration() {
        return headlightrestoration;
    }

    public void setHeadlightrestoration(int i) {
        this.headlightrestoration = i;
    }
}
