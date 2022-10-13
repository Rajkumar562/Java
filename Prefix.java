// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Prefix {
    public static void main(int n,int k,String s []) {
        
         for (int i=0;i<n;i++)
         {
             int count = 0;
             String word = s[i];
             for(int j=1;j<=k;j++)
             {
                 String prefix = word.substring(0,j);
                 
                 for(int m=0;m<n;m++)
                 {
                     if (prefix.equals(s[m].substring(0,j)))
                     count++;
                 }
             }
             System.out.print(count + " ");
         }
    }
}