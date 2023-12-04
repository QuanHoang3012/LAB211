/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class Graph {
    private boolean graph[][];
    private int edge;

    public Graph() {
    }

    public Graph(int edge) {
        this.graph = new boolean[edge][edge];
        this.edge = edge;
    }
    public void addEdge(int start,int end){
        start--;
        end--;
        graph[start][end] = true;
        graph[end][start] = true;
    }
    public boolean checkEdge(int start , int end){
        return graph[start][end];
    }
    public void display(){
        for (int i=0;i<edge;i++){
            for (int j=0;j<edge;j++){
                
            }
        }
    }
  
    
    
}
