package state;

public abstract class Test {
	User user;

	public Test(User user2) {
	}

	void State(User user) {
		this.user = user;
	}

	public abstract String onActive();

	public abstract String onDisable();

	public abstract String onLock();

	public abstract String onBuy();
}