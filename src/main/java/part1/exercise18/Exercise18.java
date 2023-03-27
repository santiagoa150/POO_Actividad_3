package part1.exercise18;

public class Exercise18 {
    
    public static double getSalary(double hours, double hoursPrice){
        return hours * hoursPrice;
    }
    
    public static double getSalary(double hours, double hoursPrice, double retencion){
        double bruto = Exercise18.getSalary(hours, hoursPrice);
        return bruto - (bruto * retencion) ;
    }
}
