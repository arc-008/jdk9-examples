import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ImmutableCollectionTest {

	@Test
	public void testMap() {
		Map<String, Integer> fruitCount = Map.of("Apples", 10, "Orange", 5, "Strawberry", 15, "Banana", 8);		
		assertThrows(UnsupportedOperationException.class, () -> fruitCount.put("Bad Fruit", 1));
	}
	
	@Test
	public void testSet() {
		Set<String> planet = Set.of("Earth", "Mars", "Mercury", "Pluto");						
		assertThrows(UnsupportedOperationException.class, () -> planet.add("Jupiter"));
	}
	
	@Test
	public void testList() {
		List<String> birds = List.of("Parrot", "Hummingbird", "Owl", "Penguin");						
		assertThrows(UnsupportedOperationException.class, () -> birds.add("Sparrow"));
	}
	
}
