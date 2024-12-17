package research;
import java.util.Date; 
import java.util.Vector;
 
public class ResearchPaper {
	private int paperId; 
	  private String title; 
	   
	  private Vector<ResearchDecorator> authors; 
	  private int numberOfPages; 
	  private Date publicationDate = new Date(System.currentTimeMillis());; 
	  private int citationsNumber; 
	  private String doi; 
	  
	   
	  {
	   
	   authors = new Vector<ResearchDecorator>();
	  }
	  public ResearchPaper() {
	   
	  }
	  public ResearchPaper(String title, Vector<ResearchDecorator> authors, int numberOfPages, int citationsNumber, String doi) { 
	   this.title = title; 
	   this.authors = authors; 
	   this.numberOfPages = numberOfPages; 
	   this.citationsNumber = citationsNumber; 
	   this.doi = doi; 
	  } 
	  
	  
	  public String getTitle() { 
	   return title; 
	  } 
	  
	  public int getPaperId() {
	  return paperId;
	 }



	 public Vector<ResearchDecorator> getAuthors() {
	  return authors;
	 }


	 public void setAuthors(Vector<ResearchDecorator> authors) {
	  this.authors = authors;
	 }


	 public int getNumberOfPages() {
	  return numberOfPages;
	 }


	 public void setNumberOfPages(int numberOfPages) {
	  this.numberOfPages = numberOfPages;
	 }


	 public String getDoi() {
	  return doi;
	 }


	 public void setDoi(String doi) {
	  this.doi = doi;
	 }


	 public void setTitle(String title) {
	  this.title = title;
	 }


	 public void setPublicationDate(Date publicationDate) {
	  this.publicationDate = publicationDate;
	 }


	 public void setCitationsNumber(int citationsNumber) {
	  this.citationsNumber = citationsNumber;
	 }


	 public Date getPublicationDate() { 
	   return publicationDate; 
	  } 
	  
	  public int getCitationsNumber() { 
	   return citationsNumber; 
	  } 
	  
	  

}
