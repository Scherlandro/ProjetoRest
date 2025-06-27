import com.biontecapi.model.Endereco;
import com.biontecapi.model.Pais;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.*;



//@RunWith(SpringRunner.class)
public class EnderecoTest {

/*    @Autowired
    EnderecoTest enderecoTest;*/


   // @Test
    public void testGettersAndSetters() {
        // Create an instance of Endereco
        Endereco endereco = new Endereco();

        // Set values using setters
        endereco.setCep("12345-678");
        endereco.setLogradouro("Rua das Flores");
        endereco.setNumero("123");
        endereco.setBairro("Centro");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");

        // Create a Pais object and set it
        Pais pais = new Pais();
        pais.setNome_pais("Brasil");
        endereco.setPais(pais);

        // Test getters
        assertEquals("12345-678", endereco.getCep());
        assertEquals("Rua das Flores", endereco.getLogradouro());
        assertEquals("123", endereco.getNumero());
        assertEquals("Centro", endereco.getBairro());
        assertEquals("São Paulo", endereco.getCidade());
        assertEquals("SP", endereco.getEstado());
        assertEquals(pais, endereco.getPais());
    }

  //  @Test
    public void testNullValues() {
        // Create an instance of Endereco
        Endereco endereco = new Endereco();

        // Set null values
        endereco.setCep(null);
        endereco.setLogradouro(null);
        endereco.setNumero(null);
        endereco.setBairro(null);
        endereco.setCidade(null);
        endereco.setEstado(null);
        endereco.setPais(null);

        // Test getters for null values
        assertNull(endereco.getCep());
        assertNull(endereco.getLogradouro());
        assertNull(endereco.getNumero());
        assertNull(endereco.getBairro());
        assertNull(endereco.getCidade());
        assertNull(endereco.getEstado());
        assertNull(endereco.getPais());
    }

   // @Test
    public void testPaisAssociation() {
        // Create an instance of Endereco
        Endereco endereco = new Endereco();

        // Create a Pais object
        Pais pais = new Pais();
        pais.setNome_pais("Brasil");

        // Associate Pais with Endereco
        endereco.setPais(pais);

        // Test the association
        assertNotNull(endereco.getPais());
        assertEquals("Brasil", endereco.getPais().getNome_pais());
    }

    //@Test
    public void setEnderecoTest(){
        Endereco address = new Endereco();


        address.setNumero("123"); // Valor numérico válido
        System.out.println(address.getNumero()); // Saida: 123

        address.setNumero("ABC"); // Valor não numérico
        System.out.println(address.getNumero()); // Saida: 0

        address.setNumero(null); // Valor nullo
        System.out.println(address.getNumero()); // Saida: 0


    }
}
