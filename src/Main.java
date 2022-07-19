public class Main {
    public static void main(String[] args) {
    for (int i=1;i<=30;i++)
    {
        if (i % 3==0 && i % 5==0)
        {System.out.println(i+": Ping Pong");}
         else if (i % 3==0) {System.out.println(i+": Ping");}
            else if (i % 5==0) {System.out.println(i+": Pong");}
                    else {System.out.println(i+":");}
    }

                                                            }
}