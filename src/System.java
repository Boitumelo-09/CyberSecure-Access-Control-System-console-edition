public class System {



    void run() throws  Exception {
        MainRegistry portal = new MainRegistry();
        String userName , userID;
        Tool tool = new Tool() ;
          IO.println("Hey -- Welcome let's sign you in!");
          tool.newLine(2);
          IO.print("Name : "); userName = IO.readln();
          IO.print("Identification : "); userID = IO.readln();
         portal.login(userName,userID);
    }



}
