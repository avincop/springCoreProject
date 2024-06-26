package valueComponentConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subject {
	private int sub_code;
	public Subject(@Value("#{10+10}") int sub_code) {
		super();
		this.sub_code = sub_code;
	}

	@Override
	public String toString() {
		return "Subject [sub_code=" + sub_code + "]";
	}
}
