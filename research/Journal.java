package research;

import java.util.ArrayList;
import java.util.List;


public class Journal  {
	 
	    private List<ResearchPaper> publishedPapers;
	    private String journalName;
	    private ResearchDecorator author;
	    {
	     
	     this.publishedPapers = new ArrayList<>();
	    }
	    public Journal() {
	    }
	    public Journal( ResearchDecorator author) {
	     this.author = author;
	    }
	    public Journal(String journalName, ResearchDecorator author) {
	        this.journalName = journalName;
	        this.author = author;
	    }
	    
	    public ResearchDecorator getAuthor() {
	  return author;
	 }
	 public void setAuthor(ResearchDecorator author) {
	  this.author = author;
	 }
	 
	 public List<ResearchPaper> getPublishedPapers() {
	  return publishedPapers;
	 }
	 public void setPublishedPapers(List<ResearchPaper> publishedPapers) {
	  this.publishedPapers = publishedPapers;
	 }
	 public String getJournalName() {
	  return journalName;
	 }
	 public void setJournalName(String journalName) {
	  this.journalName = journalName;
	 }
	   
	}