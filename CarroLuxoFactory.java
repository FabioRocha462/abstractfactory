public class CarroLuxoFactory extends CarroFactory {
  public Roda montarRoda() {
return new RodaLigaLeve();
  }

  public Som montarSom() {
return new CDPlayer();
  }

}