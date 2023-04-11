
package conferencefinallab;

import java.util.*;
import java.io.*;
    
public class ConferenceFinalLab {  
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       List cList = new List();
       int count = 0;
       while(count < 2) { 
           
           try { 
               System.out.println("please enter The conference name , id , size ");
               String conName = input.next();
               int id = input.nextInt();
               int size = input.nextInt();
                
                double fee = 0;
                Conference co = null;
                
                boolean enter = true;
                while(enter) {
                   try { 
                    System.out.println(" Enter fee");
                    fee = input.nextDouble();
                    co = new Conference(conName , id , fee , size );
                    cList.insertAtFront(co);
                    enter = false;   
                }
                   catch(InvalidFeeException e ) { 
                       System.out.println("Wrong fee , value should be entered between 0 and 9999");
                   }
                } // end of while 
                count++;
           } // end of try  
            catch(InputMismatchException r) { 
            System.out.println("Input error");
            
            input.nextLine();
            }
       } // end of while
                
               Conference con3 = null;
               
               try{
               con3 =new Conference ("Artificial intellegence International Conference " , 54114,3000,10);
               con3.addPaper("Bioinformatics");
               con3.addPaper("Cognitive systems");
               cList.insertAtFront(con3);
               }
               catch(InvalidFeeException g ) { 
                   System.out.println(g.toString());
                 
               }
               
               List temp = new List();
               try{
               File ObjFile = new File("Conferences.data");
               FileOutputStream Fou = new FileOutputStream(ObjFile);
               ObjectOutputStream ob = new ObjectOutputStream(Fou);
               
               File txtFile = new File("newConf.txt");
               Scanner scan = new Scanner(txtFile);
               
               
               
               while(!cList.isEmpty()) { 
                  
                   Conference obj = cList.removeFromFront();
                   
                   if(obj.getcID() == 22112)
                       obj.addPaper("Ethics in AI");
                   
                   System.out.println(obj.toString());
                   
                   ob.writeObject(obj);
                   
                    temp.insertAtFront(obj);
               }
                   
                 ob.close();
               } 
               catch(IOException w) { 
                       System.out.println(w.toString());
                       }
               
               
               while(!temp.isEmpty())
                   cList.insertAtFront(temp.removeFromFront());
               
               try{
              
               File txtFile = new File("newConf.txt");
               Scanner scan = new Scanner(txtFile);
               
               while(scan.hasNext()) { 
                 
                  String name =  scan.next();
                  int i = scan.nextInt();
                  double f = scan.nextDouble();
                  int s = scan.nextInt();
                  try{
                  cList.insertAtFront(new Conference (name , i , f , s));
                  }
                  catch(InvalidFeeException y ) { 
                      System.out.println(y.getMessage());
                     }
                  
                            
               }
               scan.close();
               }//end of try 
               
                catch(IOException p ) { 
                System.out.println(p.getMessage());
           
                }
               
               
               System.out.println("Conference have less than 1000");
               Conference[] arr = cList.cheapConferences();
               
               if(arr == null)
                   System.out.println("Empty list");
               else 
                  for(int i = 0 ; i < arr.length ; i++){
                      if(arr[i]!= null)
                          System.out.println(arr[i].toString());
                  }
               
               boolean found = true;
               int len = cList.Size();
               for( int j = 0 ; j < len ; j++){
                   Conference co = cList.removeFromFront();
                   if(co.checkC(con3)) {
                       found = true;
                        System.out.println("Exist ");
                       temp.insertAtFront(co);
                   }
               }
                   if(found == false )
                      System.out.println("Does not exist");
                   
                   while(!temp.isEmpty())
                       cList.insertAtFront(temp.removeFromFront());
                   
         
           } // end main
           
}//end class 
        

