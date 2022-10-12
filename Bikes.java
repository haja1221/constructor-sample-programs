class Bikes{
      String companyName;
      String bikeName;
      int price;
      int milage;  

        Bikes(String cn,String bn,int p){
           companyName=cn;
           bikeName=bn;
           price=p;
        
        }

        Bikes(String cn,String bn,int p,int m){
           companyName=cn;
           bikeName=bn;
           price=p;
           milage=m;

        }

        public static void main(String[]args){
         Bikes client1=new Bikes("yamaha","R15",150000);
         Bikes client2=new Bikes("KTM","RC",25000,25);
         
         System.out.println("Company name = "+client1.companyName+"\nBike name = "+client1.bikeName+
                                           "\nbike price = "+client1.price);
         System.out.println("\nCompany name = "+client2.companyName+"\nBike name = "+client2.bikeName+
                                           "\nbike price = "+client2.price+"\nmilage ="+client2.milage+"kms");
              

        }      
}
