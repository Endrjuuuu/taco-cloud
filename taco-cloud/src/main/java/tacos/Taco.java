package tacos;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
	
	@NotNull
	@Size(min=5, message="Nazwa musi skladac sie z przynajmniej pieciu znakow")
	private String name;
	
	@Size(min=1, message="Musisz wybrac przynajmniej jeden skladnik")
	private List<String> ingredients;
}
