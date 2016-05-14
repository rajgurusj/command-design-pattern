import java.util.*;
public class socialnetwork 
{
  public static void main(String[] args) throws Exception
   {
      System.out.println("press 1 for login ,2 for logout");
      Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		while(a<=2)
	{
	   switch(a)
	    {
	       case '1': System.out.println("please enter your name");
	                 Scanner in=new Scanner(System.in);
	                 String b=in.next();
	                 b.login();
	                 System.out.println("you have successfully logged in");
	                 System.out.println("press 1 for add friend ,2 for unfriend,3 for like,4 for unlike");
	                 Scanner in=new Scanner(System.in);
	                 int x=in.next();
	                 while (x<=4)
	              {
	                  switch(x)
	                  {
	                    case '1':System.out.println("please enter friend's name whom you want to add");
	                    		Scanner in=new Scanner(System.in);
	                            String z=in.next();
	                            if ( z=="vivek" || "rakesh" || "abhishek" || "rajguru" )
	                            {
	                              z.addfriend();
	                               System.out.println("you have successfully added freind z");
	                              }
	                            else
	                            {
	                               System.out.println("z is not a user of this network ,so please invite him"); 
	                             }  
	                       case '2':System.out.println("please enter friend's name whom you want to unfreind"); 
	                                Scanner in=new Scanner(System.in);
	                                String c=in.next();
	                                c.unfriend();
	                                System.out.println("you have successfully unfreinded c");
	                              
	                        case '3':System.out.println("whom you want to like");
	                                  Scanner in=new Scanner(System.in);
	                                  String c=in.next();
	                                  c.like();
	                                  System.out.println("you have successfully liked c");
	                         case '4':System.out.println("whom you want to dislike"); 
	                         		  Scanner in=new Scanner(System.in);
	                         		  String c=in.next();
	                                  c.unlike();
	                                  System.out.println("you have successfully unlike c");                   
	                             
	                    
	       case '2': System.out.println("if you wanna logout for sure press again 2");
	                 Scanner in=new Scanner(System.in);
	                 int i=in.nextInt();
	                 i.logout();
	                 System.out.println("you have successfully logged out");
	 }
	 }
	 }
	 
	 }  
}
}	               
	                 
	                 
	                 
	                 
	                             
	                    
	                    
	                    
	                    
	                    
	                       
	                 
	                 
	                 	

