
package darshjava;

public class check {
    public int checko(char field[][] , char effect[][] , int r , int c)
    {
        int i = r , j = c , rowcpy = r , colcpy = c , power = 0 ;
        if(effect[r][c] == 'G')
        {
                    if(i-1 > -1 && j-1 > -1)
                        if( field[i-1][j-1] == 9812 )
                             power++ ;
                        else if(i-1 > -1)
                            if(field[i-1][j] == 9812 )
                             power++ ;
                        else if(i-1 > -1 && j+1 < 8)
                            if(field[i-1][j+1] == 9812 )
                             power++ ;
                        else if(j+1 < 8)
                            if(field[i][j+1] == 9812 )
                             power++ ;
                        else if(i+1 < 8 && j+1 < 8)
                            if(field[i+1][j+1] == 9812 )
                             power++ ;
                        else if(i+1 < 8)
                            if(field[i+1][j] == 9812 )
                             power++ ;
                        else if(i+1 < 8 && j-1 > -1)
                            if(field[i+1][j-1] == 9812 )
                             power++ ;
                        else if(j-1 > -1)
                            if(field[i][j-1] == 9812 )
                             power++ ;
            if(i-2 > -1 && j-1 > -1)
                        if( field[i-2][j-1] == 9816 )
                            return 2 ;
                        else if(i-1 > -1 && j-2 > -1)
                            if(field[i-1][j-2] == 9816 )
                            return 2 ;
                        else if(i-2 > -1 && j+1 < 8)
                            if(field[i-2][j+1] == 9816 )
                            return 2 ;
                        else if(i-1 > -1 && j+2 < 8)
                            if(field[i-1][j+2] == 9816 )
                            return 2 ;
                        else if(i+2 < 8 && j+1 < 8)
                            if(field[i+2][j+1] == 9816 )
                            return 2 ;
                        else if(i+1 < 8 && j+2 < 8)
                            if(field[i+1][j+2] == 9816 )
                            return 2 ;
                        else if(i+2 < 8 && j-1 > -1)
                            if(field[i+2][j-1] == 9816 )
                            return 2 ;
                        else if(i+1 < 8 && j-2 > -1)
                            if(field[i+1][j-2] == 9816 )
                            return 2 ;
                        if(r-1 > -1 && c-1 > -1)
                        {
                            if(field [r-1][c-1] == 9817 && field[r][c] != 9946 
                            && (field[r][c] == 9819 || field[r][c] == 9822 || 
                            field[r][c] == 9821 || field[r][c] == 9822 || 
                                    field[r][c] == 9823 ))
                            {return 2;}
                            
                        }
                        if(r-1 > -1 && c+1 < 8)
                        {
                            if(field [r-1][c+1] == 9817 && field[r][c] != 9946 
                            && (field[r][c] == 9819 || field[r][c] == 9822 || 
                            field[r][c] == 9821 || field[r][c] == 9822 || 
                                    field[r][c] == 9823 ))
                            {return 2;}
                            
                        }
                        // checking if a black element has power from the direction ↖
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy-1 , n = colcpy-1 ; m > -1 && n > -1 ; m-- , n--)
                        {
                            if(field[m][n] == 9813 || field[m][n] == 9815)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction ↑
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy-1 , n = colcpy ; m > -1 ; m-- )
                        {
                            if(field[m][n] == 9813 || field[m][n] == 9814)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction ↗
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy-1 , n = colcpy+1 ; m > -1 && n < 8 ; m-- , n++)
                        {
                            if(field[m][n] == 9813 || field[m][n] == 9815)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction →
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy , n = colcpy+1 ; n < 8 ; n++)
                        {
                            if(field[m][n] == 9813 || field[m][n] == 9814)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction ↘
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy+1 , n = colcpy+1 ; m < 8 && n < 8 ; m++ , n++)
                        {
                            if(field[m][n] == 9813 || field[m][n] == 9815)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction ↓
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy+1 , n = colcpy ; m < 8 ; m++)
                        {
                            if(field[m][n] == 9813 || field[m][n] == 9814)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction ↙
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy+1 , n = colcpy-1 ; m < 8 && n > -1 ; m++ , n--)
                        {
                            if(field[m][n] == 9813 || field[m][n] == 9815)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction ←
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy , n = colcpy-1 ; n > -1 ; n--)
                        {
                            if(field[m][n] == 9813 || field[m][n] == 9814)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
        }
        return power ;
    }
    public int checka(char field[][] , char effect[][] , int r , int c)
    {
        int i = r , j = c , rowcpy = r , colcpy = c , power = 0 ;
        if(effect[r][c] == 'G')
        {
            if(i-1 > -1 && j-1 > -1)
                        if( field[i-1][j-1] == 9818 )
                             power++ ;
                        else if(i-1 > -1)
                            if(field[i-1][j] == 9818 )
                             power++ ;
                        else if(i-1 > -1 && j+1 < 8)
                            if(field[i-1][j+1] == 9818 )
                             power++ ;
                        else if(j+1 < 8)
                            if(field[i][j+1] == 9818 )
                             power++ ;
                        else if(i+1 < 8 && j+1 < 8)
                            if(field[i+1][j+1] == 9818 )
                             power++ ;
                        else if(i+1 < 8)
                            if(field[i+1][j] == 9818 )
                             power++ ;
                        else if(i+1 < 8 && j-1 > -1)
                            if(field[i+1][j-1] == 9818 )
                             power++ ;
                        else if(j-1 > -1)
                            if(field[i][j-1] == 9818 )
                             power++ ;
            if(i-2 > -1 && j-1 > -1)
                        if( field[i-2][j-1] == 9822 )
                            return 2 ;
                        else if(i-1 > -1 && j-2 > -1)
                            if(field[i-1][j-2] == 9822 )
                            return 2 ;
                        else if(i-2 > -1 && j+1 < 8)
                            if(field[i-2][j+1] == 9822 )
                            return 2 ;
                        else if(i-1 > -1 && j+2 < 8)
                            if(field[i-1][j+2] == 9822 )
                            return 2 ;
                        else if(i+2 < 8 && j+1 < 8)
                            if(field[i+2][j+1] == 9822 )
                            return 2 ;
                        else if(i+1 < 8 && j+2 < 8)
                            if(field[i+1][j+2] == 9822 )
                            return 2 ;
                        else if(i+2 < 8 && j-1 > -1)
                            if(field[i+2][j-1] == 9822 )
                            return 2 ;
                        else if(i+1 < 8 && j-2 > -1)
                            if(field[i+1][j-2] == 9822 )
                            return 2 ;
                        if(r+1 < 8 && c-1 > -1)
                        {
                            if(field [r+1][c-1] == 9823 && field[r][c] != 9946 
                            && (field[r][c] == 9813 || field[r][c] == 9814 || 
                            field[r][c] == 9815 || field[r][c] == 9816 || 
                                    field[r][c] == 9817 ))
                            {return 2;}
                            
                        }
                        if(r+1 < 8 && c+1 < 8)
                        {
                            if(field [r+1][c+1] == 9823 && field[r][c] != 9946 
                            && (field[r][c] == 9813 || field[r][c] == 9814 || 
                            field[r][c] == 9815 || field[r][c] == 9816 || 
                                    field[r][c] == 9817 ))
                            {return 2;}
                        }
                        // checking if a white element has power from the direction ↖
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy-1 , n = colcpy-1 ; m > -1 && n > -1 ; m-- , n--)
                        {
                            if(field[m][n] == 9819 || field[m][n] == 9821)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction ↑
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy-1 , n = colcpy ; m > -1 ; m-- )
                        {
                            if(field[m][n] == 9819 || field[m][n] == 9820)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction ↗
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy-1 , n = colcpy+1 ; m > -1 && n < 8 ; m-- , n++)
                        {
                            if(field[m][n] == 9819 || field[m][n] == 9821)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction →
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy , n = colcpy+1 ; n < 8 ; n++)
                        {
                            if(field[m][n] == 9819 || field[m][n] == 9820)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction ↘
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy+1 , n = colcpy+1 ; m < 8 && n < 8 ; m++ , n++)
                        {
                            if(field[m][n] == 9819 || field[m][n] == 9821)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction ↓
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy+1 , n = colcpy ; m < 8 ; m++)
                        {
                            if(field[m][n] == 9819 || field[m][n] == 9820)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction ↙
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy+1 , n = colcpy-1 ; m < 8 && n > -1 ; m++ , n--)
                        {
                            if(field[m][n] == 9819 || field[m][n] == 9821)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
                        // checking if a black element has power from the direction ←
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy , n = colcpy-1 ; n > -1 ; n--)
                        {
                            if(field[m][n] == 9819 || field[m][n] == 9820)
                            {return 2 ;}
                            else if(field[m][n] != 9946) {break;}
                        }
        }
        return 1 ;
    }
}
