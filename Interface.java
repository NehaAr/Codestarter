/*
Template for assignment 1 SENG6110

Name:               Neha
Student number:     c3396115
Course:             SENG6110
Assignment:         1
Date:               24/3/2022
*/
 
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException; 

//import com.opencsv.CSVWriter;
 
public class Interface 
{

    /* Declare the Dwarf Planet variables here, as attributes of the Interface class, so that
         you have access to these variables in every method below.
       You should not instantiate the Dwarf Planet objects here (by using the 'new' keyword) as doing so is part of question 1 and is done
         in method option01().
    */
   // DwarfPlanet ceres;
    // ... add more here
    
    static Scanner console = new Scanner(System.in);
    
    int inputNum = 0;
    //private DwarfPlanet ceres,orcus,pluto,haumea,quaoar,makemak,gonggong,eris,sedna;
   
    private int MAX_Region=5;
    private int MAX_Planet=5;
    private int numberOfRegions,numberofplanets,region_num;
    private String region_name;
    private Region c;
    Region[] Kuiper=new Region[MAX_Region];
    Region m= new Region();
    DwarfPlanet d= new DwarfPlanet();
    private int count=0;
    
    
    
    private double smallplanet=0;
    
    
    
    public void run() {
    
        // Display a menu and read input values until -1 entered:
        while(inputNum != -1) {
        
            System.out.println("Select an option and press ENTER:");
            System.out.println("1. Option 1:Add a Region");
            System.out.println("2. Option 2:Add a dwarf planet to one of the region objects");
            System.out.println("3. Option 3:Delete a Region");
            System.out.println("4. Option 4:Delete a Dwarf Planet");
            System.out.println("5. Option 5:List all the objects");
            System.out.println("6. Option 6:List all the dwarf planets that belong to one region");
            System.out.println("7. Option 7:List dwarf planets with mass greater than 4 Trillion");
            System.out.println("8. Option 8: List the dwarf planet with smallest daimeter in each region ");
            System.out.println("9. Option 9:Import Region and Dwarf Planet information from File ");
            System.out.println("10. Option 10:Write the Region and Dwarf Planet information to File ");
            //System.out.println("10. Option 10:GUI");// ... Add more options as needed. You will also have to add the corresponding methods below.
            
            System.out.println("-1. Exit");
            inputNum = console.nextInt();
        
            switch(inputNum) {
                case  1: option01(); break;
                case  2: option02(); break;
                case  3: option03(); break;
                case  4: option04(); break;
                case  5: option05(); break;
                case  6: option06(); break;
                case  7: option07(); break;
                case  8: option08(); break;
                case  9: option09(); break;
                case 10: option10(); break;
                case -1: System.exit(0); break;
            }  // end of switch(inputNum) 
            
        } // end of while(inputNum != -1) 
        
    }  // end of run() method



    // code for option 1
    public void option01() {
        System.out.println("You selected option 1 \n");
        System.out.println("Creating the new Region");
        String name;
        Double width , population;
        
        System.out.println("Enter the number of Regions you want to create");
        numberOfRegions= console.nextInt();
        
        for(int i=0;i<numberOfRegions;i++)
        { Kuiper[i]=new Region();
          System.out.println("Enter the name of Region");
          name=console.next();
          //Kuiper1.setRegionName(name);
          Kuiper[i].setRegionName(name);
          //Kuiper[i].getRegionName();
          System.out.println("Enter the width of Region");
          width=console.nextDouble();
          Kuiper[i].setRegionWidthAU(width);
          System.out.println("Enter the Population Of Objects in Region");
          population=console.nextDouble();
          Kuiper[i].setPopulationOfObjects(population);
          
        }
        System.out.println("Region Created");
         }
    
    // code for option 2
    public void option02() {
        count=0;
        System.out.println("You selected option 2 \n");
        System.out.println("Enter the region name in Which you want to add Planet");
        region_name=console.next();
        for(int i=0;i<numberOfRegions;i++)
        {if(Kuiper[i].getRegionName().equals(region_name))
         {
        Kuiper[i].addDwarfPlanet(region_name);   
         count++;}}
        
        if(count==0){
         System.out.println("Error: Region does not exist");
                }}
    
    // code for option 3
    public void option03() {
        count=0;
        System.out.println("You selected option 3 \n");
        System.out.println("Enter the region name Which you want to Delete");
        region_name=console.next();
        for(int i=0;i<numberOfRegions;i++)
        {if(Kuiper[i].getRegionName().equals(region_name))
         {
        Kuiper[i]=Kuiper[i+1];
        Kuiper[i+1]=null;
        System.out.println("Region Deleted");    
        count++;
        numberOfRegions--;}}
         if(count==0){
         System.out.println("Error:Region does not exist");}}
    //Code for option 4
     public void option04() {
         count=0;
        System.out.println("You selected option 4 \n");
        System.out.println("Enter the region name in  Which you want to delete the dwarf planet");
        region_name=console.next();
    
        for(int i=0;i<numberOfRegions;i++)
        {if(Kuiper[i].getRegionName().equals(region_name))
         { Kuiper[i].deleteDwarfPlanet();
            count++;
            System.out.println("Planets Deleted");   
            break;}}
         if(count==0){
         System.out.println("Error:Region does not exist");}
            
         }
         
         
         
        
    
      public void option05() {
        count=0;
        System.out.println("You selected option 5 \n");
        System.out.println("List all the data");
        for(int i=0;i<numberOfRegions;i++)
        {   Kuiper[i].displayRegion();
            Kuiper[i].displayDwarfPlanet();
            count++;
        }
        if(count==0)
        {  System.out.println("Error:Region does not exist");}
        
    }
     
     public void option06() {
         count=0;
        System.out.println("You selected option 6 \n"); 
        System.out.println("Enter the region name for Which you want to display planets");
        region_name=console.next();
        for(int i=0;i<numberOfRegions;i++)
        {if(Kuiper[i].getRegionName().equals(region_name))
         {
          Kuiper[i].displayDwarfPlanet();
          count++;
            }}
         if(count==0){   
         System.out.println("Region does not exist");
        }}
    
    
    public void option07() {
        count=0;
        System.out.println("You selected option 7 \n");
        System.out.println("Listing the planets with mass greater than 4 trillion");
       
        for(int i=0;i<numberOfRegions;i++)
        { if(Kuiper[i].getMassNumber()==0)
            { System.out.println("No planets with greater mass exist in Region"+ i);
                break;}
         for(int j=0;j<Kuiper[i].getMassNumber();j++)
        {
        System.out.println("Planet with greater mass in trillions"+ " "+ Kuiper[i].greatMass[j]+ " ");}
          
          
        
           }}
        
           
           
    
     
    public void option08() {
        System.out.println("You selected option 8 \n");
        System.out.println("Listing the planet with smallest Daimeter");
        for(int i=0;i<numberOfRegions;i++)
        
        {  
        System.out.println("The planet with smallest daimeter"+ Kuiper[i].smallDaimeter);  
          
    }}
    
    public void option09()
    {
        System.out.println("Listing the data from the database");
        String COMMA_DELIMITER = ",";
        Scanner scanner = null;
        try {
            //Get the scanner instance
            System.out.println("Displaying the data directly from file");
           
            scanner = new Scanner(new File("C:/Users/Aradhya Arora/Downloads/input_data.csv"));
            
            //Use Delimiter as COMMA
            scanner.useDelimiter(COMMA_DELIMITER);
            
            while(scanner.hasNext())
            {      
                    System.out.print(scanner.next()+"       ");
                   
                    
            }
            
        }
        
        catch (FileNotFoundException fe) 
        {
            fe.printStackTrace();
        }
        finally
        {
            scanner.close();
        }
        
    }
    
  public void option10()
  
  { FileWriter writer = null;

 try {

     writer = new FileWriter("output_file.csv");
     writer.append("OBJECTTYPE");
     writer.append(',');
     writer.append("REGION");
     writer.append(',');
     writer.append("DAIMETER");
     writer.append(',');
     writer.append("MASS");
     writer.append(',');
     writer.append("MOONS");
     writer.append('\n');

     writer.append("DwarfPlanet");
     writer.append(',');
     writer.append("Kuiper");
     writer.append(',');
     writer.append("4");
     writer.append(',');
     writer.append("5");
     writer.append(',');
     writer.append("6");
     writer.append('\n');
     
      writer.append("DwarfPlanet");
     writer.append(',');
     writer.append("oort");
     writer.append(',');
     writer.append("4");
     writer.append(',');
     writer.append("7");
     writer.append(',');
     writer.append("6");
     writer.append('\n');
     
    writer.append("DwarfPlanet");
     writer.append(',');
     writer.append("Kuiper");
     writer.append(',');
     writer.append("3");
     writer.append(',');
     writer.append("5");
     writer.append(',');
     writer.append("2");
     writer.append('\n');


     System.out.println("CSV file is created...");

  } catch (IOException e) {
     e.printStackTrace();
  } finally {
        try {
      writer.flush();
      writer.close();
        } catch (IOException e) {
      e.printStackTrace();
}
}

    }
   
  
  public static void main(String args[])  
{
        
        Interface intFace = new Interface();
        intFace.run();
    }
}

