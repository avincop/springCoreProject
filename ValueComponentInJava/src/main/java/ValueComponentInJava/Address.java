package ValueComponentInJava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("jaipur")
	private String city;

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
}
