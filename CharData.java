/*
CHEATSHEET BECAUSE I WONT REMEMBER
0 WS
1 BS
2 S
3 T
4 AG
5 INT
6 PER
7 WP
8 FEL
9 WND (wounds? wound???)
10 FP

Second Column is # of times taken
 */

public class CharData
{
    private int[][] stats = new int[11][2];
    
    public CharData()
    {
        reset();
    }        
    public void reset()
    {
        //Zero everything, in case someone screws up typing in the values or something?
        for(int x = 0; x<11;x++)
        {   
            stats[x][0] = 0;
            stats[x][1] = 0;
        }
    }        
    
    public void addStat(String name, int val)
    {
        //advancements will have to be like 6 total allowed or something, the first being inputting stat
        switch (name)
        {
            case "WS":
                stats[0][0]+=val;
                stats[0][1]++;
                break;
                
            case "BS":
                stats[1][0]+=val;
                stats[1][1]++;
                break;
                
            case "S":
                stats[2][0]+=val;
                stats[2][1]++;
                break;
                
            case "T":
                stats[3][0]+=val;
                stats[3][1]++;
                break;
                
            case "AG":
                stats[4][0]+=val;
                stats[4][1]++;
                break;
                
            case "INT":
                stats[5][0]+=val;
                stats[5][1]++;
                break; 
                
             case "PER":
                stats[6][0]+=val;
                stats[6][1]++;
                break;    
                 
             case "WP":
                stats[7][0]+=val;
                stats[7][1]++;
                break;     
                 
             case "FEL":
                stats[8][0]+=val;
                stats[8][1]++;
                break;
                 
             case "WND":
                stats[9][0]+=val; 
                //idk
                break; 
                 
             case "FP":
                 stats[10][0]+=val;
                 //idk
                 break;
             default:
                 System.out.println("invalid name " + name);                   
        }    
    } 
    
    public void subStat(String name, int val)
    {
        //if statement checking if they are trying to subtract with no advancements
        switch (name)
        {
            case "WS":
                if(stats[0][1]>0)
                {    
                     stats[0][0]-=val;
                     stats[0][1]--;
                }     
                break;
                
            case "BS":
                if(stats[1][1]>0)
                {    
                     stats[1][0]-=val;
                     stats[1][1]--;
                } 
                break;
                
            case "S":
                if(stats[2][1]>0)
                {    
                     stats[2][0]-=val;
                     stats[2][1]--;
                } 
                break;
                
            case "T":
                if(stats[3][1]>0)
                {    
                     stats[3][0]-=val;
                     stats[3][1]--;
                } 
                break;  
                
            case "AG":
                if(stats[4][1]>0)
                {    
                     stats[4][0]-=val;
                     stats[4][1]--;
                } 
                break;
                
            case "INT":
                if(stats[5][1]>0)
                {    
                     stats[5][0]-=val;
                     stats[5][1]--;
                } 
                break; 
                
             case "PER":
                if(stats[6][1]>0)
                {    
                     stats[6][0]-=val;
                     stats[6][1]--;
                } 
                break;  
                 
             case "WP":
                if(stats[7][1]>0)
                {    
                     stats[7][0]-=val;
                     stats[7][1]--;
                } 
                break;  
                 
             case "FEL":
                if(stats[8][1]>0)
                {    
                     stats[8][0]-=val;
                     stats[8][1]--;
                } 
                break;
            
             case "WND":
                //Idk Rules
                break;
             
             case "FP":
                 //Idk Rules
                 break;
             default:
                 System.out.println("invalid name " + name);                   
        }    
    } 
    
    public int getStat(String name)
    {
        int val = 0;
        switch (name)
        {
            case "WS":
                val = stats[0][0];
                break;
            case "BS":
                val = stats[1][0];
                break;
            case "S":
                val = stats[2][0];
                break;
            case "T":
                val = stats[3][0];
                break;  
            case "AG":
                val = stats[4][0];
                break;
            case "INT":
                val = stats[5][0];
                break; 
             case "PER":
                val = stats[6][0];
                break;               
             case "WP":
                val = stats[7][0];
                break;               
             case "FEL":
                val = stats[8][0];
                break;
            case "WND":
                val = stats[9][0];
                break;
            case "FP":
                val = stats[10][0];
                break;
             default:
                 System.out.println("invalid name " + name);             
        }
        
        return val;
    }
    
    public int getTaken(String name)
    {
        int val = 0;
        switch (name)
        {
            case "WS":
                val = stats[0][1];
                break;
            case "BS":
                val = stats[1][1];
                break;
            case "S":
                val = stats[2][1];
                break;
            case "T":
                val = stats[3][1];
                break;  
            case "AG":
                val = stats[4][1];
                break;
            case "INT":
                val = stats[5][1];
                break; 
             case "PER":
                val = stats[6][1];
                break;               
             case "WP":
                val = stats[7][1];
                break;               
             case "FEL":
                val = stats[8][1];
                break;
            case "WND":
                //idk
                break;
            case "FP":
                //idk
                break;
             default:
                 System.out.println("invalid name " + name);             
        }
        
        return val;
    }
     
     
}
