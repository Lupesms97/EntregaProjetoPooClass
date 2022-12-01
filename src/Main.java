import java.time.LocalDate;

import Desafio.Dominio.Bootcamp;
import Desafio.Dominio.Curso;
import Desafio.Dominio.Dev;
import Desafio.Dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java front-end");
        curso1.setDescricao("Descrição curso java parte visual");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Java back-end");
        curso1.setDescricao("Descrição curso java parte não visual");
        curso1.setCargaHoraria(12);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria com a Cami");
        mentoria1.setDescricao("Mentoria de ");
        mentoria1.setDate(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java bt Ifood");
        bootcamp.setDescricao("Bootcamp sobre Java e suas nuances");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe Mota");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos "+devFelipe.getConteudosInscritos()); 
        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("----------------");
        System.out.println("Conteudos inscritos "+devFelipe.getConteudosConcluidos());
        System.out.println("Conteudos inscritos "+devFelipe.getConteudosInscritos()); 
        System.out.println("XP: "+devFelipe.calcularTotalXp());

        System.out.println("----------------");

        Dev devLuis = new Dev();
        devLuis.setNome("Luis Souza");
        devLuis.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos "+devLuis.getConteudosInscritos());
        devLuis.progredir();
        System.out.println("----------------");
        System.out.println("Conteudos inscritos "+devLuis.getConteudosConcluidos());
        System.out.println("Conteudos inscritos "+devFelipe.getConteudosInscritos()); 
        System.out.println("XP: "+devLuis.calcularTotalXp());


    }
}
