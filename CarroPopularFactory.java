public class CarroPopularFactory extends CarroFactory{
  public Roda montarRoda(){
    return new RodaSimples();
  }
public Som montarSom(){
  return new TocaFitas();
  
}
}