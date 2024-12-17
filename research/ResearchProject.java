package research;
import java.util.Vector;

public class ResearchProject  {
	 
	 private int projectId;
	 private Vector<ResearchPaper> publishedPapers;
	 private String topic;
	 private Vector<ResearchDecorator> participants;

	   
	  {
	   
	   publishedPapers = new Vector<ResearchPaper>();
	   participants = new Vector<ResearchDecorator>();
	  }
	 
	  public ResearchProject() {
	   
	  }
	 
	 public ResearchProject(Vector<ResearchPaper> publishedPapers, String topic,
	   Vector<ResearchDecorator> participants) {
	  this.publishedPapers = publishedPapers;
	  this.topic = topic;
	  this.participants = participants;
	 }

	 public int getProjectId() {
	  return projectId;
	 }

	 public Vector<ResearchPaper> getPublishedPapers() {
	  return publishedPapers;
	 }

	 public String getTopic() {
	  return topic;
	 }

	 public Vector<ResearchDecorator> getParticipants() {
	  return participants;
	 }
	 

	 public void setPublishedPapers(Vector<ResearchPaper> publishedPapers) {
	  this.publishedPapers = publishedPapers;
	 }

	 public void setTopic(String topic) {
	  this.topic = topic;
	 }

	 public void setParticipants(Vector<ResearchDecorator> participants) {
	  this.participants = participants;
	 }

	 public void addParticipants(ResearchDecorator r) {
	  this.participants.add(r); 
	  System.out.println(r.getName() + " is now a participant of a project with an id of " + this.getProjectId());
	 }

	 

	 public void addPapers(ResearchPaper rp) {
	  this.publishedPapers.add(rp);
	  System.out.println(rp.getTitle() + " is added to a project with an id of " + this.getProjectId());
	 }

	 
}
