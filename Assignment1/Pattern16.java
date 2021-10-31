class Pattern16{
   public static void main(String []args){
   int i,j,k,l,m,n;
   for(i=1;i<=5;i++){
    for(j=1;j<=i;j++){
     System.out.print(" ");
   }
    for(k=5;k>=i;k--){
     System.out.print("*");
   }
    System.out.println(" ");
   }
    for(l=2;l<=5;l++){
    for(m=5;m>=l;m--){
     System.out.print(" ");
   }
    for(n=1;n<=l;n++){
     System.out.print("*");
   }
   System.out.println(" ");
}
}
}