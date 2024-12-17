package models;

public class News {
	private String topic;
    private String content;

    private boolean isPinned;
    public News() {
		
	}
    public News(int newsId, String topic, String content, boolean isPinned) {
		this.topic = topic;
		this.content = content;
		this.isPinned = isPinned;
	}
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPinned(boolean isPinned) {
        this.isPinned = isPinned;
    }

    public boolean isPinned() {
        return this.isPinned;
    }


}
