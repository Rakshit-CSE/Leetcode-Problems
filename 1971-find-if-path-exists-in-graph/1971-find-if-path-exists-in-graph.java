class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Create a graph represented as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            // Add edges to the adjacency list (graph is bidirectional)
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        // Set to keep track of visited vertices
        Set<Integer> visited = new HashSet<>();
        // Stack for DFS traversal
        Stack<Integer> stack = new Stack<>();
        // Start from the source vertex
        stack.push(source);

        // Perform DFS iteratively using a stack
        while (!stack.isEmpty()) {
            // Pop the top vertex from the stack
            int node = stack.pop();
            // If the popped vertex is the destination, return true
            if (node == destination) {
                return true;
            }
            // Mark the current vertex as visited
            visited.add(node);
            // Iterate over the neighbors of the current vertex
            for (int neighbor : graph.get(node)) {
                // If the neighbor has not been visited, push it to the stack
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }

        // If destination is not reachable, return false
        return false;
    }
}