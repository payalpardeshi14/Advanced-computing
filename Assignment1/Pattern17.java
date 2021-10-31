class Pattern17{
   public static void main(String []args){
   int i,j,k,l,m,n;
   for(i=1;i<=5;i++){
    for(j=1;j<=i;j++){
     System.out.print(" ");
   }
    for(k=5;k>=i;k--){
     System.out.print("*");
   }
     for(l=5;l>=i;l--){
      System.out.print("*");
     }
    System.out.println(" ");
   }

   for(m=1;m<=5;m++){
    for(n=5;n>=5;n--){
     System.out.print(" ");
   }
    for(p=1;p<=m;p++){
     System.out.print("*");
   }
     for(q=1;q<=m;q--){
      System.out.print("*");
     }
    System.out.println(" ");
   }
 
    
}
}