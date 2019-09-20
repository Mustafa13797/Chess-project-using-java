
package darshjava;


public class ROCK {
    public int permission (char field [][] , char effect [][] , int r1 , int r2 , char c1 , char c2)
    {
        if(field[r1][c1-97] == 9820)
        {
            if(r1 == r2 || c1 == c2)
            {
            if (r1 == r2)
            {
                if(c1 < c2)
                    for(int i = c1-97+1 ; i < c2-97 ; i++){
                        if(field[r1][i] != 9946){
                        {
                            System.out.println("There is an object that blocks the Rock's way, Try again :)");
                            return 0 ;
                        }}}
                    else if(c1 > c2){
                    for(int i = c1-97-1 ; i > c2-97 ; i--){
                        if(field[r1][i] != 9946)
                        {
                            System.out.println("There is an object that blocks the Rock's way, Try again :)");
                            return 0 ;
                        }}}                    
            }
            else if (c1 == c2)
            {
                
                if(r1 < r2){
                    for(int i = r1+1 ; i < r2 ; i++){
                        if(field[i][c1-97] != 9946)
                            {
                            System.out.println("There is an object that blocks the Rock's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 > r2){
                    for(int i = r1-1 ; i > r2 ; i--){
                        if(field[i][c1-97] != 9946)
                            {
                            System.out.println("There is an object that blocks the Rock's way, Try again :)");
                            return 0 ;
                            }}}
            }
            if(field[r2][c2-97] == 9818 || field[r2][c2-97] == 9820||field[r2][c2-97] == 9821 
                   || field[r2][c2-97] == 9819 || field[r2][c2-97] == 9823 || field[r2][c2-97] == 9822 )
            {
                System.out.println("Sorry, The ROCK can never kill any member of its KING's forces, Try agaion :)");
                return 2;
            }
            else 
            {
                // white Queen's reactions when moving 
                if(field[r2][c2-97] == 9946)
                    System.out.println("ROCK : The stones are moving!");
                else if(field[r2][c2-97] == 9813)
                    System.out.println("ROCK : SMASH SMASH !!");
                else if(field[r2][c2-97] == 9814)
                    System.out.println("ROCK : I may add these bricks to my construction");
                else if(field[r2][c2-97] == 9815)
                    System.out.println("ROCK : None is bigger than me !");
                else if(field[r2][c2-97] == 9816)
                    System.out.println("ROCK : Two ants with one hit !");
                else if(field[r2][c2-97] == 9817)
                    System.out.println("ROCK : Piece of cake");
                field[r2][c2-97] = 9820 ;
                field[r1][c1-97] = 9946 ;
                return 1 ;
            }
            }
            else
            { 
                System.out.println("The ROCK can never move this way, Try again :)");
                return 0 ;
            }
        }
        else if(field[r1][c1-97] == 9814)
        {
            if(r1 == r2 || c1 == c2)
            {
            if (r1 == r2)
            {
                if(c1 < c2)
                    for(int i = c1-97+1 ; i < c2-97 ; i++){
                        if(field[r1][i] != 9946){
                        {
                            System.out.println("There is an object that blocks the Rock's way, Try again :)");
                            return 0 ;
                        }}}
                    else if(c1 > c2){
                    for(int i = c1-97-1 ; i > c2-97 ; i--){
                        if(field[r1][i] != 9946)
                        {
                            System.out.println("There is an object that blocks the Rock's way, Try again :)");
                            return 0 ;
                        }}}                    
            }
            else if (c1 == c2)
            {
                
                if(r1 < r2){
                    for(int i = r1+1 ; i < r2 ; i++){
                        if(field[i][c1-97] != 9946)
                            {
                            System.out.println("There is an object that blocks the Rock's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 > r2){
                    for(int i = r1-1 ; i > r2 ; i--){
                        if(field[i][c1-97] != 9946)
                            {
                            System.out.println("There is an object that blocks the Rock's way, Try again :)");
                            return 0 ;
                            }}}
            }
            if(field[r2][c2-97] == 9812 || field[r2][c2-97] == 9813||field[r2][c2-97] == 9814 
                   || field[r2][c2-97] == 9815 || field[r2][c2-97] == 9816 || field[r2][c2-97] == 9817 )
            {
                System.out.println("Sorry, The ROCK can never kill any member of its KING's forces, Try agaion :)");
                return 2;
            }
            else 
            {
                // black king's reactions when moving 
                if(field[r2][c2-97] == 9946)
                    System.out.println("ROCK : The stones are moving!");
                else if(field[r2][c2-97] == 9819)
                    System.out.println("ROCK : SMASH SMASH !!");
                else if(field[r2][c2-97] == 9820)
                    System.out.println("ROCK : I may add these bricks to my construction");
                else if(field[r2][c2-97] == 9821)
                    System.out.println("ROCK : None is bigger than me !");
                else if(field[r2][c2-97] == 9822)
                    System.out.println("ROCK : Two ants with one hit !");
                else if(field[r2][c2-97] == 9823)
                    System.out.println("ROCK : Piece of cake");
                field[r2][c2-97] = 9814 ;
                field[r1][c1-97] = 9946 ;
                return 1 ;
            }
            }
            else
            { 
                System.out.println("The ROCK can never move this way, Try again :)");
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
                if(field [i][j] == 9820 || field [i][j] == 9814)
                    {
                        // setting Queens effect on the field 
                        
                        // 1 setting the 1st dierction ↑
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy-1 , n = colcpy ; m > -1 ; m-- )
                        {
                            if(field [i][j] == 9820)
                            {
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
                                if(field [m][n] != 9946)
                                    break;
                            }
                            else if(field [i][j] == 9814)
                            {
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
                                if(field [m][n] != 9946)
                                    break;
                            }
                        }
                        // 2 setting the 2nd dierction →
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy , n = colcpy+1 ; n < 8 ; n++)
                        {
                            if(field [i][j] == 9820)
                            {
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
                                if(field [m][n] != 9946)
                                    break;
                            }
                            else if(field [i][j] == 9814)
                            {
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
                                if(field [m][n] != 9946)
                                    break;
                            }
                        }
                        // 3 setting the 3rd dierction ↓
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy+1 , n = colcpy ; m < 8 ; m++ )
                        {
                            if(field [i][j] == 9820)
                            {
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
                                if(field [m][n] != 9946)
                                    break;
                            }
                            else if(field [i][j] == 9814)
                            {
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
                                if(field [m][n] != 9946)
                                    break;
                            }
                        }
                        // 4 setting the 4th dierction ←
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy , n = colcpy-1 ; n > -1 ; n--)
                        {
                            if(field [i][j] == 9820)
                            {
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
                                if(field [m][n] != 9946)
                                    break;
                            }
                            else if(field [i][j] == 9814)
                            {
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
                                if(field [m][n] != 9946)
                                    break;
                            }
                        }
                    }
    }

    
}
