
/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Tree
{
    
    protected int height;
    protected int width;
    
    public Tree(int height)
    {
        this.height = height;
        if (height%2 == 1){
            width = height - 1;
        } else{
            width = height;
        }
    }
    
    public void drawTree(){
        String[] layers = new String[width];
        for(int i = 0; i < height/2; i++){
            layers[(layers.length/2)+i] = "*";
            layers[(layers.length/2)-i] = "*";
            output(layers);
            output(layers);
        }
        if (height%2 == 1){
            for(int i = 0; i <= width; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        drawStump();
    }
    
    public void drawStump(){
        String[] stump = new String[width];
        stump[stump.length/2] = "*";
        output(stump);
        output(stump);
        for(int i = 0; i <= width/4; i++){
            stump[(stump.length/2) + i] = "*";
            stump[(stump.length/2) - i] = "*";
        }
        output(stump);
        output(stump);
    }
    
    public void output(String[] layer){
        for(String i : layer){
            if(i == null){
                System.out.print(" ");
            }else{
                System.out.print(i);
            }
        }
        System.out.println();
    }
}
