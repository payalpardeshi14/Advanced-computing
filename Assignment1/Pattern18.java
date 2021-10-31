class Pattern18{
   public static void main(String []args){
   int i,j,k,l,m,n,p,q;
   for(i=1;i<=5;i++){
    for(j=1;j<=i;j++){
     System.out.print(" ");
   }
    for(k=5;k>=i;k--){
     System.out.print("*");
   }
     for(l=4;l>=i;l--){
      System.out.print("*");
     }
    System.out.println(" ");
   }

   for(m=2;m<=5;m++){
    for(n=5;n>=m;n--){
     System.out.print(" ");
   }
    for(p=1;p<=m;p++){
     System.out.print("*");
   }
     for(q=2;q<=m;q++){
      System.out.print("*");
     }
    System.out.println(" ");
   }
 
    
}
}