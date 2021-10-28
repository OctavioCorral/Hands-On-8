//Octavio Corral Tovar 5to "A" Sistemas
//No. Control 19011234

package gradientjade;

/**
 *
 * @author Tavin
 */
public class Beta0 {
    
    public double betacero(int n, int x[], int y[], double b0, double b1){
        double beta0 = 0;
        
        for(int i=0; i<n; i++){
            
            beta0 = beta0 + (y[i]-(b0+(b1*x[i])));
     
        }
        
        beta0 = 2*(beta0/n);
    
        return beta0;
    }
    
   
}
