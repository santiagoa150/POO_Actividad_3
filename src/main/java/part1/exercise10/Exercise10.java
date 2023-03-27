package part1.exercise10;

public class Exercise10 {
    
    public static double getMatricula(double patrimonio, short estrato){
        double matricula = 50000;
        if (estrato > 3 && patrimonio > 2000000){
            matricula = matricula + (patrimonio * 0.03);
        }
        return matricula;
    }
}
