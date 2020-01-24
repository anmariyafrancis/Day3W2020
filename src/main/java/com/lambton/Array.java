package com.lambton;

import java.util.Arrays;

public class Array {
    public static void main(String[] args)
    {
        int a[];
        int b[];
        int c[]=new int[5];
        c[0]=10;
        c[1]=20;
        c[2]=30;
        c[3]=40;
        c[4]=50;

        int d[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("Length of Array: "+d.length);
        for(int i=0;i<d.length;i++)
        {
            System.out.println(d[i]);
        }
            int[] x1,y1;
            int x2,y2[];
            int x3[],y3;
            int[] x4,y4[];

            y4=new int[3][3];

            System.out.println("using compact for(:)");
            for(int p:d)
            {
                System.out.println(p);
            }
            findArray();
            reverseArray();
            stringArray();

    }
    public static void findArray()
    {
        int p[]=new int[]{14,12,16,20,18};
        int sum,min,max;
        float avg;
        sum=0;
        min=p[0];
        max=p[0];
        avg=0;
        for(int x:p)
        {
            sum+=x;
        }
        for(int y=0;y<p.length;y++)
        {
            if(p[y]<min)
            {
                min=p[y];
            }
        }
        for(int z=0;z<p.length;z++)
        {
            if(p[z]>=max)
            {
                max=p[z];
            }
        }
        System.out.println("Sum of array is: "+ sum);
        System.out.println("Minimum of array is: "+ min);
        System.out.println("Maximum of array is: "+ max);
    }
    public static void reverseArray()
    {
        int a[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i=a.length-1;i>=0;i--)
        {
           System.out.println(a[i]+"");
        }
    }
    public static void stringArray()
    {
        String fruits[];
        fruits = new String[10];

        fruits[0] = "Apple";
        fruits[1] = "Mango";
        fruits[2] = "Orange";
        fruits[3] = "Pineapple";
        fruits[4] = "Plum";
        fruits[5] = "Grapes";
        fruits[6] = "strawberry";
        fruits[7] = "Jackfruit";
        fruits[8] = "Banana";
        fruits[9] = "Rassberry";

        for (int i = 0; i < fruits.length; i++)
        {
            System.out.println(fruits[i]);
        }
        String reverseStrings[]=new String[fruits.length];
        String[] rstr;
        rstr=new String[10];
        for(int i=0;i<fruits.length;i++)
        {
            String rev = reverseStrings(fruits[i]);
            reverseStrings[i]=rev;
            rstr[i]=rev;
            System.out.println(new String(fruits[i])+"<->"+rev);
        }
    }
   public static String reverseStrings(String s)
    {
        String temp=new String();
        char names[]=s.toCharArray();
        int len=names.length;
        for(int i=0,j=len-1;i<len/2;i++,j--)
        {
            char t=names[i];
            names[i]=names[j];
            names[j]=t;
        }
        temp=new String(names);
        return temp;
    }
}
