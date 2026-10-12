import java.util.Scanner;

public class Main {
    
     

    public static void main(String[] a )
    {
        boolean repete = true ; 
        Scanner sc = new Scanner(System.in ); 
        Manager manager = new Manager();

        while( repete )
        {
            System.out.println(" The Contact Manager "); 
            System.out.println(" 1. Add The New Contact  ");
            System.out.println(" 2. Afficher Toutes Les Travailleurs ");
            System.out.println(" 3. Modifier Le Contact  ");
            System.out.println(" 4. Search By Name   ");
            System.out.println(" 5. Exit  ");


            try
            {
                int choix = sc.nextInt() ; 

                switch( choix )
                {
                    case 1 ->
                    {
                        Worker worker = new Worker( "" ,"" , "") ; 
                        String name , phone , email ; 
                        System.out.println("L'information de travailleur "); 
                        System.out.print("name :  "); 
                        worker.setName( sc.next() )  ; 
                        System.out.print("Phone :  "); 
                        worker.setPhone( sc.next() )  ;
                        System.out.println("Email :  "); 
                        worker.setEmail( sc.next() )  ; 
                        manager.addWorker(worker) ; 
                    } 
                    case 2 -> manager.toAfficher() ; 
                    case 4 ->
                    {
                        System.out.println( " Entrez le nom que vous cherchez : ");
                        manager.searchByName( sc.next()); 
                    } 
                    case 5 -> repete = false ; 
                    default -> System.out.println(" Euhhhh connardddddd, ntm , Entrez le nombre entre 1 et 5 ") ; 
                }
            }
            catch( Exception e )
            {
                System.out.println(" T'es le personne plus con de monde entier "); 
                sc.next() ; 
            }
        }
    }
}
