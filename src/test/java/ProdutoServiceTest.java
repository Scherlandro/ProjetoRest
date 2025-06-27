import com.biontecapi.model.Produto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ProdutoServiceTest {

    @Autowired
    ProdutoServiceTest prodServiceTest;

   // @Test
    public void setProdServiceTest(){
        //  https://youtu.be/4VmbETu-dcA?t=381
        Produto prod = new Produto();
        System.out.println(prod.getNomeProduto().toString());
    }
}
