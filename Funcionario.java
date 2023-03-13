public class Funcionario {

  private String nome;
  private String telefone;
  private String email;
  private int horasTrabalhadas;
  private double valorPorh;

  public Funcionario(String nome, String telefone, String email, int horasTrabalhadas, double valorPorh) {
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    this.horasTrabalhadas = horasTrabalhadas;
    this.valorPorh = valorPorh;
  }

  public Funcionario() {

  }

  public Funcionario(String telefone, int horasTrabalhadas, double valorPorh) {
    this.telefone = telefone;
    this.horasTrabalhadas = horasTrabalhadas;
    this.valorPorh = valorPorh;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getHorasTrabalhadas() {
    return horasTrabalhadas;
  }

  public void setHorasTrabalhadas(int horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
  }

  public double getValorPorh() {
    return valorPorh;
  }

  public void setValorPorh(double valorPorh) {
    this.valorPorh = valorPorh;
  }

  public double calcularSalario() {
    return horasTrabalhadas * valorPorh;
  }
}
