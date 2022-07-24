public class TesteFactory{
  public static Carro montarCarro(String tipo){
    CarroFactory cf = null;
    switch(tipo){
      case "luxo":
        cf = new CarroLuxoFactory();
        break;
      case "popular":
        cf = new CarroPopularFactory();
    }
    Carro carro = new Carro();
    carro.setRoda(cf.montarRoda());
    carro.setSom(cf.montarSom());
    return carro;
  }
  public static void main(String[] args) {
  Carro carroDoProfessor = montarCarro("luxo");
  Carro carroDoAluno = montarCarro("popular");
  System.out.println("Carro do Professor");
System.out.println(carroDoProfessor.getRoda());
System.out.println(carroDoProfessor.getSom());
System.out.println("Carro do Aluno");
System.out.println(carroDoAluno.getRoda());
System.out.println(carroDoAluno.getSom());
  }


}
