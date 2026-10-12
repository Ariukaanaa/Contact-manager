import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
     

    public static void main(String[] a )
    {
        boolean repete = true ; 
        Scanner sc = new Scanner(System.in ); 
        Manager manager = new Manager();


        Worker w1 = new Worker("Ariuka" , "96711197" , "ariuka@gmail.com") ; 
        Worker w2 = new Worker("Nandia" , "96701197" , "nandia@gmail.com") ; 
        Worker w3 = new Worker("Bilgee" , "96721197" , "bilgee@gmail.com") ; 
        Worker w4 = new Worker("Ajaa"   , "96731197" , "ajaa@gmail.com"  ) ; 

        manager.addWorker(w1); 
        manager.addWorker(w2);
        manager.addWorker(w3);
        manager.addWorker(w4);

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
                        
                        String name , phone , email ; 
                        System.out.println("L'information de travailleur "); 
                        System.out.print("name :  "); 
                        name = sc.nextLine() ; 
                        System.out.print("Phone :  "); 
                        phone = sc.nextLine() ;
                        System.out.print("Email :  "); 
                        email = sc.nextLine() ;

                        Worker worker = new Worker( name , phone , email ) ; 
                        manager.addWorker(worker) ; 

                        System.out.println("Ajouter avec le succes "); 
                    } 
                    case 2 -> manager.toAfficher() ; 
                    case 3 ->
                    {
                        System.out.print("Entrez le id de worker que vous voulez modifier le contact ");
                        int id = sc.nextInt(); 
                        System.out.print("Entrez le nouvelle contact  ");
                        String newPhone = sc.next() ; 

                        boolean modif = manager.modifierLeContact(id , newPhone); 
                        if( modif )
                        {
                            System.out.println("Modification avec le succes "); 
                        }
                        else
                        {
                            System.out.println(" This id doesn't exist in the list "); 
                        }
                    }
                    case 4 ->
                    {
                        System.out.println( " Entrez le nom que vous cherchez : ");
                        manager.searchByName( sc.next()); 
                    } 
                    case 5 -> repete = false ; 
                    default -> System.out.println(" Euhhhh connardddddd, ntm , Entrez le nombre entre 1 et 5 ") ; 
                }
            }
            catch( InputMismatchException e )
            {
                System.out.println(" T'es le personne plus con de monde entier "); 
                sc.next() ; 
            }
        }
    }
}
