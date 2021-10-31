class P15{
  public static void main(String []args){
  
  for(int i=1;i<=4;i++){ 
       
      for(int j=1;j<=4;j++){//for j
        if(i==1&&j==4 || i==2&&j==4 || i==3&&j==1 || i==3&&j==4 ||i==4&&j==2 ||i==4&&j==3){
        System.out.print("J");
        }
        else{
        System.out.print(" ");
        }
        }
       System.out.println();

        for(int k=1;k<=11;k++){//for A
        if(i==1&&k==8 ||i==2&&k==7 ||i==2&&k==9 ||i==3&&k==6 ||i==3&&k==7 ||i==3&&k==8 ||i==3&&k==9 ||i==3&&k==10 ||i==4&&k==5 ||i==4&&k==11){
        System.out.print("A");
        }
        else{
        System.out.print(" ");
        }
        }
       System.out.println();
      
        for(int l=1;l<=18;l++){//for v
        if(i==1&&l==12 ||i==1&&l==18|| i==2&&l==13 ||i==2&&l==17|| i==3&&l==14 ||i==3&&l==16||i==4&&l==15){
        System.out.print("V");
        }
        else{
        System.out.print(" ");
        }
        }
       System.out.println();


       for(int m=1;m<=25;m++){//for A
        if(i==1&&m==22 ||i==2&&m==21 ||i==2&&m==23 ||i==3&&m==20 ||i==3&&m==21 ||i==3&&m==22 ||i==3&&m==23 ||i==3&&m==24 ||i==4&&m==19 ||i==4&&m==25){
        System.out.print("A");
        }
        else{
        System.out.print(" ");
        }
        }
       System.out.println();







}
}
}  

     