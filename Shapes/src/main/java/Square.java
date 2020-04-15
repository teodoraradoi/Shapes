
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teo
 */
public class Square implements IShape
{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    
    public Square()
    {
        this.set();
    }
    
    public void setCoord1(double _x1)
    {
        this.x1 = _x1;
    }
    
    public void setCoord2(double _y1)
    {
        this.y1 = _y1;
    }
    
    public void setCoord3(double _x2)
    {
        this.x2 = _x2;
    }
    
    public void setCoord4(double _y2)
    {
        this.y2 = _y2;
    }
    
    @Override
    public void print(String message)
    {
        System.out.println(message);
    }
    
    @Override
    public double readCoordinate()
    {
        Scanner in = new Scanner(System.in);
        double coord = in.nextDouble(); 
        return coord;  
    }
    
    @Override
    public int readIndex()
    {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt(); 
        return index;        
    }
    
    @Override
    public void draw()
    {
        System.out.println("Square created successfully\n");
    }
    
    @Override
    public void set()
    {
        this.print("Enter the 4 coordinates");
        double c1 = this.readCoordinate();
        this.setCoord1(c1);
        double c2 = this.readCoordinate();
        this.setCoord2(c2);
        double c3 = this.readCoordinate();
        this.setCoord3(c3);
        double c4 = this.readCoordinate();
        this.setCoord4(c4);
        this.print("");
    }
    
    @Override
    public void modify()
    {
        this.print("Enter the index of the coordinate you want to change");
        int j = this.readIndex();
        this.print("Enter the new coordinate");
        switch(j)
        {
            case 1:
            {
                this.setCoord1(this.readCoordinate());
                break;              
            }        
            case 2:
            {
                this.setCoord2(this.readCoordinate());
                break;
            }         
            case 3:
            {
                this.setCoord3(this.readCoordinate());
                break;  
            }  
            case 4:
            {
                this.setCoord4(this.readCoordinate());
                break;
            }
        }
        this.print("");
    }
    
    @Override
    public void view()
    {
        System.out.println("Square");
        System.out.println("Coordinate 1: " + x1);
        System.out.println("Coordinate 2: " + y1);
        System.out.println("Coordinate 3: " + x2);
        System.out.println("Coordinate 4: " + y2 + "\n");
    }
}
