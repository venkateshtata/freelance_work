package com.example.superb;

import android.app.Application;

public class GlobalClass extends Application {

    private int basicwash = 0;
    private int premiumwash = 0;
    private int internalcleaning = 0;
    private int paintprotection = 0;
    private int rubbingglaze = 0;
    private int acsanitization = 0;
    private int enginecoating = 0;
    private int alloywheel = 0;
    private int seattreatment = 0;
    private int headlightrestoration = 0;


    public int getBasicwash() {
        return basicwash;
    }

    public void setBasicwash() {
        this.basicwash = 1;
    }

    public int getPremiumwash() {
        return premiumwash;
    }

    public void setPremiumwash() {
        this.premiumwash = 1;
    }

    public int getInternalcleaning() {
        return internalcleaning;
    }

    public void setInternalcleaning() {
        this.internalcleaning = 1;
    }

    public int getPaintprotection() {
        return paintprotection;
    }

    public void setPaintprotection() {
        this.paintprotection = 1;
    }

    public int getRubbingglaze() {
        return rubbingglaze;
    }

    public void setRubbingglaze() {
        this.rubbingglaze = 1;
    }

    public int getAcsanitization() {
        return acsanitization;
    }

    public void setAcsanitization() {
        this.acsanitization = 1;
    }

    public int getEnginecoating() {
        return enginecoating;
    }

    public void setEnginecoating() {
        this.enginecoating = 1;
    }

    public int getAlloywheel() {
        return alloywheel;
    }

    public void setAlloywheel() {
        this.alloywheel = 1;
    }

    public int getSeattreatment() {
        return seattreatment;
    }

    public void setSeattreatment() {
        this.seattreatment = 1;
    }

    public int getHeadlightrestoration() {
        return headlightrestoration;
    }

    public void setHeadlightrestoration() {
        this.headlightrestoration = 1;
    }
}
