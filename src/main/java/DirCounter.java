import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DirCounter {


    public static void main(String[] args) {
        DirCounter app = new DirCounter();
        System.out.println("Counting directories and files");
        final String pathGivenByUser = app.askUserForAPath();
        if (app.checkIfPathExists(pathGivenByUser))
        {
            System.out.println("It exists. The count of directories is " + CountDirs(pathGivenByUser));
        }
        else System.out.println("Directory "+ pathGivenByUser + " doesn't exist");
    }

    public static int CountDirs(String pathGivenByUser) {
        return new File(pathGivenByUser).listFiles(File::isDirectory).length;
    }

    boolean checkIfPathExists(String path) {
        return Files.exists(Paths.get(path));
    }

    String askUserForAPath() {
        System.out.println("Give me a path");
        Scanner in=new Scanner(System.in);
        return in.nextLine();
    }
} 