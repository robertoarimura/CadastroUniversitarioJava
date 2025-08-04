public class Monitor extends Pessoa implements MembroUniversitario{
    private int horasMonitoria;
    private String disciplina;

    public Monitor(String nome, String matricula, int horasMonitoria, String disciplina){
        super(nome, matricula);
        if(horasMonitoria <= 0){
            System.out.println("Número de horas de monitoria inválido! Definido como 0.");
            this.horasMonitoria = 0;
        }else{
            this.horasMonitoria = horasMonitoria;
        }
        setDisciplina(disciplina);
    }

    public int getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(int horasMonitoria) {
        this.horasMonitoria = Math.max(0, horasMonitoria);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if(disciplina == null || disciplina.trim().isBlank()){
            this.disciplina = "Indefinida";
        }else{
            this.disciplina = disciplina;
        }
    }

    @Override
    public void apresentar(){
        System.out.printf("Sou o monitor da disciplina %s, meu nome é %s.%n", getDisciplina(), getNome());
    }

    @Override
    public double calcularAtividadeMensal(){
        return horasMonitoria * 10;
    }
}
