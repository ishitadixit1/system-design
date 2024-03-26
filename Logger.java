import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {
    private static final Logger instance = new Logger();
    public static Logger getInstance() {
        return instance;
    }


    public void log(String message) {
        try {
            // Opening a file in append mode here
            PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true));
            // Appending current timestamp and message to the file here
            writer.println(LocalDateTime.now() + ": " + message);
            // Closing the file here at last.
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

