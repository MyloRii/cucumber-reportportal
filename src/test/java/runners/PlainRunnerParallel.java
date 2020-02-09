package runners;


import java.io.IOException;

import static cucumber.api.cli.Main.run;

public class PlainRunnerParallel {

    public static void main(String[] args) throws IOException {
        String[] params = new String[]{
                "--threads", "4", "-g", "steps",
                "-p", "timeline:build/cucumber-parallel-report",
                "src/test/resources/features/",};
        run(params, Thread.currentThread().getContextClassLoader());
    }
}
