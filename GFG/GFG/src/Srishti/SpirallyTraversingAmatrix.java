package Srishti;

public class SpirallyTraversingAmatrix 
{
public static void main(String args[])
{
int a[][]= {{1, 2, 3, 4},{5, 6, 7, 8},{ 9, 10, 11, 12},{ 13, 14, 15, 16}};
int r=4,c=4;
int i, sr = 0, sc = 0; 
while (sr < r && sc < c) { 
for (i = sc; i < c; ++i) { 
System.out.print(a[sr][i] + " "); 
    } 
    sr++; 

    
    for (i = sr; i < r; ++i) { 
        System.out.print(a[i][c - 1] + " "); 
    } 
    c--; 

    
    if (sr < r) { 
        for (i = c - 1; i >= sc; --i) { 
            System.out.print(a[r - 1][i] + " "); 
        } 
        r--; 
    } 

    
    if (sc < c) { 
        for (i = r - 1; i >= sr; --i) { 
            System.out.print(a[i][sc] + " "); 
        } 
        sc++; 
    } 
} 
}
}
