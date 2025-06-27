import com.biontecapi.model.Funcionario;
import com.biontecapi.repository.FuncionarioRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class TestQueryMethod {

   // @Autowired
    private FuncionarioRepository funcionarioRepository;

   // @Test
    @Transactional
    public void testQueryMethodAuthor() {
      //  List<Funcionario> a = funcionarioRepository.findByFirstName("Jesus");
    }
}