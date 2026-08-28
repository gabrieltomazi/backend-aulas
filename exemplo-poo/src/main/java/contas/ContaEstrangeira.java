package contas;


public class ContaEstrangeira extends Conta {

  private static final double COTACAO_DOLAR = 5.40;

  public ContaEstrangeira(String titular, String numero) {
    super(titular, numero);
  }

  public double getSaldoEmReais() {

    return this.getSaldo() * COTACAO_DOLAR;
  }

  // Sobrescrever o método
  @Override
  protected void depositar(double valor, String descricao) {
    if (valor <= 0) return;

    double valorEmDolar = valor / COTACAO_DOLAR;

    super.depositar(valorEmDolar, "Depósito (US$)");
  }

}
