
public class Article {

	private long reference;
    private String intitule;
    private float prixHT;
    private int quantiteEnStock;
     
    public Article(long reference,String intitule,float prixHT,int quantiteEnStock){
         
        setReference(reference);
        setIntitule(intitule);
        setPrixHT(prixHT);
        setQuantiteEnStock(quantiteEnStock);
    }
 
    public String getIntitule() {
        return intitule;
    }
 
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
 
    public long getReference() {
        return reference;
    }
 
    public void setReference(long reference) {
        this.reference = reference;
    }
 
    public float getPrixHT() {
        return prixHT;
    }
 
    public void setPrixHT(float prixHT) {
        this.prixHT = prixHT;
    }
 
    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }
 
    public void setQuantiteEnStock(int quantiteEnStockajout) {
        this.quantiteEnStock = quantiteEnStockajout;
    }
     
    public void approvisionner(int nombreUnites){
    	int total = nombreUnites + getQuantiteEnStock();
        setQuantiteEnStock(total);
    }
    
    public boolean vendre(int nombreUnites)
    {
        if(nombreUnites<getQuantiteEnStock())
        {
        setQuantiteEnStock(getQuantiteEnStock()-nombreUnites);
        return true;
        }  
        else
        return false;
    }
    
    public float prixHT(){
        return getPrixHT();
    }
    
    public float prixTTC(){
        return (1+ (float)0.196)*getPrixHT();
        //return 1;
    }
    
    public String Afficher ()
    {
        return(" l'article num : "+getReference()+" - Intitulé : "+getIntitule()+ " - PrixHT : "+getPrixHT()+" et la quantite en stock est :"+getQuantiteEnStock());
        //return("aaaa");
    }
    
   
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Article[] articles;
		articles = new Article[10];
		articles [1]=new Article(1,"Patate",10,100);
		articles [2]=new Article(2,"Stylo",20,200);
		articles [3]=new Article(3,"Serviette",30,300);
		articles [4]=new Article(4,"Chaussure",40,400);
		 
		//articles[1].equals(articles[2]);
		articles[1].approvisionner(30);
		 
		articles[1].vendre(170);
		//System.out.println(articles[1]);
		//articles[1].prixTTC();
		System.out.println(articles[1].getQuantiteEnStock());
		System.out.println (articles[2].prixTTC());
		for(int i=1;i<5;i++){
		    System.out.println (articles[i].Afficher());  
		}
		}
		
	}


