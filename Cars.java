class Cars{
   String Companyname;
   int price ;
   boolean luxury ;
   
  
    Cars(String cn,int p,boolean l){
       Companyname =cn;
       price=p;
       luxury=l;
       System.out.println("companyName = "+Companyname+"\nPrice = "+price);

      if(price>200000){
        System.out.println("it is a luxury car");
        }

      else{
        System.out.println("it is not a luxury car");
          }
      }

    public static void main(String[]args){
     Cars S1= new Cars("BMW",300000,true);
    }   
}
