import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> stringList = new ArrayList<>();
    String toReturn = "";


    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return "Add messages by using the path /add-message?s=<string>";
        } else if (url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            stringList.add(parameters[1]);
            toReturn += parameters[1] + "\n";
            return toReturn;
        } else {
            return "404 Not Found!";
        }
    }
}

public class StringServer {
    public static void main(String[] args) throws IOException {
        if (args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }
        int port = Integer.parseInt(args[0]);
        Server.start(port, new Handler());
    }
}
