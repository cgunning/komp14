package se.cgunning.java;

import java.io.File;
import java.util.Arrays;

/**
 * Created by christoffergunning on 4/27/14.
 */
public class RunTests {
    static String baseDir = "/home/christoffergunning/workspace/miniJava/tests/student-tests-2014/";

    public static void main(String args[]) {
        runTest(baseDir, "");
    }

    private static void runTest(String parent, String testPath) {
        testPath = parent + testPath;
        System.out.println(parent);
        File f = new File(testPath);
        if (f.canRead()) {
            if (f.isDirectory()) {
                String[] fs = f.list();
               // Arrays.sort(fs);
                if (fs != null) {
                    for (int i = 0; i < fs.length; i++) {
                        try {
                            runTest(testPath, fs[i] + "/");
                        } catch (Exception e) {
                            System.err.println("Failed in file: " + fs[i]);
                            e.printStackTrace();
                        }
                    }
                }
            } else {
                System.out.println(Main.runTest(testPath, true));
            }
        }
    }
}
