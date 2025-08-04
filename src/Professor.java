public class Professor extends Pessoa implements MembroUniversitario{
    private int aulasMinistradas;

    public Professor(String nome, String matricula, int aulasMinistradas){
        super(nome, matricula);
        if(aulasMinistradas <= 0){
            System.out.println("Número de aulas ministradas inválido! Definido como 0.");
            this.aulasMinistradas = 0;
        }else{
            this.aulasMinistradas = aulasMinistradas;
        }
    }

    public int getAulasMinistradas() {
        return aulasMinistradas;
    }

    public void setAulasMinistradas(int aulasMinistradas) {
        this.aulasMinistradas = Math.max(0, aulasMinistradas);
    }

    @Override
    public void apresentar(){
        System.out.printf("Sou o professor %s, responsável por %d aula%s neste mês.%n", getNome(), getAulasMinistradas(), getAulasMinistradas() == 1 ? "" : "s");
    }

    @Override
    public double calcularAtividadeMensal(){
        return aulasMinistradas * 100;
    }
}
