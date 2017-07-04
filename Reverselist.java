public class Rev {
    public static void main(String args[])
    {int i;
      
       List <Integer> st=new ArrayList <Integer>();
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[]=new int[n];
       for(i=0;i<n;i++)
       {
           a[i]=s.nextInt();
           st.add(a[i]);
          
       }
        Collections.reverse(st);
        System.out.println(st);

       
    }
}
