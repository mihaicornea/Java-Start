package main.java.com.session5;
/*
* SmartTv
Fields: display size, display resolution, voice commands, remote analog pointer, connectivity
Methods: record show, off timer
* */
public class SmartTV extends ElectronicDevice {
    //attributes
    int displaySize;
    int[] displayResolution = {1080, 720};
    boolean voice_commands;
    boolean remote_analog_pointer;
    String connectivity;
    //methods
    public void recordShow(String title) {
        System.out.println("Recording show: " + title);
    }
    public void offTimer(int min) {
        System.out.println(min + " until TV will shut off");
    }
    @Override
    public void charge() {
        //battery level nu e influentat pentru ca nu are baterie
        this.power_status = true;
        System.out.println("The device is turned on!");
    }
    @Override
    public void displayDeviceInfo() {
        //brand, model, operating_system
        System.out.println("Device info: \nBrand: " + this.brand + "\nModel: " + this.model + "\nOS: " + this.operating_system);
    }
}
