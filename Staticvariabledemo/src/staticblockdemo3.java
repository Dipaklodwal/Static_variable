class Operation{
    static int a=5,b=20,c=15;
    static int add,sub,mul,div;
             static void show(){
               add=a+b;
               sub=a-b;
               mul=a*b;
                div=c/a;
       System.out.println("Addition is:" + add);
       System.out.println("substraction is : "+sub);
       System.out.println("multiplication is :"+mul);
       System.out.println("Division is :"+div);
   }
 

static void changevariable(){
      a=12;  
      b=14;
      c=22;
}
static{ 
    System.out.println("addition,substraction,multiplication,division");
}

}     
      public class staticblockdemo3{
       public static void main(String[] args) {
       Operation O=new Operation();
        O.show();
        System.out.println(" ");
        Operation.changevariable();
        O.show();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
       
    
   
