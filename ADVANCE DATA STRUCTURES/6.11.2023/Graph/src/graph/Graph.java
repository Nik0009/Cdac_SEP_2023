
package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Graph {
    int  v=5;
    
    public void dfs(int arr[][],int source){
        Stack <Integer> s=new Stack<>();
        boolean isVisited[]=new boolean[v];
        
        s.push(source);
        isVisited[source]=true;
        
        while(!s.empty()){
            int node=s.pop();
            System.out.println("visited node : "+node);
            
             for(int index=0;index<v;index++){
                if((arr[node][index]==1) && (isVisited[index]==false)){
                    s.push(index);
                    isVisited[index]=true;
                }
            }
            
        }
        
    }
    
    
    public void bfs(int arr[][],int source){
        Queue<Integer> q=new LinkedList<>();
        boolean isVisited[]=new boolean[v];
        
        q.add(source);
        isVisited[source]=true;
        
        while(q.size()!=0){
            int node=q.poll();
            System.out.println("visited node :"+node);
            
            for(int index=0;index<v;index++){
                if((arr[node][index]==1) && (isVisited[index]==false)){
                    q.add(index);
                    isVisited[index]=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][]={
            {0,1,1,1,0},
            {1,0,0,1,1},
            {1,0,0,1,0},
            {1,1,1,0,1},
            {0,1,0,1,0}
        };
        
        Graph g=new Graph();
        System.out.println("bfs :-");
        g.bfs(arr, 0);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("dfs :-");
        g.dfs(arr, 0);
    }
    
}
