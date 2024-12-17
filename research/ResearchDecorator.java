package research;

import java.util.ArrayList;
import java.util.List;


public class ResearchDecorator {
	private String name;
    private String affiliation;
    private List<ResearchPaper> authoredPapers;
    
    public ResearchDecorator(String name, String affiliation) {
        this.name = name;
        this.affiliation = affiliation;
        this.authoredPapers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public List<ResearchPaper> getAuthoredPapers() {
        return authoredPapers;
    }

    public void setAuthoredPapers(List<ResearchPaper> authoredPapers) {
        this.authoredPapers = authoredPapers;
    }

    
  

}
