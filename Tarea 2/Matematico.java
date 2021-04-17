
/**
 * Write a description of class Matematico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matematico
{
    public String Ordenar_Numeros(double nro1, double nro2, double nro3){
        String Ordenar= "";
        double Mayor;
        double mayor;
        double Menor;
        double menor;
        double Medio;
        
        mayor = Math.max(nro2,nro3);
        Mayor = Math.max(nro1,mayor);
        menor = Math.min(nro2,nro3);
        Menor = Math.min(nro1,menor);
        Medio = 0;

        if(nro2 < nro1 && nro1 < nro3 ){
            Medio = nro1;
        }
        if(nro2 > nro1 && nro1 > nro3 ){
            Medio = nro1;
        }
        if(nro1 < nro2 && nro2 < nro3 ){
            Medio = nro2;
        }
        if(nro1 > nro2 && nro2 > nro3 ){
            Medio = nro2;
        }
        if(nro2 < nro3 && nro3 < nro1 ){
            Medio = nro3;
        }
        if(nro2 > nro3 && nro3 > nro1 ){
            Medio = nro3;
        }
        
        Ordenar="El numero Mayor es " + Mayor +", el Menor "+ Menor +" y el numero Medio " + Medio;
        
        return Ordenar;
    }
    
    public double Area_Cuadrado(double Base, double Altura){
        double Area;
        
        Area = Base * Altura; 
        
        return Area;
    }
    
    public double Distancia_Entre_Puntos(Punto punto1, Punto punto2){
        double Distancia;
        
        Distancia = Math.sqrt(Math.pow((punto1.getX()-punto2.getX()),2)
                    +Math.pow((punto1.getY()-punto2.getY()),2));
        
        return Distancia;
    }
    
    public String Ver_Cuadrante(Punto Ub){
        String Cuadrante;
        Cuadrante ="";
        
        if(Ub.getX() > 0 && Ub.getY() > 0){
            Cuadrante = " Pertenece al 1er Cuadrante";
        }
        if(Ub.getX() < 0 && Ub.getY() > 0){
            Cuadrante = " Pertenece al 2do Cuadrante";
        }
        if(Ub.getX() < 0 && Ub.getY() < 0){
            Cuadrante = " Pertenece al 3er Cuadrante";
        }
        if(Ub.getX() > 0 && Ub.getY() < 0){
            Cuadrante = " Pertenece al 4to Cuadrante";
        }
        if(Ub.getX() == 0 && Ub.getY() == 0){
            Cuadrante = " Esta en el centro del plano ";
        }
        
        
        return Cuadrante;
    }
}
