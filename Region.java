/*
Template for assignment 1 SENG6110

Name:               Neha 
Student number:     c3396115
Course:             SENG6110
Assignment:         1
Date:               24/3/2022
*/

import java.util.*;

public class Region
{

    static Scanner console = new Scanner(System.in);
    //private Region[] K=new Region[5];
    //K[0]=new Region("ceres",0.0,0.0);
    

    private String name ,RegionName,region ;
    private double daimeter , radius , orbitalperiod;
    private int mass;
    private int moons;
    private double RegionWidth,PopulationOfObjects;
    private int MAX_Planet=5;
    private int numberOfPlanets , numberOfRegions;
    private int number=0;
    private String nameplanet[]=new String[5];
    private String nameplanet1[]=new String[5];
    private int mass_number=0;
    private int daimeter_number=0;
    int greatMass[]=new int[MAX_Planet*2];
    String planetname[]=new String[10];
    double smallDaimeter ,number1;
    String smallplanetname;
  
    private double temp=1000 ;
    
    
    
    public String getRegionName(){
        
        return RegionName;
    }
    
    public double getWidthAU(){
        return RegionWidth;
    }
    
    public double getPopulationOfObjects(){
        return PopulationOfObjects;}
        
    public int getNumberofPlanets()
    { return numberOfPlanets;}
    
    public int getNumberofRegions()
    { return numberOfRegions;}
     public int getMassNumber()
    { return number;}
     

     public double getsmallDaimeter()
    { return smallDaimeter;}
    
    public void setRegionName(String input_name){
        RegionName= input_name;
       
    }
    public void setMassNumber(int massNo){
        number=massNo;
        System.out.println("Mass_No is set to:"+ number);
       
    }
    
    public void setsmallDaimeter(double dNo){
        number1=dNo;
        System.out.println("small Daimeter is set to:"+ number1);
       
    }
    
     public void setMassName(String massname){
        nameplanet[number]=massname;
        
        System.out.println("Mass_Name is set to:"+ nameplanet[number]);
        number++;
    }
    
    
    public void setRegionWidthAU(double Region_Width){
        RegionWidth = Region_Width;
       
    }
    
        public void setPopulationOfObjects(double input_population){
         PopulationOfObjects= input_population;
    }
    
    public void setNumberofPlanets(int num)
    { numberOfPlanets=num;}
    // ... etc.
    public void setNumberofRegions(int num)
    { numberOfRegions=num;}
    
    
    Region()
    {
        RegionName         = "";
        RegionWidth     = 0;
        PopulationOfObjects = 0;
    }
    
    Region(String m, double o, double p)
    {
        RegionName   = m;
        RegionWidth  = o;
        PopulationOfObjects=p;
    }
    
    private DwarfPlanet planet[]= new DwarfPlanet[MAX_Planet]; 
    
    
    public void addDwarfPlanet(String region) {
        // create new object
      
        
        // set values of attributes
        System.out.println("Add the number of planets you want to add");
        numberOfPlanets=console.nextInt();
        
        setNumberofPlanets(numberOfPlanets);
        int trillion = 4;
        for(int i=0;i<numberOfPlanets;i++)
        { planet[i] = new DwarfPlanet();
          System.out.println("Enter the name of Planet");
          name=console.next();
          planet[i].setName(name);
          System.out.println("Enter the mass of the Planet(Unit trillion)");
          mass=console.nextInt();
          planet[i].setMass(mass);
          System.out.println("Enter the Daimeter of the planet");
          daimeter=console.nextDouble();
          planet[i].setDaimeter(daimeter);
          System.out.println("Enter the Radius of the planet");
          radius=console.nextDouble();
          planet[i].setOrbitalRadius(radius);
          System.out.println("Enter the moons of the planet");
          moons=console.nextInt();
          planet[i].setMoons(moons);
          System.out.println("Enter the Period of the planet");
          orbitalperiod=console.nextDouble();
          planet[i].setOrbitalPeriod(orbitalperiod);
          
          planet[i].setRegion(region);
          if(planet[i].getMass()>trillion)
          {   System.out.println("Hello");
              compareMass(planet[i].getMass(),planet[i].getName());
          }
          if(planet[i].getDaimeter()<temp)
          {   temp = planet[i].getDaimeter();
              
                  smallDaimeter(temp,planet[i].getName());}
          }
        
        
        
    }    
    
    public void deleteDwarfPlanet()
    {
     System.out.println("Deleting the planets");
  
    for(int i=0;i<numberOfPlanets;i++)
    {   
            planet[i]=null;   
    }
    numberOfPlanets=0;}
    
    public void displayRegion()
    {  System.out.println("Region Name:"+ getRegionName());
       System.out.println("Region Width "+ getWidthAU());
       System.out.println("Region Population:"+ getPopulationOfObjects());
        
    }
    public void displayDwarfPlanet() {
        if(numberOfPlanets==0)
        {
            System.out.println("Planets were deleted");
        }
        for(int i=0;i<numberOfPlanets;i++)
        {
        
        System.out.println("Name:"+ planet[i].getName());
        System.out.println("Region:"+ planet[i].getRegion());
        System.out.println("OrbitalRadius:"+ planet[i].getOrbitalRadius());
        System.out.println("OrbitalPeriod:"+ planet[i].getOrbitalPeriod());
        System.out.println("Daimeter:"+ planet[i].getDaimeter());
        System.out.println("Mass:"+planet[i].getMass());
        System.out.println("Moons:"+planet[i].getMoons());
        System.out.println("Name:"+planet[i].getName());
            }
}
    public void compareMass(int mass, String name)
    {   
        
        
        greatMass[mass_number]=mass;
        planetname[mass_number]=name;
        System.out.println(greatMass[mass_number]);
        mass_number=mass_number+1;
        System.out.println(mass_number);
        setMassNumber(mass_number);
      
}
   public void smallDaimeter(double daimeter , String name)
    {   
        
        
        smallDaimeter=daimeter;
        setsmallDaimeter(smallDaimeter);
        
       
}
}


