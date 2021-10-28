//Octavio Corral Tovar 5to "A" Sistemas
//No. Control 19011234

package gradientjade;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

/**
 *
 * @author Tavin
 */
public class GradientJADE extends Agent{

  
    protected void setup(){
        
        System.out.println("Agente "+getLocalName()+" iniciado");
        addBehaviour(new MyOneShotBehaviour());
    }
    
    
    private class MyOneShotBehaviour extends OneShotBehaviour {

    @Override
    public void action() {
       int x[] = {23,26,30,34,43,48,52,57,58};
        int y[] = {651,762,856,1063,1190,1298,1421,1440,1518};
        
        int n = 9;
        double b0=0, b1=0, a=0.003, Error=0,error2=0;
        double b0aux = 0, b1aux = 0;
        
        Beta0 beta0 = new Beta0();
        Beta1 beta1 = new Beta1();
        Errorgrad error = new Errorgrad();
        
         
        Error = error.ErrorM(x, y, b0, b1);
        error2 = Error;
      
      
        b0 = beta0.betacero(n, x, y, b0, b1);
        b1 = beta1.betauno(n, x, y, b0, b1);
        
        System.out.println("Beta 0 es :"+b0);
        System.out.println("Beta 1 es :"+b1);

       
        while(Error<=error2){  // While para la condicion del 0
            b0aux = b0; //se actualiza beta 0
            b1aux = b1; //se actualiza beta 1
            b0 = b0-(a*(beta0.betacero(n, x, y, b0, b1)));  //se multiplica por alpha
            b1 = b1-(a*(beta1.betauno(n, x, y, b0, b1)));
            
            
            Error=error2;
            Error = error.ErrorM(x, y, b0, b1); 
            System.out.println("El resultado es: "+Error+"\n");
            //System.out.println(Error+"\n");  
       
        }
    } 
    
    @Override
    public int onEnd() {
        System.out.println("\nAgente Muerto");
      myAgent.doDelete();   
      return super.onEnd();
    } 
  }
    
}

