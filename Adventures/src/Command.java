import java.util.List;

public interface Command{

   public void execute();

   public void undo();




    class goCommand implements Command{

        public Adventure.Directions
       @Override
       public void execute() {

       }

       @Override
       public void undo() {

       }
   }
class showInventoryCommand implements Command{
private List<String> items;
showInventoryCommand(List<String> items){
    this.items=items;

}
    @Override
    public void execute() {
    System.out.println("Printing Inventory");
            for(String s:items)
                System.out.println("    "+ s);
    }

    @Override
    public void undo() {

    }
}

class quitCommand implements Command
{


    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}


    }


