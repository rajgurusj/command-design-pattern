public class invoker
{
 public Command command;
 public invoker(Command c,Command d)
 {
    this.command=c;
    
    }
 public void execute()
 {
   this.command.execute();
   }
   }   
    class ConcreteCommand : Command

  {

    

    public ConcreteCommand(Receiver receiver) :

      base(receiver)

    {

    }

 

    public override void Execute()

    {

      receiver.Action();

    }

  }
