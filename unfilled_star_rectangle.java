package src;



public class unfilled_star_rectangle {
    public static void main(String[]args){
    
        for(int i=1;i<=4;i++){
            if(i==1 || i==4){
                for(int j=1;j<=4;j++){
                    System.out.print("*");
                }System.out.println();
                }
            else if(i==2||i==3){
                for(int k=1;k<=4;k=k+2){
                    System.out.print("*");
                    System.out.print("  ");
                }System.out.println(" ");
                    
            }
            
           

        }

        
        
    
    
    
    
    
    }
}

