import br.com.dio.desafio.dominio.*;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        //Classe pra formatar valores Double
        DecimalFormat df = new DecimalFormat("0.00");

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de PHP");
        curso1.setDescricao("Aprendendo backend com PHP");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de HTML/CSS");
        curso2.setDescricao("Aprendendo frontend com HTML/CSS");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso2.setTitulo("Curso de Bootstrap 5");
        curso2.setDescricao("Agilizando seu frontend com Bootstrap 5");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Web Developer");
        mentoria.setDescricao("Seja um desenvolvedor web usando tecnologias atuais do mercado");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Fullstack Developer");
        bootcamp.setEndereco(new Endereco("Rua Dev", "83234-233", "Perto da igreja Cristo de paz", "São Paulo", "SP"));
        bootcamp.setDescricao("Desenvolva sistemas web dinâmicos");
        bootcamp.setPatrocinio("Empresa X de SP");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.setIdade(23);
        devMateus.setEndereco(new Endereco("Rua Chocolate", "01555-090", "Perto do hospital Health999", "São Paulo", "SP"));
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Mateus:" + devMateus.getConteudosInscritos());
        System.out.println("Idade: " + devMateus.getIdade());
        devMateus.progredir();
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Mateus:" + devMateus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Mateus:" + devMateus.getConteudosConcluidos());
        System.out.println("XP:" + devMateus.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.setIdade(27);
        devJoao.setEndereco(new Endereco("Rua DIO", "02837-233", "Perto do mercado Martelo", "Suzano", "SP"));
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de João:" + devJoao.getConteudosInscritos());
        System.out.println("Idade: " + devJoao.getIdade());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println("-------");

        Dev devLuana = new Dev();
        devLuana.setNome("Luana");
        devLuana.setIdade(30);
        devLuana.setEndereco(new Endereco("Rua Bolinho", "03532-200", "Perto do bar", "Itaquaquecetuba", "SP"));
        devLuana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Luana:" + devLuana.getConteudosInscritos());
        System.out.println("Idade: " + devLuana.getIdade());
        devLuana.progredir();
        devLuana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Luana:" + devLuana.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Luana:" + devLuana.getConteudosConcluidos());
        System.out.println("XP:" + devLuana.calcularTotalXp());

        //Media de idade dos Devs inscritos
        System.out.println("-------");
        bootcamp.setIdadeDevs(devMateus.getIdade());
        bootcamp.setIdadeDevs(devJoao.getIdade());
        bootcamp.setIdadeDevs(devLuana.getIdade());
        bootcamp.setMediaIdadeDevs();
        String media = df.format(bootcamp.getMediaIdadeDevs());
        System.out.println("Idade média entre os inscritos do bootcamp: " + media);

    }

}
