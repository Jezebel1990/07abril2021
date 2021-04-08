package OpExercicios;

import java.text.NumberFormat;

public class Cliente {
	private String nome;
	private int cpf;
	private int telefone;
	private String tipoPagamento;
	double total_comprado;
			
	public Cliente(String nome, int cpf, int telefone, String tipoPagamento, double total_comprado)  
	{
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.tipoPagamento = tipoPagamento;
	}
	public String getNome() {
		return nome;
    }
   public void setNome(String nome) {
        this.nome = nome;
    }

	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	public double getTotal_comprado() {
		return total_comprado;
	}
	public void setTotal_comprado(int total_comprado) {
		this.total_comprado = total_comprado;
	}
	public String formatarMoeda()
  	{
  		NumberFormat nf = NumberFormat.getCurrencyInstance();
  		nf.setMinimumFractionDigits(2);
  		String formatoMoeda = nf.format(total_comprado);
  		return formatoMoeda;
  	 }
    public void comprarProduto()
     {
	this.total_comprado++;
     }
    public void devolverProduto()
      {
    if(total_comprado>0)
    {
	 this.total_comprado--;
     }
    }
	public void printInfo() 
	{
	System.out.println("\n***Informações do Cliente***\nNome: "+nome+"\nCPF: "+cpf+"\nTelefone: "+telefone+"\nTipo de pagamento: "+tipoPagamento+"\nTotal de produtos comprados: "+this.formatarMoeda());
	}
}
	
	