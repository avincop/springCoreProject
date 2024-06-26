package ValueComponentInJava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subject {
	@Value("#{10+10}")
	private int sub_code;

	@Override
	public String toString() {
		return "Subject [sub_code=" + sub_code + "]";
	}
}
