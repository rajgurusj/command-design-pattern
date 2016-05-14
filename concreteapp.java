 class MainApp

  {

    /// <summary>

    /// Entry point into console application.

    /// </summary>

    static void Main()

    {

      // Create receiver, command, and invoker

      Receiver receiver = new Receiver();

      Command command = new ConcreteCommand(receiver);

      Invoker invoker = new Invoker();

 

      // Set and execute command

      invoker.SetCommand(command);

      invoker.ExecuteCommand();

 

      // Wait for user

      Console.ReadKey();

    }

  }
