class Pattern8{
    public static void main(String[]args){
     int a,b,c,d,i,j,k,l;
     for(a=1;a<=5;a++){
     for(b=5;b>=a;b--){
      System.out.print(" ");
     }
     for(c=1;c<=a;c++){
       System.out.print("*");
     }
     for(d=2;d<=a;d++){
       System.out.print("*");
     }
     System.out.println(" ");

     }
     for(i=2;i<=5;i++){
          for(k=1;k<=i;k++){
           System.out.print(" ");
           }
      for(j=5;j>=i;j--){
          System.out.print("*");
       }
      for(l=4;l>=i;l--){
          System.out.print("*");
      }
        System.out.println(" ");
     }
}
}
