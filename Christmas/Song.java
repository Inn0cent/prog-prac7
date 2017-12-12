public class Song
{
    
    String[] days;
    
    public Song()
    {
        days = new String[12];
        days[0] = "partridge in a pear tree.";
        days[1] = "turtle doves;";
        days[2] = "French hens;";
        days[3] = "calling birds;";
        days[4] = "gold rings;";
        days[5] = "geese a laying;";
        days[6] = "swans a swimming;";
        days[7] = "maids a milking;";
        days[8] = "ladies dancing;";
        days[9] = "lords a leaping;";
        days[10] = "pipers piping;";
        days[11] = "drummers drumming;";
    }
    
    public void Sing(){
        String suffix = "";
        for(int i = 0; i < 12; i++){
            suffix = findSuffix(i+1);
            System.out.println("On the " + (i+1) + suffix + " day of Christmas my true love sent to me:");
            for(int j = i; j >= 0; j--){
                System.out.println(j+1 + " " + days[j]);
            }
            System.out.println();
        }
    }
    
    public String findSuffix(int i){
        switch (i){
            case 1: return "st";
            case 2: return "nd";
            case 3: return "rd";
            default: return "th";
        }
    }
}














