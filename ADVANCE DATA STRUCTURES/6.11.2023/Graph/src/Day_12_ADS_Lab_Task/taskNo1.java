
package Day_12_ADS_Lab_Task;

//Q1. Write a java program to Implement a graph using adjacency
//Matrix and traverse using Depth First Search.

import java.util.Stack;

public class taskNo1 {
    
    int v=4;
    
    public void dfs(int arr[][],int source){
        Stack<Integer> s=new Stack<>();
        boolean isVisited[]=new boolean[v];
        
        s.push(source);
        isVisited[source]=true;
        
        while(!s.empty()){
            int node=s.pop();
            System.out.println("visited node:"+node);
            
            for(int i=0;i<v;i++){
                if((arr[node][i]==1) && (isVisited[i]==false)){
                    s.push(i);
                    isVisited[i]=true;
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        int arr[][]={
            {0,1,1,1},
            {1,0,1,0},
            {1,1,0,0},
            {1,0,0,0},
        };
        
        taskNo1 ts=new taskNo1();
        ts.dfs(arr, 1);
        
    }
}
