import java.util.ArrayList;
import java.util.List;

public class Manager {
    
    private List<Worker> list ; 

    public Manager()
    {
        this.list = new ArrayList<>() ; 
    }

    public void searchByName( String name )
    {
        for( Worker worker : list )
        {
            if( worker.getName().equalsIgnoreCase(name))
            {
                System.out.println( worker.toString()) ; 
            }
        }
    }

    public void addWorker( Worker worker )
    {
        list.add(worker); 
    }

    public void toAfficher()
    {
        for( Worker  worker : list )
        {
            System.out.println( worker.toString()) ; 
        }
    }
}
