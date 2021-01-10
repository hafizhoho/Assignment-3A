package Drama;

public class Romance extends Genre {
	
	
	public void details() {
	

	Romance r = new Romance();
	r.setDramaName ("Dr.Stranger (2014)");
	r.setLanguage ("Korean");
	r.setSubstitle ("Malay/English/Mandarin");
	

	
	System.out.println ("This is the Drama List of Romance Genre");
	System.out.println ("Name: "+r.getDramaName());
    System.out.println ("Language : "+r.getLanguage());
    System.out.println ("Substitle : "+r.getSubstitle());
    System.out.println();
    
	Romance r2 = new Romance();
	r2.setDramaName ("7 Hari Mencintaiku (2016)");
	r2.setLanguage ("Bahasa Melayu");
	r2.setSubstitle ("Malay/English/Mandarin");
	

	System.out.println ("Name: "+r2.getDramaName());
    System.out.println ("Language : "+r2.getLanguage());
    System.out.println ("Substitle : "+r2.getSubstitle());
    

}
}