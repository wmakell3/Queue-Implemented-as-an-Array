import java.util.Scanner;
import java.io.*;
public class QueueWMakell
{
//Begin the program
int size = 8;
String myQueue[] = new String[size];
String tempQueue[] = new String [size];
int count = 0;
int front = 0; int rear =0;
int tempFront= 0; int tempRear=0;
Scanner keyboard = new Scanner (System.in);  


public void storeQueue() throws IOException
{
 //get the file name
 System.out.println("Enter the name of a file");
 String filename = keyboard.next();
         
 //open the file
 File file = new File (filename);
 Scanner inputfile = new Scanner(file);
          
 while(inputfile.hasNext())
 {
   myQueue[rear] = inputfile.nextLine();
   rear++;
   count++;
   
 }
 inputfile.close();
 
 }
 
 
 public void addEl(String x)
 {
 
   if (rear == size)
   {
      System.out.println("Queue is Full");
   }
   
   else
   {
      System.out.println("Add an element to the Queue");
      myQueue[rear] = x;
      rear++; 
      count++;
   }
 }
 
 
 public void removeEl()
 {
   if(count>0)
   {
      front++;
      count--;
   }
 }
 
 
 
 public void printQueue()
 {
   for(int i = front; i<=count; i++)
   {
      tempQueue[tempRear] = myQueue[i];
      System.out.println(tempQueue[tempRear]);
      tempRear++;
      front++;
   }
   rear = 0;
   front = 0;
   
   for(int i = tempFront; i<=count; i++)
   {
      myQueue[rear] = myQueue[i];
      rear++;
      tempFront++;
   }
 }
 
 
 public void searchEl(String x)
 {
   boolean flag = false;
   tempRear = 0;
   tempFront = 0;
   int occur = 0;
   for( int i = front; i<count; i++)
   {
      tempQueue[tempRear] = myQueue[i];
      if(myQueue[i].equals(x))
      {
         flag = true;
         occur++;
      }
      tempRear++;
      front++;
   }
   
   front = 0;
   rear = 0;
   
   for(int i = tempFront; i<=count; i++)
   {
      myQueue[rear] = tempQueue[i];
      rear++;
      tempFront++; 
   }
   System.out.println(x + " is " + flag);
   System.out.println(x + " occurs " + occur + " time(s)");
   
 }

}//End Program
