package com.slybootslion.d4;

public class DemoMain {

    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.powerOn();

        USB usbMouse = new Mouse();
        Keyboard usbKeyboard = new Keyboard();

        computer.useUSB(usbMouse);
        computer.useUSB(usbKeyboard);

        computer.powerOff();
    }
}
