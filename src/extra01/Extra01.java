

package extra01;

import java.util.Date;
import java.util.Scanner;


public class Extra01 {


    public static void main(String[] args) {
      Date d = new Date();
      Scanner t = new Scanner(System.in);
      
        System.out.println(d);
        Ex a = new Ex();
        a.setAluno("Isadora");
        a.setInscricao(01);
        a.setCurso("Biologia Marinha");
        a.setInicio("04/07/2022");
        a.setDuracao("3600 horas");
        a.setTempo(4);
       
        a.estado();
        System.out.println("--------------------------------");
        a.aluno();
        a.inscricao();
        a.inicio();
        a.curso();
        a.tempo();
        System.out.println("---------------------------------");
    }
    
}
