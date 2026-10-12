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
        boolean found = false ; 
        for( Worker worker : list )
        {
            if( worker.getName().equalsIgnoreCase(name))
            {
                System.out.println( worker.toString()) ; 
                found = true ; 
            }
        }

        if( !found )
        {
            System.out.println( "Introuvable "); 
        }
    }

    public void addWorker( Worker worker )
    {
        list.add(worker); 
    }

    public void toAfficher()
    {
        if (list.isEmpty()) {
            System.out.println("Aucun travailleur.");
            return;
        }
        
        for( Worker  worker : list )
        {
            System.out.println( worker.toString()) ; 
        }
    }

    public boolean modifierLeContact( int id , String newPhone )
    {
        for( Worker worker : list )
        {
            if( worker.getIdWorker() == id  )
            {
                worker.setPhone( newPhone ) ; 
                return true ; 
            }
        }

        return false ; 
    }
}
