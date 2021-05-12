

public class Robot
{   
    
    public  int sucesionPadovan(int n)
    {
        
        if(n == 0 || n == 1 || n == 2){
            return 1;
        }else{
        return sucesionPadovan(n-2) + sucesionPadovan(n-3);
        }
}
}


