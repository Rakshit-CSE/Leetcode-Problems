class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        for(int i=0;i<m;i++)
        {
            reverse(image,i,m,n-1);
            invert(image,i,n);
        }
        return image;
    }
    
    public static void reverse(int[][] image,int i,int m,int n)
    {
        int k=0;
        while(k<n)
        {
            int temp = image[i][k];
            image[i][k] = image[i][n];
            image[i][n] = temp;
            k++;
            n--;
        }
    }
    
    public static void invert(int[][] image,int i,int n)
    {
        for(int k=0;k<n;k++)
        {
            if(image[i][k]==0)
            {
                image[i][k]=1;
            }
            else
            {
                image[i][k]=0;
            }
        }
    }
}