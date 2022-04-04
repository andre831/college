import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner option = new Scanner(System.in);

        ArrayList<String> alunos = new ArrayList<>();

        System.out.print("Adicione um aluno a sua lista. Lembrando o que o limite máximo é de 25 alunos... \n");

        for(int i = 0; i < 25; i++){
            String newAluno = option.nextLine();

            if(newAluno.length() < 2 || newAluno == " "){
                System.out.print("Por Favor, preencha com um nome válido, contendo no minímo 2 caracteres. \n");
            }

            alunos.add(newAluno);

            System.out.print("Agora sua lista possui:" + alunos.size() + " alunos... \n");
        }

        int yes = 1;
        int no = 2;

        System.out.print("A sua lista foi preenchida corretamente, deseja fazer novas inserções? \n [1] Sim [2]Não \n Resposta: \n");

        Integer updateListAlunos = option.nextInt();

        if (updateListAlunos == 1){
            System.out.print("Após adicionar 25 alunos a lista, é possível adicionar apenas mais 5 \n");
            for(int i = 0; i < 25 + 5; i++){
                String newAluno = option.nextLine();
    
                if(newAluno.length() < 2 || newAluno == " "){
                    System.out.print("Por Favor, preencha com um nome válido, contendo no minímo 2 caracteres \n");
                }
    
                alunos.add(newAluno);

                if(alunos.size() == 30){
                    System.out.print("Sua lista atingiu o número máximo de alunos \n");
                    break;
                }
    
                System.out.print("Agora sua lista possui:" + alunos.size() + " alunos...");
            }
        }else if (updateListAlunos == 2) {
            System.out.print("Ok... Seu programa encerra aqui.");
        }

    }
}