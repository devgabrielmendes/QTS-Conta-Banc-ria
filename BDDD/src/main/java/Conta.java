import org.junit.Assert;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
/**
 * @author Gabriel Mendes
 * Classe conta
 */

public class Conta {

    private Integer saldoInicial;

    /**
     * @param valorInicial
     */
    
    @Given("Um cliente especial com saldo atual de {int} reais")
    public void um_cliente_especial_com_saldo_atual_de_reais(Integer valorInicial){
    	saldoInicial = valorInicial;
        
    	}
    /**
     * @param valorSacado
     */
    
    @When("for solicitado um saque no valor de {int} reais")
    public void for_solicitado_um_saque_no_valor_de_reais(Integer valorSacado){
        System.out.println("Saldo atual: " + saldoInicial);
        System.out.println("Saque: " + valorSacado);
        saldoInicial -= valorSacado;
    	}
    /**
     * @param valorRestante
     */
    
    @Then("deve efetuar o saque e atualiza o saldo da conta para {int} reais")
    public void deve_efetuar_o_saque_e_atualiza_o_saldo_da_conta_para_reais(Integer valorRestante){
        Assert.assertEquals(valorRestante, saldoInicial);
        if (saldoInicial.equals(valorRestante)){
            System.out.println("Saque efetuado com sucesso!");
        	}
        else{
            System.out.println("Saldo insuficiente!");
        	}

    	}
    /**
     * Verifica mais resultados.
     */
    
    @Then("check more outcomes")
    public void check_more_outcomes() {
        System.out.println("Esperando ações");
    	}
    /**
     * @param valorInicial2
     */
    
    @Given("Um cliente comum com saldo atual de {int} reais")
    public void umClienteComumComSaldoAtualDeReais(int valorInicial2){
        System.out.println("Saldo atual: " + valorInicial2);
        saldoInicial = valorInicial2;
    	}
    /**
     * @param valorSacado2
     */
    
    @When("solicitar um saque de {int} reais")
    public void solicitarUmSaqueDeReais(int valorSacado2){
        if (saldoInicial >= valorSacado2){
        	saldoInicial -= valorSacado2;
            System.out.println("Saque efetuado com sucesso!");
        	}
    	}
    /**
     * Saldo Insuficiente.
     */
    
    @Then("não deve efetuar o saque e deve retornanar a mensagem saldo insuficiente")
    public void naoDeveEfetuarOSaqueEDeveRetornanarAMensagemSaldoInsuficiente(){
        System.out.println("Saldo insuficiente! Saque não efetuado");
    	}
	}