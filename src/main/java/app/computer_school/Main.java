package app.computer_school;

import app.computer_school.models.User;
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntriesFilter;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]) {
        ConsoleController controller = new ConsoleController();

        controller.run();
    }
}
