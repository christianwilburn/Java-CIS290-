
package examone;


public class Temperature {
    private double temperature;


    public Temperature() {
        temperature = 0;
    }


    public Temperature(double temperature) {
        this.temperature = temperature;
    }


    public double getTemperature() {
        return temperature;
    }


    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }


    public boolean isEthylFreezing() {
        return temperature <= -173;
    }


    public boolean isEthylBoiling() {
        return temperature >= 172;
    }

    
    public boolean isOxygenFreezing() {
        return temperature <= -362;
    }


    public boolean isOxygenBoiling() {
        return temperature >= -306;
    }

    
    public boolean isWaterFreezing() {
        return temperature <= 32;
    }


    public boolean isWaterBoiling() {
        return temperature >= 212;
    }
}
