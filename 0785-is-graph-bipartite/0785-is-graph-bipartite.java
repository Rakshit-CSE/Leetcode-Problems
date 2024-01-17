public class bipartitepair{
    int vtx;
    int d;
    public bipartitepair(int v,int d)
    {
        this.vtx = v;
        this.d = d;
    }
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        HashMap<Integer,HashMap<Integer,Integer>> mp = new HashMap<>();
        for(int i=0;i<graph.length;i++)
        {
            mp.put(i,new HashMap<>());
        }
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].length;j++)
            {
                mp.get(i).put(graph[i][j],0);
            }
        }
        return fun(mp);
    }
    public static boolean fun(HashMap<Integer,HashMap<Integer,Integer>> mp)
    {
        Queue<bipartitepair> q = new LinkedList<>();
        HashMap<Integer,Integer> visited = new HashMap<>();
        for(int src: mp.keySet())
        {
            if(visited.containsKey(src))
            {
                continue;
            }
            bipartitepair bp = new bipartitepair(src,0);
            q.add(bp);
            while(!q.isEmpty())
            {
                bipartitepair r =q.remove();
                if(visited.containsKey(r.vtx) && r.d!=visited.get(r.vtx))
                {
                    return false;
                }
                visited.put(r.vtx,r.d);
                for(int nbrs:mp.get(r.vtx).keySet())
                {
                    if(!visited.containsKey(nbrs))
                    {
                        bipartitepair nbp = new bipartitepair(nbrs,r.d+1);
                        q.add(nbp);
                    }
                }
            }
        }
        return true;
    }
}