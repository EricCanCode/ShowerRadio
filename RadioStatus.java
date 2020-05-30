public class RadioStatus {
    private String power;
    private int volume;
    private int time;

    public static void main(String[] args) {
        //introduction of the process
        System.out.println("The Morning Routine of the Shower Radio:");

        RadioStatus wakeUp = new RadioStatus();
        RadioStatus inShower = new RadioStatus();
        RadioStatus outShower = new RadioStatus();

        wakeUp.power = "On";
        wakeUp.volume = 5;
        wakeUp.time = 500;
        System.out.println("When it is " +wakeUp.time + " a.m., the radio is "+ wakeUp.power + " with the volume at "+ wakeUp.volume);

        inShower.power = "On";
        inShower.volume = 15;
        inShower.time = 530;
        System.out.println("When it is " +inShower.time + " a.m., the radio is "+ inShower.power + " with the volume at "+ inShower.volume);

        outShower.power = "Off";
        outShower.volume = 0;
        outShower.time = 600;
        System.out.println("When it is " +outShower.time + " a.m., the radio is "+ outShower.power + " with the volume at "+ outShower.volume);
    }
}

