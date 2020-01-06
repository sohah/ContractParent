package GoToTransformation;

import java.io.IOException;
import java.util.ArrayList;

public class GoToTransformerJar {


    public static boolean active;

    public static boolean statisticsOn;

    //statistics that collects all classes where the condition of the goTo was found
    public static ArrayList<String> goToUpdatedClasses = new ArrayList<>();


    //this is where the new rewritten bytes can be found
    public static byte[] reWrittenBytes;

    public static Boolean execute(String classUniqueName, byte[] classByteRead) throws IOException {

        Pair<Boolean, Byte[]> classByteWritePair = CollectGoTo.execute(classByteRead);
        if (statisticsOn && classByteWritePair.getKey())
            goToUpdatedClasses.add(classUniqueName);
        reWrittenBytes = TransformerUtil.toPrimitives(classByteWritePair.getValue());

        return classByteWritePair.getKey();

    }
}
