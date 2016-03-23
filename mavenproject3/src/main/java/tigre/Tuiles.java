/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigre;

/**
 *
 * @author mohamad
 */
public class Tuiles extends Pions{
    private int  nb_tuile ;
    private String type_tuile;
    

    public Tuiles( String type , int nb ) {
        super();
        this.nb_tuile = nb;
        this.type_tuile = type ;
    }
      
    public  String toString(){
        
        return "   T|" ;
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private Tuiles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
        public void initialise() {
          
 
           Plateau p =new Plateau(10, 15);
    
    java.util.Random rand=new java.util.Random();
    int i=rand.nextInt(20);
    int j=rand.nextInt(20);
    int nTuiles=1;
    for(int n=0;n<nTuiles;n++){
        if(p.getGrille()[i][j]== null){
            p.getGrille()[i][j] = new Tuiles();
        }
        
        
        
        
        
       //if(ocean.grille[i][j]==null){
      // ocean.grille[i][j]=new Sardine();
    }
    }
    
    
    
    
    
    
    
/*
    Tuiles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
/*
    Tuiles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */

  
  

    @Override
    public void oneparty(Plateau plateau, int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
   /*
    @Override
    
    public void oneparty(Plateau p, int i, int j) {
      Tuiles t1 = new Tuiles();
 
       java.util.Random rand=new java.util.Random();
        int nombreAleatoire=rand.nextInt(4);
       
       int nb_tuile =0;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
   
    
    
    
    
   
   
   
    

