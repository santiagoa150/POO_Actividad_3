package part1.exercise23;

public class Exercise23 {
    
    public static double getDeterminante(double a, double b, double c){
        return (Math.pow(b, 2) - (4 * a * c));
    }
    
    public static double getSolution1(double a, double b, double c){
        double response = 0;
        double determinante = Exercise23.getDeterminante(a, b, c);
        if(determinante >= 0){
            double raiz = Math.sqrt(determinante);
            response = (-b + raiz) / (2 * a);        
        }
        return response;
    }
    
    public static double getSolution2(double a, double b, double c){
         double response = 0;
        double determinante = Exercise23.getDeterminante(a, b, c);
        if(determinante >= 0){
            double raiz = Math.sqrt(determinante);
            response = (-b - raiz) / (2 * a);        
        }
        return response;
    }
}
