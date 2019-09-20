
package darshjava;

import java.util.Scanner ;

public class SOLIDER {
    
    public void upgrade (char field [][])
    {
        Scanner enter = new Scanner(System.in);
        for(int i = 0 ; i < 8 ; i++)
        {
            for(int j = 0 ; j < 8 ; j++)
            {
                if(i == 0 && field[i][j] == 9823)
                {
                    System.out.println("Congrats white KING !. "
                            + "\none of your soliders could reach the other king's palace."
                            +"\nThis gives you the right to upgrade his position. "
                            + "\nPlease choose one of the following four");
                    for(int k = 9819 ; k <= 9822 ; k++)
                    {
                        System.out.println((k-9818) + "-----> " + (char)k);
                    }
                    int chosen = enter.nextInt();
                    if(chosen == 1)field[i][j] = (char)(chosen+9818);
                    else if(chosen == 2)field[i][j] = (char)(chosen+9818);
                    else if(chosen == 3)field[i][j] = (char)(chosen+9818);
                    else if(chosen == 4)field[i][j] = (char)(chosen+9818);
                    else
                    {
                        System.out.println("You should have chosen one of the four, Try again :)");
                        upgrade(field);
                    }
                }
                else if(i == 7 && field[i][j] == 9817)
                {
                    System.out.println("Congrats black KING !. "
                            + "\none of your soliders could reach the other king's palace."
                            +"\nThis gives you the right to upgrade his position. "
                            + "\nPlease choose one of the following four");
                    for(int k = 9819 ; k <= 9822 ; k++)
                    {
                        System.out.println((k-9818) + "-----> " + (char)k);
                    }
                    int chosen = enter.nextInt();
                    if(chosen == 1)field[i][j] = (char)(chosen+9812);
                    else if(chosen == 2)field[i][j] = (char)(chosen+9812);
                    else if(chosen == 3)field[i][j] = (char)(chosen+9812);
                    else if(chosen == 4)field[i][j] = (char)(chosen+9812);
                    else
                    {
                        System.out.println("You should have chosen one of the four, Try again :)");
                        upgrade(field);
                    }
                }
            }
        }
    }
    
    public int permission (char field [][] , char effect [][] , int r1 , int r2 , char c1 , char c2)
    {
        if(field[r1][c1-97] == 9823)
        {
            if((r1 == 6 && r2 == 4 && field[4][c1-97] == 9946 && field[5][c1-97] == 9946 && c1 == c2)
                    || (r1 - r2 == 1 && field[r2][c1-97] == 9946 && c1 == c2)
                    || (r1 - r2 == 1 && field[r2][c2-97] != 9946 && Math.abs(c1-c2) == 1))
            {
                if((r1 - r2 == 1 && field[r2][c2-97] != 9946 && Math.abs(c1-c2) == 1)
                   && (field[r2][c2-97] == 9818 || field[r2][c2-97] == 9820||field[r2][c2-97] == 9821 
                   || field[r2][c2-97] == 9819 || field[r2][c2-97] == 9823 || field[r2][c2-97] == 9822 ))
                {
                    System.out.println("Sorry, The SOLIDER can never kill any member of its KING's forces, Try agaion :)");
                    return 2;
                }
                else
                {
                    // white HOSRE's reactions when moving 
                    if(field[r2][c2-97] == 9946)
                        System.out.println("SOLIDER : FORWARD!!");
                    else if(field[r2][c2-97] == 9813)
                        System.out.println("SOLIDER : I killed their queen, surely the king will upgrade me to knight");
                    else if(field[r2][c2-97] == 9814)
                        System.out.println("SOLIDER : No rocks stands against hard work");
                    else if(field[r2][c2-97] == 9815)
                        System.out.println("SOLIDER : WOW ! I could kill this elephant alone");
                    else if(field[r2][c2-97] == 9816)
                        System.out.println("SOLIDER : I may ride this horse after the battle is over =D");
                    else if(field[r2][c2-97] == 9817)
                        System.out.println("SOLIDER : Join us or die!!");
                    field[r2][c2-97] = 9823 ;
                    field[r1][c1-97] = 9946 ;
                    return 1 ;
                }       
                
            }
            else 
            {
                System.out.println("The SOLIDER can never move this way, Try again:)");
                return 0 ;
            }
        }
        else if(field[r1][c1-97] == 9817)
        {
            if((r1 == 1 && r2 == 3 && field[2][c1-97] == 9946 && field[3][c1-97] == 9946 && c1 == c2)
                    || (r2 - r1 == 1 && field[r2][c1-97] == 9946 && c1 == c2)
                    || (r2 - r1 == 1 && field[r2][c2-97] != 9946 && Math.abs(c1-c2) == 1))
            {
                if((r2 - r1 == 1 && field[r2][c2-97] != 9946 && Math.abs(c1-c2) == 1)
                   && (field[r2][c2-97] == 9812 || field[r2][c2-97] == 9813||field[r2][c2-97] == 9814 
                   || field[r2][c2-97] == 9815 || field[r2][c2-97] == 9816 || field[r2][c2-97] == 9817 ))
                {
                    System.out.println("Sorry, The SOLIDER can never kill any member of its KING's forces, Try agaion :)");
                    return 2;
                }
                else
                {
                    // white HOSRE's reactions when moving 
                    if(field[r2][c2-97] == 9946)
                        System.out.println("SOLIDER : FORWARD!!");
                    else if(field[r2][c2-97] == 9819)
                        System.out.println("SOLIDER : I killed their queen, surely the king will upgrade me to knight");
                    else if(field[r2][c2-97] == 9820)
                        System.out.println("SOLIDER : No rocks stands against hard work");
                    else if(field[r2][c2-97] == 9821)
                        System.out.println("SOLIDER : WOW ! I could kill this elephant alone");
                    else if(field[r2][c2-97] == 9822)
                        System.out.println("SOLIDER : I may ride this horse after the battle is over =D");
                    else if(field[r2][c2-97] == 9823)
                        System.out.println("SOLIDER : Join us or die!!");
                    field[r2][c2-97] = 9817 ;
                    field[r1][c1-97] = 9946 ;
                    return 1 ;
                }       
                
            }
            else 
            {
                System.out.println("The SOLIDER can never move this way, Try again:)");
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
                if(field [i][j] == 9823 || field [i][j] == 9817)
                {
                    // setting Horses effect on the field 
                    
                    // 1 setting the 1st position row-1 col-1 (white solider)
                    if(i-1 > -1 && j-1 > -1 && field [i][j] == 9823)
                    {
                        m = i-1 ; n = j-1 ;
                        switch(effect[m][n])
                                {
                                    case 'G' :
                                    case 'B' : 
                                        effect[m][n] = 'G' ;
                                        break ;
                                    default : 
                                        effect[m][n] = 'W' ;
                                        break ;
                                }
                    }
                    
                    // 2 setting the 2nd position row-1 col+1 (white solider)
                    if(i-1 > -1 && j+1 < 8 && field [i][j] == 9823)
                    {
                        m = i-1 ; n = j+1 ;
                        switch(effect[m][n])
                                {
                                    case 'G' :
                                    case 'B' : 
                                        effect[m][n] = 'G' ;
                                        break ;
                                    default : 
                                        effect[m][n] = 'W' ;
                                        break ;
                                }
                        
                    }
                    // 1 setting the 1st position row+1 col-1 (black solider)
                    if(i+1 < 8 && j-1 > -1 && field [i][j] == 9817)
                    {
                        m = i+1 ; n = j-1 ;
                        switch(effect[m][n])
                                {
                                    case 'G' :
                                    case 'W' : 
                                        effect[m][n] = 'G' ;
                                        break ;
                                    default : 
                                        effect[m][n] = 'B' ;
                                        break ;
                                }
                    }
                    
                    // 2 setting the 2nd position row+1 col+1 (black solider)
                    if(i+1 < 8 && j+1 < 8 && field [i][j] == 9817)
                    {
                        m = i+1 ; n = j+1 ;
                        switch(effect[m][n])
                                {
                                    case 'G' :
                                    case 'W' : 
                                        effect[m][n] = 'G' ;
                                        break ;
                                    default : 
                                        effect[m][n] = 'B' ;
                                        break ;
                                }
                    }
                }
    }
}
