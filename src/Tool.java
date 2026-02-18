public class Tool implements Utility{
    @Override
    public void newLine(int times) {
           for(int i = 1; i <= Math.abs(times) ; ++i)
               IO.print('\n');
    }
}
