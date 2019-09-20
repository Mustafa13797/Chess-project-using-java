
package darshjava;

public class QUEEN {
    // tracking way coordinates
    private int min , max ;
    public int permission (char field [][] , char effect [][] , int r1 , int r2 , char c1 , char c2)
    {
        if(field[r1][c1-97] == 9819)
        {
            
            if(r1 == r2 || c1 == c2 || Math.abs(r1-r2) == Math.abs(c1-c2))
            {
            if (r1 == r2)
            {
                if(c1 < c2)
                    for(int i = c1-97+1 ; i < c2-97 ; i++){
                        if(field[r1][i] != 9946){
                        {
                            System.out.println("There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                        }}}
                    else if(c1 > c2){
                    for(int i = c1-97-1 ; i > c2-97 ; i--){
                        if(field[r1][i] != 9946)
                        {
                            System.out.println("There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                        }}}                    
            }
            else if (c1 == c2)
            {
                
                if(r1 < r2){
                    for(int i = r1+1 ; i < r2 ; i++){
                        if(field[i][c1-97] != 9946)
                            {
                            System.out.println("There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 > r2){
                    for(int i = r1-1 ; i > r2 ; i--){
                        if(field[i][c1-97] != 9946)
                            {
                            System.out.println("There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                            }}}
            }
            else 
            {
                if(r1 > r2 && c1 > c2){
                    for(int i = r1-1 , j = c1-97-1 ; i > r2 && j > c2-97 ; i-- , j--){
                        if(field[i][j] != 9946)
                            {
                            System.out.println("33There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 > r2 && c1 < c2){
                    for(int i = r1-1 , j = c1-97+1 ; i > r2 && j < c2-97 ; i-- , j++){
                        if(field[i][j] != 9946)
                            {
                            System.out.println("44There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 < r2 && c1 < c2){
                    for(int i = r1+1 , j = c1-97+1 ; i < r2 && j < c2-97 ; i++ , j++){
                        if(field[i][j] != 9946)
                            {
                            System.out.println("55There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 < r2 && c1 > c2)
                    for(int i = r1+1 , j = c1-97-1 ; i < r2 && j > c2-97 ; i++ , j--){
                        if(field[i][j] != 9946){
                           {
                            System.out.println("66There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                          }}}
            }
            if(field[r2][c2-97] == 9818 || field[r2][c2-97] == 9820||field[r2][c2-97] == 9821 
                   || field[r2][c2-97] == 9819 || field[r2][c2-97] == 9823 || field[r2][c2-97] == 9822 )
            {
                System.out.println("Sorry, The QUEEN can never kill any member of her KING's forces, Try agaion :)");
                return 2;
            }
            else 
            {
                // white Queen's reactions when moving 
                if(field[r2][c2-97] == 9946)
                    System.out.println("QUEEN : Free the way for the KING's first lady!");
                else if(field[r2][c2-97] == 9813)
                    System.out.println("QUEEN : It's your tragedic end, poor woman");
                else if(field[r2][c2-97] == 9814)
                    System.out.println("QUEEN : No rocks stands against the QUEEN's magic!");
                else if(field[r2][c2-97] == 9815)
                    System.out.println("QUEEN : When it comes to magic any gaint becomes nothing");
                else if(field[r2][c2-97] == 9816)
                    System.out.println("QUEEN : WELL, The KING will be happy with these captured horse and knight");
                else if(field[r2][c2-97] == 9817)
                    System.out.println("QUEEN : One more man is captured, The KING will surely be happy about me");
                field[r2][c2-97] = 9819 ;
                field[r1][c1-97] = 9946 ;
                return 1 ;
            }
            }
            else
            { 
                System.out.println("The QUEEN can never move this way, Try again :)");
                return 0 ;
            }
        }
        else if(field[r1][c1-97] == 9813)
        {
            if (r1 == r2)
            {
                if(c1 < c2)
                    for(int i = c1-97+1 ; i < c2-97 ; i++){
                        if(field[r1][i] != 9946){
                        {
                            System.out.println("There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                        }}}
                    else if(c1 > c2){
                    for(int i = c1-97-1 ; i > c2-97 ; i--){
                        if(field[r1][i] != 9946)
                        {
                            System.out.println("There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                        }}}                    
            }
            else if (c1 == c2)
            {
                
                if(r1 < r2){
                    for(int i = r1+1 ; i < r2 ; i++){
                        if(field[i][c1-97] != 9946)
                            {
                            System.out.println("There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 > r2){
                    for(int i = r1-1 ; i > r2 ; i--){
                        if(field[i][c1-97] != 9946)
                            {
                            System.out.println("There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                            }}}
            }
            else 
            {
                if(r1 > r2 && c1 > c2){
                    for(int i = r1-1 , j = c1-97-1 ; i > r2 && j > c2-97 ; i-- , j--){
                        if(field[i][j] != 9946)
                            {
                            System.out.println("There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 > r2 && c1 < c2){
                    for(int i = r1-1 , j = c1-97+1 ; i > r2 && j < c2-97 ; i-- , j++){
                        if(field[i][j] != 9946)
                            {
                            System.out.println("There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 < r2 && c1 < c2){
                    for(int i = r1+1 , j = c1-97+1 ; i < r2 && j < c2-97 ; i++ , j++){
                        if(field[i][j] != 9946)
                            {
                            System.out.println("uuThere is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                            }}}
                else if(r1 < r2 && c1 > c2)
                    for(int i = r1+1 , j = c1-97-1 ; i < r2 && j > c2-97 ; i++ , j--){
                        if(field[i][j] != 9946){
                           {
                            System.out.println("There is an object that blocks the Queen's way, Try again :)");
                            return 0 ;
                          }}}
            }
            if(r1 == r2 || c1 == c2 || Math.abs(r1-r2) == Math.abs(c1-c2))
            {
            if(field[r2][c2-97] == 9812 || field[r2][c2-97] == 9813||field[r2][c2-97] == 9814 
                   || field[r2][c2-97] == 9815 || field[r2][c2-97] == 9816 || field[r2][c2-97] == 9817 )
            {
                System.out.println("Sorry, The QUEEN can never kill any member of her KING's forces, Try agaion :)");
                return 2;
            }
            else 
            {
                // black king's reactions when moving 
                if(field[r2][c2-97] == 9946)
                    System.out.println("QUEEN : Free the way for the KING's first lady!");
                else if(field[r2][c2-97] == 9819)
                    System.out.println("QUEEN : It's your tragedic end, poor woman");
                else if(field[r2][c2-97] == 9820)
                    System.out.println("QUEEN : No rocks stands against the QUEEN's magic!");
                else if(field[r2][c2-97] == 9821)
                    System.out.println("QUEEN : When it comes to magic any gaint becomes nothing");
                else if(field[r2][c2-97] == 9822)
                    System.out.println("QUEEN : WELL, The KING will be happy with these captured horse and knight");
                else if(field[r2][c2-97] == 9823)
                    System.out.println("QUEEN : One more man is captured, The KING will surely be happy about me");
                field[r2][c2-97] = 9813 ;
                field[r1][c1-97] = 9946 ;
                return 1 ;
            }
            }
            else
            { 
                System.out.println("The KING can never move this way, Try again :)");
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
                if(field [i][j] == 9819 || field [i][j] == 9813)
                    {
                        // setting Queens effect on the field 
                        
                        // 1 setting the 1st dierction ↖
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy-1 , n = colcpy-1 ; m > -1 && n > -1 ; m-- , n--)
                        {
                            if(field [i][j] == 9819)
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
                            else if(field [i][j] == 9813)
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
                        // 2 setting the 2nd dierction ↑
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy-1 , n = colcpy ; m > -1 ; m-- )
                        {
                            if(field [i][j] == 9819)
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
                            else if(field [i][j] == 9813)
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
                        // 3 setting the 3rd dierction ↗                       
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy-1 , n = colcpy+1 ; m > -1&& n < 8 ; m-- , n++)
                        {
                            if(field [i][j] == 9819)
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
                            else if(field [i][j] == 9813)
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
                        // 4 setting the 4th dierction →
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy , n = colcpy+1 ; n < 8 ; n++)
                        {
                            if(field [i][j] == 9819)
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
                            else if(field [i][j] == 9813)
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
                        // 5 setting the 5th dierction ↘
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy+1 , n = colcpy+1 ; m < 8 && n < 8 ; m++ , n++)
                        {
                            if(field [i][j] == 9819)
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
                            else if(field [i][j] == 9813)
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
                        // 6 setting the 6th dierction ↓
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy+1 , n = colcpy ; m < 8 ; m++ )
                        {
                            if(field [i][j] == 9819)
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
                            else if(field [i][j] == 9813)
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
                        // 7 setting the 7th dierction ↙
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy+1 , n = colcpy-1 ; m < 8 && n > -1 ; m++ , n--)
                        {
                            if(field [i][j] == 9819)
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
                            else if(field [i][j] == 9813)
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
                        // 8 setting the 8th dierction ←
                        rowcpy = i ; colcpy = j ;
                        
                        for(m = rowcpy , n = colcpy-1 ; n > -1 ; n--)
                        {   
                            if(field [i][j] == 9819)
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
                            else if(field [i][j] == 9813)
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
