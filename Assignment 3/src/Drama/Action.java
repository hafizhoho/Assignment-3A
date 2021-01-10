package Drama;

public class Action extends Genre {
	
public void details() {
	
	
	Action a = new Action();
	a.setDramaName ("The Flash (2014)");
	a.setLanguage ("English");
	a.setSubstitle ("Malay/English/Mandarin");
	
	
	System.out.println ("This is the Drama List of Action Genre");
	System.out.println ("Name: "+a.getDramaName());
    System.out.println ("Language : "+a.getLanguage());
    System.out.println ("Substitle : "+a.getSubstitle());
    System.out.println ();
	
	Action a2 = new Action();
	a2.setDramaName ("Arrow (2012)");
	a2.setLanguage ("English");
	a2.setSubstitle ("Malay/English/Mandarin");
	
	

	System.out.println ("Name: "+a2.getDramaName());
    System.out.println ("Language : "+a2.getLanguage());
    System.out.println ("Substitle : "+a2.getSubstitle());
    
}

}

    
    
		
	
	
