//Importacao das bibliotecas sugeridas pelo Cucumber devido a classe feita.
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//Esta é a classe que contém os métodos de step definitions (definições de passos) para o Cucumber. 
//Cada método corresponde a um passo definido em um arquivo .feature.
public class Conta {
	
	@Given("um cliente especial com saldo atual de (\\d+ reais)")
    public void um_cliente_especial_com_saldo_atual_de_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^for solicitado um saque no valor de (\\d+) reais$")
    public void for_solicitado_um_saque_no_valor_de_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("check more outcomes")
    public void check_more_outcomes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
