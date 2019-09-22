package GoToTransformation;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class GoToTransformer {


    public static void execute() throws IOException {

        Path pathRead = FileSystems.getDefault().getPath("resources", "VeritestingPerf.class");

        Path pathWrite = FileSystems.getDefault().getPath("resources", "VeritestingPerfNew.class");


        byte[] classByteRead = Files.readAllBytes(pathRead);

        //byte[] classByteWrite = MyTransformer.transform(classByteRead);

        CollectGoTo.execute(classByteRead);

        //Files.write(pathWrite, classByteWrite);

    }

    public static void main(String[] args) throws IOException {
        GoToTransformer.execute();
    }
}
