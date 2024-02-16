package main.java.com.session5;

/*
*
Create two concrete classes that *inherit* from ElectronicDevice: Smartphone, and SmartTv
Smartphone
Fields: display resolution, weight, nfc, bluetooth, headphones 3.5mm, fast charge
Methods: make call, receive a call, send a message
* */
public class SmartPhone extends ElectronicDevice {
    // attributes
    int[] displayResolution = {1440, 720};
    float weight;
    boolean nfc;
    boolean bluetooth;
    boolean headphones3_5;
    boolean fast_charge;

    // methods
    public void make_call(int nr) {
        System.out.println("Apelam numarul " + nr);
    }

    public void answer_call(int nr) {
        System.out.println("Answering call from" + nr);
    }

    public void send_text(String text, int nr){
        System.out.println("Sending text: " + text + " to " + nr);
    }

    @Override
    public void charge() {
        // la fiecare minut urca procentul de baterie +1
        int min = 0;
        while(true){
            ++min;
            this.battery_level +=1;
            //this.battery_level = this.battery_level + 1;
            if(this.battery_level == 95) break;
        }

    }

    @Override
    public void displayDeviceInfo() {
        //brand, model, operating_system
        System.out.println("Device info: \nBrand: " + this.brand + "\nModel: " + this.model + "\nOS: " + this.operating_system);
    }
}
//Device Info:
// Brand: dlkkjs
