import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Just a java course");
        curso1.setCargaHoraria(45);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Just a Java Course");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);

        System.out.println("--------------------------");
        System.out.println("Conteudos Inscritos" + devCarlos.getConteudosInscritos());
        System.out.println("--------------------------");
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.getConteudosConcluidos();

        System.out.println("--------------------------");
        System.out.println("Conteudos Inscritos" + devCarlos.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devCarlos.getConteudosConcluidos());
        System.out.println("--------------------------");
        System.out.println("EXP: " + devCarlos.calcularXp());
    }
}
