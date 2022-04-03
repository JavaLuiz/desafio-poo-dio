import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

public class Main {
    private static Conteudo mentoria;

    public static void main(String[] args) {

        // Criando primeiro curso

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Herança");
        curso1.setDescricao("Aprenda a criar classes a partir de uma outra classe ja existente");
        curso1.setCargaHoraria(4);

        // Criando segundo curso

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Polimorfismo");
        curso2.setDescricao("Referenciando de diferentes formas");
        curso2.setCargaHoraria(6);

        // Criando terceiro curso

        Curso curso3 = new Curso();
        curso3.setTitulo("curso Encapsulamento");
        curso3.setDescricao("Criando modificadores de acesso");
        curso3.setCargaHoraria(5);


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Comece a caminhada para se tornar um desenvolvedor Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luiz:" + devLuiz.getConteudosInscritos());
        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Luiz:" + devLuiz.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Luiz:" + devLuiz.getConteudosConcluidos());
        System.out.println("XP:" + devLuiz.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Joao:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

    public static void setMentoria(Conteudo mentoria) {
        Main.mentoria = mentoria;
    }
}
