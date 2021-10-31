class Pattern19{
   public static void main(String []args){
   int i,j,k,l,m,n,p,q;
   for(i=1;i<=5;i++){
    for(j=5;j<=i;j--){
     Syste.out.print(" ");
    }
     for(k=1;k<=i;k++){
     if(i==5||j==5||(i==4&&j==2)||(i==3&&j==3)||(i==2&&j==4)){
     System.out.print("*");
     }
     else{
     System.out.print(" ");
     }
   }
    System.out.println(" ");
   }

  
 
    
}
}