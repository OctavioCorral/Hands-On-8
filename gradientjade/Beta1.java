//Octavio Corral Tovar 5to "A" Sistemas
//No. Control 19011234

package gradientjade;

/**
 *
 * @author Tavin
 */
public class Beta1 {
    
     public double betauno(int n, int x[], int y[], double b0, double b1){
        double beta1 = 0;
        
        for(int i=0; i<n; i++){
            
            beta1 = beta1 + (x[i]*(y[i]-(b0+(b1*x[i]))));
     
        }
        
        beta1 =(-2*beta1)/n;
    
        return beta1;
    }
    
}
