
package darshjava;


public class ELEPHANT {
    public int permission (char field [][] , char effect [][] , int r1 , int r2 , char c1 , char c2)
    {
        if(field[r1][c1-97] == 9821)
        {
            
            if(Math.abs(r1-r2) == Math.abs(c1-c2))
            {
                if(r1 > r2 && c1 > c2){
                    for(int i = r1-1 , j = c1-97-1 ; i > r2 && j > c2-97 ; i-- , j--){
                        if(field[i][j] != 9946)
                            {
                            System.out.println("There is an object that blocks the ELEPHANT's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 > r2 && c1 < c2){
                    for(int i = r1-1 , j = c1-97+1 ; i > r2 && j < c2-97 ; i-- , j++){
                        if(field[i][j] != 9946)
                            {
                            System.out.println("There is an object that blocks the ELEPHANT's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 < r2 && c1 < c2){
                    for(int i = r1 , j = c1-97 ; i < r2 && j < c2-97 ; i++ , j++){
                        if(field[i][j] != 9946)
                            {
                            System.out.println("There is an object that blocks the ELEPHANT's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 < r2 && c1 > c2)
                    for(int i = r1 , j = c1-97 ; i < r2 && j > c2-97 ; i++ , j--){
                        if(field[i][j] != 9946){
                           {
                            System.out.println("There is an object that blocks the ELEPHANT's way, Try again :)");
                            return 0 ;
                          }}}
            
            if(field[r2][c2-97] == 9818 || field[r2][c2-97] == 9820||field[r2][c2-97] == 9821 
                   || field[r2][c2-97] == 9819 || field[r2][c2-97] == 9823 || field[r2][c2-97] == 9822 )
            {
                System.out.println("Sorry, The ELEPHANT can never kill any member of its KING's forces, Try agaion :)");
                return 2;
            }
            else 
            {
                // white Queen's reactions when moving 
                if(field[r2][c2-97] == 9946)
                    System.out.println("ELEPHANT : The earthquate is coming !");
                else if(field[r2][c2-97] == 9813)
                    System.out.println("ELEPHANT : One more added to my score!");
                else if(field[r2][c2-97] == 9814)
                    System.out.println("ELEPHANT : Rocks are nothing more than piece of cake");
                else if(field[r2][c2-97] == 9815)
                    System.out.println("ELEPHANT : I'm the elephants' king here, DIE!");
                else if(field[r2][c2-97] == 9816)
                    System.out.println("ELEPHANT : Did you think that horse may mesh with me");
                else if(field[r2][c2-97] == 9817)
                    System.out.println("ELEPHANT : Oh sorry I didn't see you =D");
                field[r2][c2-97] = 9821 ;
                field[r1][c1-97] = 9946 ;
                return 1 ;
            }
            }
            else
            { 
                System.out.println("The ELEPHANT can never move this way, Try again :)");
                return 0 ;
            }
        }
        else if(field[r1][c1-97] == 9815)
        {
            if(Math.abs(r1-r2) == Math.abs(c1-c2))
            {
            if(r1 > r2 && c1 > c2){
                    for(int i = r1-1 , j = c1-97-1 ; i > r2 && j > c2-97 ; i-- , j--){
                        if(field[i][j] != 9946)
                            {
                            System.out.println("There is an object that blocks the ELEPHANT's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 > r2 && c1 < c2){
                    for(int i = r1-1 , j = c1-97+1 ; i > r2 && j < c2-97 ; i-- , j++){
                        if(field[i][j] != 9946)
                            {
                            System.out.println("There is an object that blocks the ELEPHANT's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 < r2 && c1 < c2){
                    for(int i = r1+1 , j = c1-97+1 ; i < r2 && j < c2-97 ; i++ , j++){
                        if(field[i][j] != 9946)
                            {
                            System.out.println("There is an object that blocks the ELEPHANT's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 < r2 && c1 > c2)
                    for(int i = r1+1 , j = c1-97-1 ; i < r2 && j > c2-97 ; i++ , j--){
                        if(field[i][j] != 9946){
                           {
                            System.out.println("There is an object that blocks the ELEPHANT's way, Try again :)");
                            return 0 ;
                          }}}
            if(field[r2][c2-97] == 9812 || field[r2][c2-97] == 9813||field[r2][c2-97] == 9814 
                   || field[r2][c2-97] == 9815 || field[r2][c2-97] == 9816 || field[r2][c2-97] == 9817 )
            {
                System.out.println("Sorry, The ELEPHANT can never kill any member of its KING's forces, Try agaion :)");
                return 2;
            }
            else 
            {
                // black king's reactions when moving 
                if(field[r2][c2-97] == 9946)
                    System.out.println("ELEPHANT : The earthquate is coming !");
                else if(field[r2][c2-97] == 9819)
                    System.out.println("ELEPHANT : One more added to my score!");
                else if(field[r2][c2-97] == 9820)
                    System.out.println("ELEPHANT : Rocks are nothing more than piece of cake");
                else if(field[r2][c2-97] == 9821)
                    System.out.println("ELEPHANT : I'm the elephants' king here, DIE!");
                else if(field[r2][c2-97] == 9822)
                    System.out.println("ELEPHANT : Did you think that horse may mesh with me");
                else if(field[r2][c2-97] == 9823)
                    System.out.println("ELEPHANT : Oh sorry I didn't see you =D");
                field[r2][c2-97] = 9815 ;
                field[r1][c1-97] = 9946 ;
                return 1 ;
            }
            }
            else
            { 
                System.out.println("The ELEPHANT can never move this way, Try again :)");
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
                if(field [i][j] == 9821 || field [i][j] == 9815)
                    {
                        // setting Queens effect on the field 
                        
                        // 1 setting the 1st dierction ↖
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy-1 , n = colcpy-1 ; m > -1 && n > -1 ; m-- , n--)
                        {
                            if(field [i][j] == 9821)
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
                            else if(field [i][j] == 9815)
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
                        // 3 setting the 2nd dierction ↗                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy-1 , n = colcpy+1 ; m > -1&& n < 8 ; m-- , n++)
                        {
                            if(field [i][j] == 9821)
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
                            else if(field [i][j] == 9815)
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
                        // 3 setting the 3rd dierction ↘
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy+1 , n = colcpy+1 ; m < 8 && n < 8 ; m++ , n++)
                        {
                            if(field [i][j] == 9821)
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
                            else if(field [i][j] == 9815)
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
                        // 4 setting the 4th dierction ↙
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy+1 , n = colcpy-1 ; m < 8 && n > -1 ; m++ , n--)
                        {
                            if(field [i][j] == 9821)
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
                            else if(field [i][j] == 9815)
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
