package com.titanomachy;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        char[] x = new char[]{'A','B','C','A','B','A','B','D','A','B','A'};
        char[] y = new char[]{'A','B'};

        System.out.println("Count: " + charCount2(x,y));
    }

    public static int charCount(char[] x, char[] y)
    {
        int count = 0;
        for(int i=0; i < x.length-1; i++)
        {
            if((x[i] == y[0]) && (x[i+1] == y[1]))
            {
                count++;
            }
        }
        return count;
    }

    public static int charCount2(char[] x, char[] y)
    {
        String xx = String.valueOf(x);
        String yy = String.valueOf(y);

        int count = 0;
        int lastIndex = 0;

        while(lastIndex != -1)
        {
            lastIndex = xx.indexOf(yy,lastIndex);

            if(lastIndex != -1)
            {
                count++;
                lastIndex += yy.length();
            }
        }
        System.out.println(xx);
        System.out.println(yy);
        return count;
    }
}
