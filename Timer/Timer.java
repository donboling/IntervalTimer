// -------- Begin: Advertisement.java ------------
class Advertisement extends Thread
{
    private String msg = null;
    
    Advertisement(String msg){this.msg = msg;};
    
    public void run()
    {
        while (!msg.equals(""))
        {
            try
            {
                System.out.print(msg + " ");
                sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Interrupt Received ... ");
                msg = "";
                break;
            }
        }
    }// end of 'run()' ..
}
// --------End: Advertisement.java ------------
