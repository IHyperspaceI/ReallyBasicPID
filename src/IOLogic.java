public class IOLogic {

    private static double current = 0;
    
    private static double target = 10;
    private static double validRange = 0.1;
    private static double kp = 01;
    private static double ki = 0.5;
    private static double kd = 0.0;
    private static double dt = 1;

    //So code doesn't crash when infinite ocilation:
    private static double maxTries = 100;
    private static double tries = 0;

    //Just to test an external force:
    private static double gravity = 1;


    public static void main(String[] args) {
        ReallyBasicPID PIDController = new ReallyBasicPID();

        do{
            current += PIDController.calculatePID(target, current, kp, ki, kd, dt);
            tries++;

            //System.out.println(current);
            System.out.println((Math.abs(target) - Math.abs(current)));
        }while (Math.abs(Math.abs(target) - Math.abs(current)) > validRange && tries < maxTries);
    }
}
