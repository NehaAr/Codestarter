/*
Template for assignment 1 SENG6110

Name:               Neha
Student number:     c3396115
Course:             SENG6110
Assignment:         1
Date:               24/3/2022
*/

public class DwarfPlanet
{
    // attributes
    private String name ;
    private String Region;
    private double Orbital_Radius;
    private double Orbital_Period;
    private double Daimeter;
    private int Mass;
    private int Moons;
    // Initialise with a null string
    // ... add more here
    
    // constructor with no parameters
        
    // constructor with parameters

    // getter methods
    public String getName(){
        
        return name;
    }
    
    public String getRegion(){
        return Region;
    }
    
    public double getOrbitalRadius(){
        return Orbital_Radius;
    }
    
    public double getOrbitalPeriod(){
        return Orbital_Period;
    }
    
    public double getDaimeter(){
        return Daimeter;
    }
    
    public int getMass(){
        return Mass;
    }
    
    public double getMoons(){
        return Moons;
    }
    // ... add more here

    // setter methods
    public void setName(String input_name){
        name= input_name;
       
    }
    public void setRegion(String input_Region){
        Region = input_Region;
       
    }
    
        public void setOrbitalRadius(double input_OrbitalRadius){
         Orbital_Radius= input_OrbitalRadius;
    }

        public void setOrbitalPeriod(double input_OrbitalPeriod){
        Orbital_Period = input_OrbitalPeriod;
    }
    
        public void setDaimeter(double input_daimeter){
        Daimeter = input_daimeter;
    }
    
        public void setMass(int input_mass){
        Mass = input_mass;
    }
    
        public void setMoons(int input_moon){
        Moons= input_moon;
    }
    
    
     
    DwarfPlanet()
    {
        name         = "";
        Region     = "";
        Orbital_Radius= 0;
        Orbital_Period = 0;
        Daimeter=0;
        Mass=0;
        Moons=0;
    }
    
    DwarfPlanet(String m, String n, double o, double p,double q,int r, int s)
    {
        name   = m;
        Region  = n;
        Orbital_Radius= o;
        Orbital_Period = p;
        Daimeter=q;
        Mass=r;
        Moons=s;
    }
}


