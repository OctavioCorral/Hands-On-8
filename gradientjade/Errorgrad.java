//Octavio Corral Tovar 5to "A" Sistemas
//No. Control 19011234

package gradientjade;

/**
 *
 * @author Tavin
 */
public class Errorgrad {
    
    public double ErrorM (int x[],int y[], double b0, double b1){
        double Error = 0, n = 9;
        for(int i=0; i<n; i++){
            
            Error = Error + (Math.pow((y[i]-b0-(b1*x[i])),2));
     
        }
        
        Error = Error/n;
    
   
        return Error;
    }
    
}
