public class Aluno extends Pessoa implements MembroUniversitario{
    private int horasEstudoMensal;
    public Aluno(String nome, String matricula, int horasEstudoMensal){
        super(nome, matricula);
        if(horasEstudoMensal < 0){
            System.out.println("Horas de estudo inválidas! Definido como 0.");
            this.horasEstudoMensal = 0;
        }else{
            this.horasEstudoMensal = horasEstudoMensal;
        }
    }

    public int getHorasEstudoMensal() {
        return horasEstudoMensal;
    }

    public void setHorasEstudoMensal(int horasEstudoMensal){
        this.horasEstudoMensal = Math.max(0, horasEstudoMensal);
    }

    @Override
    public void apresentar(){
        System.out.printf("Sou o aluno %s, matriculado sob o número %s%n", getNome(), getMatricula());
    }

    @Override
    public double calcularAtividadeMensal(){
        return horasEstudoMensal * 1.5;
    }

}
