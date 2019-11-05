package com.cnu.mentoring.vineet.cdp.oo.codeTask.codereview;

public class Driver {
    public static void main(String[] args) {
        Home vineetHome = new Home();
        Appliance livingRoomFan = new Fan();
        Appliance livingRoomLight = new Light();
        Appliance bedroomFan = new Fan();

        livingRoomFan.setState(true);
        livingRoomLight.setState(true);

        vineetHome.add(livingRoomFan);
        vineetHome.add(livingRoomLight);
        vineetHome.add(bedroomFan);

        int totalConsumption = ApplicationLogic.calculatePowerConsumption(vineetHome);
        System.out.println(totalConsumption);
    }


}
