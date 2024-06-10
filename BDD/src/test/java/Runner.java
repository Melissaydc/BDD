//* Importa a anotação RunWith do JUnit, que é usada para definir um runner personalizado para a classe de testes.
import org.junit.runner.RunWith;
//*Importa a classe Cucumber do framework Cucumber, que serve como runner para executar os testes definidos no formato Cucumber.
import cucumber.api.junit.Cucumber;

//*A anotação @RunWith é usada para especificar um runner personalizado.
//*Nesse caso, estamos utilizando o Cucumber.class como o runner
@RunWith(Cucumber.class)
public class Runner {

}
