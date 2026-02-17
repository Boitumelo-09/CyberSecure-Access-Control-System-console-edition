public class Tool implements Utility{
    @Override
    public void newLine(int times) {
           for(int i = 0; i < times ; ++i)
               IO.println('\n');
    }
}
