class P27{
   public static void main(String[]args){
     for(int i=1;i<=5;i++){
     
         for(int k=1;k<=i;k++){
      if(i==1&&k==5 || i==2&&k==4 || i==2&&k==5 || i==3&&k==3 || i==3&&k==5 ||i==4&&k==2 || i==4&&k==5 || i==5&&k==1 || i==5&&k==2 || i==5&&k==3 || i==5&&k==4 || i==5&&k==5)
      {
        System.out.print("*");
      }     
      else{
       System.out.println(" ");
       }
}
 }
}
}