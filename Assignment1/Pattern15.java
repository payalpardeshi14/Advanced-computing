class Pattern15{
   public static void main(String []args){
   int i,j,k,l;
   for(i=1;i<=5;i++){
    for(j=5;j>=i;j--){
     System.out.print("*");
   }
     System.out.println(" ");
   }
   
    for(k=2;k<=5;k++){
    for(l=1;l<=k;l++){
     System.out.print("*");
   }
     System.out.println(" ");
   }

}
}