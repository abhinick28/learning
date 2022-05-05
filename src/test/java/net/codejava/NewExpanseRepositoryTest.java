package net.codejava;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class NewExpanseRepositoryTest {
	
	@Autowired
	private NewExpanseRepository expanse;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateNewExpanse() {
		NewExpanse expanses = new NewExpanse();
		expanses.setExpanseId(122);
		expanses.setExpanseDate("12/03/2022");
		expanses.setDescription("spencers");
		expanses.setLocation("Hyderabad");
		expanses.setCategory(101);
		
		
		
		 NewExpanse savedexpanse = expanse.save(expanses);
	}
		}
