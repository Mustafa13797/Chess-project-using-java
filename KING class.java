
package darshjava;

public class KING {
    public int indanger (char field [][] , char effect [][] , int who)
    {
        check checko = new check() ;
        check checka = new check() ;
        //the technique of  close the nine and check one of the four
        int eight = 0 , rowcpy = 0 , colcpy = 0 , decision = 1 , dead = 0 , before = 0 ;
        for(int i = 0 ; i < 8 ; i++){
            for(int j = 0 ; j < 8 ; j++){
                // the white king
                if(field[i][j] == 9818 && (effect[i][j] == 'G' || effect[i][j] == 'B') && who == 1)
                {   
                    rowcpy = i ; colcpy = j ;
                    // checking if the eight squares around the KING are forbidden or not 
                    if(i-1 > -1 && j-1 > -1)
                    {
                        if( field[i-1][j-1] == 9819 ||  field[i-1][j-1] == 9820 || 
                    field[i-1][j-1] == 9821 ||  field[i-1][j-1] == 9822 ||  field[i-1][j-1] == 9823 
                     || effect[i-1][j-1] == 'G' || effect[i-1][j-1] == 'B')
                        {eight++ ;}
                    }
                    else { eight++ ; }
                    if(i-1 > -1 )
                    {
                        if(field[i-1][j] == 9819 ||  field[i-1][j] == 9820 || 
                    field[i-1][j] == 9821 ||  field[i-1][j] == 9822 ||  field[i-1][j] == 9823 
                            || effect[i-1][j] == 'G' || effect[i-1][j] == 'B')
                        { eight++ ;}
                    }
                    else { eight++ ; }
                    if(i-1 > -1 && j+1 < 8)
                    {
                        if(field[i-1][j+1] == 9819 ||  field[i-1][j+1] == 9820 || 
                    field[i-1][j+1] == 9821 ||  field[i-1][j+1] == 9822 ||  field[i-1][j+1] == 9823 ||
                          effect[i-1][j+1] == 'G' || effect[i-1][j+1] == 'B')
                        { eight++ ; }
                    }
                    else { eight++ ; }
                    
                    if(j+1 < 8){ 
                        if(field[i][j+1] == 9819 ||  field[i][j+1] == 9820 || 
                    field[i][j+1] == 9821 ||  field[i][j+1] == 9822 ||  field[i][j+1] == 9823 ||
                            effect[i][j+1] == 'G' || effect[i][j+1] == 'B')
                        {eight++ ;}}
                    else { eight++ ; }
                    if(i+1 < 8 && j+1 < 8){
                        if(field[i+1][j+1] == 9819 ||  field[i+1][j+1] == 9820 || 
                    field[i+1][j+1] == 9821 ||  field[i+1][j+1] == 9822 ||  field[i+1][j+1] == 9823 ||
                            effect[i+1][j+1] == 'G' || effect[i+1][j+1] == 'B')
                        {eight++ ;}}
                    else { eight++ ; }
                    if(i+1 < 8){
                        if(field[i+1][j] == 9819 ||  field[i+1][j] == 9820 || 
                    field[i+1][j] == 9821 ||  field[i+1][j] == 9822 ||  field[i+1][j] == 9823 || 
                           effect[i+1][j] == 'G' || effect[i+1][j] == 'B')
                        { eight++ ;}}
                    else { eight++ ; }
                    if(i+1 < 8 &&  j-1 > -1){
                        if(field[i+1][j-1] == 9819 ||  field[i+1][j-1] == 9820 || 
                    field[i+1][j-1] == 9821 ||  field[i+1][j-1] == 9822 ||  field[i+1][j-1] == 9823 ||
                            effect[i+1][j-1] == 'G' || effect[i+1][j-1] == 'B')
                        {eight++ ;}}
                    else { eight++ ; }
                    if(j-1 > -1) {
                        if(field[i][j-1] == 9819 ||  field[i][j-1] == 9820 || 
                    field[i][j-1] == 9821 ||  field[i][j-1] == 9822 ||  field[i][j-1] == 9823 ||
                            effect[i][j-1] == 'G' || effect[i][j-1] == 'B')
                        {eight++ ;}}
                    else { eight++ ; }
                    System.out.println("white eight : " + eight);
                    // checkong if the KING will die or can be saved
                    if(eight == 8)
                    {
                        if(i-2 > -1 && j-1 > -1){
                            if( field[i-2][j-1] == 9816 
                                    && (effect[i-2][j-1] != 'W' && effect[i-2][j-1] != 'G' )){
                            return 0 ;}
                            else if( field[i-2][j-1] == 9816 
                                    && (effect[i-2][j-1] == 'W' || effect[i-2][j-1] == 'G' ))
                            {before = dead++;}
                        }
                        
                        if(i-1 > -1 && j-2 > -1){
                            if(field[i-1][j-2] == 9816 
                                && (effect[i-1][j-2] != 'W' && effect[i-1][j-2] != 'G' ))
                            return 0 ;
                            else if(field[i-1][j-2] == 9816 
                                && (effect[i-1][j-2] == 'W' || effect[i-1][j-2] == 'G' ))
                            {before = dead++;}
                        }
                        if(i-2 > -1 && j+1 < 8){
                            if(field[i-2][j+1] == 9816 
                                && (effect[i-2][j+1] != 'W' || effect[i-2][j+1] != 'G' ))
                            return 0 ;
                            else if(field[i-2][j+1] == 9816 
                                && (effect[i-2][j+1] == 'W' || effect[i-2][j+1] == 'G' ))
                            {before = dead++;}
                        }
                        if(i-1 > -1 && j+2 < 8){
                            if(field[i-1][j+2] == 9816 
                                && (effect[i-1][j+2] != 'W' || effect[i-1][j+2] != 'G' ))
                            return 0 ;
                            else if(field[i-1][j+2] == 9816 
                                && (effect[i-1][j+2] == 'W' || effect[i-1][j+2] == 'G' ))
                            {before = dead++;}
                        }
                        if(i+2 < 8 && j+1 < 8){
                            if(field[i+2][j+1] == 9816 
                                && (effect[i+2][j+1] != 'W' || effect[i+2][j+1] != 'G' ))
                            return 0 ;
                            else if(field[i+2][j+1] == 9816 
                                && (effect[i+2][j+1] == 'W' || effect[i+2][j+1] == 'G' ))
                            {before = dead++;}
                        }
                        if(i+1 < 8 && j+2 < 8){
                            if(field[i+1][j+2] == 9816 
                                && (effect[i+1][j+2] != 'W' || effect[i+1][j+2] != 'G' ))
                            return 0 ;
                            else if(field[i+1][j+2] == 9816 
                                && (effect[i+1][j+2] == 'W' || effect[i+1][j+2] == 'G' ))
                            {before = dead++;}
                        }
                        if(i+2 < 8 && j-1 > -1){
                            if(field[i+2][j-1] == 9816 
                                && (effect[i+2][j-1] != 'W' || effect[i+2][j-1] != 'G' ))
                            return 0 ;
                            else if(field[i+2][j-1] == 9816 
                                && (effect[i+2][j-1] == 'W' || effect[i+2][j-1] == 'G' ))
                            {before = dead++;}
                        }
                        if(i+1 < 8 && j-2 > -1){
                            if(field[i+1][j-2] == 9816 
                                && (effect[i+1][j-2] != 'W' || effect[i+1][j-2] != 'G' ))
                            return 0 ;
                            else if(field[i+1][j-2] == 9816 
                                && (effect[i+1][j-2] == 'W' || effect[i+1][j-2] == 'G' ))
                            {before = dead++;}
                        }
                        if(i-1 > -1 && j-1 > -1)
                        {
                            if(field[i-1][j-1] == 9817 
                            && checko.checko(field, effect, i-1, j-1) > 0
                            && checko.checka(field, effect, i-1, j-1) < 2)
                            {return 0;}
                            else if(field[i-1][j-1] == 9817 
                            && checko.checko(field, effect, i-1, j-1) > 0
                            && checko.checka(field, effect, i-1, j-1) == 2)
                            {before = dead++;}
                        }
                        if(i-1 > -1 && j+1 < 8)
                        {
                            if(field[i-1][j+1] == 9817 
                            && checko.checko(field, effect, i-1, j+1) > 0
                            && checko.checka(field, effect, i-1, j+1) < 2)
                            {return 0;}
                            else if(field[i-1][j+1] == 9817 
                            && checko.checko(field, effect, i-1, j+1) > 0
                            && checko.checka(field, effect, i-1, j+1) == 2)
                            {before = dead++;}
                        }
                        // checkong if he the KING is killed from the direction ↖
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy-1 , n = colcpy-1 ; m > -1 && n > -1 ; m-- , n--)
                        {   
                            if(field[m][n] != 9813 && field[m][n] != 9815
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9813 || field[m][n] == 9815)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy-1 , y = colcpy-1 ; x >= m && y >= n ; x-- , y--)
                                {   
                                    if(effect[x][y] == 'G' && x != m && y != n
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        System.out.println(dead + " " + before);
                                        break;
                                    } 
                                    else if((effect[x][y] == 'W' || (effect[x][y] == 'G' && checko.checka(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        
                        // checkong if he the KING is killed from the direction ↑
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy-1 , n = colcpy ; m > -1 ; m-- )
                        {
                            if(field[m][n] != 9813 && field[m][n] != 9814
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9813 || field[m][n] == 9814)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy-1 , y = colcpy ; x >= m ; x--)
                                {
                                    if(effect[x][y] == 'G' && x != m
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        break;
                                    } 
                                    else if((effect[x][y] == 'W' || (effect[x][y] == 'G' && checko.checka(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        // checkong if he the KING is killed from the direction ↗
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy-1 , n = colcpy+1 ; m > -1 && n < 8 ; m-- , n++)
                        {
                            if(field[m][n] != 9813 && field[m][n] != 9815
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9813 || field[m][n] == 9815)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy-1 , y = colcpy+1 ; x >= m && y <= n ; x-- , y++)
                                {   
                                    if(effect[x][y] == 'G' && x != m && y != n
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        break;
                                    } 
                                    else if((effect[x][y] == 'W' || (effect[x][y] == 'G' && checko.checka(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        // checkong if he the KING is killed from the direction →
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy , n = colcpy+1 ; n < 8 ; n++)
                        {
                            if(field[m][n] != 9813 && field[m][n] != 9814
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9813 || field[m][n] == 9814)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy , y = colcpy+1 ; y <= n ; y++)
                                {   
                                    if(effect[x][y] == 'G' && y != n
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        break;
                                    } 
                                    else if((effect[x][y] == 'W' || (effect[x][y] == 'G' && checko.checka(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        // checkong if he the KING is killed from the direction ↘
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy+1 , n = colcpy+1 ; m < 8 && n < 8 ; m++ , n++)
                        {
                            if(field[m][n] != 9813 && field[m][n] != 9814
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9813 || field[m][n] == 9814)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy+1 , y = colcpy+1 ; x <= m && y <= n ; x++, y++)
                                {   
                                    if(effect[x][y] == 'G' && x != m && y != n
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        break;
                                    } 
                                    else if((effect[x][y] == 'W' || (effect[x][y] == 'G' && checko.checka(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        // checkong if he the KING is killed from the direction ↓
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy+1 , n = colcpy ; m < 8 ; m++)
                        {
                            if(field[m][n] != 9813 && field[m][n] != 9814
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9813 || field[m][n] == 9814)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy+1 , y = colcpy ; x <= m ; x++ )
                                {   
                                    if(effect[x][y] == 'G' && x != m
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        break;
                                    } 
                                    else if((effect[x][y] == 'W' || (effect[x][y] == 'G' && checko.checka(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        // checkong if he the KING is killed from the direction ↙
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy+1 , n = colcpy-1 ; m < 8 && n > -1 ; m++ , n--)
                        {
                            if(field[m][n] != 9813 && field[m][n] != 9815
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9813 || field[m][n] == 9815)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy+1 , y = colcpy-1 ; x <= m && y >= n ; x++ , y--)
                                {   
                                    if(effect[x][y] == 'G' && x != m && y != n
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        break;
                                    } 
                                    else if((effect[x][y] == 'W' || (effect[x][y] == 'G' && checko.checka(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        // checkong if he the KING is killed from the direction ←
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy , n = colcpy-1 ; n > -1 ; n--)
                        {   
                            if(field[m][n] != 9813 && field[m][n] != 9814
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9813 || field[m][n] == 9814)
                            {   
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy , y = colcpy-1 ; y >= n ; y--)
                                {   
                                    if(effect[x][y] == 'G' && y != n
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        break;
                                    } 
                                    else if((effect[x][y] == 'W' || (effect[x][y] == 'G' && checko.checka(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        
                    }
                    if(dead > 1){return 0;}
                    return decision ;
                }
                // the black KING
                else if(field[i][j] == 9812  && (effect[i][j] == 'G' || effect[i][j] == 'W') && who == 0)
                {
                    rowcpy = i ; colcpy = j ;
                    // checkong if the eight squares around the KING are forbidden or not 
                    if(i-1 > -1 && j-1 > -1)
                    {
                        if( field[i-1][j-1] == 9813 ||  field[i-1][j-1] == 9814 || 
                    field[i-1][j-1] == 9815 ||  field[i-1][j-1] == 9816 ||  field[i-1][j-1] == 9817 
                     || effect[i-1][j-1] == 'G' || effect[i-1][j-1] == 'W')
                        {eight++ ;}
                    }
                    else { eight++ ; }
                    if(i-1 > -1 )
                    {
                        if(field[i-1][j] == 9813 ||  field[i-1][j] == 9814 || 
                    field[i-1][j] == 9815 ||  field[i-1][j] == 9816 ||  field[i-1][j] == 9817 
                            || effect[i-1][j] == 'G' || effect[i-1][j] == 'W')
                        { eight++ ;}
                    }
                    else { eight++ ; }
                    if(i-1 > -1 && j+1 < 8)
                    {
                        if(field[i-1][j+1] == 9813 ||  field[i-1][j+1] == 9814 || 
                    field[i-1][j+1] == 9815 ||  field[i-1][j+1] == 9816 ||  field[i-1][j+1] == 9817 ||
                          effect[i-1][j+1] == 'G' || effect[i-1][j+1] == 'W')
                        { eight++ ; }
                    }
                    else { eight++ ; }
                    if(j+1 < 8){ 
                        if(field[i][j+1] == 9813 ||  field[i][j+1] == 9814 || 
                    field[i][j+1] == 9815 ||  field[i][j+1] == 9816 ||  field[i][j+1] == 9817 ||
                            effect[i][j+1] == 'G' || effect[i][j+1] == 'W')
                        {eight++ ;}}
                    else { eight++ ; }
                    if(i+1 < 8 && j+1 < 8){
                        if(field[i+1][j+1] == 9813 ||  field[i+1][j+1] == 9814 || 
                    field[i+1][j+1] == 9815 ||  field[i+1][j+1] == 9816 ||  field[i+1][j+1] == 9817 ||
                            effect[i+1][j+1] == 'G' || effect[i+1][j+1] == 'W')
                        {eight++ ;}}
                    else { eight++ ; }
                    if(i+1 < 8){
                        if(field[i+1][j] == 9813 ||  field[i+1][j] == 9814 || 
                    field[i+1][j] == 9815 ||  field[i+1][j] == 9816 ||  field[i+1][j] == 9817 || 
                           effect[i+1][j] == 'G' || effect[i+1][j] == 'W')
                        { eight++ ;}}
                    else { eight++ ; }
                    if(i+1 < 8 &&  j-1 > -1){
                        if(field[i+1][j-1] == 9813 ||  field[i+1][j-1] == 9814 || 
                    field[i+1][j-1] == 9815 ||  field[i+1][j-1] == 9816 ||  field[i+1][j-1] == 9817 ||
                            effect[i+1][j-1] == 'G' || effect[i+1][j-1] == 'W')
                        {eight++ ;}}
                    else { eight++ ; }
                    if(j-1 > -1) {
                        if(field[i][j-1] == 9813 ||  field[i][j-1] == 9814 || 
                    field[i][j-1] == 9815 ||  field[i][j-1] == 9816 ||  field[i][j-1] == 9817 ||
                            effect[i][j-1] == 'G' || effect[i][j-1] == 'W')
                        {eight++ ;}}
                    else { eight++ ; }
                    // checkong if the KING will die or can be saved
                    System.out.println("Black eight is : " + eight);
                    if(eight == 8)
                    {
                        if(i-2 > -1 && j-1 > -1){
                            if( field[i-2][j-1] == 9822 
                                    && (effect[i-2][j-1] != 'B' && effect[i-2][j-1] != 'G' )){
                            return 0 ;}
                            else if( field[i-2][j-1] == 9822 
                                    && (effect[i-2][j-1] == 'B' || effect[i-2][j-1] == 'G' ))
                            {before = dead++;}
                        }
                        
                        if(i-1 > -1 && j-2 > -1){
                            if(field[i-1][j-2] == 9822 
                                && (effect[i-1][j-2] != 'B' && effect[i-1][j-2] != 'G' ))
                            return 0 ;
                            else if(field[i-1][j-2] == 9822 
                                && (effect[i-1][j-2] == 'B' || effect[i-1][j-2] == 'G' ))
                            {before = dead++;}
                        }
                        if(i-2 > -1 && j+1 < 8){
                            if(field[i-2][j+1] == 9822 
                                && (effect[i-2][j+1] != 'B' || effect[i-2][j+1] != 'G' ))
                            return 0 ;
                            else if(field[i-2][j+1] == 9822 
                                && (effect[i-2][j+1] == 'B' || effect[i-2][j+1] == 'G' ))
                            {before = dead++;}
                        }
                        if(i-1 > -1 && j+2 < 8){
                            if(field[i-1][j+2] == 9822 
                                && (effect[i-1][j+2] != 'B' || effect[i-1][j+2] != 'G' ))
                            return 0 ;
                            else if(field[i-1][j+2] == 9822 
                                && (effect[i-1][j+2] == 'B' || effect[i-1][j+2] == 'G' ))
                            {before = dead++;}
                        }
                        if(i+2 < 8 && j+1 < 8){
                            if(field[i+2][j+1] == 9822 
                                && (effect[i+2][j+1] != 'B' || effect[i+2][j+1] != 'G' ))
                            return 0 ;
                            else if(field[i+2][j+1] == 9822 
                                && (effect[i+2][j+1] == 'B' || effect[i+2][j+1] == 'G' ))
                            {before = dead++;}
                        }
                        if(i+1 < 8 && j+2 < 8){
                            if(field[i+1][j+2] == 9822 
                                && (effect[i+1][j+2] != 'B' || effect[i+1][j+2] != 'G' ))
                            return 0 ;
                            else if(field[i+1][j+2] == 9822 
                                && (effect[i+1][j+2] == 'B' || effect[i+1][j+2] == 'G' ))
                            {before = dead++;}
                        }
                        if(i+2 < 8 && j-1 > -1){
                            if(field[i+2][j-1] == 9822 
                                && (effect[i+2][j-1] != 'B' || effect[i+2][j-1] != 'G' ))
                            return 0 ;
                            else if(field[i+2][j-1] == 9822 
                                && (effect[i+2][j-1] == 'B' || effect[i+2][j-1] == 'G' ))
                            {before = dead++;}
                        }
                        if(i+1 < 8 && j-2 > -1){
                            if(field[i+1][j-2] == 9822 
                                && (effect[i+1][j-2] != 'B' || effect[i+1][j-2] != 'G' ))
                            return 0 ;
                            else if(field[i+1][j-2] == 9822 
                                && (effect[i+1][j-2] == 'B' || effect[i+1][j-2] == 'G' ))
                            {before = dead++;}
                        }
                        if(i+1 < 8 && j-1 > -1)
                        {
                            if(field[i+1][j-1] == 9823 
                            && checko.checka(field, effect, i+1, j-1) > 0
                            && checko.checko(field, effect, i+1, j-1) < 2)
                            {return 0;}
                            else if(field[i+1][j-1] == 9823 
                            && checko.checka(field, effect, i+1, j-1) > 0
                            && checko.checko(field, effect, i+1, j-1) == 2)
                            {before = dead++;}
                        }
                        if(i+1 < 8  && j+1 < 8)
                        {
                            if(field[i+1][j+1] == 9823 
                            && checko.checka(field, effect, i+1, j+1) > 0
                            && checko.checko(field, effect, i+1, j+1) < 2)
                            {return 0;}
                            if(field[i+1][j+1] == 9823 
                            && checko.checka(field, effect, i+1, j+1) > 0
                            && checko.checko(field, effect, i+1, j+1) == 2)
                            {before = dead++;}
                        }
                        // checkong if he the KING is killed from the direction ↖
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy-1 , n = colcpy-1 ; m > -1 && n > -1 ; m-- , n--)
                        {   
                            if(field[m][n] != 9819 && field[m][n] != 9821
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9819 || field[m][n] == 9821)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy-1 , y = colcpy-1 ; x >= m && y >= n ; x-- , y--)
                                {   
                                    if(effect[x][y] == 'G' && x != m && y != n
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        System.out.println(dead + " " + before);
                                        break;
                                    } 
                                    else if((effect[x][y] == 'W' || (effect[x][y] == 'G' && checko.checka(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        // checkong if he the KING is killed from the direction ↑
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy-1 , n = colcpy ; m > -1 ; m-- )
                        {
                            if(field[m][n] != 9819 && field[m][n] != 9820
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9819 || field[m][n] == 9820)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy-1 , y = colcpy ; x >= m ; x--)
                                {
                                    if(effect[x][y] == 'G' && x != m 
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        break;
                                    } 
                                    else if((effect[x][y] == 'W' || (effect[x][y] == 'G' && checko.checka(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        // checkong if he the KING is killed from the direction ↗
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy-1 , n = colcpy+1 ; m > -1 && n < 8 ; m-- , n++)
                        {
                            if(field[m][n] != 9819 && field[m][n] != 9821
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9819 || field[m][n] == 9821)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy-1 , y = colcpy+1 ; x >= m && y <= n ; x-- , y++)
                                {   
                                    if(effect[x][y] == 'G' && x != m && y != n
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        break;
                                    } 
                                    else if((effect[x][y] == 'W' || (effect[x][y] == 'G' && checko.checka(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        // checkong if he the KING is killed from the direction →
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy , n = colcpy+1 ; n < 8 ; n++)
                        {
                            if(field[m][n] != 9819 && field[m][n] != 9820
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9819 || field[m][n] == 9820)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy , y = colcpy+1 ; y <= n ; y++)
                                {   
                                    if(effect[x][y] == 'G' && y != n
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        break;
                                    } 
                                    else if((effect[x][y] == 'W' || (effect[x][y] == 'G' && checko.checka(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        // checkong if he the KING is killed from the direction ↘
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy+1 , n = colcpy+1 ; m < 8 && n < 8 ; m++ , n++)
                        {
                            if(field[m][n] != 9819 && field[m][n] != 9821
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9819 || field[m][n] == 9821)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy+1 , y = colcpy+1 ; x <= m && y <= n ; x++, y++)
                                {   
                                    if(effect[x][y] == 'G' && x != m && y != n
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        break;
                                    } 
                                    else if((effect[x][y] == 'W' || (effect[x][y] == 'G' && checko.checka(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        // checkong if he the KING is killed from the direction ↓
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy+1 , n = colcpy ; m < 8 ; m++)
                        {
                            if(field[m][n] != 9819 && field[m][n] != 9820
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9819 || field[m][n] == 9820)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy+1 , y = colcpy ; x <= m ; x++ )
                                {   
                                    if(effect[x][y] == 'G' && x != m 
                                    && checko.checka(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        break;
                                    } 
                                    else if((effect[x][y] == 'B' || (effect[x][y] == 'G' && checko.checko(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        // checkong if he the KING is killed from the direction ↙
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy+1 , n = colcpy-1 ; m < 8 && n > -1 ; m++ , n--)
                        {
                            if(field[m][n] != 9819 && field[m][n] != 9821
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9819 || field[m][n] == 9821)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy+1 , y = colcpy-1 ; x <= m && y >= n ; x++ , y--)
                                {   
                                    if(effect[x][y] == 'G' && x != m && y != n
                                    && checko.checko(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        break;
                                    } 
                                    else if((effect[x][y] == 'B' || (effect[x][y] == 'G' && checko.checko(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                        // checkong if he the KING is killed from the direction ←
                        rowcpy = i ; colcpy = j ;
                        for(int m = rowcpy , n = colcpy-1 ; n > -1 ; n--)
                        {
                            if(field[m][n] != 9819 && field[m][n] != 9820
                                    && field[m][n] != 9946) 
                            {break;}
                            else if (field[m][n] == 9819 || field[m][n] == 9820)
                            {
                                rowcpy = i ; colcpy = j ;
                                for(int x = rowcpy , y = colcpy-1 ; y <= n ; y--)
                                {   
                                    if(effect[x][y] == 'G' && y != n
                                    && checko.checko(field, effect, x, y) == 2)
                                    {
                                        before = dead++; 
                                        
                                        break;
                                    } 
                                    else if((effect[x][y] == 'B' || (effect[x][y] == 'G' && checko.checko(field, effect, x, y) == 2))
                                    && x == m && y == n)
                                    {
                                        before = dead++; break;
                                    } 
                                }
                                if(before == dead){return 0;}
                                break ;
                            }
                        }
                    }
                    if(dead > 1){return 0;}
                    return decision ;
                }
            }}
        return 4 ;
    }
    public int permission (char field [][] , char effect [][] , int r1 , int r2 , char c1 , char c2)
    {
        
        if(field[r1][c1-97] == 9818)
        {
            if(r1 == r2 && Math.abs(c1-c2) == 2 && (c2 == 'c' || c2 == 'g'))
            {
                if(Darshjava.wking == 1 && Darshjava.wrock1 == 1 && c2 == 'c'
                        && effect[7][2] != 'G' && effect[7][2] != 'B' 
                        && effect[7][3] != 'G' && effect[7][3] != 'B'
                        && effect[7][4] != 'G' && effect[7][4] != 'B'
                        && field[7][2] == 9946 && field[7][3] == 9946)
                {
                    System.out.println("KING : Come on Rocky !, let's do our special move!");
                    field[7][3] = 9820 ;
                    field[7][2] = 9818 ;
                    field[7][0] = 9946 ;
                    field[7][4] = 9946 ;
                    Darshjava.wking = 0 ;
                }
                else if(Darshjava.wking == 1 && Darshjava.wrock2 == 1 && c2 == 'g'
                        && effect[7][6] != 'G' && effect[7][6] != 'B' 
                        && effect[7][5] != 'G' && effect[7][5] != 'B'
                        && effect[7][4] != 'G' && effect[7][4] != 'B'
                        && field[7][6] == 9946 && field[7][5] == 9946)
                {
                    System.out.println("KING : Come on Rocky !, let's do our special move!");
                    field[7][5] = 9820 ;
                    field[7][6] = 9818 ;
                    field[7][7] = 9946 ;
                    field[7][4] = 9946 ;
                    Darshjava.wking = 0 ;
                }
                else if(Darshjava.wking == 0)
                {
                    System.out.println("Sorry, you are not allowed to do it anymore as the KING was moved before, try again :)");
                }
                else if(Darshjava.wking == 1 && Darshjava.wrock1 == 0 )
                {
                    System.out.println("Sorry, you are not allowed to do it anymore as the left rock was moved before, try again :)");
                }
                else if(Darshjava.wking == 1 && Darshjava.wrock2 == 0 )
                {
                    System.out.println("Sorry, you are not allowed to do it anymore as the right rock was moved before, try again :)");
                }
                else if(field[7][2] != 9946 || field[7][3] !=9946)
                {
                    System.out.println("Sorry, there is an element that blocks the way for such a move, try again :)");
                }
                else if(c2 != 'c' && c2 != 'g')
                {
                    System.out.println("Sorry, this special move can only be done on the same row of the king and rock, Try again:)");
                }
            }
            else if((r1 == r2 && Math.abs(c1-c2) == 1) ||(c1 == c2 && Math.abs(r1-r2) == 1)
                    || (Math.abs(r1-r2) == 1 && Math.abs(c1-c2) == 1))
            {
            if(field[r2][c2-97] == 9820||field[r2][c2-97] == 9821 
                   || field[r2][c2-97] == 9819 || field[r2][c2-97] == 9823 || field[r2][c2-97] == 9822 )
            {
                System.out.println("Sorry, The KING can never kill any of his forces, Try agaion :)");
                return 2;
            }
            else if(effect[r2][c2-97] == 'G' || effect[r2][c2-97] == 'B' )
            {
                System.out.println("Sorry, The KING will be killed this way, Try agaion :)");
                return 3 ;
            }
            else 
            {
                Darshjava.wking = 0 ;
                // white king's reactions when moving 
                if(field[r2][c2-97] == 9946)
                    System.out.println("KING : Free the way for the KING!");
                else if(field[r2][c2-97] == 9813)
                    System.out.println("KING : I won't kill you lady don't worry, you will be a good servant won't you??");
                else if(field[r2][c2-97] == 9814)
                    System.out.println("KING : Just one touch and this wretched rock is over");
                else if(field[r2][c2-97] == 9815)
                    System.out.println("KING : WOW ! This wretched elephant was really gaint, I killed it anyway");
                else if(field[r2][c2-97] == 9816)
                    System.out.println("KING : WELL, one knight is captured and a horse is added to my own stable");
                else if(field[r2][c2-97] == 9817)
                    System.out.println("KING : You were too weak to fight, poor solider1");
                field[r2][c2-97] = 9818 ;
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
        else if(field[r1][c1-97] == 9812)
        {
            if(r1 == r2 && Math.abs(c1-c2) == 2 && (c2 == 'c' || c2 == 'g'))
            {
                if(Darshjava.bking == 1 && Darshjava.brock1 == 1 && c2 == 'c'
                        && effect[0][2] != 'G' && effect[0][2] != 'W' 
                        && effect[0][3] != 'G' && effect[0][3] != 'W'
                        && effect[0][4] != 'G' && effect[0][4] != 'W'
                        && field[0][2] == 9946 && field[0][3] == 9946)
                {
                    System.out.println("KING : Come on Rocky !, let's do our special move!");
                    field[0][3] = 9814 ;
                    field[0][2] = 9812 ;
                    field[0][0] = 9946 ;
                    field[0][4] = 9946 ;
                    Darshjava.bking = 0 ;
                }
                else if(Darshjava.bking == 1 && Darshjava.brock2 == 1 && c2 == 'g'
                        && effect[0][6] != 'G' && effect[0][6] != 'W' 
                        && effect[0][5] != 'G' && effect[0][5] != 'W'
                        && effect[0][4] != 'G' && effect[0][4] != 'W'
                        && field[0][6] == 9946 && field[0][5] == 9946)
                {
                    System.out.println("KING : Come on Rocky !, let's do our special move!");
                    field[0][5] = 9814 ;
                    field[0][6] = 9812 ;
                    field[0][7] = 9946 ;
                    field[0][4] = 9946 ;
                    Darshjava.bking = 0 ;
                }
                else if(Darshjava.bking == 0)
                {
                    System.out.println("Sorry, you are not allowed to do it anymore as the KING bas moved before, try again :)");
                }
                else if(Darshjava.bking == 1 && Darshjava.brock1 == 0 )
                {
                    System.out.println("Sorry, you are not allowed to do it anymore as the left rock bas moved before, try again :)");
                }
                else if(Darshjava.bking == 1 && Darshjava.brock2 == 0 )
                {
                    System.out.println("Sorry, you are not allowed to do it anymore as the right rock bas moved before, try again :)");
                }
                else if(field[0][2] != 9946 || field[0][3] !=9946)
                {
                    System.out.println("Sorry, there is an element that blocks the bay for such a move, try again :)");
                }
                else if(c2 != 'c' && c2 != 'g')
                {
                    System.out.println("Sorry, this special move can only be done on the same rob of the king and rock, Try again:)");
                }
            }
            else if((r1 == r2 && Math.abs(c1-c2) == 1) ||(c1 == c1 && Math.abs(r1-r2) == 1)
                    || (Math.abs(r1-r2) == 1 && Math.abs(c1-c2) == 1))
            {
            if(field[r2][c2-97] == 9813||field[r2][c2-97] == 9814 
                   || field[r2][c2-97] == 9815 || field[r2][c2-97] == 9816 || field[r2][c2-97] == 9817 )
            {
                System.out.println("Sorry, The KING can never kill any of his forces, Try agaion :)");
                return 2;
            }
            else if(effect[r2][c2-97] == 'G' || effect[r2][c2-97] == 'B' )
            {
                System.out.println("Sorry, The KING will be killed this way, Try agaion :)");
                return 3 ;
            }
            else 
            {
                // black king's reactions when moving 
                if(field[r2][c2-97] == 9946)
                    System.out.println("KING : Free the way for the KING!");
                else if(field[r2][c2-97] == 9819)
                    System.out.println("KING : I won't kill you lady don't worry, you will be a good servant won't you??");
                else if(field[r2][c2-97] == 9820)
                    System.out.println("KING : Just one touch and this wretched rock is over");
                else if(field[r2][c2-97] == 9821)
                    System.out.println("KING : WOW ! This wretched elephant was really gaint, I killed it anyway");
                else if(field[r2][c2-97] == 9822)
                    System.out.println("KING : WELL, one knight is captured and a horse is added to my own stable");
                else if(field[r2][c2-97] == 9823)
                    System.out.println("KING : You were too weak to fight, poor solider1");
                field[r2][c2-97] = 9812 ;
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
                if(field [i][j] == 9818 || field [i][j] == 9812)
                    {
                        // setting kings effect on the field 
                        
                        // 1 setting the 1st dierction ↖
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy-1 , n = colcpy-1 ; m > -1 && n > -1 ; m-- , n--)
                        {
                            
                            if(field [i][j] == 9818)
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
                                break ;
                            }
                            else if(field [i][j] == 9812)
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
                                break ;
                            }
                            
                        }
                        // 2 setting the 2nd dierction ↑
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy-1 , n = colcpy ; m > -1 ; m-- )
                        {
                            if(field [i][j] == 9818)
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
                                break ;
                            }
                            else if(field [i][j] == 9812)
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
                                break ;
                            }
                        }
                        // 3 setting the 3rd dierction ↗                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy-1 , n = colcpy+1 ; m > -1&& n < 8 ; m-- , n++)
                        {
                            if(field [i][j] == 9818)
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
                                break ;
                            }
                            else if(field [i][j] == 9812)
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
                                break ;
                            }
                        }
                        // 4 setting the 4th dierction →
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy , n = colcpy+1 ; n < 8 ; n++)
                        {
                            if(field [i][j] == 9818)
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
                                break ;
                            }
                            else if(field [i][j] == 9812)
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
                                break ;
                            }
                        }
                        // 5 setting the 5th dierction ↘
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy+1 , n = colcpy+1 ; m < 8 && n < 8 ; m++ , n++)
                        {
                            if(field [i][j] == 9818)
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
                                break ;
                            }
                            else if(field [i][j] == 9812)
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
                                break ;
                            }
                        }
                        // 6 setting the 6th dierction ↓
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy+1 , n = colcpy ; m < 8 ; m++ )
                        {
                            if(field [i][j] == 9818)
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
                                break ;
                            }
                            else if(field [i][j] == 9812)
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
                                break ;
                            }
                        }
                        // 7 setting the 7th dierction ↙
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy+1 , n = colcpy-1 ; m < 8 && n > -1 ; m++ , n--)
                        {
                            if(field [i][j] == 9818)
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
                                break ;
                            }
                            else if(field [i][j] == 9812)
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
                                break ;
                            }
                        }
                        // 8 setting the 8th dierction ←
                        rowcpy = i ; colcpy = j ;
                        for(m = rowcpy , n = colcpy-1 ; n > -1 ; n--)
                        {
                            if(field [i][j] == 9818)
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
                                break ;
                            }
                            else if(field [i][j] == 9812)
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
                                break ;
                            }
                        }
                    }
    }
}
