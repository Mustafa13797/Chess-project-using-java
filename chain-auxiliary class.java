
package darshjava;

public class chain {
    public int whitechain (char field [][] , char effect [][] , char lock [][])
    {
        int whitenum = 0 , whitechain = 0 
                , eight = 0 , outerfor = 0 , four = 0 , three = 0 ;
        for (int i = 0 ; i < 8 ; i++){
            for(int j = 0 ; j < 8 ; j++){
                if(field[i][j] == 9820 || field[i][j] == 9821 ||field[i][j] == 9818
                     || field[i][j] == 9819 || field[i][j] == 9823 || field[i][j] == 9822 )
                {   
                    whitenum++;
                    eight = four = three = 0 ;
                    if( field[i][j] == 9818 )
                    {
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
                    if(eight == 8){whitechain++; lock[i][j] = '&';}
                    }
                    else
                    {
                        outerfor = eight = four = three = 0 ;
                        if(field[i][j] != 9819 && field[i][j] != 9821){
                        // checking chain from direction ↖
                        for(int m = i-1 , n = j-1 ; m > -1 && n > -1 ; m-- , n--)
                        {
                            if(m == i-1 && n == j-1 && field[i][j] == 9823)
                            {
                                if(m > -1 && n > -1)
                                {
                                    if(field[m][n] == 9813 || field[m][n] == 9814 || 
                                    field[m][n] == 9815 || field[m][n] == 9816 || field[m][n] == 9817)
                                    {
                                        break ;
                                    }   
                                }  
                            }
                            else if(field[m][n] != 9946 && (field[m][n] == 9813 || field[m][n] == 9815))
                            {
                                for(m = i+1 , n = j+1 ; m < 8 && n < 8 ; m++ , n++)
                                {
                                    if(field[m][n] != 9946 && field[m][n] == 9818)
                                    {
                                        whitechain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9818) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9813 && field[m][n] != 9815)
                            {break;}
                        }
                        // checking chain from direction ↗
                        if(outerfor == 0)
                        {
                        for(int m = i-1 , n = j+1 ; m > -1 && n < 8 ; m-- , n++)
                        {   
                            if(m == i-1 && n == j+1 && field[i][j] == 9823)
                            {
                                if(m > -1 && n < 8)
                                {
                                    if(field[m][n] == 9813 || field[m][n] == 9814 || 
                                    field[m][n] == 9815 || field[m][n] == 9816 || field[m][n] == 9817)
                                    {
                                        break ;
                                    }   
                                }  
                            }
                            else if(field[m][n] != 9946 && (field[m][n] == 9813 || field[m][n] == 9815))
                            {   
                                for(m = i+1 , n = j-1 ; m < 8 && n > -1 ; m++ , n--)
                                {   
                                    if(field[m][n] != 9946 && field[m][n] == 9818)
                                    {
                                        whitechain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9818) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9813 && field[m][n] != 9815)
                            {break;}
                        }
                        }
                        // checking chain from direction ↘
                        if(outerfor == 0)
                        {
                        for(int m = i+1 , n = j+1 ; m < 8 && n < 8 ; m++ , n++)
                        {
                            if(field[m][n] != 9946 && (field[m][n] == 9813 || field[m][n] == 9815))
                            {
                                for(m = i-1 , n = j-1 ; m > -1 && n > -1 ; m--, n--)
                                {
                                    if(field[m][n] != 9946 && field[m][n] == 9818)
                                    {
                                        whitechain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9818) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9813 && field[m][n] != 9815)
                            {break;}
                        }
                        }
                        // checking chain from direction ↙
                        if(outerfor == 0)
                        {
                        for(int m = i+1 , n = j-1 ; m < 8 && n > -1 ; m++ , n--)
                        {
                            if(field[m][n] != 9946 && (field[m][n] == 9813 || field[m][n] == 9815))
                            {
                                for( m = i-1 , n = j+1 ; m > -1 && n < 8 ; m-- , n++)
                                {
                                    if(field[m][n] != 9946 && field[m][n] == 9818)
                                    {
                                        whitechain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9818) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9813 && field[m][n] != 9815)
                            {break;}
                        }
                        }
                        }
                        if(field[i][j] != 9819 && field[i][j] != 9820){
                        // checking chain from direction ↑
                        if(outerfor == 0)
                        {
                        for(int m = i-1 , n = j ; m > -1 ; m-- )
                        {
                            if(field[i][j] != 9823)
                            {
                            if(field[m][n] != 9946 && (field[m][n] == 9813 || field[m][n] == 9814))
                            {
                                for(m = i+1 , n = j ; m < 8 ; m++ )
                                {
                                    if(field[m][n] != 9946 && field[m][n] == 9818)
                                    {
                                        whitechain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9818) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9813 && field[m][n] != 9814)
                            {break;}
                            }
                        }
                        }
                        // checkong chain from the direction →
                        if(outerfor == 0)
                        {
                        for(int m = i , n = j+1 ; n < 8 ; n++)
                        {
                            if(field[m][n] != 9946 && (field[m][n] == 9813 || field[m][n] == 9814))
                            {
                                for(m = i , n = j-1 ; n > -1 ; n--)
                                {
                                    if(field[m][n] != 9946 && field[m][n] == 9818)
                                    {
                                        whitechain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9818) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9813 && field[m][n] != 9814)
                            {break;}
                        }
                        }
                        // checking chain from direction ↓
                        if(outerfor == 0)
                        {
                        for(int m = i+1 , n = j ; m < 8 ; m++ )
                        {
                            if(field[m][n] != 9946 && (field[m][n] == 9813 || field[m][n] == 9814))
                            {
                                
                            for( m = i-1 , n = j ; m > -1 ; m-- )
                                {
                                    if(field[m][n] != 9946 && field[m][n] == 9818)
                                    {
                                        whitechain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9818) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9813 && field[m][n] != 9814)
                            {break;}
                        }
                        }
                        // checkong chain from the direction ←
                        if(outerfor == 0)
                        { 
                        for(int m = i , n = j-1 ; n > -1 ; n--)
                        {
                            
                            if(field[m][n] != 9946 && (field[m][n] == 9813 || field[m][n] == 9814))
                            {   
                                for( m = i , n = j+1 ; n < 8 ; n++)
                                {   
                                    if(field[m][n] != 9946 && field[m][n] == 9818)
                                    {   
                                        whitechain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9818) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9813 && field[m][n] != 9814)
                            {break;}
                        }
                        }
                        }
                        ////// checking specail chains for chess elements
                    if(outerfor == 0)
                    {
                    if(field[i][j] == 9819)
                    {
                    // checking if the eight squares around the Queen are forbidden  
                    if(i-1 > -1 && j-1 > -1)
                    {
                        if( field[i-1][j-1] == 9818 || field[i-1][j-1] == 9819
                                ||  field[i-1][j-1] == 9820 || field[i-1][j-1] == 9821 
                                ||  field[i-1][j-1] == 9822 ||  field[i-1][j-1] == 9823 )
                        {eight++ ;}
                    }
                    else { eight++ ; }
                    if(i-1 > -1 )
                    {
                        if( field[i-1][j] == 9818 || field[i-1][j] == 9819
                                ||  field[i-1][j] == 9820 || field[i-1][j] == 9821 
                                ||  field[i-1][j] == 9822 ||  field[i-1][j] == 9823 )
                        { eight++ ;}
                    }
                    else { eight++ ; }
                    if(i-1 > -1 && j+1 < 8)
                    {
                        if( field[i-1][j+1] == 9818 || field[i-1][j+1] == 9819
                                ||  field[i-1][j+1] == 9820 || field[i-1][j+1] == 9821 
                                ||  field[i-1][j+1] == 9822 ||  field[i-1][j+1] == 9823 )
                        { eight++ ; }
                    }
                    else { eight++ ; }
                    
                    if(j+1 < 8){ 
                        if( field[i][j+1] == 9818 || field[i][j+1] == 9819
                                ||  field[i][j+1] == 9820 || field[i][j+1] == 9821 
                                ||  field[i][j+1] == 9822 ||  field[i][j+1] == 9823 )
                        {eight++ ;}}
                    else { eight++ ; }
                    if(i+1 < 8 && j+1 < 8){
                        if( field[i+1][j+1] == 9818 || field[i+1][j+1] == 9819
                                ||  field[i+1][j+1] == 9820 || field[i+1][j+1] == 9821 
                                ||  field[i+1][j+1] == 9822 ||  field[i+1][j+1] == 9823 )
                        {eight++ ;}}
                    else { eight++ ; }
                    if(i+1 < 8){
                        if( field[i+1][j] == 9818 || field[i+1][j] == 9819
                                ||  field[i+1][j] == 9820 || field[i+1][j] == 9821 
                                ||  field[i+1][j] == 9822 ||  field[i+1][j] == 9823 )
                        { eight++ ;}}
                    else { eight++ ; }
                    if(i+1 < 8 &&  j-1 > -1){
                        if( field[i+1][j-1] == 9818 || field[i+1][j-1] == 9819
                                ||  field[i+1][j-1] == 9820 || field[i+1][j-1] == 9821 
                                ||  field[i+1][j-1] == 9822 ||  field[i+1][j-1] == 9823 )
                        {eight++ ;}}
                    else { eight++ ; }
                    if(j-1 > -1) {
                        if( field[i][j-1] == 9818 || field[i][j-1] == 9819
                                ||  field[i][j-1] == 9820 || field[i][j-1] == 9821 
                                ||  field[i][j-1] == 9822 ||  field[i][j-1] == 9823 )
                        {eight++ ;}}
                    else { eight++ ; }
                    if(eight == 8)
                    {whitechain++; lock[i][j] = '&';}
                    }
                    else if(field[i][j] == 9820)
                            {
                    // checking if the four squares around the ROCK are forbidden  
                    
                    if(i-1 > -1 )
                    {
                        if( field[i-1][j] == 9818 || field[i-1][j] == 9819
                                ||  field[i-1][j] == 9820 || field[i-1][j] == 9821 
                                ||  field[i-1][j] == 9822 ||  field[i-1][j] == 9823 )
                        { four++ ;}
                    }
                    else { four++ ; }
                    
                    if(j+1 < 8){ 
                        if( field[i][j+1] == 9818 || field[i][j+1] == 9819
                                ||  field[i][j+1] == 9820 || field[i][j+1] == 9821 
                                ||  field[i][j+1] == 9822 ||  field[i][j+1] == 9823 )
                        {four++ ;}}
                    else { four++ ; }
                    
                    if(i+1 < 8){
                        if( field[i+1][j] == 9818 || field[i+1][j] == 9819
                                ||  field[i+1][j] == 9820 || field[i+1][j] == 9821 
                                ||  field[i+1][j] == 9822 ||  field[i+1][j] == 9823 )
                        { four++ ;}}
                    else { four++ ; }
                    
                    if(j-1 > -1) {
                        if( field[i][j-1] == 9818 || field[i][j-1] == 9819
                                ||  field[i][j-1] == 9820 || field[i][j-1] == 9821 
                                ||  field[i][j-1] == 9822 ||  field[i][j-1] == 9823 )
                        {four++ ;}}
                    else { four++ ; }
                   
                    if(four == 4)
                    {whitechain++; lock[i][j] = '&';}
                    }
                    else if(field[i][j] == 9821)
                    {
                    // checking if the four squares around the ELEPHANT are forbidden  
                    if(i-1 > -1 && j-1 > -1)
                    {
                        if( field[i-1][j-1] == 9818 || field[i-1][j-1] == 9819
                                ||  field[i-1][j-1] == 9820 || field[i-1][j-1] == 9821 
                                ||  field[i-1][j-1] == 9822 ||  field[i-1][j-1] == 9823 )
                        {four++ ;}
                    }
                    else { four++ ; }
                    
                    if(i-1 > -1 && j+1 < 8)
                    {
                        if( field[i-1][j+1] == 9818 || field[i-1][j+1] == 9819
                                ||  field[i-1][j+1] == 9820 || field[i-1][j+1] == 9821 
                                ||  field[i-1][j+1] == 9822 ||  field[i-1][j+1] == 9823 )
                        { four++ ; }
                    }
                    else { four++ ; }
                    
                    
                    if(i+1 < 8 && j+1 < 8){
                        if( field[i+1][j+1] == 9818 || field[i+1][j+1] == 9819
                                ||  field[i+1][j+1] == 9820 || field[i+1][j+1] == 9821 
                                ||  field[i+1][j+1] == 9822 ||  field[i+1][j+1] == 9823 )
                        {four++ ;}}
                    else { four++ ; }
                    
                    if(i+1 < 8 &&  j-1 > -1){
                        if( field[i+1][j-1] == 9818 || field[i+1][j-1] == 9819
                                ||  field[i+1][j-1] == 9820 || field[i+1][j-1] == 9821 
                                ||  field[i+1][j-1] == 9822 ||  field[i+1][j-1] == 9823 )
                        {four++ ;}}
                    else { four++ ; }
                   
                    if(four == 4)
                    {whitechain++; lock[i][j] = '&';}
                    }
                    else if(field[i][j] == 9822)
                    {
                    // checking if the eight squares around the HORSE are forbidden 
                        if(i-2 > -1 && j-1 > -1){
                        if( field[i-2][j-1] == 9818 || field[i-2][j-1] == 9819
                                ||  field[i-2][j-1] == 9820 || field[i-2][j-1] == 9821 
                                ||  field[i-2][j-1] == 9822 ||  field[i-2][j-1] == 9823 )
                        {eight++ ;}}
                        else {eight++ ;}
                        
                        if(i-1 > -1 && j-2 > -1){
                            if( field[i-1][j-2] == 9818 || field[i-1][j-2] == 9819
                                ||  field[i-1][j-2] == 9820 || field[i-1][j-2] == 9821 
                                ||  field[i-1][j-2] == 9822 ||  field[i-1][j-2] == 9823 )
                            {eight++ ;}}
                        else {eight++ ;}
                        
                        if(i-2 > -1 && j+1 < 8){
                            if( field[i-2][j+1] == 9818 || field[i-2][j+1] == 9819
                                ||  field[i-2][j+1] == 9820 || field[i-2][j+1] == 9821 
                                ||  field[i-2][j+1] == 9822 ||  field[i-2][j+1] == 9823 )
                            {eight++ ;}}
                        else {eight++ ;}
                        
                        if(i-1 > -1 && j+2 < 8){
                            if( field[i-1][j+2] == 9818 || field[i-1][j+2] == 9819
                                ||  field[i-1][j+2] == 9820 || field[i-1][j+2] == 9821 
                                ||  field[i-1][j+2] == 9822 ||  field[i-1][j+2] == 9823 )
                            {eight++ ;}}
                        else {eight++ ;}
                        
                        if(i+2 < 8 && j+1 < 8){
                            if( field[i+2][j+1] == 9819 || field[i+2][j+1] == 9820
                                ||  field[i+2][j+1] == 9818 || field[i+2][j+1] == 9821 
                                ||  field[i+2][j+1] == 9822 ||  field[i+2][j+1] == 9823 )
                            {eight++ ;}}
                        else {eight++ ;}
                        
                        if(i+1 < 8 && j+2 < 8){
                            if( field[i+1][j+2] == 9818 || field[i+1][j+2] == 9819
                                ||  field[i+1][j+2] == 9821 || field[i+1][j+2] == 9822 
                                ||  field[i+1][j+2] == 9820 ||  field[i+1][j+2] == 9823 )
                            {eight++ ;}}
                        else {eight++ ;}
                        
                        if(i+2 < 8 && j-1 > -1){
                            if( field[i+2][j-1] == 9818 || field[i+2][j-1] == 9819
                                ||  field[i+2][j-1] == 9820 || field[i+2][j-1] == 9821 
                                ||  field[i+2][j-1] == 9822 ||  field[i+2][j-1] == 9823 )
                            {eight++ ;}}
                        else {eight++ ;}
                        
                        if(i+1 < 8 && j-2 > -1){
                            if( field[i+1][j-2] == 9818 || field[i+1][j-2] == 9819
                                ||  field[i+1][j-2] == 9820 || field[i+1][j-2] == 9821 
                                ||  field[i+1][j-2] == 9822 ||  field[i+1][j-2] == 9823 )
                            {eight++ ;}}
                        else {eight++ ;}
                        
                        if(eight == 8)
                        {whitechain++; lock[i][j] = '&';}
                    }
                    // checking if the 3 squares around the SOLIDER are forbidden 
                    else if(field[i][j] == 9823)
                    {
                        if(i-1 > -1 && j-1 > -1)
                        {
                            if(field[i-1][j-1] != 9946 &&
                                (field[i-1][j-1] == 9819 || field[i-1][j-1] == 9822 ||
                                field[i-1][j-1] == 9820 || field[i-1][j-1] == 9823 ||
                                field[i-1][j-1] == 9821 || field[i-1][j+1] == 9818))
                            {three++;}
                            else if(field[i-1][j-1] == 9946){three++;}
                        }
                        else {three++;}
                        if(i-1 > -1 && j+1 < 8)
                        {
                            if(field[i-1][j+1] != 9946 &&
                                (field[i-1][j+1] == 9819 || field[i-1][j+1] == 9822 ||
                                field[i-1][j+1] == 9820 || field[i-1][j+1] == 9823 ||
                                field[i-1][j+1] == 9821 ||field[i-1][j+1] == 9818 ))
                            {three++;}
                            else if(field[i-1][j+1] == 9946){three++;}
                        }
                        else {three++;}
                        if(i-1 > -1)
                        {
                            if(field[i-1][j] != 9946)
                            {three++;}
                            
                        }
                        else {three++;}
                        
                        if(three == 3){whitechain++; lock[i][j] = '&';}
                    }
                    }
                    }
                    
                }
            }
        }
        
        if(whitenum == whitechain){return 1;}
        return 0 ;
    }
    public int blackchain (char field [][] , char effect [][] , char lock [][])
    {
        int blacknum = 0 , blackchain = 0 
                , eight = 0 , outerfor = 0 , four = 0 , three = 0 ;
        for (int i = 0 ; i < 8 ; i++){
            for(int j = 0 ; j < 8 ; j++){
                if(field[i][j] == 9814 || field[i][j] == 9815 ||field[i][j] == 9812
                     || field[i][j] == 9813 || field[i][j] == 9817 || field[i][j] == 9816 )
                {   
                    blacknum++;
                    eight = four = three = 0 ;
                    if( field[i][j] == 9812 )
                    {
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
                    if(eight == 8){blackchain++; lock[i][j] = '&';}
                    }
                    else
                    {
                        outerfor = eight = four = three = 0 ;
                        if(field[i][j] != 9813 && field[i][j] != 9815){
                        // checking chain from direction ↖
                        for(int m = i-1 , n = j-1 ; m > -1 && n > -1 ; m-- , n--)
                        {
                            if(field[m][n] != 9946 && (field[m][n] == 9819 || field[m][n] == 9821))
                            {
                                for(m = i+1 , n = j+1 ; m < 8 && n < 8 ; m++ , n++)
                                {
                                    if(field[m][n] != 9946 && field[m][n] == 9812)
                                    {
                                        blackchain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9812) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9819 && field[m][n] != 9821)
                            {break;}
                        }
                        // checking chain from direction ↗
                        if(outerfor == 0)
                        {
                        for(int m = i-1 , n = j+1 ; m > -1 && n < 8 ; m-- , n++)
                        {   
                            if(field[m][n] != 9946 && (field[m][n] == 9819 || field[m][n] == 9821))
                            {   
                                for(m = i+1 , n = j-1 ; m < 8 && n > -1 ; m++ , n--)
                                {   
                                    if(field[m][n] != 9946 && field[m][n] == 9812)
                                    {
                                        blackchain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9812) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9819 && field[m][n] != 9821)
                            {break;}
                        }
                        }
                        // checking chain from direction ↘
                        if(outerfor == 0)
                        {
                        for(int m = i+1 , n = j+1 ; m < 8 && n < 8 ; m++ , n++)
                        {
                            if(m == i+1 && n == j+1 && field[i][j] == 9817)
                            {
                                if(m < 8 && n < 8)
                                {
                                    if(field[m][n] == 9819 || field[m][n] == 9820 || 
                                    field[m][n] == 9821 || field[m][n] == 9822 || field[m][n] == 9823)
                                    {
                                        break ;
                                    }   
                                }  
                            }
                            else if(field[m][n] != 9946 && (field[m][n] == 9819 || field[m][n] == 9821))
                            {
                                for(m = i-1 , n = j-1 ; m > -1 && n > -1 ; m--, n--)
                                {
                                    if(field[m][n] != 9946 && field[m][n] == 9812)
                                    {
                                        blackchain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9812) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9819 && field[m][n] != 9821)
                            {break;}
                        }
                        }
                        // checking chain from direction ↙
                        if(outerfor == 0)
                        {
                        for(int m = i+1 , n = j-1 ; m < 8 && n > -1 ; m++ , n--)
                        {
                            if(m == i+1 && n == j-1 && field[i][j] == 9817)
                            {
                                if(m < 8 && n > -1)
                                {
                                    if(field[m][n] == 9819 || field[m][n] == 9820 || 
                                    field[m][n] == 9821 || field[m][n] == 9822 || field[m][n] == 9823)
                                    {
                                        break ;
                                    }   
                                }  
                            }
                            else if(field[m][n] != 9946 && (field[m][n] == 9819 || field[m][n] == 9821))
                            {
                                for( m = i-1 , n = j+1 ; m > -1 && n < 8 ; m-- , n++)
                                {
                                    if(field[m][n] != 9946 && field[m][n] == 9812)
                                    {
                                        blackchain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9812) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9819 && field[m][n] != 9821)
                            {break;}
                        }
                        }
                        }
                        if(field[i][j] != 9813 && field[i][j] != 9814){
                        // checking chain from direction ↑
                        if(outerfor == 0)
                        {
                        for(int m = i-1 , n = j ; m > -1 ; m-- )
                        {
                           
                            if(field[m][n] != 9946 && (field[m][n] == 9819 || field[m][n] == 9820))
                            {
                                for(m = i+1 , n = j ; m < 8 ; m++ )
                                {
                                    if(field[m][n] != 9946 && field[m][n] == 9812)
                                    {
                                        blackchain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9812) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9819 && field[m][n] != 9820)
                            {break;}
                            
                        }
                        }
                        // checkong chain from the direction →
                        if(outerfor == 0)
                        {
                        for(int m = i , n = j+1 ; n < 8 ; n++)
                        {
                            if(field[m][n] != 9946 && (field[m][n] == 9819|| field[m][n] == 9820))
                            {
                                for(m = i , n = j-1 ; n > -1 ; n--)
                                {
                                    if(field[m][n] != 9946 && field[m][n] == 9812)
                                    {
                                        blackchain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9812) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9819 && field[m][n] != 9820)
                            {break;}
                        }
                        }
                        // checking chain from direction ↓
                        if(outerfor == 0)
                        {
                        if(field[i][j] != 9817)
                        {
                        for(int m = i+1 , n = j ; m < 8 ; m++ )
                        {
                            if(field[m][n] != 9946 && (field[m][n] == 9819 || field[m][n] == 9820))
                            {
                                
                            for( m = i-1 , n = j ; m > -1 ; m-- )
                                {
                                    if(field[m][n] != 9946 && field[m][n] == 9812)
                                    {
                                        blackchain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9812) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9819 && field[m][n] != 9820)
                            {break;}
                        }
                        }
                        }
                        // checkong chain from the direction ←
                        if(outerfor == 0)
                        { 
                        for(int m = i , n = j-1 ; n > -1 ; n--)
                        {
                            
                            if(field[m][n] != 9946 && (field[m][n] == 9819 || field[m][n] == 9820))
                            {   
                                for( m = i , n = j+1 ; n < 8 ; n++)
                                {   
                                    if(field[m][n] != 9946 && field[m][n] == 9812)
                                    {   System.out.println("action");
                                        blackchain++; lock[i][j] = '&';
                                        outerfor = 1 ;
                                        break ;
                                    }
                                    else if(field[m][n] != 9946 && field[m][n] != 9812) {break ;}
                                }
                            }
                            else if(field[m][n] != 9946 && field[m][n] != 9819 && field[m][n] != 9820)
                            {break;}
                        }
                        }
                        }
                        ////// checking specail chains for chess elements
                    if(outerfor == 0)
                    {
                    if(field[i][j] == 9813)
                    {
                    // checking if the eight squares around the Queen are forbidden  
                    if(i-1 > -1 && j-1 > -1)
                    {
                        if( field[i-1][j-1] == 9812 || field[i-1][j-1] == 9813
                                ||  field[i-1][j-1] == 9814 || field[i-1][j-1] == 9815 
                                ||  field[i-1][j-1] == 9816 ||  field[i-1][j-1] == 9817 )
                        {eight++ ;}
                    }
                    else { eight++ ; }
                    if(i-1 > -1 )
                    {
                        if( field[i-1][j] == 9812 || field[i-1][j] == 9813
                                ||  field[i-1][j] == 9814 || field[i-1][j] == 9815 
                                ||  field[i-1][j] == 9816 ||  field[i-1][j] == 9817 )
                        { eight++ ;}
                    }
                    else { eight++ ; }
                    if(i-1 > -1 && j+1 < 8)
                    {
                        if( field[i-1][j+1] == 9812 || field[i-1][j+1] == 9813
                                ||  field[i-1][j+1] == 9814 || field[i-1][j+1] == 9815 
                                ||  field[i-1][j+1] == 9816 ||  field[i-1][j+1] == 9817 )
                        { eight++ ; }
                    }
                    else { eight++ ; }
                    
                    if(j+1 < 8){ 
                        if( field[i][j+1] == 9812 || field[i][j+1] == 9813
                                ||  field[i][j+1] == 9814 || field[i][j+1] == 9815 
                                ||  field[i][j+1] == 9816 ||  field[i][j+1] == 9817 )
                        {eight++ ;}}
                    else { eight++ ; }
                    if(i+1 < 8 && j+1 < 8){
                        if( field[i+1][j+1] == 9812 || field[i+1][j+1] == 9813
                                ||  field[i+1][j+1] == 9814 || field[i+1][j+1] == 9815 
                                ||  field[i+1][j+1] == 9816 ||  field[i+1][j+1] == 9817 )
                        {eight++ ;}}
                    else { eight++ ; }
                    if(i+1 < 8){
                        if( field[i+1][j] == 9812 || field[i+1][j] == 9813
                                ||  field[i+1][j] == 9814 || field[i+1][j] == 9815 
                                ||  field[i+1][j] == 9816 ||  field[i+1][j] == 9817 )
                        { eight++ ;}}
                    else { eight++ ; }
                    if(i+1 < 8 &&  j-1 > -1){
                        if( field[i+1][j-1] == 9812 || field[i+1][j-1] == 9813
                                ||  field[i+1][j-1] == 9814 || field[i+1][j-1] == 9815 
                                ||  field[i+1][j-1] == 9816 ||  field[i+1][j-1] == 9817 )
                        {eight++ ;}}
                    else { eight++ ; }
                    if(j-1 > -1) {
                        if( field[i][j-1] == 9812 || field[i][j-1] == 9813
                                ||  field[i][j-1] == 9814 || field[i][j-1] == 9815 
                                ||  field[i][j-1] == 9816 ||  field[i][j-1] == 9817 )
                        {eight++ ;}}
                    else { eight++ ; }
                    if(eight == 8)
                    {blackchain++; lock[i][j] = '&';}
                    }
                    else if(field[i][j] == 9814)
                            {
                    // checking if the four squares around the ROCK are forbidden  
                    
                    if(i-1 > -1 )
                    {
                        if( field[i-1][j] == 9812 || field[i-1][j] == 9813
                                ||  field[i-1][j] == 9814 || field[i-1][j] == 9815 
                                ||  field[i-1][j] == 9816 ||  field[i-1][j] == 9817 )
                        { four++ ;}
                    }
                    else { four++ ; }
                    
                    if(j+1 < 8){ 
                        if( field[i][j+1] == 9812 || field[i][j+1] == 9813
                                ||  field[i][j+1] == 9814 || field[i][j+1] == 9815 
                                ||  field[i][j+1] == 9816 ||  field[i][j+1] == 9817 )
                        {four++ ;}}
                    else { four++ ; }
                    
                    if(i+1 < 8){
                        if( field[i+1][j] == 9812 || field[i+1][j] == 9813
                                ||  field[i+1][j] == 9814 || field[i+1][j] == 9815 
                                ||  field[i+1][j] == 9816 ||  field[i+1][j] == 9817 )
                        { four++ ;}}
                    else { four++ ; }
                    
                    if(j-1 > -1) {
                        if( field[i][j-1] == 9812 || field[i][j-1] == 9813
                                ||  field[i][j-1] == 9814 || field[i][j-1] == 9815 
                                ||  field[i][j-1] == 9816 ||  field[i][j-1] == 9817 )
                        {four++ ;}}
                    else { four++ ; }
                    if(four == 4)
                    {blackchain++; lock[i][j] = '&';}
                    }
                    else if(field[i][j] == 9815)
                    {
                    // checking if the four squares around the ELEPHANT are forbidden  
                    if(i-1 > -1 && j-1 > -1)
                    {
                        if( field[i-1][j-1] == 9812 || field[i-1][j-1] == 9813
                                ||  field[i-1][j-1] == 9814 || field[i-1][j-1] == 9815 
                                ||  field[i-1][j-1] == 9816 ||  field[i-1][j-1] == 9817 )
                        {four++ ;}
                    }
                    else { four++ ; }
                    
                    if(i-1 > -1 && j+1 < 8)
                    {
                        if( field[i-1][j+1] == 9812 || field[i-1][j+1] == 9813
                                ||  field[i-1][j+1] == 9814 || field[i-1][j+1] == 9815 
                                ||  field[i-1][j+1] == 9816 ||  field[i-1][j+1] == 9817 )
                        { four++ ; }
                    }
                    else { four++ ; }
                    
                    
                    if(i+1 < 8 && j+1 < 8){
                        if( field[i+1][j+1] == 9812 || field[i+1][j+1] == 9813
                                ||  field[i+1][j+1] == 9814 || field[i+1][j+1] == 9815 
                                ||  field[i+1][j+1] == 9816 ||  field[i+1][j+1] == 9817 )
                        {four++ ;}}
                    else { four++ ; }
                    
                    if(i+1 < 8 &&  j-1 > -1){
                        if( field[i+1][j-1] == 9812 || field[i+1][j-1] == 9813
                                ||  field[i+1][j-1] == 9814 || field[i+1][j-1] == 9815 
                                ||  field[i+1][j-1] == 9816 ||  field[i+1][j-1] == 9817 )
                        {four++ ;}}
                    else { four++ ; }
                    if(four == 4)
                    {blackchain++; lock[i][j] = '&';}
                    }
                    else if(field[i][j] == 9816)
                    {
                    // checking if the eight squares around the HORSE are forbidden 
                        if(i-2 > -1 && j-1 > -1){
                        if( field[i-2][j-1] == 9812 || field[i-2][j-1] == 9813
                                ||  field[i-2][j-1] == 9814 || field[i-2][j-1] == 9815 
                                ||  field[i-2][j-1] == 9816 ||  field[i-2][j-1] == 9817 )
                        {eight++ ;}}
                        else {eight++ ;}
                      
                        if(i-1 > -1 && j-2 > -1){
                            if( field[i-1][j-2] == 9812 || field[i-1][j-2] == 9813
                                ||  field[i-1][j-2] == 9814 || field[i-1][j-2] == 9815 
                                ||  field[i-1][j-2] == 9816 ||  field[i-1][j-2] == 9817 )
                            {eight++ ;}}
                        else {eight++ ;}
                      
                        if(i-2 > -1 && j+1 < 8){
                            if( field[i-2][j+1] == 9812 || field[i-2][j+1] == 9813
                                ||  field[i-2][j+1] == 9814 || field[i-2][j+1] == 9815 
                                ||  field[i-2][j+1] == 9816 ||  field[i-2][j+1] == 9817 )
                            {eight++ ;}}
                        else {eight++ ;}
                        
                        if(i-1 > -1 && j+2 < 8){
                            if( field[i-1][j+2] == 9812 || field[i-1][j+2] == 9813
                                ||  field[i-1][j+2] == 9814 || field[i-1][j+2] == 9815 
                                ||  field[i-1][j+2] == 9816 ||  field[i-1][j+2] == 9817 )
                            {eight++ ;}}
                        else {eight++ ;}
                        
                        if(i+2 < 8 && j+1 < 8){
                            if( field[i+2][j+1] == 9813 || field[i+2][j+1] == 9814
                                ||  field[i+2][j+1] == 9812 || field[i+2][j+1] == 9815 
                                ||  field[i+2][j+1] == 9816 ||  field[i+2][j+1] == 9817 )
                            {eight++ ;}}
                        else {eight++ ;}
                        
                        if(i+1 < 8 && j+2 < 8){
                            if( field[i+1][j+2] == 9812 || field[i+1][j+2] == 9813
                                ||  field[i+1][j+2] == 9815 || field[i+1][j+2] == 9816 
                                ||  field[i+1][j+2] == 9814 ||  field[i+1][j+2] == 9817 )
                            {eight++ ;}}
                        else {eight++ ;}

                        if(i+2 < 8 && j-1 > -1){
                            if( field[i+2][j-1] == 9812 || field[i+2][j-1] == 9813
                                ||  field[i+2][j-1] == 9814 || field[i+2][j-1] == 9815 
                                ||  field[i+2][j-1] == 9816 ||  field[i+2][j-1] == 9817 )
                            {eight++ ;}}
                        else {eight++ ;}
                        
                        if(i+1 < 8 && j-2 > -1){
                            if( field[i+1][j-2] == 9812 || field[i+1][j-2] == 9813
                                ||  field[i+1][j-2] == 9814 || field[i+1][j-2] == 9815 
                                ||  field[i+1][j-2] == 9816 ||  field[i+1][j-2] == 9817 )
                            {eight++ ;}}
                        else {eight++ ;}
                        
                        if(eight == 8)
                        {blackchain++; lock[i][j] = '&';}
                    }
                    // checking if the 3 squares around the SOLIDER are forbidden 
                    else if(field[i][j] == 9817)
                    {
                        if(i+1 < 8 && j-1 > -1)
                        {
                            if(field[i+1][j-1] != 9946 &&
                                (field[i+1][j-1] == 9813 || field[i+1][j-1] == 9816 ||
                                field[i+1][j-1] == 9814 || field[i+1][j-1] == 9817 ||
                                field[i+1][j-1] == 9815 || field[i+1][j+1] == 9812))
                            {three++;}
                            else if(field[i+1][j-1] == 9946){three++;}
                        }
                        else {three++;}
                        if(i+1 < 8  && j+1 < 8)
                        {
                            if(field[i+1][j+1] != 9946 &&
                                (field[i+1][j+1] == 9813 || field[i+1][j+1] == 9816 ||
                                field[i+1][j+1] == 9814 || field[i+1][j+1] == 9817 ||
                                field[i+1][j+1] == 9815 ||field[i+1][j+1] == 9812 ))
                            {three++;}
                            else if(field[i+1][j+1] == 9946){three++;}
                        }
                        else {three++;}
                        if(i+1 < 8)
                        {
                            if(field[i+1][j] != 9946)
                            {three++;}
                            
                        }
                        else {three++;}
                        
                        if(three == 3){blackchain++; lock[i][j] = '&';}
                    }
                    }
                    }
                    
                }
            }
        }
        
        if(blacknum == blackchain){return 1;}
        return 0 ;
    }
}
