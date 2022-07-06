package a.team;

import java.util.ArrayList;
import java.util.Scanner;

public class ATeam {

    
    public static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        String word = "";
        int count ;
        int temp = 0;
        int temp2 = 0;
        int p , v , t ;
        ArrayList<Integer> data ;
        ArrayList<ArrayList<Integer>> FinalData = new ArrayList<>();
        count = inp.nextInt();
        for(int i = 0 ; i < count ; i++){
            data = new ArrayList<>();
            p = inp.nextInt();     
            data.add(p);
            v = inp.nextInt();
            data.add(v);
            t = inp.nextInt();
            data.add(t); 
            FinalData.add(data);  
                 
        }
        //System.out.println(FinalData);
        for(int i = 0 ; i < FinalData.size() ; i++){
            temp = 0;
            for(int j = 0 ; j < FinalData.get(i).size(); j++){
               if(FinalData.get(i).get(j) == 1){
                    temp += 1;
               }
            }
            if(temp >1){
                temp2+=1;
            }
        }
        System.out.println(temp2);
             
    }
    
}
