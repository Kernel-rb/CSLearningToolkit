public class Main {
    public static void main(String[] args) {
        Child child = new Child(1 ,"Kernel" , 25);
        child.career("Lawyer");
        child.univ("Harvard");
        Parent.greet();
        Car  volvo = new Car(); // Engine volvo it's possible but we can't access to methods
        volvo.start();
        volvo.acc();
        volvo.brake();
        volvo.stop();


        NiceCar tesla = new NiceCar();
        tesla.start();
        tesla.stop();
        tesla.startMusic();
        tesla.stopMusic();
        tesla.upgradeEngine();
    }
}
