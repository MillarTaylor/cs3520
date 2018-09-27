import java.util.HashMap;
import java.util.Map;

public class Node {
    boolean isCaps;
    public int count;
    private Map<Integer,Boolean> positionMap;

    public Node(int Position, boolean isCaps){
        positionMap= new HashMap<>();
        this.count=0;
        addToMap(Position,isCaps);


    }
    public void addToMap(int position, boolean isCaps){
        positionMap.put(position,isCaps);

        this.count++;
    }

    public void printNode(){
        for (int pos:positionMap.keySet()){
            System.out.println(pos+":"+ positionMap.get(pos));


        }

    }




}
