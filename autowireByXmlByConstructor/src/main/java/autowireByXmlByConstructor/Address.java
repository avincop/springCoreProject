package autowireByXmlByConstructor;

public class Address {
	private String cityName;

	public Address(String cityName) {
		
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + "]";
	}

}
