package Standard3;

public abstract class Department {
	 private String name;

	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() {
		return queue;
	}
}
