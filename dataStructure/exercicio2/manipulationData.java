import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class ManipulationData {

    public static void main(String[] args) {

        Integer itemLength = 6;

        ArrayList<Integer> dataList = new ArrayList<Integer>(itemLength);

        for(int data = 1; data < itemLength; data++){
            dataList.add(data);
            System.out.println("Sua lista possui: " + dataList + " itens");
        }

        Integer dataListLenght = dataList.size();

        if(dataListLenght >= 5){
            System.out.println("Sua lista irá limpar agora... \n");

            dataList.clear();

            System.out.println("Lista atualizada para: " + dataList.size() + "\n");
        };

        System.out.println("-----");

        Stack<Integer> toStack = new Stack<Integer>();

        for(int data = 1; data < itemLength; data++){
            System.out.println("Para criarmos sua pilha, reconstruiremos sua lista: ");

            dataList.add(data);

            System.out.println(dataList + "\n");
        }

        if(dataListLenght >= 5){
            toStack.addAll(dataList);
            System.out.println("Sua lista foi convertida em uma pilha: " + toStack);
        };

        System.out.println("----- \n");

        if(toStack.size() >= 5){
            System.out.println("Para criarmos sua fila é necessário limpar a pilha...");

            toStack.clear();

            System.out.println("Pilha: " + toStack.size());
        };

        System.out.println("----- \n");
        
        Queue<Integer> toQueue = new LinkedList<Integer>();

        for(int data = 1; data < itemLength; data++){
            System.out.println("Para criarmos sua fila, reconstruiremos sua pilha: ");

            toStack.add(data);

            System.out.println(toStack + "\n");
        }

        if(toStack.size() >= 5){
            toQueue.addAll(toStack);
            System.out.println("Sua pilha foi convertida em uma fila: " + toQueue.size());
        };

        System.out.println("----- \n");

        System.out.println("Será adicionado alguns itens a sua fila... \n");

        for(int data = 6; data < 11; data++){
            toQueue.add(data);
        }

        System.out.println("Agora sua fila possui: " + toQueue + " itens...");
    }  
}