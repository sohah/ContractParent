package GoToTransformation;

import javafx.util.Pair;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class GoToTransformer {


    public static void execute() throws IOException {

        File folder = new File("resources/old");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String currentName = listOfFiles[i].getName();
                if (currentName.contains("class")) {
                    Path pathRead = FileSystems.getDefault().getPath("resources/old/", currentName);

                    Path pathWrite = FileSystems.getDefault().getPath("resources/new", currentName);


                    byte[] classByteRead = Files.readAllBytes(pathRead);

                    try {
                        Pair<Boolean, Byte[]> classByteWritePair = CollectGoTo.execute(classByteRead);
                        Files.write(pathWrite, TransformerUtil.toPrimitives(classByteWritePair.getValue()));

                        System.out.println("finished rewriting class " + currentName + " with result = " +
                                classByteWritePair.getKey());
                    } catch (TypeNotPresentException e) {
                        System.out.println("Problem encountered during rewriting: " + e.toString());
                    }

                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        GoToTransformer.execute();
    }
}
