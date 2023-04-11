package mao.linatrix.phone;

public class OnePlus5 implements IPhone {

	@Override
	public String processor() {
		return "SD835";
	}

	@Override
	public String os() {

		return "Android";
	}

	@Override
	public int spaceInGB() {

		return 64;
	}

}
