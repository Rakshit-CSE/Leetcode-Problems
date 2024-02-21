class Trie {

    class Node{
        char data;
        boolean isTerminal;
        HashMap<Character,Node> child = new HashMap<>();
    }

    private Node root;

    public Trie() {
        Node nn = new Node();
        nn.data='*';
        root=nn;
    }
    
    public void insert(String word) {
        Node curr = root;
        for(int i=0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if(curr.child.containsKey(c))
            {
                curr = curr.child.get(c);
            }
            else
            {
                Node n = new Node();
                n.data=c;
                curr.child.put(c,n);
                curr=n;
            }
        }
        curr.isTerminal=true;
    }
    
    public boolean search(String word) {
        Node curr = root;
        for(int i=0;i<word.length();i++)
        {
            char c = word.charAt(i);
            if(curr.child.containsKey(c))
            {
                curr = curr.child.get(c);
            }
            else
            {
                return false;
            }
        }
        return curr.isTerminal;
    }
    
    public boolean startsWith(String prefix) {
        Node curr = root;
        for(int i=0;i<prefix.length();i++)
        {
            char c = prefix.charAt(i);
            if(curr.child.containsKey(c))
            {
                curr = curr.child.get(c);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */