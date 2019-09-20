
package darshjava;

public class HORSE {
    public int permission (char field [][] , char effect [][] , int r1 , int r2 , char c1 , char c2)
    {
        if(field[r1][c1-97] == 9822)
        {
        if((Math.abs(r1-r2) == 2 && Math.abs(c1-c2) == 1) 
                || (Math.abs(r1-r2) == 1 && Math.abs(c1-c2) == 2))
        {
            if(field[r2][c2-97] == 9818 || field[r2][c2-97] == 9820||field[r2][c2-97] == 9821 
                   || field[r2][c2-97] == 9819 || field[r2][c2-97] == 9823 || field[r2][c2-97] == 9822 )
            {
                System.out.println("Sorry, The HOSRE can never kill any member of its KING's forces, Try agaion :)");
                return 2;
            }
            else 
            {
                // white HOSRE's reactions when moving 
                if(field[r2][c2-97] == 9946)
                    System.out.println("HOSRE : I'm the favorite knight for the king");
                else if(field[r2][c2-97] == 9813)
                    System.out.println("HOSRE : The king will be happy with this pretty lady");
                else if(field[r2][c2-97] == 9814)
                    System.out.println("HOSRE : This rock was really huge, But I made it anyway");
                else if(field[r2][c2-97] == 9815)
                    System.out.println("HOSRE : Just one hit in the heart and you are over gaint one!");
                else if(field[r2][c2-97] == 9816)
                    System.out.println("HOSRE : Great Nonw I have to horses not just one :)");
                else if(field[r2][c2-97] == 9817)
                    System.out.println("HOSRE : I won't kill you if you are a good servant");
                field[r2][c2-97] = 9822 ;
                field[r1][c1-97] = 9946 ;
                return 1 ;
            }
        }
        else
        {
            System.out.println("The HORSE can never move this way, Try again:)");
            return 0 ;
        }
        }
        
        else if(field[r1][c1-97] == 9816)
        {
        if((Math.abs(r1-r2) == 2 && Math.abs(c1-c2) == 1) 
                || (Math.abs(r1-r2) == 1 && Math.abs(c1-c2) == 2))
        {
            if(field[r2][c2-97] == 9812 || field[r2][c2-97] == 9813||field[r2][c2-97] == 9814 
                   || field[r2][c2-97] == 9815 || field[r2][c2-97] == 9816 || field[r2][c2-97] == 9817 )
            {
                System.out.println("Sorry, The HOUSE can never kill any member of its KING's forces, Try agaion :)");
                return 2 ;
            }
            else 
            {
                // white HOSRE's reactions when moving 
                if(field[r2][c2-97] == 9946)
                    System.out.println("HOSRE : I'm the favorite knight for the king");
                else if(field[r2][c2-97] == 9819)
                    System.out.println("HOSRE : The king will be happy with this pretty lady");
                else if(field[r2][c2-97] == 9820)
                    System.out.println("HOSRE : This rock was really huge, But I made it anyway");
                else if(field[r2][c2-97] == 9821)
                    System.out.println("HOSRE : Just one hit in the heart and you are over gaint one!");
                else if(field[r2][c2-97] == 9822)
                    System.out.println("HOSRE : Great Nonw I have to horses not just one :)");
                else if(field[r2][c2-97] == 9823)
                    System.out.println("HOSRE : I won't kill you if you are a good servant");
                field[r2][c2-97] = 9816 ;
                field[r1][c1-97] = 9946 ;
                return 1 ;
            }
        }
        else
        {
            System.out.println("The HORSE can never move this way, Try again:)");
            return 0 ;
        }
        }
        return 0 ;
    }
    public void effect(char field [][] , char effect [][])
    {
        int rowcpy = 0 , colcpy = 0 , m , n ;
        for(int i = 0 ; i < 8 ; i++)
            for(int j = 0 ; j < 8 ; j++)
                if(field [i][j] == 9822 || field [i][j] == 9816)
                {
                    // setting Horses effect on the field 
                    
                    // 1 setting the 1st position row-2 col-1
                    if(i-2 > -1 && j-1 > -1)
                    {
                        m = i-2 ; n = j-1 ;
                        if(field [i][j] == 9822)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'B' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'W' ;                                        break ;                                }
                        else if(field [i][j] == 9816)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'W' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'B' ;                                        break ;                                }
                    }
                    // 2 setting the 2nd position row-1 col-2
                    if(j-2 > -1 && i-1 > -1)
                    {
                        m = i-1 ; n = j-2 ;
                        if(field [i][j] == 9822)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'B' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'W' ;                                        break ;                                }
                        else if(field [i][j] == 9816)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'W' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'B' ;                                        break ;                                }
                    }
                    // 3 setting the 3rd position row-2 col+1
                    if(i-2 > -1 && j+1 < 8)
                    {
                        m = i-2 ; n = j+1;
                        if(field [i][j] == 9822)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'B' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'W' ;                                        break ;                                }
                        else if(field [i][j] == 9816)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'W' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'B' ;                                        break ;                                }
                    }
                    // 4 setting the 4th position row-1 col+2
                    if(i-1 > -1 && j+2 < 8)
                    {
                        m = i-1 ; n = j+2 ;
                        if(field [i][j] == 9822)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'B' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'W' ;                                        break ;                                }
                        else if(field [i][j] == 9816)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'W' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'B' ;                                        break ;                                }
                    }
                    // 5 setting the 5th position row+2 col+1
                    if(i+2 < 8 && j+1 < 8)
                    {
                        m = i+2 ; n = j+1 ;
                        if(field [i][j] == 9822)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'B' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'W' ;                                        break ;                                }
                        else if(field [i][j] == 9816)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'W' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'B' ;                                        break ;                                }
                    }
                    // 6 setting the 6th position row+1 col+2
                    if(i+1 < 8 && j+2 < 8)
                    {
                        m = i+1 ; n = j+2 ;
                        if(field [i][j] == 9822)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'B' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'W' ;                                        break ;                                }
                        else if(field [i][j] == 9816)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'W' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'B' ;                                        break ;                                }
                    }
                    // 7 setting the 7th position row+2 col-1
                    if(i+2 < 8 && j-1 > -1)
                    {
                        m = i+2 ; n = j-1 ;
                        if(field [i][j] == 9822)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'B' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'W' ;                                        break ;                                }
                        else if(field [i][j] == 9816)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'W' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'B' ;                                        break ;                                }
                    }
                    // 8 setting the 8th position row+1 col-2
                    if(i+1 < 8 && j-2 > -1)
                    {
                        m = i+1 ; n = j-2 ;
                        if(field [i][j] == 9822)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'B' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'W' ;                                        break ;                                }
                        else if(field [i][j] == 9816)
                            switch(effect[m][n])                                {                                    case 'G' :                                    case 'W' :                                         effect[m][n] = 'G' ;                                        break ;                                    default :                                         effect[m][n] = 'B' ;                                        break ;                                }
                    }
                }
    }
}
