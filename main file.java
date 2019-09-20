package darshjava;

import java.util.*;

public class Darshjava 
{  
    // king rock special move
    public static int wking = 1 , wrock1 = 1 , wrock2 = 1 ;
    public static int bking = 1 , brock1 = 1 , brock2 = 1 ;
    public static void main(String args [])
    {   
        Scanner enter = new Scanner (System.in) ; 
        // pieces objects initialization 
        SOLIDER sold = new SOLIDER() ;
        KING king = new KING() ;
        QUEEN queen = new QUEEN() ;
        HORSE horse = new HORSE() ;
        ELEPHANT elephant = new ELEPHANT() ;
        ROCK rock = new ROCK() ;
        // control coordinates
        char firstcol = 0 , secondcol = 0;
        int firstrow = 0 , secondrow = 0 ;
        // license to make an actual move , turn organizer 
        int licence = 0 , turn = 1 ;
        // chess field array
        char chess [][] =
        {
            { 9814 , 9816 , 9815 , 9813 , 9812 , 9815 , 9816 , 9814 }, 
            { 9817 , 9817 , 9817 , 9817 , 9817 , 9817 , 9817 , 9817 },
            { 9946 , 9946 , 9946 , 9946 , 9946 , 9946 , 9946 , 9946 },
            { 9946 , 9946 , 9946 , 9946 , 9946 , 9946 , 9946 , 9946 },
            { 9946 , 9946 , 9946 , 9946 , 9946 , 9946 , 9946 , 9946 },
            { 9946 , 9946 , 9946 , 9946 , 9946 , 9946 , 9946 , 9946 },
            { 9823 , 9823 , 9823 , 9823 , 9823 , 9823 , 9823 , 9823 },
            { 9820 , 9822 , 9821 , 9819 , 9818 , 9821 , 9822 , 9820 }
        };
        // 5 a 5 a
        // chess pieces' power effect
        char effect [] [] = new char [8][8] ;
        // chess pieces' locks 
        char lock [] [] = new char [8][8] ;
        // Pieces effect field to adjust the code till the end
        for (int i = 0 ; i < 8 ; i++)
            for(int j = 0 ; j < 8 ; j++)
                effect[i][j] = '.';
        // Pieces lock field to adjust the code till the end
        for (int i = 0 ; i < 8 ; i++)
            for(int j = 0 ; j < 8 ; j++)
                lock[i][j] = '.';
        // printing chess field 
        
        // game running
        king.effect(chess, effect);
        queen.effect(chess, effect);
        sold.effect(chess, effect);
        rock.effect(chess, effect);
        elephant.effect(chess, effect);
        horse.effect(chess, effect);
        chain chaino = new chain();
        /*for (int i = 0 ; i < 8 ; i++)
            {   
                for(int j = 0 ; j < 8 ; j++)
                {
                        System.out.print(effect[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println("----------------------");*/
        while(true)
        {
            if(firstrow != 0 && firstcol != 0)
            {
                if(firstrow == 8 && firstcol == 'e') wking = 0 ;
                else if(firstrow == 8 && firstcol == 'a') wrock1 = 0 ;
                else if(firstrow == 8 && firstcol == 'h') wrock2 = 0 ;
                else if(firstrow == 1 && firstcol == 'e') bking = 0 ;
                else if(firstrow == 1 && firstcol == 'a') brock1 = 0 ;
                else if(firstrow == 1 && firstcol == 'h') brock2 = 0 ;
            }
            
            // chain mattttttter 
            chaino.whitechain(chess, effect, lock);
            chaino.blackchain(chess, effect, lock);
            /*for (int i = 0 ; i < 8 ; i++)
            {   
                for(int j = 0 ; j < 8 ; j++)
                {
                        System.out.print(lock[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println("----------------------");
            */
            // reset effect array 
            for (int i = 0 ; i < 8 ; i++)
                for(int j = 0 ; j < 8 ; j++)
                    effect[i][j] = '.';
            System.out.print("  a");System.out.print("  b");System.out.print("  c");System.out.print(" d");System.out.print("  e");System.out.print("  f");System.out.print(" g"); System.out.print("  h"); System.out.println();
            for (int i = 0 ; i < 8 ; i++)
            {   System.out.print(i+1 + " ");
                for(int j = 0 ; j < 8 ; j++)
                {
                    if(chess[i][j] == 1 || chess[i][j] == 9842)
                        System.out.print(chess[i][j] + " ");
                    else
                        System.out.print(chess[i][j] + " ");
                }
                System.out.println();
            }
            
            System.out.println("Scanning the coordinates of the piece you want to move");
            System.out.println("Enter the number of the row form 1 to 8");
            firstrow = enter.nextInt();
            System.out.println("Enter the number of the col for a to h");
            firstcol = enter.next().charAt(0);
            
            if(chess[firstrow-1][firstcol-97] == 9946)
            {System.out.println("This cell is empty, hold a piece and move it");}
            else if(lock[firstrow-1][firstcol-97] == '&')
            {
                System.out.println("Sorry, but this element can't move, it's locked");
            }
            else if((chess[firstrow-1][firstcol-97] == 9818 
                    || chess[firstrow-1][firstcol-97] == 9819 || 
              chess[firstrow-1][firstcol-97] == 9820
                    || chess[firstrow-1][firstcol-97] == 9821 || 
              chess[firstrow-1][firstcol-97] == 9822 
                    || chess[firstrow-1][firstcol-97] == 9823) && turn % 2 == 0)
            {
                System.out.println("Sorry, it is The white team turn");
            }
            else if((chess[firstrow-1][firstcol-97] == 9812 
                    || chess[firstrow-1][firstcol-97] == 9813 || 
              chess[firstrow-1][firstcol-97] == 9814 
                    || chess[firstrow-1][firstcol-97] == 9815 || 
              chess[firstrow-1][firstcol-97] == 9816 
                    || chess[firstrow-1][firstcol-97] == 9817) && turn % 2 == 1)
            {
                System.out.println("Sorry, it is The black team turn");
            }
            else
            {
                System.out.println("Scanning the coordinates of the position you want to move the chosen piece to...");
                System.out.println("Enter the number of the row form 1 to 8");
                secondrow = enter.nextInt();
                System.out.println("Enter the number of the col for a to h");
                secondcol = enter.next().charAt(0);
                
                if(chess[firstrow-1][firstcol-97] == 9818 || chess[firstrow-1][firstcol-97] == 9812 )
                {
                    licence = king.permission(chess, effect, firstrow-1, secondrow-1, firstcol, secondcol);
                    if(licence == 1) turn++ ;
                    else
                    {
                        firstrow = firstcol = 0 ;
                    }
                }
                else if(chess[firstrow-1][firstcol-97] == 9819 || chess[firstrow-1][firstcol-97] == 9813 )
                {
                    licence = queen.permission(chess, effect, firstrow-1, secondrow-1, firstcol, secondcol);
                    if(licence == 1) turn++ ;
                    else
                    {
                        firstrow = firstcol = 0 ;
                    }
                }
                else if(chess[firstrow-1][firstcol-97] == 9820 || chess[firstrow-1][firstcol-97] == 9814 )
                {
                    licence = rock.permission(chess, effect, firstrow-1, secondrow-1, firstcol, secondcol);
                    if(licence == 1) turn++ ;
                    else
                    {
                        firstrow = firstcol = 0 ;
                    }
                }
                else if(chess[firstrow-1][firstcol-97] == 9821 || chess[firstrow-1][firstcol-97] == 9815 )
                {
                    licence = elephant.permission(chess, effect, firstrow-1, secondrow-1, firstcol, secondcol);
                    if(licence == 1) turn++ ;
                    else
                    {
                        firstrow = firstcol = 0 ;
                    }
                }
                else if(chess[firstrow-1][firstcol-97] == 9822 || chess[firstrow-1][firstcol-97] == 9816 )
                {
                    licence = horse.permission(chess, effect, firstrow-1, secondrow-1, firstcol, secondcol);
                    if(licence == 1) turn++ ;
                    else
                    {
                        firstrow = firstcol = 0 ;
                    }
                }
                else if(chess[firstrow-1][firstcol-97] == 9823 || chess[firstrow-1][firstcol-97] == 9817 )
                {
                    licence = sold.permission(chess, effect, firstrow-1, secondrow-1, firstcol, secondcol);
                    if(licence == 1) turn++ ;
                    else
                    {
                        firstrow = firstcol = 0 ;
                    }
                }
                
            }
            king.effect(chess, effect);
            queen.effect(chess, effect);
            sold.effect(chess, effect);
            rock.effect(chess, effect);
            elephant.effect(chess, effect);
            horse.effect(chess, effect);
            sold.upgrade(chess);
            /*for (int i = 0 ; i < 8 ; i++)
            {   
                for(int j = 0 ; j < 8 ; j++)
                {
                        System.out.print(effect[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println("----------------------");*/
            // reset lock array 
            for (int i = 0 ; i < 8 ; i++)
                for(int j = 0 ; j < 8 ; j++)
                    lock[i][j] = '.';
        }
    }
}

