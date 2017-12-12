
/**
 * Write a description of class SawToothTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SawToothTree extends Tree
{
    public SawToothTree(int height)
    {
        super(height);
    }
    
    @Override
    public void drawTree(){
        String[] layers = new String[height];
        int layersCount = 0;
        for(int i = 0; i < height/3; i++){
            for(int j = 0; j < 3; j++){
                layers[(layers.length/2)+(i+j)] = "*";
                layers[(layers.length/2)-(i+j)] = "*";
                output(layers);
                layersCount++;
            }
            layers[(layers.length/2)+(i+2)] = " ";
            layers[(layers.length/2)-(i+2)] = " ";            
        }
        while(layersCount < height){
            layers[(layers.length/2)+(layersCount/2)] = "*";
            layers[(layers.length/2)-(layersCount/2)] = "*";
            output(layers);
            layersCount++;
        }
        drawStump();
    }
}
