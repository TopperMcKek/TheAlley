package mckeken.room.action.actions.conversation;

public abstract class Event {

    String[] properties;

    public Event() {

    }

    public abstract void perform();

    public String[] getProperties() {
        return properties;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }
}
