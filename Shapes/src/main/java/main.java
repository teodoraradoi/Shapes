
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teo
 */
public class main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Board board = new Board();
        Menu mainMenu = initializeMainMenu(board);    
        mainMenu.execute();
    }
     
    private static Menu initializeMainMenu(Board board)
    {
        ArrayList<IMenuItem> mainMenuItems = new ArrayList();
  
        mainMenuItems.add(new MenuItem("Add shape", 1, (parameters)->
        {
            Menu secondMenu = initializeSecondMenu(board);
            secondMenu.execute();  
        }));
        
        mainMenuItems.add(new MenuItem("Delete shape", 2, (parameters)->
        {
            board.view();
            board.removeShape();
        }));
        
        mainMenuItems.add(new MenuItem("Modify shape", 3, (parameters)->
        {
            board.view();
            board.modifyShape();
        })); 
        
        mainMenuItems.add(new MenuItem("View board", 4, (parameters)->
        {
            board.view();
        }));

        return new Menu("Main Menu", 0, mainMenuItems); 
    }
    
    private static Menu initializeSecondMenu(Board board)
    {
        ArrayList<IMenuItem> secondMenuItems = new ArrayList(); 
        
        secondMenuItems.add(new MenuItem("Circle", 1, (parameters2)->
        {
            board.addShape(1);
        }));
        
        secondMenuItems.add(new MenuItem("Square", 2, (parameters2)->
        {
            board.addShape(2);
        }));
        
        return new Menu("Second Menu", 0, secondMenuItems); 
    }
}
