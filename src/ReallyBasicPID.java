public class ReallyBasicPID {
    private double error;
    private double integral;
    private double derivative;
    private double prevError;

    public double calculatePID(double target, double measuredOutput, double kp, double ki, double kd, double dt){
        error = target - measuredOutput;
        integral = error * dt;
        derivative = (error - prevError) / dt;
        prevError = error;

        return (kp * error) + (ki * integral) + (kd * derivative);
    }
}
