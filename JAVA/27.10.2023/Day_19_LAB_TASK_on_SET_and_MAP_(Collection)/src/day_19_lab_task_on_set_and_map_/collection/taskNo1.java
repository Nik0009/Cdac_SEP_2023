package day_19_lab_task_on_set_and_map_.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//Q1. .Write a java program to Create a HashMap called populationMap,
//stores population data for several cities, retrieves and prints the population
//of a specific city, iterates through the map to print all city populations,
//removes a city from the map, and checks if a city exists in the map.


class taskNo1{
    
   
    
    public static void main(String[] args) {
        
        HashMap<String,Integer> populationMap = new HashMap<>();
        
        populationMap.put( "Chandrapur",20000);
        populationMap.put( "Nagpur",30000);
        populationMap.put("Pune",38484);
        populationMap.put("Mumbai",437847847);
        populationMap.put( "Goa",78948);
        
        
        
        System.out.println(populationMap);
        
        System.out.println("Enter city name:");
        Scanner sc=new Scanner(System.in);
        String search=sc.nextLine();
        
        if(populationMap.containsKey(search)){
            System.out.println(search+" is present.");
        }
        else{
             System.out.println(search+" is present.");
        }
        
        System.out.println();
        
        for(Map.Entry<String,Integer> entry :populationMap.entrySet()){
            String c=entry.getKey();
            int p=entry.getValue();
            System.out.println(c+" has "+p+ " populations.");
        }
        
        System.out.println();
        
        System.out.println("Enter city name to remove from map:");
        String remove=sc.nextLine();
        
        if(populationMap.containsKey(remove)){
            populationMap.remove(remove);
            System.out.println(remove+" is remove from  map.");
        }
        else{
            System.out.println(remove+" is not repsent in  map.");
        }
        
         System.out.println();
        
        for(Map.Entry<String,Integer> entry :populationMap.entrySet()){
            String c=entry.getKey();
            int p=entry.getValue();
            System.out.println(c+" has "+p+ " populations.");
        }
      
        
        
    }
}





