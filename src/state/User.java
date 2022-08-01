package state;

public class User {

	public void changeState(LockState lockState) {}

	public void changeState(DisableState disableState) {}

	public void changeState(BuyingState buyingState) {}

	public String startBuy() {

		return null;
	}

	public void setBuying(boolean b) {}

	public void changeState(ActiveState activeState) {}

	public void setEnable(boolean b) {}

	public boolean isBuying() {

		return false;
	}

	public boolean getEnable() {

		return false;
	}

}
