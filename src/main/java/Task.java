import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.paint.Color;

class Task {
	
	private final StringProperty name = new SimpleStringProperty(""); // name of task
	private boolean isNotDone; // is the timer currently marked as done
	private Color colour; // task's user-defined colour
	
	private IntegerProperty minutes = new SimpleIntegerProperty(0);
	private IntegerProperty seconds = new SimpleIntegerProperty(0);
	
	
	public Task(String name, int minutes, Color colour) {
		setName(name);
		setNotDone(true);
		setMinutes(minutes);
		setColour(colour);
	}
	
	@Override
	public String toString() {
		System.out.println("Error: outputting string value of task");
		return getMinutes() + ":" + getSeconds() + " " + getName();
	}
	
	////////////////////////////
	
	
	public boolean isNotDone() {
		return isNotDone;
	}
	
	public void setNotDone(boolean notDone) {
		isNotDone = notDone;
	}
	
	public String getName() {
		return name.get();
	}
	
	public void setName(String name) {
		this.name.set(name);
	}
	
	public StringProperty nameProperty() {
		return name;
	}
	
	public Color getColour() {
		return colour;
	}
	
	public void setColour(Color colour) {
		this.colour = colour;
	}
	
	public int getMinutes() {
		return minutes.get();
	}
	
	public IntegerProperty minutesProperty() {
		return minutes;
	}
	
	public void setMinutes(int minutes) {
		this.minutes.set(minutes);
	}
	
	public int getSeconds() {
		return seconds.get();
	}
	
	public IntegerProperty secondsProperty() {
		return seconds;
	}
	
	public void setSeconds(int seconds) {
		this.seconds.set(seconds);
	}
}