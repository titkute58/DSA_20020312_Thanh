package Week_12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RoadnLib {
    static int uf(int i, int [] parent) {
        while(i!=parent[i]) {
            i=parent[i];
        }
        return i;
    }


    static void bfs(ArrayList<ArrayList<Integer>> list, int parent[], int size, int visited[], int v) {
        Queue<Integer> q=new LinkedList<>();
        q.add(v); visited[v]=1;

        while(!q.isEmpty()) {
            int u=q.poll();
            int lsize=list.get(u).size();
            for(int i=0;i<lsize;++i) {
                int child=list.get(u).get(i);
                if(visited[child]!=1) {
                    q.add(child);
                    parent[child]=u;
                    visited[child]=1;
                }
            }
        }
    }

    static void getParents( ArrayList<ArrayList<Integer>> list,int parent[], int size) {
        int visited[]=new int[size];
        for(int i=0;i<size;++i) {
            if(visited[i]!=1)
                bfs(list,parent,size,visited,i);
        }
    }

    static long solve( ArrayList<ArrayList<Integer>> list, int size,int road_cost, int lib_cost) {
        int parent[]=new int[size];
        for(int i=0;i<size;++i) {
            parent[i]=i;
        }
        getParents(list,parent,size);

        int cost[]=new int[size];  long sum=0;
        for(int i=0;i<size;++i) {
            int p= uf(i,parent); int count=0;
            if(p==i) {
                ++count;
            } else {
                if(road_cost+cost[p] >=lib_cost ) {
                    ++count;
                }
                else {
                    cost[i] = road_cost+cost[p];
                    sum += (long)road_cost+cost[p];
                }
            }
            sum += (long)count*lib_cost;
        }
        return sum;

    }
    public static void main(String args[]) {
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        while(t-->0) {
            int size = inp.nextInt();
            int roads = inp.nextInt();
            int lib_cost=inp.nextInt();
            int road_cost=inp.nextInt();


            ArrayList<ArrayList<Integer>> list=new ArrayList<>();
            for(int i=0;i<size;++i) {
                list.add(new ArrayList<Integer>());
            }

            for(int i=0;i<roads;++i) {
                int p1=inp.nextInt()-1; int p2=inp.nextInt()-1;
                list.get(p1).add(p2); list.get(p2).add(p1);
            }

            long minCost=solve(list,size,road_cost,lib_cost);
            System.out.println(minCost);
            System.gc();
        }
        inp.close();
    }
}