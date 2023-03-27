package part1.exercise19;

public class Exercise19 {
    
    public static double getPerimeter(double lado){
        return  lado * 3;
    }
    
    public static double getHeight(double lado){
        return (Math.sqrt(3) * lado) / 2;
    }
    
    public static double getArea(double lado){
        double altura = Exercise19.getHeight(lado);
        return (lado * altura) / 2;
    }
}
